-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 04, 2020 lúc 02:26 PM
-- Phiên bản máy phục vụ: 10.4.14-MariaDB
-- Phiên bản PHP: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `nmcnpm`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `approve`
--

CREATE TABLE `approve` (
  `mngUsername` varchar(100) NOT NULL,
  `requestID` int(11) DEFAULT NULL,
  `state` varchar(10) NOT NULL,
  `note` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `approve`
--

INSERT INTO `approve` (`mngUsername`, `requestID`, `state`, `note`) VALUES
('Nguyen Van Kinh', 201, 'đã duyệt', '2'),
('Nguyen Van Kinh', 202, 'đã duyệt', '2'),
('Nguyen Van Kinh', 203, 'đã duyệt', '2'),
('Nguyen Van Kinh', 204, 'đã duyệt', '2'),
('Nguyen Van Kinh', 205, 'đã duyệt', '2'),
('Nguyen Van Kinh', 206, 'đã duyệt', '2');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `event`
--

CREATE TABLE `event` (
  `eventID` int(11) NOT NULL,
  `eventName` varchar(200) NOT NULL,
  `startTime` datetime NOT NULL,
  `finishTime` datetime NOT NULL,
  `roomName` varchar(100) NOT NULL,
  `eventDescription` varchar(1000) DEFAULT NULL,
  `fee` int(11) NOT NULL,
  `note` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `event`
--

INSERT INTO `event` (`eventID`, `eventName`, `startTime`, `finishTime`, `roomName`, `eventDescription`, `fee`, `note`) VALUES
(301, 'Tham quan nhà văn hóa', '2020-12-01 00:00:00', '2020-12-02 00:00:00', 'Phòng truyền thống', 'Tham quan nhà văn hóa', 0, 0),
(302, 'Tổ chức đám cưới', '2020-12-05 00:00:00', '2020-12-07 00:00:00', 'Phòng sự kiện', 'Tổ chức đám cưới', 500000, 0),
(303, 'Diễn tập văn nghệ', '2020-11-11 00:00:00', '2020-11-21 00:00:00', 'Phòng văn nghệ', 'Chuẩn bị cho buổi giao lưu văn nghệ', 0, 0),
(304, 'Họp tổ dân phố', '2020-12-01 00:00:00', '2020-12-02 00:00:00', 'Hội trường rộng', 'Họp để xử lý các vấn đề của tổ dân phố', 0, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `infrastructure`
--

CREATE TABLE `infrastructure` (
  `itemID` int(11) NOT NULL,
  `itemName` varchar(200) NOT NULL,
  `amount` int(11) NOT NULL,
  `color` varchar(20) NOT NULL,
  `lastTimeUpdate` datetime NOT NULL,
  `itemDescription` varchar(1000) NOT NULL,
  `roomName` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `infrastructure`
--

INSERT INTO `infrastructure` (`itemID`, `itemName`, `amount`, `color`, `lastTimeUpdate`, `itemDescription`, `roomName`) VALUES
(101, 'bàn', 20, 'nâu', '2020-11-25 00:00:00', 'còn mới', 'Hội trường rộng'),
(102, 'ghế băng', 20, 'nâu', '2020-11-25 00:00:00', 'còn mới', 'Hội trường rộng'),
(103, 'bục nói chuyện', 1, 'nâu', '2020-11-25 00:00:00', 'còn mới', 'Hội trường rộng'),
(104, 'loa', 2, 'xám', '2020-11-25 00:00:00', 'còn mới', 'Hội trường rộng'),
(105, 'đài', 1, 'đen', '2020-11-27 00:00:00', 'còn mới', 'Hội trường rộng'),
(106, 'màn hính lớn', 1, 'trắng', '2020-11-25 00:00:00', 'còn mới', 'Hội trường rộng'),
(107, 'vợt cầu lông', 15, 'xanh lá', '2020-11-15 00:00:00', 'bình thường', 'Phòng thể dục thể thao'),
(108, 'bóng đá', 2, 'trắng', '2020-11-25 00:00:00', 'còn mới', 'Phòng thể dục thể thao'),
(109, 'vợt bóng bàn', 20, 'đỏ', '2020-11-25 00:00:00', 'còn mới', 'Phòng thể dục thể thao'),
(110, 'bàn bóng bàn', 5, 'xanh lá', '2020-11-10 00:00:00', 'bình thường', 'Phòng thể dục thể thao'),
(111, 'bàn tròn', 15, 'nâu', '2020-11-25 00:00:00', 'còn mới', 'Phòng sự kiện'),
(112, 'khăn phủ bàn', 15, 'trắng', '2020-11-05 00:00:00', 'còn mới', 'Phòng sự kiện'),
(113, 'phông sự kiện', 1, 'xanh lá', '2020-11-05 00:00:00', 'bình thường', 'Phòng sự kiện'),
(114, 'Áo dài truyền thống', 25, 'trắng', '2020-05-11 00:00:00', 'đã cũ', 'Phòng văn nghệ'),
(115, 'Đài', 1, 'xám', '2020-05-11 00:00:00', 'đã cũ', 'Phòng văn nghệ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `manager`
--

CREATE TABLE `manager` (
  `mngID` int(11) NOT NULL,
  `mngUsername` varchar(100) NOT NULL,
  `mngPassword` varchar(100) NOT NULL,
  `fullName` varchar(200) NOT NULL,
  `address` varchar(1000) NOT NULL,
  `birthDay` date NOT NULL,
  `signUpDate` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `manager`
--

INSERT INTO `manager` (`mngID`, `mngUsername`, `mngPassword`, `fullName`, `address`, `birthDay`, `signUpDate`) VALUES
(11, 'manager_01', '123456', 'Nguyen Van Kinh', 'Ha Noi', '0000-00-00', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `request`
--

CREATE TABLE `request` (
  `requestID` int(11) NOT NULL,
  `startTimeRequest` datetime NOT NULL,
  `finishTimeRequest` datetime NOT NULL,
  `requestDescription` varchar(1000) NOT NULL,
  `userUsername` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `request`
--

INSERT INTO `request` (`requestID`, `startTimeRequest`, `finishTimeRequest`, `requestDescription`, `userUsername`) VALUES
(201, '2020-12-01 00:00:00', '2020-12-05 00:00:00', 'Yêu cầu thuê dụng cụ của phòng thể dục thể thao', 'Hoàng Thị Thủy'),
(202, '2020-12-05 00:00:00', '2020-12-06 00:00:00', 'Yêu cầu tổ chức sự kiện', 'Phạm Thị Thu Thảo'),
(203, '2020-12-11 00:00:00', '2020-12-05 00:00:00', 'Yêu cầu quyền sử dụng phòng văn nghệ', 'Nguyễn Thị Thoa'),
(204, '2020-11-01 00:00:00', '2020-11-10 00:00:00', 'Yêu cầu nâng cấp hệ thống chiếu sáng hội trường rộng', 'Hoàng Văn Nguyện'),
(205, '2020-11-20 00:00:00', '2020-11-22 00:00:00', 'Yêu cầu họp bàn về vấn đề an ninh của tổ dân phố', 'Nguyễn Quang Khải'),
(206, '2020-12-05 00:00:00', '2020-12-06 00:00:00', 'Yêu cầu bảo trì thiết bị ', 'Tạ Xuân Lan');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `requestwantroom`
--

CREATE TABLE `requestwantroom` (
  `requestID` int(11) NOT NULL,
  `roomName` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `requestwantroom`
--

INSERT INTO `requestwantroom` (`requestID`, `roomName`) VALUES
(201, 'Phòng thể dục thể thao'),
(202, 'Phòng sự kiện'),
(203, 'Phòng văn nghệ'),
(204, 'Hội trường rộng'),
(205, 'Hội trường rộng'),
(206, 'Phòng thể dục thể thao');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `room`
--

CREATE TABLE `room` (
  `roomID` int(11) NOT NULL,
  `roomName` varchar(100) NOT NULL,
  `floor` int(11) NOT NULL,
  `usag` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `room`
--

INSERT INTO `room` (`roomID`, `roomName`, `floor`, `usag`) VALUES
(1, 'Hội trường rộng', 1, 'họp'),
(2, 'Phòng truyền thống', 2, 'lưu trữ hình ảnh của tổ dân phố'),
(3, 'Phòng sự kiện', 2, 'tổ chức sự kiện'),
(4, 'Phòng thể dục thể thao', 2, 'bảo quản thiết bị thể thao'),
(5, 'Phòng sự kiện', 2, 'phục vụ cho hoạt động văn nghệ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `UserID` int(11) NOT NULL,
  `userUsername` varchar(100) NOT NULL,
  `userPassword` varchar(100) NOT NULL,
  `fullName` varchar(100) NOT NULL,
  `address` varchar(200) NOT NULL,
  `signUpDate` datetime NOT NULL,
  `job` varchar(100) NOT NULL,
  `birthDay` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`UserID`, `userUsername`, `userPassword`, `fullName`, `address`, `signUpDate`, `job`, `birthDay`) VALUES
(40, 'user01', '123456', 'Phạm Thị THu Thảo', 'Hà Nội', '2020-09-01 00:00:00', 'Sinh viên', '2000-09-12'),
(41, 'user02', '123456', 'Đào Thúy Hiền', 'Hà Nội', '2020-09-01 00:00:00', 'Công nhân', '1986-09-12'),
(42, 'user03', '123456', 'Hoàng Thị Thủy', 'Hà Nội', '2020-10-01 00:00:00', 'Sinh viên', '2000-11-12'),
(43, 'user04', '123456', 'Nguyễn Quang Khải', 'Hà Nội', '2020-09-01 00:00:00', 'Bác sĩ', '1967-09-12'),
(44, 'user05', '123456', 'Hoàng Văn Nguyện', 'Hà Nội', '2020-10-01 00:00:00', 'Kỹ sư', '1990-09-12'),
(45, 'user06', '123456', 'Tạ Xuân Lan', 'Hà Nội', '2020-09-01 00:00:00', 'Tự do', '1995-09-12'),
(46, 'user07', '123456', 'Đặng Thanh Hải', 'Hà Nội', '2020-09-01 00:00:00', 'Kế toán', '1998-09-12'),
(47, 'user08', '123456', 'Đặng Phương Anh', 'Hà Nội', '2020-09-01 00:00:00', 'Sinh viên', '2000-10-21'),
(48, 'user09', '123456', 'Lê Văn Cường', 'Hà Nội', '2020-09-01 00:00:00', 'Công nhân', '1999-09-12'),
(49, 'user10', '123456', 'Lê Văn Long', 'Hà Nội', '2020-12-01 00:00:00', 'Công nhân', '2000-11-12'),
(50, 'user11', '123456', 'Phạm Xuân Quý', 'Hà Nội', '2020-09-01 00:00:00', 'Công nhân', '2000-12-12'),
(51, 'user12', '123456', 'Đỗ Xuân Lộc', 'Hà Nội', '2020-09-01 00:00:00', 'Giáo viên', '1973-01-12'),
(52, 'user01', '123456', 'Nguyễn Đăng DŨng', 'Hà Nội', '2020-09-01 00:00:00', 'Bảo vệ', '1973-09-12');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `approve`
--
ALTER TABLE `approve`
  ADD KEY `requestID` (`requestID`);

--
-- Chỉ mục cho bảng `event`
--
ALTER TABLE `event`
  ADD PRIMARY KEY (`eventID`,`eventName`);

--
-- Chỉ mục cho bảng `infrastructure`
--
ALTER TABLE `infrastructure`
  ADD PRIMARY KEY (`itemID`,`itemName`);

--
-- Chỉ mục cho bảng `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`mngID`,`mngUsername`);

--
-- Chỉ mục cho bảng `request`
--
ALTER TABLE `request`
  ADD PRIMARY KEY (`requestID`);

--
-- Chỉ mục cho bảng `requestwantroom`
--
ALTER TABLE `requestwantroom`
  ADD KEY `requestID` (`requestID`);

--
-- Chỉ mục cho bảng `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`roomID`,`roomName`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UserID`,`userUsername`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `approve`
--
ALTER TABLE `approve`
  ADD CONSTRAINT `approve_ibfk_1` FOREIGN KEY (`requestID`) REFERENCES `request` (`requestID`);

--
-- Các ràng buộc cho bảng `requestwantroom`
--
ALTER TABLE `requestwantroom`
  ADD CONSTRAINT `requestwantroom_ibfk_1` FOREIGN KEY (`requestID`) REFERENCES `request` (`requestID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
