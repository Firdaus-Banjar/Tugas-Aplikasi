-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 29, 2020 at 06:49 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubesjavalanjut`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_datakelas`
--

CREATE TABLE `tbl_datakelas` (
  `kd_kelas` int(10) NOT NULL,
  `nm_kelas` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_datasiswa`
--

CREATE TABLE `tbl_datasiswa` (
  `kd_siswa` varchar(10) NOT NULL,
  `namasiswa` varchar(20) NOT NULL,
  `jk` varchar(15) NOT NULL,
  `tgllahir` varchar(10) NOT NULL,
  `agama` varchar(10) NOT NULL,
  `anakke` int(5) DEFAULT NULL,
  `jumlahbersaudara` int(5) DEFAULT NULL,
  `nohp` varchar(15) NOT NULL,
  `alamat` varchar(20) NOT NULL,
  `goldarah` varchar(5) NOT NULL,
  `asalsekolah` varchar(20) NOT NULL,
  `tahunlulus` int(5) DEFAULT NULL,
  `ijazah` varchar(50) NOT NULL,
  `foto` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_datasiswa`
--

INSERT INTO `tbl_datasiswa` (`kd_siswa`, `namasiswa`, `jk`, `tgllahir`, `agama`, `anakke`, `jumlahbersaudara`, `nohp`, `alamat`, `goldarah`, `asalsekolah`, `tahunlulus`, `ijazah`, `foto`) VALUES
('k05', 'st fajriah fattah', 'Perempuan', '5-08-1999', 'Islam', 6, 6, '0853465409', 'takalar', 'B', 'SMP 2 TAKALAR', 2017, 'E:/foto kegiatan HBI/IMG-20180125-WA0012.jpg', 'E:/foto kegiatan HBI/IMG-20180125-WA0017.jpg'),
('k06', 'firdaus banjar', 'Laki-laki', '05-05-1999', 'Islam', 2, 3, '085256091766', 'wesabbe', 'A', 'mts 02', 2017, 'D:/Photo/bone fix.png', 'D:/Photo/dandy.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_nilai`
--

CREATE TABLE `tbl_nilai` (
  `kd_siswa` varchar(10) DEFAULT NULL,
  `nama_soal` varchar(20) DEFAULT NULL,
  `nilai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pelajaran`
--

CREATE TABLE `tbl_pelajaran` (
  `kd_pelajaran` int(10) NOT NULL,
  `nm_pelajaran` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_soal`
--

CREATE TABLE `tbl_soal` (
  `kd_soal` int(10) NOT NULL,
  `kd_pejaran` int(10) NOT NULL,
  `kd_kelas` int(10) NOT NULL,
  `soal` varchar(70) NOT NULL,
  `pilihanA` varchar(3) NOT NULL,
  `pilihanB` varchar(3) NOT NULL,
  `pilihanC` varchar(3) NOT NULL,
  `pilihanD` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_datakelas`
--
ALTER TABLE `tbl_datakelas`
  ADD PRIMARY KEY (`kd_kelas`);

--
-- Indexes for table `tbl_datasiswa`
--
ALTER TABLE `tbl_datasiswa`
  ADD PRIMARY KEY (`kd_siswa`);

--
-- Indexes for table `tbl_pelajaran`
--
ALTER TABLE `tbl_pelajaran`
  ADD PRIMARY KEY (`kd_pelajaran`);

--
-- Indexes for table `tbl_soal`
--
ALTER TABLE `tbl_soal`
  ADD PRIMARY KEY (`kd_soal`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_datakelas`
--
ALTER TABLE `tbl_datakelas`
  MODIFY `kd_kelas` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_pelajaran`
--
ALTER TABLE `tbl_pelajaran`
  MODIFY `kd_pelajaran` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_soal`
--
ALTER TABLE `tbl_soal`
  MODIFY `kd_soal` int(10) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
