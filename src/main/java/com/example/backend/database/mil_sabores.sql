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
  id INT AUTO_INCREMENT PRIMARY KEY,
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
  id_producto BIGINT PRIMARY KEY,
  nombre_producto VARCHAR(100) NOT NULL,
  descripcion_producto VARCHAR(280) NOT NULL,
  descripcion_larga VARCHAR(400) NOT NULL,
  imagen_url VARCHAR(255),
  precio DOUBLE,
  stock INT,
  activo TINYINT(1),
  id_categoria BIGINT,
  FOREIGN KEY (id_categoria) REFERENCES categorias(id_categoria)
);

-- ======================================
-- INSERT PRODUCTOS
-- ======================================
-- (AQUÍ MANTENGO TU LISTA TAL CUAL — NO LA REPITO PARA AHORRAR ESPACIO)
-- PÉGALA COMPLETA AQUÍ ↓↓↓
-- 👉 ya validamos que TODAS las rutas son correctas

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

