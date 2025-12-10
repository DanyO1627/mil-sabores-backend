-- -- ======================================
-- -- LIMPIEZA (para evitar conflictos)
-- -- ======================================
-- DROP TABLE IF EXISTS items_boleta;
-- DROP TABLE IF EXISTS boletas;
-- DROP TABLE IF EXISTS productos;
-- DROP TABLE IF EXISTS categorias;
-- DROP TABLE IF EXISTS usuarios;



-- -- ACÁ NO ESTÁN LOS USUARIOS ESTÁN EN SU PROPIO TXT EN EL MISMO PACKAGE
-- -- gracias.


-- -- ======================================
-- -- TABLA CATEGORIAS
-- -- ======================================
-- CREATE TABLE categorias (
--   id_categoria BIGINT PRIMARY KEY,
--   nombre_categoria VARCHAR(100) NOT NULL,
--   descripcion_categoria VARCHAR(255),
--   imagen_url VARCHAR(255),
--   activo TINYINT(1),
--   descripcion VARCHAR(255),
--   nombre VARCHAR(100)
-- );

-- -- ======================================
-- -- INSERT CATEGORIAS (CORREGIDO)
-- -- ======================================
-- INSERT INTO categorias (id_categoria, nombre_categoria, descripcion_categoria, imagen_url, activo, descripcion, nombre) VALUES
-- (1, 'Tortas & Pasteles', 'Deliciosas tortas y pasteles para toda ocasión', '/img/productos/tarta-selva-negra.jpg', 1, NULL, ''),
-- (2, 'Tartas & Pies', 'Exquisitas tartas y pies artesanales', '/img/productos/cheesecakeImg.webp', 1, NULL, ''),
-- (3, 'Individuales & Repostería Fina', 'Pequeñas delicias para disfrutar en cualquier momento', '/img/productos/macarons2.webp', 1, NULL, ''),
-- (4, 'Especialidades & Gourmet', 'Productos premium y especiales', '/img/productos/Tiramisu2.webp', 1, NULL, '');

-- -- ======================================
-- -- TABLA PRODUCTOS
-- -- ======================================
-- CREATE TABLE productos (
--     id_producto BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
--     nombre_producto VARCHAR(100) NOT NULL,
--     precio DOUBLE NOT NULL,
--     imagen_url VARCHAR(255) NOT NULL,
--     descripcion_producto VARCHAR(280) NOT NULL,
--     descripcion_larga VARCHAR(400) NOT NULL,
--     activo BOOLEAN,
--     stock INT NOT NULL,
--     id_categoria BIGINT,
--     FOREIGN KEY (id_categoria) REFERENCES categorias(id_categoria)
-- );


-- -- ======================================
-- -- TABLA BOLETAS
-- -- ======================================
-- CREATE TABLE boletas (
--   id BIGINT AUTO_INCREMENT PRIMARY KEY,
--   fecha VARCHAR(20),
--   subtotal INT,
--   costo_envio INT,
--   total_final INT,
--   metodo_pago VARCHAR(100),
--   atendido_por VARCHAR(100),

--   calle VARCHAR(255),
--   departamento VARCHAR(50),
--   comuna VARCHAR(100),
--   region VARCHAR(100),
--   indicaciones VARCHAR(500),

--   usuario_id BIGINT,
--   CONSTRAINT fk_boleta_usuario FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
-- );

-- -- ======================================
-- -- TABLA ITEMS_BOLETA
-- -- ======================================
-- CREATE TABLE items_boleta (
--   id BIGINT AUTO_INCREMENT PRIMARY KEY,
--   producto_id BIGINT,
--   nombre_producto VARCHAR(255),
--   cantidad INT,
--   precio_unitario INT,
--   total_linea INT,

--   boleta_id BIGINT,
--   CONSTRAINT fk_item_boleta FOREIGN KEY (boleta_id) REFERENCES boletas(id) ON DELETE CASCADE
-- );


