-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-10-2018 a las 08:14:16
-- Versión del servidor: 10.1.30-MariaDB
-- Versión de PHP: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `veterinaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `dni` bigint(20) NOT NULL,
  `nombre_apellido` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `direccion` varchar(60) COLLATE utf8_spanish_ci NOT NULL,
  `responsable_2` varchar(40) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`dni`, `nombre_apellido`, `telefono`, `direccion`, `responsable_2`) VALUES
(39455128, 'asd', 2664587895, 'prueba ', 'prueba'),
(39799437, 'Mauricio Pizarro', 2612196029, 'Constitucion 1079, San Luis', 'Julio Pizarro'),
(41001579, 'Matias Sotelo', 2615489528, 'Barrio Solares de Roca, M B C 6', 'Carolina Garcia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `id_mascota` int(11) NOT NULL,
  `cliente_dni` bigint(20) NOT NULL,
  `alias` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `especie` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `raza` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `sexo` varchar(6) COLLATE utf8_spanish_ci NOT NULL,
  `color_pelo` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `fec_nac` date NOT NULL,
  `peso_medio` double NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`id_mascota`, `cliente_dni`, `alias`, `especie`, `raza`, `sexo`, `color_pelo`, `fec_nac`, `peso_medio`) VALUES
(1, 39799437, 'Napoloeon', 'Felino', 'Persian', 'Macho', 'Rubio', '2008-11-07', 10),
(2, 41001579, 'India', 'Canino', 'Retriever-Caniche', 'Hembra', 'Rubio', '2018-02-15', 8),
(3, 39799437, 'Lorenz', 'Loro', 'Guacamayo', 'Macho', 'Verde', '2015-06-03', 1.5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_tratamiento`
--

CREATE TABLE `tipo_tratamiento` (
  `nombre` varchar(60) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `tipo_tratamiento`
--

INSERT INTO `tipo_tratamiento` (`nombre`) VALUES
('Baño y corte de pelo'),
('Castracion'),
('Cirugia'),
('Consulta'),
('Enfermedad'),
('Vacunacion');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `id_tratamiento` int(11) NOT NULL,
  `mascota_id` int(11) NOT NULL,
  `nombre_tipo_tratamiento` varchar(60) COLLATE utf8_spanish_ci NOT NULL,
  `descripcion` varchar(80) COLLATE utf8_spanish_ci NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `importe` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `tratamiento`
--

INSERT INTO `tratamiento` (`id_tratamiento`, `mascota_id`, `nombre_tipo_tratamiento`, `descripcion`, `estado`, `importe`) VALUES
(1, 1, 'Vacunacion', 'Vacunacion contra calcivirus', 0, 1500),
(2, 2, 'Baño y corte de pelo', 'Baño, corte de pelo y uñas', 1, 650),
(3, 1, 'Baño y corte de pelo', 'corte de pelo', 0, 500),
(4, 1, 'Consulta', 'Consulta de chequeo general', 0, 350),
(5, 1, 'Consulta', 'Chequeo general', 0, 350),
(6, 3, 'Vacunacion', 'Vacunacion contra parasitos', 0, 500),
(7, 1, 'Consulta', 'Chequeo de estado general', 0, 450),
(8, 1, 'Baño y corte de pelo', 'Corte de pelo', 0, 590),
(9, 3, 'Consulta', 'Chequeo general', 1, 300),
(10, 1, 'Vacunacion', 'Vacunacion contra colculus', 1, 500);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visita`
--

CREATE TABLE `visita` (
  `id_visita` int(11) NOT NULL,
  `tratamiento_id` int(11) NOT NULL,
  `detalles` varchar(250) COLLATE utf8_spanish_ci NOT NULL,
  `fecha` date NOT NULL,
  `peso` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `visita`
--

INSERT INTO `visita` (`id_visita`, `tratamiento_id`, `detalles`, `fecha`, `peso`) VALUES
(1, 1, 'Se le suminustran los medicamentos correspondientes', '2018-10-23', 7),
(2, 2, 'Se le realizara un baño, y luego se le colocara antipulgas', '2018-10-23', 8),
(3, 3, 'corte de pelo', '2018-10-23', 12),
(4, 5, 'Se examina el interior de las orejas, los dientes, las patas; con un estetoscopio escucha los latidos del corazón y verifica la frecuencia respiratoria.', '2018-10-23', 12),
(5, 6, 'Se le suministran los antiparasitos', '2018-10-23', 1),
(6, 7, 'Se le realiza la rutina de chequeos mensuales', '2018-10-24', 11),
(7, 8, 'Se le corta el pelo y baño', '2018-10-24', 9),
(8, 9, 'Se chequea general', '2018-10-24', 2),
(9, 10, 'Se suministra dosis', '2018-10-24', 9);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`id_mascota`),
  ADD KEY `cliente_dni` (`cliente_dni`);

--
-- Indices de la tabla `tipo_tratamiento`
--
ALTER TABLE `tipo_tratamiento`
  ADD PRIMARY KEY (`nombre`);

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`id_tratamiento`),
  ADD KEY `nombre_tipo_tratamiento` (`nombre_tipo_tratamiento`),
  ADD KEY `mascota_id` (`mascota_id`);

--
-- Indices de la tabla `visita`
--
ALTER TABLE `visita`
  ADD PRIMARY KEY (`id_visita`),
  ADD KEY `tratamiento_id` (`tratamiento_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `id_mascota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  MODIFY `id_tratamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `visita`
--
ALTER TABLE `visita`
  MODIFY `id_visita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`cliente_dni`) REFERENCES `cliente` (`dni`) ON DELETE CASCADE;

--
-- Filtros para la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD CONSTRAINT `tratamiento_ibfk_1` FOREIGN KEY (`mascota_id`) REFERENCES `mascota` (`id_mascota`) ON DELETE CASCADE;

--
-- Filtros para la tabla `visita`
--
ALTER TABLE `visita`
  ADD CONSTRAINT `visita_ibfk_1` FOREIGN KEY (`tratamiento_id`) REFERENCES `tratamiento` (`id_tratamiento`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
