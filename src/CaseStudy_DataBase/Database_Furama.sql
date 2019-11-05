drop database if exists caseStudyDataBase;
create database caseStudyDataBase;
use caseStudyDataBase;
create table Vitri(
IDVitri int unique auto_increment not null primary key,
TenViTri nvarchar(45) not null
);
create table TrinhDo(
IDTrinhDo int unique auto_increment not null primary key,
TrinhDo nvarchar(45) not null
);
create table BoPhan(
IDBoPhan int unique auto_increment not null primary key,
TenBoPhan nvarchar(45) not null
);
create table LoaiKhach(
IDLoaiKhach int unique auto_increment not null primary key,
TenLoaiKhach nvarchar(45) not null
);
create table KieuThue(
IDKieuThue int unique auto_increment not null primary key,
TenKieuThue nvarchar(45) not null,
Gia decimal
);
create table LoaiDichVu(
IDLoaiDichVu int unique auto_increment not null primary key,
TenLoaiDichVu nvarchar(45) not null
);
create table DichVuDiKem(
IDDichVuDiKem int unique auto_increment not null primary key,
TenDichVuDiKem nvarchar(45) not null,
Gia decimal,
DonVi int,
TrangThaiSuDung nvarchar(45) not null
);
create table NhanVien(
IDNhanVien int unique auto_increment not null primary key,
HoTen nvarchar(50) not null,
NgaySinh date not null,
SoCMTND int not null unique,
Luong decimal,
SDT int,
Email varchar(50),
DiaChi nvarchar(50),
IdVitri int,
IDTrinhDo int,
IDBoPhan int,
constraint IDVitri_fk foreign key(IdVitri) references Vitri(IDVitri),
constraint IDTrinhDo_fk foreign key(IDTrinhDo) references TrinhDo(IDTrinhDo),
constraint IDBoPhan_fk foreign key(IDBoPhan) references BoPhan(IDBoPhan)
);
create table KhachHang(
IDKhachHang int unique auto_increment not null primary key,
HoTen nvarchar(50) not null,
NgaySinh date not null,
SoCMTND int not null unique,
SDT int,
Email varchar(50),
DiaChi nvarchar(50),
IDLoaiKhach int,
constraint IDLoaiKhach_fk foreign key(IDLoaiKhach) references LoaiKhach(IDLoaiKhach)
);
create table DichVu(
IDDichVu int unique auto_increment not null primary key,
TenDichVu nvarchar(50) not null,
DienTich double not null,
SoTang tinyint ,
SoNguoiToiDa tinyint,
ChiPhiThue decimal,
IDKieuThue int,
IDLoaiDichVu int,
constraint IDKieuThue_fk foreign key(IDKieuThue) references KieuThue(IDKieuThue),
constraint IDLoaiDichVu_fk foreign key(IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu)
);
create table HopDong(
IDHopDong int unique auto_increment not null primary key,
HoTen nvarchar(50) not null,
NgayLamHopDong date not null,
NgayKetThuc date not null,
TienDatCoc decimal,
TongTien decimal,
IdNhanVien int,
IDKhachHang int,
IDDichVu int,
constraint IdNhanVien_fk foreign key(IdNhanVien) references NhanVien(IdNhanVien),
constraint IDKhachHang_fk foreign key(IDKhachHang) references KhachHang(IDKhachHang),
constraint IDDichVu_fk foreign key(IDDichVu) references DichVu(IDDichVu)
);
create table HopDongChiTiet(
SoLuong int,
IDHopDong int,
IDDichVuDiKem int,
constraint IDHopDongChiTiet primary key(IDHopDong,IDDichVuDiKem),
constraint IDHopDong_fk foreign key(IDHopDong) references HopDong(IDHopDong),
constraint IDDichVuDiKem_fk foreign key(IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem)
);
insert into bophan values ('Buồng phòng'),('Lễ tân'),('Nhà hàng'),('An ninhh'),('Văn phòng');
insert into vitri values ('Giam Đốc'),('Trưởng Phòng'),('Quản Lý'),('Nhan Vien');
insert into trinhdo values ('Cao học'),('Đại Học'),('Cao đẳng'),('Trung cấp');
insert into NhanVien(HoTen, NgaySinh, SoCMTND, Luong,  ) 