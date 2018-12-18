-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Vært: 127.0.0.1
-- Genereringstid: 18. 12 2018 kl. 14:16:46
-- Serverversion: 10.1.36-MariaDB
-- PHP-version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tv2`
--

-- --------------------------------------------------------

--
-- Struktur-dump for tabellen `artikler`
--

DROP TABLE IF EXISTS `artikler`;
CREATE TABLE `artikler` (
  `Navn` text NOT NULL,
  `Forfatter` text NOT NULL,
  `FileType` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Data dump for tabellen `artikler`
--

INSERT INTO `artikler` (`Navn`, `Forfatter`, `FileType`) VALUES
('Hehehe', 'Dan', 'txt'),
('Hehehe', 'Dan', 'txt'),
('Julemand', 'Alexander Klemp', 'txt'),
('Julemand', 'Alexander Klemp', 'txt'),
('julekalender', 'Alexander Klemp', 'txt'),
('mosemanden', 'Alexander Klemp', 'txt');

-- --------------------------------------------------------

--
-- Struktur-dump for tabellen `billeder`
--

DROP TABLE IF EXISTS `billeder`;
CREATE TABLE `billeder` (
  `Navn` text NOT NULL,
  `fileType` text NOT NULL,
  `Width` int(11) NOT NULL,
  `Height` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Data dump for tabellen `billeder`
--

INSERT INTO `billeder` (`Navn`, `fileType`, `Width`, `Height`) VALUES
('', '', 0, 0),
('null', 'jpg', 1505, 2021),
('null', 'jpg', 1240, 697),
('null', 'jpg', 1880, 1058);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
