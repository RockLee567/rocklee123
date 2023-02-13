DELETE BangDiem

DELETE MonHoc

DELETE GiangVien 

DELETE AccountSinhVien

DELETE AccountAdmin

DELETE SinhVien 

DELETE Lop 

DELETE ChuyenNganh

DELETE Khoa 

/* Khoa */ 
INSERT INTO Khoa 
VALUES( 'CNTT' , N'Công nghệ thông tin'   ) ; 
INSERT INTO Khoa 
VALUES( 'KT' , N'Kiến trúc'   ) ;  
INSERT INTO Khoa 
VALUES( 'XD' , N'Xây Dựng'   ) ; 
INSERT INTO Khoa 
VALUES( 'KTe' , N'Kinh Tế'   ) ; 

/* Chuyen Nganh */ 
INSERT INTO ChuyenNganh
VALUES( 'KT_CNTT' , N'Công nghệ thông tin' , 'CNTT'  ) 
INSERT INTO ChuyenNganh
VALUES( 'KT_KTPM' , N'Kỹ thuật phần mềm' , 'CNTT'  ) 
INSERT INTO ChuyenNganh
VALUES( 'KT_KHMT' , N'Khoa học máy tính' , 'CNTT'  ) 

INSERT INTO ChuyenNganh
VALUES( 'KT_KT' , N'Kiến trúc' , 'KT'  ) 
INSERT INTO ChuyenNganh
VALUES( 'KT_KTCQ' , N'Kiến trúc cảnh quan' , 'KT'  ) 

INSERT INTO ChuyenNganh
VALUES( 'KT_KTXD' , N'Kỹ thuật xây dựng' , 'XD'  ) 
INSERT INTO ChuyenNganh
VALUES( 'KT_CTDD' , N'Công trình dân dụng' , 'XD'  ) 

INSERT INTO ChuyenNganh
VALUES( 'KT_QTKD' , N'Quản trị kinh doanh' , 'KTe'  ) 
INSERT INTO ChuyenNganh
VALUES( 'KT_KTQT' , N'Kinh tế quốc tế' , 'KTe'  ) 


/*                                                                    Lop                                            */ 

/* CNTT  */
INSERT INTO Lop 
VALUES( '20CN5' , N'20CN5' , 'KT_CNTT' )
INSERT INTO Lop 
VALUES( '20CN4' , N'20CN4' , 'KT_CNTT' )



/* KTPM  */
INSERT INTO Lop 
VALUES( '20PM1' , N'20PM1' , 'KT_KTPM' )
INSERT INTO Lop 
VALUES( '20PM2' , N'20PM2' , 'KT_KTPM' )

/* KHMT  */
INSERT INTO Lop 
VALUES( '20KH3' , N'20KH3' , 'KT_KHMT' )
INSERT INTO Lop 
VALUES( '20KH4' , N'20KH4' , 'KT_KHMT' )

/* Kiến Trúc   */
INSERT INTO Lop 
VALUES( '20KT1' , N'20KT1' , 'KT_KT' )
INSERT INTO Lop 
VALUES( '20KT2' , N'20KT3' , 'KT_KT' )
INSERT INTO Lop 
VALUES( '20KT3' , N'20KT3' , 'KT_KT' )

/* Kiến Trúc cảnh quan    */
INSERT INTO Lop 
VALUES( '20CQ1' , N'20CQ1' , 'KT_KTCQ' )
INSERT INTO Lop 
VALUES( '20CQ2' , N'20CQ2' , 'KT_KTCQ' )

/* Ki thuat Xay dung   */
INSERT INTO Lop 
VALUES( '20XD1' , N'20XD1' , 'KT_KTXD' )
INSERT INTO Lop 
VALUES( '20XD2' , N'20XD2' , 'KT_KTXD' )

/* Cong trinh dan dung   */
INSERT INTO Lop 
VALUES( '20DD1' , N'20DD1' , 'KT_CTDD' )
INSERT INTO Lop 
VALUES( '20DD5' , N'20DD6' , 'KT_CTDD' )


/* Quan tri kinh doanh   */
INSERT INTO Lop 
VALUES( '20QTKD1' , N'20QTKD1' , 'KT_QTKD' )
INSERT INTO Lop 
VALUES( '20QTKD3' , N'20QTKD3' , 'KT_QTKD' )

/* Kinh doanh quocte   */
INSERT INTO Lop 
VALUES( '20KTQT2' , N'20KTQT2' , 'KT_KTQT' )
INSERT INTO Lop 
VALUES( '20KTQT6' , N'20KTQT6' , 'KT_KTQT' )



/*                                                 Mon Hoc                            */ 
INSERT INTO MonHoc 
VALUES( 'CTDL' , N'Cấu trúc dữ liệu và giải thuật' , '3' )

INSERT INTO MonHoc 
VALUES( 'OOP' , N'Hướng đối tượng' , '3' )

INSERT INTO MonHoc 
VALUES( 'KTLT' , N'Kỹ thuật lập trình' , '3' )

INSERT INTO MonHoc 
VALUES( 'CSDL' , N'Cơ sở dữ liệu' , '2' )



/*                                                 Giang Vien                            */ 
INSERT INTO GiangVien
VALUES( 'NHN' , N'Ngô Hồng Nhung' , N'Nữ' ,  N'Nam Định' , 576443534 ,  N'hongNhung@gmail.com' )

INSERT INTO GiangVien
VALUES( 'NTH' , N'Nguyễn Thị Huyền' , N'Nữ' ,  N'Hà Nội' , 457576584 ,  N'huyen@gmail.com' )

INSERT INTO GiangVien
VALUES( 'NTM' , N'Nguyễn Thành Minh' , N'Nam' ,  N'Nam Định' , 576443534 ,  N'thanhminh@gmail.com' )



/*                                    INSERT INTO            Sinh Vien                             */ 
/* CNTT */ 
INSERT INTO SinhVien 
VALUES( 2055010251 , N'Vũ Thanh Tùng' , '2002-03-25' , N'Nam' , N'Hà Nội' ,  245346534 , N'thanhtung@gmail.com'  ,  '20CN5' ) 
INSERT INTO SinhVien 
VALUES( 2055010227 , N'Phạm Đinh Trường Sơn' , '2002-10-23' , N'Nam' , N'Hà Nội' ,  245346534 , N'truongson@gmail.com'  ,  '20CN5' ) 
INSERT INTO SinhVien 
VALUES( 2055010203 , N'Phạm Đăng Phúc' , '2002-11-29' , N'Nam' , N'Thái Bình' ,  245346534 , N'dangphuc@gmail.com'  ,  '20CN5' ) 

INSERT INTO SinhVien 
VALUES( 2055010101 , N'Nguyễn Việt Hoàng' , '2002-08-26' , N'Nam' , N'Nam Định' ,  245346534 , N'viethoang@gmail.com'  ,  '20CN4' ) 
INSERT INTO SinhVien 
VALUES( 2055010077 , N'Nguyễn Quang Hải' , '2002-06-30' , N'Nam' , N'Hà Nội' ,  245346534 , N'quanghai@gmail.com'  ,  '20CN4' ) 


/*                                    INSERT INTO            Account SinhVien                             */ 
INSERT INTO AccountSinhVien
VALUES(  '2055010251' , '12345' , 0  )  ;
INSERT INTO AccountSinhVien
VALUES(  '2055010227' , '12345' , 0  )  ;
INSERT INTO AccountSinhVien
VALUES(  '2055010203' , '12345' , 0  )  ;
INSERT INTO AccountSinhVien
VALUES(  '2055010101' , '12345' , 0  )  ;
INSERT INTO AccountSinhVien
VALUES(  '2055010077' , '12345' , 0  )  ;

/*                                    INSERT INTO            Account Admin                             */ 
INSERT INTO AccountAdmin 
VALUES( 5000 , '12345' , 1   ) ; 
INSERT INTO AccountAdmin 
VALUES( 5001 , '12345' , 1   ) ; 
INSERT INTO AccountAdmin 
VALUES( 5002 , '12345' , 1   ) ; 


/*                                                Bang Diem                              */ 
INSERT INTO BangDiem (  ID_SV     , maMonHoc , maTinChi , maGV , HocKy   , NamHoc     , Diem ) 
VALUES(                 2055010251 , 'CTDL'   , '3'      , 'NHN', 'HK1'   , 'NH20-21'  , 8.2) 

INSERT INTO BangDiem (  ID_SV     , maMonHoc , maTinChi , maGV , HocKy   , NamHoc     , Diem ) 
VALUES(                 2055010251 , 'OOP'   , '3'      , 'NTH', 'HK2'   , 'NH20-21'  , 9.2) 

INSERT INTO BangDiem (  ID_SV     , maMonHoc , maTinChi , maGV , HocKy   , NamHoc     , Diem ) 
VALUES(                 2055010251 , 'CSDL'   , '3'      , 'NHN', 'HK2'   , 'NH20-21'  , 8.5) 


INSERT INTO BangDiem (  ID_SV     , maMonHoc , maTinChi , maGV , HocKy   , NamHoc     , Diem ) 
VALUES(                 2055010227 , 'CTDL'   , '3'      , 'NTH', 'HK1'   , 'NH20-21'  , 8.8) 

INSERT INTO BangDiem (  ID_SV     , maMonHoc , maTinChi , maGV , HocKy   , NamHoc     , Diem ) 
VALUES(                 2055010227 , 'OOP'   , '3'      , 'NTH', 'HK2'   , 'NH20-21'  , 7.8) 

INSERT INTO BangDiem (  ID_SV     , maMonHoc , maTinChi , maGV , HocKy   , NamHoc     , Diem ) 
VALUES(                 2055010227 , 'CSDL'   , '3'      , 'NTM', 'HK1'   , 'NH20-21'  , 8 ) 


INSERT INTO BangDiem (  ID_SV     , maMonHoc , maTinChi , maGV , HocKy   , NamHoc     , Diem ) 
VALUES(                 2055010203 , 'CTDL'   , '3'      , 'NHN', 'HK1'   , 'NH20-21'  , 8.8) 

INSERT INTO BangDiem (  ID_SV     , maMonHoc , maTinChi , maGV , HocKy   , NamHoc     , Diem ) 
VALUES(                 2055010203 , 'OOP'   , '3'      , 'NTM', 'HK2'   , 'NH20-21'  , 9.2 ) 

INSERT INTO BangDiem (  ID_SV     , maMonHoc , maTinChi , maGV , HocKy   , NamHoc     , Diem ) 
VALUES(                 2055010203 , 'CSDL'   , '3'      , 'NTM', 'HK1'   , 'NH20-21'  , 8.5 ) 


INSERT INTO BangDiem (  ID_SV     , maMonHoc , maTinChi , maGV , HocKy   , NamHoc     , Diem ) 
VALUES(                 2055010101 , 'CTDL'   , '3'      , 'NTH', 'HK2'   , 'NH20-21'  , 8 ) 

INSERT INTO BangDiem (  ID_SV     , maMonHoc , maTinChi , maGV , HocKy   , NamHoc     , Diem ) 
VALUES(                 2055010101 , 'OOP'   , '3'      , 'NTH', 'HK2'   , 'NH20-21'  , 9 ) 

INSERT INTO BangDiem (  ID_SV     , maMonHoc , maTinChi , maGV , HocKy   , NamHoc     , Diem ) 
VALUES(                 2055010101 , 'KTLT'   , '3'      , 'NTM', 'HK1'   , 'NH20-21'  , 8.4 ) 



INSERT INTO BangDiem (  ID_SV     , maMonHoc , maTinChi , maGV , HocKy   , NamHoc     , Diem ) 
VALUES(                 2055010077 , 'CSDL'   , '3'      , 'NHN', 'HK1'   , 'NH20-21'  , 8 ) 

INSERT INTO BangDiem (  ID_SV     , maMonHoc , maTinChi , maGV , HocKy   , NamHoc     , Diem ) 
VALUES(                 2055010077 , 'OOP'   , '3'      , 'NTM', 'HK1'   , 'NH20-21'  , 8.5 ) 

INSERT INTO BangDiem (  ID_SV     , maMonHoc , maTinChi , maGV , HocKy   , NamHoc     , Diem ) 
VALUES(                 2055010077 , 'KTLT'   , '3'      , 'NTM', 'HK2'   , 'NH20-21'  , 7 ) 


