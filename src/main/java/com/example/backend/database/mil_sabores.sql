-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-11-2025 a las 22:11:02
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12



-- ESTA ES LA BASE DE DATOS CON LAS CATEGORÍAS Y CON LOS PRODUCTOS, 
-- SOLO LES DEJO EL ARCHIVO PARA QUE LO TENGAN USTEDES TMB. 
-- ATTE: CONY





SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mil_sabores`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `id_categoria` bigint(20) NOT NULL,
  `nombre_categoria` varchar(100) NOT NULL,
  `descripcion_categoria` varchar(255) DEFAULT NULL,
  `imagen_url` varchar(255) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`id_categoria`, `nombre_categoria`, `descripcion_categoria`, `imagen_url`, `activo`, `descripcion`, `nombre`) VALUES
(1, 'Tortas & Pasteles', 'Deliciosas tortas y pasteles para toda ocasión', '/assets/tarta-selva-negra.jpg', 1, NULL, ''),
(2, 'Tartas & Pies', 'Exquisitas tartas y pies artesanales', '/assets/cheesecakeImg.webp', 1, NULL, ''),
(3, 'Individuales & Repostería Fina', 'Pequeñas delicias para disfrutar en cualquier momento', '/assets/macarons2.webp', 1, NULL, ''),
(4, 'Especialidades & Gourmet', 'Productos premium y especiales', '/assets/Tiramisu2.webp', 1, NULL, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id_producto` bigint(20) NOT NULL,
  `nombre_producto` varchar(100) NOT NULL,
  `descripcion_producto` varchar(280) NOT NULL,
  `descripcion_larga` varchar(400) NOT NULL,
  `imagen_url` varchar(255) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT NULL,
  `id_categoria` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_producto`, `nombre_producto`, `descripcion_producto`, `descripcion_larga`, `imagen_url`, `precio`, `stock`, `activo`, `id_categoria`) VALUES
(1, 'Torta Tres Leches', 'Torta tres leches húmeda, con textura suave y sabor casero.', 'Nuestra Torta Tres Leches es un clásico irresistible: bizcocho esponjoso bañado en una mezcla de tres tipos de leche (entera, condensada y evaporada), cubierto con crema merengue y decorado con frutas frescas. Perfecta para celebraciones y amantes de los postres tradicionales que buscan un sabor auténtico y sumamente húmedo.', '/assets/torta_tres_leches_8910_orig.jpg', 12000, 10, 1, 1),
(2, 'Tarta de Manzana', 'Tarta con manzanas caramelizadas y toque de canela.', 'Disfruta de nuestra Tarta de Manzana con su base de masa quebrada crujiente, rellena de láminas de manzana fresca, suavemente caramelizadas y sazonadas con un toque cálido de canela. Horneada a la perfección, es ideal para servir tibia, sola o acompañada de helado.', '/assets/Tarta-de-manzana-ajustada-web-570x458.jpg', 8500, 14, 1, 2),
(3, 'Cheesecake Frutos Rojos', 'Cheesecake con base de galleta y cobertura de frutos rojos.', 'El Cheesecake de Frutos Rojos es una delicia cremosa y refrescante. Presenta una base de galleta de mantequilla, un relleno de queso crema suave y aireado, y una generosa capa superior de mermelada y frutos rojos.', '/assets/cheesecake.png', 10000, 2, 1, 2),
(4, 'Brownie XL', 'Brownie de chocolate intenso con trozos de nuez.', 'Nuestro Brownie XL es la máxima expresión del placer chocolatero. Con una textura interior densa y fudgy, y una capa exterior crujiente.', '/assets/brownie.webp', 7990, 3, 1, 3),
(5, 'Pie de Limón', 'Pie con base crocante, relleno de limón y merengue dorado.', 'El clásico y vibrante Pie de Limón: base de masa sablée, crema de limón natural y merengue tostado.', '/assets/pie_limon.webp', 8500, 11, 1, 2),
(6, 'Torta Selva Negra', 'Bizcocho de chocolate con crema batida y cerezas.', 'Capas de bizcocho de chocolate con crema batida y cerezas ácidas, humedecidas con Kirsch.', '/assets/tarta-selva-negra.jpg', 13500, 4, 1, 1),
(7, 'Tarta de Frambuesa', 'Deliciosa tarta casera con frambuesas frescas.', 'Base de masa dulce, crema pastelera casera y frambuesas frescas.', '/assets/tarta_berries2_home.jpg', 9600, 13, 1, 2),
(8, 'Torta Milhojas', 'Capas de masa hojaldrada rellenas de manjar casero.', 'Finísimas capas de hojaldre horneado con manjar artesanal.', '/assets/torta mil hojas.jpg', 14000, 7, 1, 1),
(9, 'Cupcakes Vainilla', 'Pack de 6 cupcakes con buttercream de colores.', 'Bizcocho suave de vainilla con buttercream ligero y colorido.', '/assets/cupcakes de vainilla.jpg', 4800, 20, 1, 3),
(10, 'Galletas Decoradas', 'Galletas de mantequilla con glaseado decorativo.', 'Galletas decoradas artesanalmente con glaseado real.', '/assets/Galletas Decoradas.webp', 5500, 15, 1, 3),
(11, 'Torta Zanahoria', 'Bizcocho húmedo con zanahoria, nueces y crema de queso.', 'Bizcocho especiado con crema de queso suave y ácida.', '/assets/Torta Zanahoria.jpg', 11000, 8, 1, 4),
(12, 'Tarta de Maracuyá', 'Tarta refrescante con mousse de maracuyá natural.', 'Base crujiente con mousse aireada de maracuyá natural.', '/assets/tarta_maracuya.avif', 9000, 12, 1, 4),
(13, 'Torta de Chocolate', 'Torta de bizcocho de cacao y crema de chocolate artesanal.', 'Bizcocho húmedo de cacao con cremosa ganache de chocolate.', '/assets/torta chocolate.png', 12500, 11, 1, 1),
(14, 'Red Velvet Cookies', 'Galletas suaves sabor red velvet con chips.', 'Suaves por dentro, con chips de chocolate blanco.', '/assets/RedVelvetCookies.png', 6500, 17, 1, 3),
(15, 'Banana Muffins', 'Muffins esponjosos de plátano con nuez.', 'Muffins con plátano maduro y trocitos de nuez.', '/assets/Banana Muffins.png', 7200, 16, 1, 3),
(16, 'Tiramisú Clásico', 'Postre italiano de mascarpone, café y soletillas.', 'Tiramisú auténtico italiano en capas de mascarpone y café.', '/assets/tiramisu.jpg', 9800, 9, 1, 4),
(17, 'Surtido de Macarons', 'Caja de 10 macarons franceses.', 'Macarons crujientes por fuera, suaves por dentro.', '/assets/maracons.jpg', 11000, 14, 1, 3),
(18, 'Mousse de Chocolate Oscuro', 'Mousse aireada 70% cacao.', 'Mousse ligera y sedosa con chocolate oscuro.', '/assets/mousse_chocolate.jpg', 7500, 19, 1, 3),
(19, 'Volcán de Chocolate', 'Bizcocho con centro líquido.', 'Bizcocho firme con centro fundente de chocolate.', '/assets/volcan_chocolate.jpg', 8200, 12, 1, 3),
(20, 'Tarta de Pecan y Caramelo', 'Tarta clásica de nuez pecana.', 'Base crujiente con relleno de caramelo y pecanas tostadas.', '/assets/tarta_pecan.jpg', 10500, 10, 1, 2),
(21, 'Lemon Curd Cake', 'Bizcocho de vainilla con crema de limón.', 'Bizcocho húmedo relleno de lemon curd vibrante.', '/assets/lemon_curd_cake.jpg', 11500, 7, 1, 1),
(22, 'Éclair de Café', 'Masa choux rellena de crema de café.', 'Éclairs franceses rellenos de crema moka.', '/assets/eclair.jpg', 5000, 18, 1, 3),
(23, 'Rollitos de Canela (Pack 6)', 'Rollos de masa tierna con canela.', 'Rollitos suaves, glaseados con queso crema.', '/assets/rollos_canela.jpg', 7800, 15, 1, 3),
(24, 'Pastel Imposible', 'Pastel de chocolate y flan.', 'Bizcocho húmedo con capa superior de flan cremoso.', '/assets/pastel_imposible.webp', 13000, 8, 1, 4),
(25, 'Galletas Chocochips XL', 'Pack de 4 galletas XL.', 'Galletas gigantes con chips de chocolate semi-amargo.', '/assets/choco_chips.jpeg', 5200, 20, 1, 3),
(26, 'Tarta de Tres Chocolates', 'Tarta con 3 capas de chocolate.', 'Mousse de chocolate blanco, leche y oscuro.', '/assets/torta_tres_chocolates.jpeg', 14500, 10, 1, 4),
(27, 'Flan de Huevo Casero', 'Flan tradicional con caramelo.', 'Flan suave con aroma a vainilla y caramelo.', '/assets/flan_casero.jpg', 6900, 13, 1, 4),
(28, 'Gofres de Lieja (Pack 4)', 'Waffles belgas caramelizados.', 'Masa brioche con azúcar perla caramelizada.', '/assets/gofres_liege.jpg', 8900, 16, 1, 3),
(29, 'Torta Ópera', 'Pastel francés con café y chocolate.', 'Bizcocho de almendra, crema moka y ganache.', '/assets/opera_cake.jpg', 15000, 7, 1, 1),
(30, 'Scone de Arándanos', 'Panecillo suave con arándanos.', 'Scone suave y ligeramente dulce con arándanos frescos.', '/assets/scone_arandanos.avif', 4500, 19, 1, 3),
(31, 'Palmeritas de Chocolate', 'Palmeritas de hojaldre con chocolate.', 'Hojaldre crujiente cubierto de chocolate.', '/assets/palmera_chocolate.jpg', 6000, 17, 1, 3),
(32, 'Pastel de Queso y Guayaba', 'Cheesecake tropical.', 'Cheesecake horneado con mermelada y trozos de guayaba.', '/assets/pastel_guayaba.jpg', 10800, 11, 1, 2),
(33, 'Torta Chocolate Blanco', 'Torta con mousse de chocolate blanco.', 'Bizcocho de vainilla con mousse ligera de chocolate blanco.', '/assets/torta para 8p.jpg', 13900, 9, 1, 1),
(34, 'Torta San Felipe', 'Torta de panqueque nuez y manjar.', 'Panqueques de nuez con abundante manjar casero.', '/assets/torta_san felipe.jpeg', 11200, 6, 1, 1),
(35, 'Torta San Daniela', 'Hojarasca con crema pastelera y damasco.', 'Capas crujientes de hojarasca con crema pastelera y mermelada de damasco.', '/assets/tortaSanDaniela.png', 12500, 8, 1, 1),
(36, 'Torta Chocolate y Frutas', 'Bizcocho húmedo con frutas frescas.', 'Bizcocho extra húmedo con ganache y frutas frescas.', '/assets/torta chocolate.png', 14900, 10, 1, 1),
(37, 'Tarta de Frambuesa (Grande)', 'Tarta grande con frambuesas.', 'Masa sablée con crema pastelera y gran cobertura de frambuesas.', '/assets/tarta_berries2_home.jpg', 10500, 12, 1, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id_producto`),
  ADD KEY `id_categoria` (`id_categoria`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categorias` (`id_categoria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
