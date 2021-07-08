-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 08, 2021 at 12:47 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `testgrading`
--

-- --------------------------------------------------------

--
-- Table structure for table `assignment`
--

CREATE TABLE `assignment` (
  `assignment_id` int(11) NOT NULL,
  `assignment_name` varchar(255) DEFAULT NULL,
  `teacherid_fk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `assignment`
--

INSERT INTO `assignment` (`assignment_id`, `assignment_name`, `teacherid_fk`) VALUES
(1, 'Maths', 1),
(2, 'Sinhala', 2);

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE `question` (
  `question_id` int(11) NOT NULL,
  `answer` int(11) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `question_no` int(11) DEFAULT NULL,
  `assignmenqtid_fk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`question_id`, `answer`, `question`, `question_no`, `assignmenqtid_fk`) VALUES
(1, 3, 'What is 3+3 =\r\n1=2,\r\n2=3,\r\n3=6,', 1, 1),
(2, 3, 'What is 8+8?\r\n1=3\r\n2=4\r\n3=16', 2, 1),
(3, 1, 'how many Sinhala words in the alphabet?\r\n1=20\r\n2=58\r\n3=30\r\n\r\n ', 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `student_id` int(11) NOT NULL,
  `student_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`student_id`, `student_name`) VALUES
(1, 'Yanik'),
(2, 'Theejana');

-- --------------------------------------------------------

--
-- Table structure for table `student_answer`
--

CREATE TABLE `student_answer` (
  `answer_id` int(11) NOT NULL,
  `answer` int(11) DEFAULT NULL,
  `rightwrong` bit(1) DEFAULT NULL,
  `questionid_pk` int(11) DEFAULT NULL,
  `studentid_pk` int(11) DEFAULT NULL,
  `assignmenqtidstanswer_fk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_answer`
--

INSERT INTO `student_answer` (`answer_id`, `answer`, `rightwrong`, `questionid_pk`, `studentid_pk`, `assignmenqtidstanswer_fk`) VALUES
(1, 3, b'1', 1, 2, 1),
(2, 2, b'0', 2, 2, 1),
(3, 3, b'1', 1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `teacher_id` int(11) NOT NULL,
  `teacher_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`teacher_id`, `teacher_name`) VALUES
(1, 'Perera'),
(2, 'Silva');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `assignment`
--
ALTER TABLE `assignment`
  ADD PRIMARY KEY (`assignment_id`),
  ADD KEY `FKcvw9sirjabjmkfw1gmynbpxcn` (`teacherid_fk`);

--
-- Indexes for table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`question_id`),
  ADD KEY `FKwlpl8g4rcn8b5bhjjustdylt` (`assignmenqtid_fk`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`student_id`);

--
-- Indexes for table `student_answer`
--
ALTER TABLE `student_answer`
  ADD PRIMARY KEY (`answer_id`),
  ADD KEY `FK7liol7f16gp03fi3ejpyr64cp` (`questionid_pk`),
  ADD KEY `FK3m9lxuh1gohgo3b4bqodqkihy` (`studentid_pk`),
  ADD KEY `FKpg21qo8588evh4tolqfnyj0y8` (`assignmenqtidstanswer_fk`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`teacher_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `assignment`
--
ALTER TABLE `assignment`
  ADD CONSTRAINT `FKcvw9sirjabjmkfw1gmynbpxcn` FOREIGN KEY (`teacherid_fk`) REFERENCES `teacher` (`teacher_id`);

--
-- Constraints for table `question`
--
ALTER TABLE `question`
  ADD CONSTRAINT `FKwlpl8g4rcn8b5bhjjustdylt` FOREIGN KEY (`assignmenqtid_fk`) REFERENCES `assignment` (`assignment_id`);

--
-- Constraints for table `student_answer`
--
ALTER TABLE `student_answer`
  ADD CONSTRAINT `FK3m9lxuh1gohgo3b4bqodqkihy` FOREIGN KEY (`studentid_pk`) REFERENCES `student` (`student_id`),
  ADD CONSTRAINT `FK7liol7f16gp03fi3ejpyr64cp` FOREIGN KEY (`questionid_pk`) REFERENCES `question` (`question_id`),
  ADD CONSTRAINT `FKpg21qo8588evh4tolqfnyj0y8` FOREIGN KEY (`assignmenqtidstanswer_fk`) REFERENCES `assignment` (`assignment_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
