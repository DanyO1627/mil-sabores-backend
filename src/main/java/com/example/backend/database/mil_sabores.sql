-- ======================================
-- LIMPIEZA (para evitar conflictos)
-- ======================================
DROP TABLE IF EXISTS items_boleta;
DROP TABLE IF EXISTS boletas;
DROP TABLE IF EXISTS productos;
DROP TABLE IF EXISTS categorias;
DROP TABLE IF EXISTS usuarios;

-- ======================================
-- TABLA USUARIOS
-- ======================================
CREATE TABLE IF NOT EXISTS usuarios (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100),
  email VARCHAR(100),
  edad INT,
  clave VARCHAR(50),
  region VARCHAR(50),
  comuna VARCHAR(50),
  estado VARCHAR(20),
  rol VARCHAR(20),
  categoria VARCHAR(20),
  fecha VARCHAR(20)
);

-- ======================================
-- INSERT USUARIOS
-- ======================================
INSERT INTO usuarios (nombre,email,edad,clave,region,comuna,estado,rol,categoria,fecha) VALUES
('admin','admin@milsabores.cl',NULL,'empleado123','RM','Providencia','Activo','admin','empleado','2025-10-28'),
('Constanza Pino','constanza.pino@milsabores.cl',NULL,'empleado123','RM','Providencia','Activo','admin','empleado','2025-10-28'),
('Evelin Calderón','evelin.calderon@milsabores.cl',NULL,'empleado123','RM','Providencia','Activo','admin','empleado','2025-10-28'),
('Daniela Oliveros','daniela.oliveros@milsabores.cl',NULL,'empleado123','RM','Providencia','Activo','admin','empleado','2025-10-28'),
('Esteban Gutiérrez','esteban.g@mail.cl',38,'GutierrezE','Maule','Parral','Activo','cliente','base','2025-10-28'),
('Sofía Aguilera','sofia.a@mail.cl',50,'AguileraS','Ñuble','Bulnes','Activo','cliente','base','2025-10-28'),
('Ricardo Flores','ricardo.f@mail.cl',61,'FloresR','BioBio','Cabrero','Pendiente','cliente','base','2025-10-28'),
('Valentina Muñoz','vale.m@mail.cl',25,'MunozV','Araucania','Victoria','Activo','cliente','base','2025-10-28'),
('Fabián Vargas','fabian.v@mail.cl',41,'VargasF','Rios','Futrono','Activo','cliente','base','2025-10-28'),
('Javiera Lagos','javi.l@mail.cl',33,'LagosJavi','Lagos','Frutillar','Suspendido','cliente','base','2025-10-28'),
('Carlos Soto','carlos.s@mail.cl',52,'SotoC1','Aysen','Lago Verde','Activo','cliente','base','2025-10-28'),
('Pilar Cárdenas','pilar.c@mail.cl',30,'CardenasP','Magallanes','San Gregorio','Activo','cliente','base','2025-10-28'),
('Matías López','matias.l@mail.cl',28,'LopezM','Arica','Putre','Pendiente','cliente','base','2025-10-28'),
('Isabel Flores','isabel.f@mail.cl',45,'FloresI','Tarapaca','Huara','Activo','cliente','base','2025-10-28'),
('Juan Herrera','juan.h@mail.cl',58,'HerreraJ','Antofagasta','San Pedro de Atacama','Activo','cliente','base','2025-10-28'),
('Natalia Vega','naty.v@mail.cl',23,'VegaN','Atacama','Huasco','Suspendido','cliente','base','2025-10-28'),
('Mario Bravo','mario.b@mail.cl',36,'BravoM','Coquimbo','La Higuera','Activo','cliente','base','2025-10-28'),
('Andrea Díaz','andrea.d@mail.cl',49,'DiazA10','Valparaiso','Puchuncaví','Activo','cliente','base','2025-10-28'),
('Ignacio Soto','ignacio.s@mail.cl',32,'SotoI','Metropolitana','Lo Barnechea','Pendiente','cliente','base','2025-10-28'),
('Francisca Vera','fran.v@mail.cl',44,'VeraF2','Libertador','Coltauco','Activo','cliente','base','2025-10-28'),
('Manuel Orellana','manu.o@mail.cl',56,'OrellanaM','Maule','Talca','Activo','cliente','base','2025-10-28'),
('Paula Gómez','paula.g@mail.cl',26,'GomezP','Ñuble','Coelemu','Suspendido','cliente','base','2025-10-28'),
('Felipe Miranda','felipe.m@mail.cl',39,'MirandaF','BioBio','Tomé','Activo','cliente','base','2025-10-28'),
('Catalina Robles','cata.r@mail.cl',31,'RoblesC','Araucania','Lonquimay','Activo','cliente','base','2025-10-28'),
('Cristóbal Tapia','cristobal.t@mail.cl',47,'TapiaC','Rios','Río Bueno','Pendiente','cliente','base','2025-10-28'),
('Loreto Fuentes','loreto.f@mail.cl',24,'FuentesL','Lagos','Llanquihue','Activo','cliente','base','2025-10-28'),
('Daniel Henríquez','daniel.h@mail.cl',53,'HenriquezD','Aysen','Chile Chico','Activo','cliente','base','2025-10-28'),
('Alejandra Gómez','ale.g@mail.cl',40,'GomezA','Magallanes','Porvenir','Suspendido','cliente','base','2025-10-28'),
('Gabriel Vera','gabriel.v@mail.cl',35,'VeraG','Metropolitana','La Cisterna','Activo','cliente','base','2025-10-28'),
('Camila Moya','camila.m@mail.cl',27,'MoyaC','Valparaiso','Quilpué','Activo','cliente','base','2025-10-28'),
('Andrés Díaz','andres.d@mail.cl',60,'DiazA','Coquimbo','Ovalle','Pendiente','cliente','base','2025-10-28'),
('Isidora Rojas','isi.r@mail.cl',42,'RojasI','Antofagasta','Calama','Activo','cliente','base','2025-10-28'),
('Héctor Palma','hector.p@mail.cl',51,'PalmaH','Tarapaca','Iquique','Activo','cliente','base','2025-10-28'),
('Valeria Bravo','valeria.b@mail.cl',20,'BravoV','Arica','Arica','Suspendido','cliente','base','2025-10-28'),
('Sebastián Reyes','seba.r@mail.cl',33,'ReyesS','Atacama','Diego de Almagro','Activo','cliente','base','2025-10-28'),
('Josefina Vidal','jose.v@mail.cl',37,'VidalJ','Coquimbo','Los Vilos','Activo','cliente','base','2025-10-28'),
('Cristian Miranda','cristian.m@mail.cl',59,'MirandaC','Valparaiso','Isla de Pascua','Pendiente','cliente','base','2025-10-28'),
('María Jesús Soto','mj.soto@mail.cl',26,'SotoMJ','Metropolitana','Peñalolén','Activo','cliente','base','2025-10-28'),
('Patricio Flores','pato.f@mail.cl',48,'FloresP','Libertador','San Fernando','Activo','cliente','base','2025-10-28'),
('Karla Guzmán','karla.g@mail.cl',30,'GuzmanK','Maule','Curicó','Suspendido','cliente','base','2025-10-28'),
('Álvaro Díaz','alvaro.d@mail.cl',54,'DiazA','Ñuble','Pemuco','Activo','cliente','base','2025-10-28');

-- ======================================
-- TABLA CATEGORIAS
-- ======================================
CREATE TABLE categorias (
  id_categoria BIGINT PRIMARY KEY,
  nombre_categoria VARCHAR(100) NOT NULL,
  descripcion_categoria VARCHAR(255),
  imagen_url VARCHAR(255),
  activo TINYINT(1),
  descripcion VARCHAR(255),
  nombre VARCHAR(100)
);

-- ======================================
-- INSERT CATEGORIAS (CORREGIDO)
-- ======================================
INSERT INTO categorias (id_categoria, nombre_categoria, descripcion_categoria, imagen_url, activo, descripcion, nombre) VALUES
(1, 'Tortas & Pasteles', 'Deliciosas tortas y pasteles para toda ocasión', '/img/productos/tarta-selva-negra.jpg', 1, NULL, ''),
(2, 'Tartas & Pies', 'Exquisitas tartas y pies artesanales', '/img/productos/cheesecakeImg.webp', 1, NULL, ''),
(3, 'Individuales & Repostería Fina', 'Pequeñas delicias para disfrutar en cualquier momento', '/img/productos/macarons2.webp', 1, NULL, ''),
(4, 'Especialidades & Gourmet', 'Productos premium y especiales', '/img/productos/Tiramisu2.webp', 1, NULL, '');

-- ======================================
-- TABLA PRODUCTOS
-- ======================================
CREATE TABLE productos (
    id_producto BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre_producto VARCHAR(100) NOT NULL,
    precio DOUBLE NOT NULL,
    imagen_url VARCHAR(255) NOT NULL,
    descripcion_producto VARCHAR(280) NOT NULL,
    descripcion_larga VARCHAR(400) NOT NULL,
    activo BOOLEAN,
    stock INT NOT NULL,
    id_categoria BIGINT,
    FOREIGN KEY (id_categoria) REFERENCES categorias(id_categoria)
);

-- ======================================
-- INSERT PRODUCTOS
-- ======================================
INSERT INTO productos 
(id_producto, nombre_producto, descripcion_producto, descripcion_larga, imagen_url, precio, stock, activo, id_categoria) VALUES
(1, 'Torta Tres Leches', 'Torta tres leches húmeda, con textura suave y sabor casero.', 'Nuestra Torta Tres Leches es un clásico irresistible: bizcocho esponjoso bañado en una mezcla de tres tipos de leche...', '/img/productos/torta_tres_leches_8910_orig.jpg', 12000, 10, 1, 1),

(2, 'Tarta de Manzana', 'Tarta con manzanas caramelizadas y toque de canela.', 'Disfruta de nuestra Tarta de Manzana...', '/img/productos/Tarta-de-manzana-ajustada-web-570x458.jpg', 8500, 14, 1, 2),

(3, 'Cheesecake Frutos Rojos', 'Cheesecake con base de galleta...', 'El Cheesecake de Frutos Rojos es una delicia...', '/img/productos/cheesecake.png', 10000, 2, 1, 2),

(4, 'Brownie XL', 'Brownie de chocolate intenso...', 'Nuestro Brownie XL es la máxima expresión...', '/img/productos/brownie.webp', 7990, 3, 1, 3),

(5, 'Pie de Limón', 'Pie con base crocante...', 'El clásico y vibrante Pie de Limón...', '/img/productos/pie_limon.webp', 8500, 11, 1, 2),

(6, 'Torta Selva Negra', 'Bizcocho de chocolate...', 'Capas de bizcocho de chocolate...', '/img/productos/tarta-selva-negra.jpg', 13500, 4, 1, 1),

(7, 'Tarta de Frambuesa', 'Deliciosa tarta casera...', 'Base de masa dulce...', '/img/productos/tarta_frambuesa.jpg', 9600, 13, 1, 2),

(8, 'Torta Milhojas', 'Capas de masa hojaldrada...', 'Finísimas capas de hojaldre...', '/img/productos/torta%20mil%20hojas.jpg', 14000, 7, 1, 1),

(9, 'Cupcakes Vainilla', 'Pack de 6 cupcakes...', 'Bizcocho suave de vainilla...', '/img/productos/cupcakes%20de%20vainilla.jpg', 4800, 20, 1, 3),

(10, 'Galletas Decoradas', 'Galletas de mantequilla...', 'Galletas decoradas artesanalmente...', '/img/productos/Galletas%20Decoradas.webp', 5500, 15, 1, 3),

(11, 'Torta Zanahoria', 'Bizcocho húmedo...', 'Bizcocho especiado...', '/img/productos/Torta%20Zanahoria.jpg', 11000, 8, 1, 4),

(12, 'Tarta de Maracuyá', 'Tarta refrescante...', 'Base crujiente...', '/img/productos/tarta_maracuya.avif', 9000, 12, 1, 4),

(13, 'Torta de Chocolate', 'Torta de bizcocho...', 'Bizcocho húmedo...', '/img/productos/torta%20chocolate.png', 12500, 11, 1, 1),

(14, 'Red Velvet Cookies', 'Galletas suaves...', 'Suaves por dentro...', '/img/productos/RedVelvetCookies.png', 6500, 17, 1, 3),

(15, 'Banana Muffins', 'Muffins esponjosos...', 'Muffins con plátano...', '/img/productos/Banana%20Muffins.png', 7200, 16, 1, 3),

(16, 'Tiramisú Clásico', 'Postre italiano...', 'Tiramisú auténtico...', '/img/productos/tiramisu.jpg', 9800, 9, 1, 4),

(17, 'Surtido de Macarons', 'Caja de 10 macarons...', 'Macarons crujientes...', '/img/productos/maracons.jpg', 11000, 14, 1, 3),

(18, 'Mousse de Chocolate Oscuro', 'Mousse aireada...', 'Mousse ligera...', '/img/productos/mousse_chocolate.jpg', 7500, 19, 1, 3),

(19, 'Volcán de Chocolate', 'Bizcocho con centro líquido...', 'Bizcocho firme...', '/img/productos/volcan_chocolate.jpg', 8200, 12, 1, 3),

(20, 'Tarta de Pecan y Caramelo', 'Tarta clásica...', 'Base crujiente...', '/img/productos/tarta_pecan.jpg', 10500, 10, 1, 2),

(21, 'Lemon Curd Cake', 'Bizcocho de vainilla...', 'Bizcocho húmedo...', '/img/productos/lemon_curd_cake.jpg', 11500, 7, 1, 1),

(22, 'Éclair de Café', 'Masa choux...', 'Éclairs franceses...', '/img/productos/eclair.jpg', 5000, 18, 1, 3),

(23, 'Rollitos de Canela', 'Rollos de masa tierna...', 'Rollitos suaves...', '/img/productos/rollos_canela.jpg', 7800, 15, 1, 3),

(24, 'Pastel Imposible', 'Pastel de chocolate...', 'Bizcocho húmedo...', '/img/productos/pastel_imposible.webp', 13000, 8, 1, 4),

(25, 'Galletas Chocochips XL', 'Pack de 4 galletas...', 'Galletas gigantes...', '/img/productos/choco_chips.jpeg', 5200, 20, 1, 3),

(26, 'Tarta de Tres Chocolates', 'Tarta con 3 capas...', 'Mousse de chocolate...', '/img/productos/torta_tres_chocolates.jpeg', 14500, 10, 1, 4),

(27, 'Flan de Huevo Casero', 'Flan tradicional...', 'Flan suave...', '/img/productos/flan_casero.jpg', 6900, 13, 1, 4),

(28, 'Gofres de Lieja', 'Waffles belgas...', 'Masa brioche...', '/img/productos/gofres_liege.jpg', 8900, 16, 1, 3),

(29, 'Torta Ópera', 'Pastel francés...', 'Bizcocho de almendra...', '/img/productos/opera_cake.jpg', 15000, 7, 1, 1),

(30, 'Scone de Arándanos', 'Panecillo suave...', 'Scone suave...', '/img/productos/scone_arandanos.avif', 4500, 19, 1, 3),

(31, 'Palmeritas de Chocolate', 'Palmeritas de hojaldre...', 'Hojaldre crujiente...', '/img/productos/palmera_chocolate.jpg', 6000, 17, 1, 3),

(32, 'Pastel de Queso y Guayaba', 'Cheesecake tropical...', 'Cheesecake horneado...', '/img/productos/pastel_guayaba.jpg', 10800, 11, 1, 2),

(33, 'Torta Chocolate Blanco', 'Torta con mousse...', 'Bizcocho de vainilla...', '/img/productos/torta%20para%208p.jpg', 13900, 9, 1, 1),

(34, 'Torta San Felipe', 'Torta de panqueque nuez...', 'Panqueques de nuez...', '/img/productos/torta_san%20felipe.jpeg', 11200, 6, 1, 1),

(35, 'Torta San Daniela', 'Hojarasca con crema pastelera...', 'Capas crujientes...', '/img/productos/tortaSanDaniela.png', 12500, 8, 1, 1),

(36, 'Torta Chocolate y Frutas', 'Bizcocho húmedo...', 'Bizcocho extra húmedo...', '/img/productos/torta%20chocolate.png', 14900, 10, 1, 1),

(37, 'Tarta de Frambuesa (Grande)', 'Tarta grande...', 'Masa sablée...', '/img/productos/tarta_berries2_home.jpg', 10500, 12, 1, 2);


-- ======================================
-- TABLA BOLETAS
-- ======================================
CREATE TABLE boletas (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  fecha VARCHAR(20),
  subtotal INT,
  costo_envio INT,
  total_final INT,
  metodo_pago VARCHAR(100),
  atendido_por VARCHAR(100),

  calle VARCHAR(255),
  departamento VARCHAR(50),
  comuna VARCHAR(100),
  region VARCHAR(100),
  indicaciones VARCHAR(500),

  usuario_id BIGINT,
  CONSTRAINT fk_boleta_usuario FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

-- ======================================
-- TABLA ITEMS_BOLETA
-- ======================================
CREATE TABLE items_boleta (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  producto_id BIGINT,
  nombre_producto VARCHAR(255),
  cantidad INT,
  precio_unitario INT,
  total_linea INT,

  boleta_id BIGINT,
  CONSTRAINT fk_item_boleta FOREIGN KEY (boleta_id) REFERENCES boletas(id) ON DELETE CASCADE
);


