package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import org.springframework.boot.CommandLineRunner;

import org.springframework.context.annotation.Bean;
import com.example.backend.model.Usuario;
import com.example.backend.repository.UsuarioRepository;

@SpringBootApplication
public class BackendApplication {
 public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    // usuarios
    @Bean
    public CommandLineRunner initData(UsuarioRepository usuarioRepository) {
        return args -> {
            if (usuarioRepository.count() == 0) {

                usuarioRepository.save(new Usuario(
                        "Esteban Gutiérrez",
                        "esteban.g@mail.cl",
                        38,
                        "GutierrezE",
                        "Maule",
                        "Parral",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                    "Sofía Aguilera",
                    "sofia.a@mail.cl",
                    50,
                    "AguileraS",
                    "Ñuble",
                    "Bulnes",
                    "Activo",
                    "cliente",
                    "base",
                    "2025-10-28"
            ));

            usuarioRepository.save(new Usuario(
                    "Ricardo Flores",
                    "ricardo.f@mail.cl",
                    61,
                    "FloresR",
                    "BioBio",
                    "Cabrero",
                    "Pendiente",
                    "cliente",
                    "base",
                    "2025-10-28"
            ));
            usuarioRepository.save(new Usuario(
                        "Valentina Muñoz",
                        "vale.m@mail.cl",
                        25,
                        "MunozV",
                        "Araucania",
                        "Victoria",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Fabián Vargas",
                        "fabian.v@mail.cl",
                        41,
                        "VargasF",
                        "Rios",
                        "Futrono",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Javiera Lagos",
                        "javi.l@mail.cl",
                        33,
                        "LagosJavi",
                        "Lagos",
                        "Frutillar",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Carlos Soto",
                        "carlos.s@mail.cl",
                        52,
                        "SotoC1",
                        "Aysen",
                        "Lago Verde",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Pilar Cárdenas",
                        "pilar.c@mail.cl",
                        30,
                        "CardenasP",
                        "Magallanes",
                        "San Gregorio",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Matías López",
                        "matias.l@mail.cl",
                        28,
                        "LopezM",
                        "Arica",
                        "Putre",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Isabel Flores",
                        "isabel.f@mail.cl",
                        45,
                        "FloresI",
                        "Tarapaca",
                        "Huara",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Juan Herrera",
                        "juan.h@mail.cl",
                        58,
                        "HerreraJ",
                        "Antofagasta",
                        "San Pedro de Atacama",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Natalia Vega",
                        "naty.v@mail.cl",
                        23,
                        "VegaN",
                        "Atacama",
                        "Huasco",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Mario Bravo",
                        "mario.b@mail.cl",
                        36,
                        "BravoM",
                        "Coquimbo",
                        "La Higuera",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Andrea Díaz",
                        "andrea.d@mail.cl",
                        49,
                        "DiazA10",
                        "Valparaiso",
                        "Puchuncaví",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Ignacio Soto",
                        "ignacio.s@mail.cl",
                        32,
                        "SotoI",
                        "Metropolitana",
                        "Lo Barnechea",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Francisca Vera",
                        "fran.v@mail.cl",
                        44,
                        "VeraF2",
                        "Libertador",
                        "Coltauco",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Manuel Orellana",
                        "manu.o@mail.cl",
                        56,
                        "OrellanaM",
                        "Maule",
                        "Talca",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Paula Gómez",
                        "paula.g@mail.cl",
                        26,
                        "GomezP",
                        "Ñuble",
                        "Coelemu",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Felipe Miranda",
                        "felipe.m@mail.cl",
                        39,
                        "MirandaF",
                        "BioBio",
                        "Tomé",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Catalina Robles",
                        "cata.r@mail.cl",
                        31,
                        "RoblesC",
                        "Araucania",
                        "Lonquimay",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Cristóbal Tapia",
                        "cristobal.t@mail.cl",
                        47,
                        "TapiaC",
                        "Rios",
                        "Río Bueno",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Loreto Fuentes",
                        "loreto.f@mail.cl",
                        24,
                        "FuentesL",
                        "Lagos",
                        "Llanquihue",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Daniel Henríquez",
                        "daniel.h@mail.cl",
                        53,
                        "HenriquezD",
                        "Aysen",
                        "Chile Chico",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Alejandra Gómez",
                        "ale.g@mail.cl",
                        40,
                        "GomezA",
                        "Magallanes",
                        "Porvenir",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));
                usuarioRepository.save(new Usuario(
                        "Gabriel Vera",
                        "gabriel.v@mail.cl",
                        35,
                        "VeraG",
                        "Metropolitana",
                        "La Cisterna",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Camila Moya",
                        "camila.m@mail.cl",
                        27,
                        "MoyaC",
                        "Valparaiso",
                        "Quilpué",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Andrés Díaz",
                        "andres.d@mail.cl",
                        60,
                        "DiazA",
                        "Coquimbo",
                        "Ovalle",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Isidora Rojas",
                        "isi.r@mail.cl",
                        42,
                        "RojasI",
                        "Antofagasta",
                        "Calama",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Héctor Palma",
                        "hector.p@mail.cl",
                        51,
                        "PalmaH",
                        "Tarapaca",
                        "Iquique",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Valeria Bravo",
                        "valeria.b@mail.cl",
                        20,
                        "BravoV",
                        "Arica",
                        "Arica",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Sebastián Reyes",
                        "seba.r@mail.cl",
                        33,
                        "ReyesS",
                        "Atacama",
                        "Diego de Almagro",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Josefina Vidal",
                        "jose.v@mail.cl",
                        37,
                        "VidalJ",
                        "Coquimbo",
                        "Los Vilos",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Cristian Miranda",
                        "cristian.m@mail.cl",
                        59,
                        "MirandaC",
                        "Valparaiso",
                        "Isla de Pascua",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "María Jesús Soto",
                        "mj.soto@mail.cl",
                        26,
                        "SotoMJ",
                        "Metropolitana",
                        "Peñalolén",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Patricio Flores",
                        "pato.f@mail.cl",
                        48,
                        "FloresP",
                        "Libertador",
                        "San Fernando",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Karla Guzmán",
                        "karla.g@mail.cl",
                        30,
                        "GuzmanK",
                        "Maule",
                        "Curicó",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Álvaro Díaz",
                        "alvaro.d@mail.cl",
                        54,
                        "DiazA",
                        "Ñuble",
                        "Pemuco",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Daniela Castro",
                        "daniela.c@mail.cl",
                        22,
                        "CastroD",
                        "BioBio",
                        "Chiguayante",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));
                usuarioRepository.save(new Usuario(
                        "Jorge Rojas",
                        "jorge.r@mail.cl",
                        63,
                        "RojasJ",
                        "Araucania",
                        "Carahue",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Elena Núñez",
                        "elena.n@mail.cl",
                        38,
                        "NunezE",
                        "Rios",
                        "Corral",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Guillermo Pérez",
                        "guille.p@mail.cl",
                        41,
                        "PerezG",
                        "Lagos",
                        "Purranque",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Consuelo Soto",
                        "consu.s@mail.cl",
                        27,
                        "SotoC",
                        "Aysen",
                        "Cisnes",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Sergio Muñoz",
                        "sergio.m@mail.cl",
                        50,
                        "MunozS",
                        "Magallanes",
                        "Río Verde",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Romina Leiva",
                        "romina.l@mail.cl",
                        35,
                        "LeivaR",
                        "Arica",
                        "General Lagos",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Pablo Vargas",
                        "pablo.v@mail.cl",
                        44,
                        "VargasP",
                        "Tarapaca",
                        "Pica",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Bárbara Herrera",
                        "barbara.h@mail.cl",
                        28,
                        "HerreraB",
                        "Antofagasta",
                        "Sierra Gorda",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Marcelo Díaz",
                        "marcelo.d@mail.cl",
                        57,
                        "DiazM",
                        "Atacama",
                        "Vallenar",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Claudia Fuentes",
                        "claudia.f@mail.cl",
                        30,
                        "FuentesC",
                        "Coquimbo",
                        "Vicuña",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Gonzalo Castro",
                        "gonzalo.c@mail.cl",
                        39,
                        "CastroG",
                        "Valparaiso",
                        "Villa Alemana",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Nicole Flores",
                        "nicole.f@mail.cl",
                        23,
                        "FloresN",
                        "Metropolitana",
                        "Cerro Navia",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Cristian Gómez",
                        "cris.g@mail.cl",
                        52,
                        "GomezC",
                        "Libertador",
                        "Graneros",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Daniela Alarcón",
                        "daniela.a@mail.cl",
                        36,
                        "AlarconD",
                        "Maule",
                        "Linares",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Javier Reyes",
                        "javi.r@mail.cl",
                        48,
                        "ReyesJ",
                        "Ñuble",
                        "Quirihue",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Camila Henríquez",
                        "cami.h@mail.cl",
                        25,
                        "HenriquezC",
                        "BioBio",
                        "Yumbel",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Benjamín Soto",
                        "benja.soto@mail.cl",
                        31,
                        "SotoB",
                        "Araucania",
                        "Galvarino",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Macarena Muñoz",
                        "macarena.m@mail.cl",
                        40,
                        "MunozM",
                        "Rios",
                        "Los Lagos",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Ricardo Bravo",
                        "ricardo.b@mail.cl",
                        53,
                        "BravoR",
                        "Lagos",
                        "Chaitén",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Josefina Díaz",
                        "josefina.d@mail.cl",
                        29,
                        "DiazJ",
                        "Aysen",
                        "Cochrane",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Andrés Gutiérrez",
                        "andres.g@mail.cl",
                        64,
                        "GutierrezA",
                        "Magallanes",
                        "Laguna Blanca",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Valentina Pizarro",
                        "vale.p@mail.cl",
                        21,
                        "PizarroV",
                        "Metropolitana",
                        "Estación Central",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Eduardo Rojas",
                        "eduardo.r@mail.cl",
                        55,
                        "RojasE",
                        "Valparaiso",
                        "Los Andes",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Camila Leiva",
                        "camila.l@mail.cl",
                        33,
                        "LeivaC",
                        "Coquimbo",
                        "Canela",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Cristóbal Tapia",
                        "cris.t@mail.cl",
                        47,
                        "TapiaC",
                        "Antofagasta",
                        "Taltal",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Javiera Gómez",
                        "javi.g@mail.cl",
                        26,
                        "GomezJ",
                        "Tarapaca",
                        "Colchane",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Ignacio Soto",
                        "ignacio.soto@mail.cl",
                        39,
                        "SotoI",
                        "Arica",
                        "Putre",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "María Paz Flores",
                        "mariapaz.f@mail.cl",
                        30,
                        "FloresMP",
                        "Atacama",
                        "Caldera",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Nicolás Vera",
                        "nicolas.v@mail.cl",
                        51,
                        "VeraN",
                        "Coquimbo",
                        "Salamanca",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Francisca Miranda",
                        "fran.m@mail.cl",
                        24,
                        "MirandaF",
                        "Valparaiso",
                        "Zapallar",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Alfredo Guzmán",
                        "alfredo.g@mail.cl",
                        46,
                        "GuzmanA",
                        "Metropolitana",
                        "Quilicura",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Silvana Díaz",
                        "silvana.d@mail.cl",
                        38,
                        "DiazS",
                        "Libertador",
                        "Rancagua",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Benjamín Castro",
                        "benjamin.c@mail.cl",
                        59,
                        "CastroB",
                        "Maule",
                        "Cauquenes",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Loreto Pérez",
                        "loreto.p@mail.cl",
                        31,
                        "PerezL",
                        "Ñuble",
                        "Cobquecura",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Manuel Sánchez",
                        "manu.s@mail.cl",
                        43,
                        "SanchezM",
                        "BioBio",
                        "Nacimiento",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Catalina Muñoz",
                        "cata.m@mail.cl",
                        27,
                        "MunozC",
                        "Araucania",
                        "Loncoche",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Rodrigo Fuentes",
                        "rodrigo.f@mail.cl",
                        55,
                        "FuentesR",
                        "Rios",
                        "Paillaco",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));


                usuarioRepository.save(new Usuario(
                        "Camila Henríquez",
                        "cami.h@mail.cl",
                        36,
                        "HenriquezC",
                        "Libertador",
                        "Peralillo",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Sebastián Muñoz",
                        "seba.m@mail.cl",
                        47,
                        "MunozS",
                        "Maule",
                        "Curicó",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Isidora Vargas",
                        "isi.v@mail.cl",
                        29,
                        "VargasI",
                        "Ñuble",
                        "Chillán",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Álvaro Bravo",
                        "alvaro.b@mail.cl",
                        52,
                        "BravoA",
                        "BioBio",
                        "Arauco",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Daniela Reyes",
                        "dani.r@mail.cl",
                        33,
                        "ReyesD",
                        "Araucania",
                        "Loncoche",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Felipe Díaz",
                        "felipe.d@mail.cl",
                        40,
                        "DiazF",
                        "Rios",
                        "La Unión",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Javiera Gómez",
                        "javi.g@mail.cl",
                        25,
                        "GomezJ",
                        "Lagos",
                        "Ancud",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Manuel Flores",
                        "manu.f@mail.cl",
                        56,
                        "FloresM",
                        "Aysen",
                        "Guaitecas",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Paula Pérez",
                        "paula.p@mail.cl",
                        31,
                        "PerezP",
                        "Magallanes",
                        "Laguna Blanca",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Ricardo Soto",
                        "ricardo.s@mail.cl",
                        43,
                        "SotoR",
                        "Metropolitana",
                        "Puente Alto",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Valentina Tapia",
                        "vale.t@mail.cl",
                        22,
                        "TapiaV",
                        "Valparaiso",
                        "San Antonio",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Juan Vera",
                        "juan.v@mail.cl",
                        59,
                        "VeraJ",
                        "Coquimbo",
                        "Vicuña",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Camila Cárdenas",
                        "cami.c@mail.cl",
                        35,
                        "CardenasC",
                        "Antofagasta",
                        "Mejillones",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Sebastián Leiva",
                        "seba.l@mail.cl",
                        48,
                        "LeivaS",
                        "Tarapaca",
                        "Alto Hospicio",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Isidora Flores",
                        "isi.f@mail.cl",
                        26,
                        "FloresI",
                        "Arica",
                        "General Lagos",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Álvaro Muñoz",
                        "alvaro.m@mail.cl",
                        53,
                        "MunozA",
                        "Atacama",
                        "Diego de Almagro",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Daniela Bravo",
                        "dani.b@mail.cl",
                        30,
                        "BravoD",
                        "Libertador",
                        "Doñihue",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Felipe Reyes",
                        "felipe.r@mail.cl",
                        42,
                        "ReyesF",
                        "Maule",
                        "Parral",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Javiera Díaz",
                        "javi.d@mail.cl",
                        27,
                        "DiazJ",
                        "Ñuble",
                        "Ninhue",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Manuel Soto",
                        "manu.s@mail.cl",
                        55,
                        "SotoM",
                        "BioBio",
                        "Tucapel",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Paula Gómez",
                        "paula.g@mail.cl",
                        34,
                        "GomezP",
                        "Araucania",
                        "Curarrehue",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Ricardo Henríquez",
                        "ricardo.h@mail.cl",
                        40,
                        "HenriquezR",
                        "Rios",
                        "Corral",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Valentina Vargas",
                        "vale.v@mail.cl",
                        21,
                        "VargasV",
                        "Lagos",
                        "Dalcahue",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Juan Tapia",
                        "juan.t@mail.cl",
                        64,
                        "TapiaJ",
                        "Aysen",
                        "Tortel",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Camila Pérez",
                        "cami.p@mail.cl",
                        32,
                        "PerezC",
                        "Magallanes",
                        "Natales",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Sebastián Bravo",
                        "seba.b@mail.cl",
                        47,
                        "BravoS",
                        "Metropolitana",
                        "Quilicura",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Isidora Díaz",
                        "isi.d@mail.cl",
                        26,
                        "DiazI",
                        "Valparaiso",
                        "El Tabo",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Álvaro Flores",
                        "alvaro.f@mail.cl",
                        50,
                        "FloresA",
                        "Coquimbo",
                        "Los Vilos",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Daniela Soto",
                        "dani.s@mail.cl",
                        35,
                        "SotoD",
                        "Antofagasta",
                        "Sierra Gorda",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Felipe Muñoz",
                        "felipe.m@mail.cl",
                        41,
                        "MunozF",
                        "Tarapaca",
                        "Camiña",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Javiera Leiva",
                        "javi.l@mail.cl",
                        29,
                        "LeivaJ",
                        "Arica",
                        "Camarones",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Manuel Gómez",
                        "manu.g@mail.cl",
                        54,
                        "GomezM",
                        "Atacama",
                        "Alto del Carmen",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Paula Henríquez",
                        "paula.h@mail.cl",
                        30,
                        "HenriquezP",
                        "Libertador",
                        "San Fernando",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Ricardo Miranda",
                        "ricardo.m@mail.cl",
                        45,
                        "MirandaR",
                        "Maule",
                        "Talcahuano",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Valentina Soto",
                        "vale.s@mail.cl",
                        26,
                        "SotoV",
                        "Ñuble",
                        "Cobquecura",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Juan Pérez",
                        "juan.p@mail.cl",
                        61,
                        "PerezJ",
                        "BioBio",
                        "Hualqui",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Camila Tapia",
                        "cami.t@mail.cl",
                        33,
                        "TapiaC",
                        "Araucania",
                        "Temuco",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Sebastián Vera",
                        "seba.v@mail.cl",
                        48,
                        "VeraS",
                        "Rios",
                        "Valdivia",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));
                usuarioRepository.save(new Usuario(
                        "Isidora Cárdenas",
                        "isi.c@mail.cl",
                        24,
                        "CardenasI",
                        "Lagos",
                        "San Pablo",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Álvaro Leiva",
                        "alvaro.l@mail.cl",
                        50,
                        "LeivaA",
                        "Aysen",
                        "Lago Verde",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Daniela Flores",
                        "dani.f@mail.cl",
                        39,
                        "FloresD",
                        "Magallanes",
                        "Río Verde",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Felipe Bravo",
                        "felipe.b@mail.cl",
                        42,
                        "BravoF",
                        "Metropolitana",
                        "Ñuñoa",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Javiera Reyes",
                        "javi.r@mail.cl",
                        27,
                        "ReyesJ",
                        "Valparaiso",
                        "Zapallar",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Manuel Díaz",
                        "manu.d@mail.cl",
                        53,
                        "DiazM",
                        "Coquimbo",
                        "Andacollo",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Paula Muñoz",
                        "paula.m@mail.cl",
                        30,
                        "MunozP",
                        "Antofagasta",
                        "Calama",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Ricardo Vargas",
                        "ricardo.v@mail.cl",
                        44,
                        "VargasR",
                        "Tarapaca",
                        "Huara",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Valentina Gómez",
                        "vale.g@mail.cl",
                        23,
                        "GomezV",
                        "Arica",
                        "Putre",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Juan Tapia",
                        "juan.t@mail.cl",
                        57,
                        "TapiaJ",
                        "Atacama",
                        "Tierra Amarilla",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Camila Pérez",
                        "cami.p@mail.cl",
                        36,
                        "PerezC",
                        "Libertador",
                        "Rancagua",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Sebastián Miranda",
                        "seba.m@mail.cl",
                        47,
                        "MirandaS",
                        "Maule",
                        "Talca",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Isidora Soto",
                        "isi.s@mail.cl",
                        29,
                        "SotoI",
                        "Ñuble",
                        "Portezuelo",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Álvaro Henríquez",
                        "alvaro.h@mail.cl",
                        52,
                        "HenriquezA",
                        "BioBio",
                        "Penco",
                        "Suspendido",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Daniela Bravo",
                        "dani.b@mail.cl",
                        33,
                        "BravoD",
                        "Araucania",
                        "Vilcún",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Felipe Reyes",
                        "felipe.r@mail.cl",
                        40,
                        "ReyesF",
                        "Rios",
                        "Los Lagos",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Javiera Díaz",
                        "javi.d@mail.cl",
                        25,
                        "DiazJ",
                        "Lagos",
                        "Frutillar",
                        "Pendiente",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Manuel Gómez",
                        "manu.g@mail.cl",
                        56,
                        "GomezM",
                        "Aysen",
                        "Cisnes",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                usuarioRepository.save(new Usuario(
                        "Paula Flores",
                        "paula.f@mail.cl",
                        31,
                        "FloresP",
                        "Magallanes",
                        "Timaukel",
                        "Activo",
                        "cliente",
                        "base",
                        "2025-10-28"
                ));

                                usuarioRepository.save(new Usuario(
                            "Ricardo Tapia",
                            "ricardo.t@mail.cl",
                            43,
                            "TapiaR",
                            "Metropolitana",
                            "La Cisterna",
                            "Suspendido",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Valentina Vera",
                            "vale.v@mail.cl",
                            22,
                            "VeraV",
                            "Valparaiso",
                            "Puchuncaví",
                            "Activo",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Juan Cárdenas",
                            "juan.c@mail.cl",
                            59,
                            "CardenasJ",
                            "Coquimbo",
                            "Salamanca",
                            "Activo",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Camila Leiva",
                            "cami.l@mail.cl",
                            35,
                            "LeivaC",
                            "Antofagasta",
                            "Taltal",
                            "Pendiente",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Sebastián Muñoz",
                            "seba.m@mail.cl",
                            48,
                            "MunozS",
                            "Tarapaca",
                            "Pica",
                            "Activo",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Isidora Vargas",
                            "isi.v@mail.cl",
                            26,
                            "VargasI",
                            "Arica",
                            "General Lagos",
                            "Activo",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Álvaro Bravo",
                            "alvaro.b@mail.cl",
                            53,
                            "BravoA",
                            "Atacama",
                            "Freirina",
                            "Suspendido",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Daniela Reyes",
                            "dani.r@mail.cl",
                            30,
                            "ReyesD",
                            "Libertador",
                            "Pichidegua",
                            "Activo",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Felipe Díaz",
                            "felipe.d@mail.cl",
                            42,
                            "DiazF",
                            "Maule",
                            "Chanco",
                            "Activo",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Javiera Gómez",
                            "javi.g@mail.cl",
                            27,
                            "GomezJ",
                            "Ñuble",
                            "San Ignacio",
                            "Pendiente",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Manuel Flores",
                            "manu.f@mail.cl",
                            55,
                            "FloresM",
                            "BioBio",
                            "Cabrero",
                            "Activo",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Paula Pérez",
                            "paula.p@mail.cl",
                            34,
                            "PerezP",
                            "Araucania",
                            "Gorbea",
                            "Activo",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Ricardo Soto",
                            "ricardo.s@mail.cl",
                            40,
                            "SotoR",
                            "Rios",
                            "Máfil",
                            "Suspendido",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Valentina Tapia",
                            "vale.t@mail.cl",
                            21,
                            "TapiaV",
                            "Lagos",
                            "Purranque",
                            "Activo",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Juan Vera",
                            "juan.v@mail.cl",
                            64,
                            "VeraJ",
                            "Aysen",
                            "Cochrane",
                            "Activo",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Camila Cárdenas",
                            "cami.c@mail.cl",
                            32,
                            "CardenasC",
                            "Magallanes",
                            "Cabo de Hornos",
                            "Pendiente",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Sebastián Leiva",
                            "seba.l@mail.cl",
                            47,
                            "LeivaS",
                            "Metropolitana",
                            "Las Condes",
                            "Activo",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Isidora Flores",
                            "isi.f@mail.cl",
                            26,
                            "FloresI",
                            "Valparaiso",
                            "Llaillay",
                            "Activo",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Álvaro Muñoz",
                            "alvaro.m@mail.cl",
                            50,
                            "MunozA",
                            "Coquimbo",
                            "Río Hurtado",
                            "Suspendido",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Daniela Bravo",
                            "dani.b@mail.cl",
                            35,
                            "BravoD",
                            "Antofagasta",
                            "Ollagüe",
                            "Activo",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Felipe Reyes",
                            "felipe.r@mail.cl",
                            41,
                            "ReyesF",
                            "Tarapaca",
                            "Colchane",
                            "Activo",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Javiera Díaz",
                            "javi.d@mail.cl",
                            29,
                            "DiazJ",
                            "Arica",
                            "Putre",
                            "Pendiente",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));

                    usuarioRepository.save(new Usuario(
                            "Manuel Soto",
                            "manu.s@mail.cl",
                            54,
                            "SotoM",
                            "Atacama",
                            "Huasco",
                            "Activo",
                            "cliente",
                            "base",
                            "2025-10-28"
                    ));
                }
            };
        };
    }

