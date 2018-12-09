-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 09, 2018 at 08:14 AM
-- Server version: 5.7.23
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hms`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `id` varchar(30) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(12) NOT NULL,
  `maritial_status` varchar(12) NOT NULL,
  `nic` varchar(15) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(50) NOT NULL,
  `phone` int(11) NOT NULL,
  `blood_group` varchar(15) NOT NULL,
  `join_date` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `firstName`, `lastName`, `age`, `gender`, `maritial_status`, `nic`, `address`, `city`, `phone`, `blood_group`, `join_date`, `username`, `password`) VALUES
('sdfdff', 'Amila', 'Darshana', 24, 'Male', 'Unmarried', '941256387V', 'sfdfsdfs', 'sdffsdfd', 714857596, 'B+', '2012-04-12', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
CREATE TABLE IF NOT EXISTS `appointment` (
  `appointment_id` varchar(30) NOT NULL,
  `patient_firstName` varchar(50) NOT NULL,
  `patient_lastName` varchar(50) NOT NULL,
  `assigned_doctor` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(15) NOT NULL,
  `honoric` varchar(10) NOT NULL,
  `nic` varchar(15) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(50) NOT NULL,
  `phone` int(11) NOT NULL,
  `date_time` varchar(100) NOT NULL,
  `blood_group` varchar(10) NOT NULL,
  PRIMARY KEY (`appointment_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`appointment_id`, `patient_firstName`, `patient_lastName`, `assigned_doctor`, `age`, `gender`, `honoric`, `nic`, `address`, `city`, `phone`, `date_time`, `blood_group`) VALUES
('fsdfdsfdf', 'Ranga', 'Prasad', 'Malinda', 25, 'Male', 'Mr', '931568452V', 'sfdfdsdf', 'sffsfsdfs', 714268579, '2018-03-21 18:12', 'A+');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
CREATE TABLE IF NOT EXISTS `doctor` (
  `doctor_id` varchar(30) NOT NULL,
  `med_reg_no` varchar(50) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(12) NOT NULL,
  `maritial_status` varchar(15) NOT NULL,
  `nic` varchar(15) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(50) NOT NULL,
  `phone` int(11) NOT NULL,
  `specialization` varchar(50) NOT NULL,
  `blood_group` varchar(10) NOT NULL,
  `join_date` varchar(30) NOT NULL,
  `leaving_date` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`doctor_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`doctor_id`, `med_reg_no`, `firstName`, `lastName`, `age`, `gender`, `maritial_status`, `nic`, `address`, `city`, `phone`, `specialization`, `blood_group`, `join_date`, `leaving_date`, `username`, `password`) VALUES
('gfhfhvfh', 'hvhxvch', 'Malinda', 'Pradeep', 23, 'Male', 'Unmarried', '123456789V', 'fdgfgfd', 'fggfdgdg', 714268596, 'dsfdf', 'B+', '2013-01-15', '2020-03-02', 'malindap', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
CREATE TABLE IF NOT EXISTS `patient` (
  `patient_id` varchar(30) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `maritial_status` varchar(12) NOT NULL,
  `date` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(50) NOT NULL,
  `phone` int(11) NOT NULL,
  `type` varchar(15) NOT NULL,
  `blood_group` varchar(10) NOT NULL,
  `ward` varchar(15) NOT NULL,
  `bed` varchar(15) NOT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patient_id`, `firstName`, `lastName`, `age`, `gender`, `maritial_status`, `date`, `address`, `city`, `phone`, `type`, `blood_group`, `ward`, `bed`) VALUES
('sfddddd', 'Ranga', 'Prasad', 25, 'Male', 'Unmarried', '2018-12-09', 'dfsdsdfdgdfdf', 'sfdfdfdf', 711426756, 'Indoor', 'A+', '1', '7'),
('fdsffdfd', 'Nipuni', 'Wathsala', 24, 'Female', 'Married', '2018-12-11', 'sffdfdf', 'ddfdfsdf', 754267589, 'Outdoor', 'B+', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `receptionist`
--

DROP TABLE IF EXISTS `receptionist`;
CREATE TABLE IF NOT EXISTS `receptionist` (
  `receptionist_id` varchar(30) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(12) NOT NULL,
  `maritial_status` varchar(12) NOT NULL,
  `nic` varchar(15) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(50) NOT NULL,
  `phone` int(11) NOT NULL,
  `experience` varchar(15) NOT NULL,
  `blood_group` varchar(10) NOT NULL,
  `join_date` varchar(30) NOT NULL,
  `leaving_date` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`receptionist_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `receptionist`
--

INSERT INTO `receptionist` (`receptionist_id`, `firstName`, `lastName`, `age`, `gender`, `maritial_status`, `nic`, `address`, `city`, `phone`, `experience`, `blood_group`, `join_date`, `leaving_date`, `username`, `password`) VALUES
('svhsgsfvf', 'Piyumi', 'Lokuge', 25, 'Female', 'Married', '934267589V', 'dffdsfsdfdfdf', 'fdfdfsdffdf', 714257895, 'Qualified', 'B+', '2012-11-03', '2018-12-31', 'piyumi', '123456');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
