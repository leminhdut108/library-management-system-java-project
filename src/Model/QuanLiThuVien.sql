SET SQL_SAFE_UPDATES = 0;



CREATE TABLE IF NOT EXISTS Sach (
MaSach VARCHAR(20) NOT NULL ,
TenSach VARCHAR(50) NOT NULL ,
Gia INT ,
Nxb VARCHAR(20) ,
NamXB INT ,
TacGia VARCHAR(20) ,
TheLoai VARCHAR(20) ,
SoTrang INT ,
CONSTRAINT PK_Sach PRIMARY KEY (MaSach)
);



CREATE TABLE IF NOT EXISTS ChiTietSach(
MaSach VARCHAR(20) NOT NULL ,
MaQuyen VARCHAR(20) NOT NULL ,
NgayNhap DATE ,
TrangThai VARCHAR(20),

CONSTRAINT PK_ChiTietSach PRIMARY KEY (MaQuyen),
CONSTRAINT FK_ChiTietSach FOREIGN KEY (MaSach) REFERENCES Sach(MaSach)
);



CREATE TABLE IF NOT EXISTS DocGia (
MaDocGia VARCHAR(20) NOT NULL,
TenDocGia VARCHAR(20) NOT NULL,
Mssv INT NOT NULL,
Lop VARCHAR(30) NOT NULL,
Khoa VARCHAR(20) NOT NULL, 
GioiTinh VARCHAR(20) NOT NULL,
NgaySinh DATE NOT NULL,
Sdt VARCHAR(20) NOT NULL,
DiaChi VARCHAR(20) NOT NULL,
NgayTao DATE NOT NULL,
CONSTRAINT PK_DocGia PRIMARY KEY (MaDocGia)
);



CREATE TABLE IF NOT EXISTS MuonTra(
MaMuonTra VARCHAR(20) NOT NULL,
MaDocGia VARCHAR(20) NOT NULL,
NgayMuon DATE NOT NULL,
DatCoc INT NOT NULL,
GhiChu VARCHAR(50) ,

CONSTRAINT PK_MuonTra PRIMARY KEY (MaMuonTra),
CONSTRAINT FK_MuonTra FOREIGN KEY (MaDocGia) REFERENCES DocGia(MaDocGia)
);


CREATE TABLE IF NOT EXISTS ChiTietMuonTra(
MaMuonTra VARCHAR(20) NOT NULL,
MaQuyen VARCHAR(20) NOT NULL,
TienPhatTrenNgay INT NOT NULL,
NgayTraDuKien DATE ,
NgayTra DATE ,

CONSTRAINT CHK CHECK (NgayTraDuKien > CURDATE() AND NgayTra > CURDATE()),
CONSTRAINT PK_ChiTietMuonTra PRIMARY KEY (MaMuonTra,MaQuyen),
CONSTRAINT FK1_ChiTietMuonTra FOREIGN KEY (MaMuonTra) REFERENCES MuonTra(MaMuonTra),
CONSTRAINT FK2_ChiTietMuonTra FOREIGN KEY (MaQuyen) REFERENCES ChiTietSach(MaQuyen)
);