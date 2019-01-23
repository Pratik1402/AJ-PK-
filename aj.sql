-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 13, 2018 at 10:07 AM
-- Server version: 5.1.53
-- PHP Version: 5.3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `aj`
--

-- --------------------------------------------------------

--
-- Table structure for table `user905`
--

CREATE TABLE IF NOT EXISTS `user905` (
  `enrollmentno` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `country` varchar(20) NOT NULL,
  `sem` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user905`
--

INSERT INTO `user905` (`enrollmentno`, `name`, `password`, `email`, `country`, `sem`) VALUES
('28', 'Pratik', '95', 'pratik@gmail.com', 'Present', '6'),
('31', 'Rahul', '90', 'rahul@gmail.com', 'Present', '6'),
('10', 'abc', '70', 'abc@gamil.com', 'Present', '5');
