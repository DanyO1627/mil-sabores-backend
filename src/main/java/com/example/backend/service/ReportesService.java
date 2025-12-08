package com.example.backend.service;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.backend.dto.ReportesInventarioDTO;
import com.example.backend.dto.ReportesUsuariosDTO;
import com.example.backend.model.Producto;
import com.example.backend.model.Usuario;
import com.example.backend.repository.ProductoRepository;
import com.example.backend.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReportesService {

    private final ProductoRepository productoRepository;
    private final UsuarioRepository usuarioRepository;

 
    public ReportesInventarioDTO getInventarioReport() {

    List<Producto> productos = productoRepository.findAll();

    int totalProductos = productos.size();

    int totalCriticos = (int) productos.stream()
            .filter(p -> toInt(p.getStock()) <= 5)
            .count();

    int stockTotal = productos.stream()
            .mapToInt(p -> toInt(p.getStock()))
            .sum();

    long valorInventario = productos.stream()
            .mapToLong(p -> toLong(p.getPrecio()) * toLong(p.getStock()))
            .sum();

// TODO EL REPORTE DE LOS INVENTARIOS


    // STOCK POR CATEGORÍA
    List<Map<String, Object>> stockPorCategoria = productos.stream()
            .collect(Collectors.groupingBy(
                    Producto::getCategoria,
                    Collectors.summingInt(p -> toInt(p.getStock()))
            ))
            .entrySet()
            .stream()
            .map(e -> Map.of(
                    "name", e.getKey(),           // nombre de la categoría
                    "stock", (Object) e.getValue()
            ))
            .collect(Collectors.toList());

    // 🔹 DISTRIBUCIÓN DE STOCK 
    List<Map<String, Object>> distribucionStock = List.of(
            Map.of("name", "Sin stock",
                    "value", productos.stream().filter(p -> toInt(p.getStock()) == 0).count(),
                    "color", "#dc3545"),

            Map.of("name", "Crítico (1-5)",
                    "value", productos.stream().filter(p -> {
                        int s = toInt(p.getStock());
                        return s > 0 && s <= 5;
                    }).count(),
                    "color", "#ff9800"),

            Map.of("name", "Bajo (6-10)",
                    "value", productos.stream().filter(p -> {
                        int s = toInt(p.getStock());
                        return s > 5 && s <= 10;
                    }).count(),
                    "color", "#ffc107"),

            Map.of("name", "Normal (>10)",
                    "value", productos.stream().filter(p -> toInt(p.getStock()) > 10).count(),
                    "color", "#28a745")
    );

    // TOP 5 MÁS CAROS
    List<Map<String, Object>> topCaros = productos.stream()
            .sorted((a, b) -> Double.compare(toDouble(b.getPrecio()), toDouble(a.getPrecio())))
            .limit(5)
            .map(p -> Map.of(
                    "name", p.getNombreProducto(),
                    "precio", (Object) toDouble(p.getPrecio())
            ))
            .collect(Collectors.toList());

    // VALOR POR CATEGORÍA
    List<Map<String, Object>> valorPorCategoria = productos.stream()
            .collect(Collectors.groupingBy(
                    Producto::getCategoria,
                    Collectors.summingLong(p -> toLong(p.getPrecio()) * toLong(p.getStock()))
            ))
            .entrySet()
            .stream()
            .map(e -> Map.of("name", e.getKey(), "valor", (Object) e.getValue()))
            .collect(Collectors.toList());

    return new ReportesInventarioDTO(
            totalProductos,
            totalCriticos,
            stockTotal,
            valorInventario,
            stockPorCategoria,
            distribucionStock,
            topCaros,
            valorPorCategoria
    );
}


    // REPORTE USUARIOS
    public ReportesUsuariosDTO getUsersReport() {

        List<Usuario> usuarios = usuarioRepository.findAll();

        int totalUsuarios = usuarios.size();

        // Usuarios por región
        List<Map<String, Object>> usuariosPorRegion = usuarios.stream()
                .collect(Collectors.groupingBy(
                        Usuario::getRegion,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .map(e -> Map.of("name", e.getKey(), "cantidad", (Object) e.getValue()))
                .collect(Collectors.toList());

        // Usuarios por edad
        List<Map<String, Object>> usuariosPorEdad = List.of(
                rango("18-25", usuarios, u -> u.getEdad() != null && u.getEdad() <= 25),
                rango("26-35", usuarios, u -> u.getEdad() != null && u.getEdad() > 25 && u.getEdad() <= 35),
                rango("36-45", usuarios, u -> u.getEdad() != null && u.getEdad() > 35 && u.getEdad() <= 45),
                rango("46-60", usuarios, u -> u.getEdad() != null && u.getEdad() > 45 && u.getEdad() <= 60),
                rango("+60", usuarios, u -> u.getEdad() != null && u.getEdad() > 60),
                rango("Desconocido", usuarios, u -> u.getEdad() == null)
        );

        // Usuarios por estado
        List<Map<String, Object>> usuariosPorEstado = usuarios.stream()
                .collect(Collectors.groupingBy(
                        Usuario::getEstado,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .map(e -> Map.of("name", e.getKey(), "value", (Object) e.getValue()))
                .collect(Collectors.toList());

        return new ReportesUsuariosDTO(
                totalUsuarios,
                usuariosPorRegion,
                usuariosPorEdad,
                usuariosPorEstado
        );
    }

    // Helper rangos
    private Map<String, Object> rango(String etiqueta, List<Usuario> usuarios, Predicate<Usuario> pred) {
        long cantidad = usuarios.stream().filter(pred).count();
        return Map.of("name", etiqueta, "cantidad", (Object) cantidad);
    }

    // Helpers seguros
    private int toInt(Number n) {
        return n == null ? 0 : n.intValue();
    }

    private long toLong(Number n) {
        return n == null ? 0L : n.longValue();
    }

    private double toDouble(Number n) {
        return n == null ? 0.0 : n.doubleValue();
    }
}
