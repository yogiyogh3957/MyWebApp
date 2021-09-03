# MyWebApp

1. Dibutuhkan 1 menu data karyawan dengan fitur sbb:
![Screen Shot 2021-09-03 at 08 08 06](https://user-images.githubusercontent.com/20709687/131936178-11be7192-3cdd-437f-b355-2913ba490d4f.png)

  a. Pencarian data Karyawan

i. Pencarian data karyawan berdasarkan kriteria pencarian yang disediakan :
1. Nama Karyawan
a. Tipe input : textbox
b. System dapat mencari data karyawan berdasarkan nama yang diinput / bagian dari nama yang diinput.
 - SEARCH INPUT :  
    ![Screen Shot 2021-09-03 at 08 17 14](https://user-images.githubusercontent.com/20709687/131936313-8d70f250-467d-45ec-bded-e6be2f07599b.png)    
    - SEARCH RESULT :
    ![Screen Shot 2021-09-03 at 08 17 26](https://user-images.githubusercontent.com/20709687/131936409-9d63219f-1ab5-4277-9b77-e93815a6d499.png)

2. Periode Tanggal Masuk Karyawan [[belum dibuat]]  
a. Tipe Input : DateRangePicker [[belum dibuat]]  
b. System dapat mencari data karyawan yang masuk 
berdasarkan tanggal awal dan tanggal akhir yang 
dimasukkan pada komponen ini. [[belum dibuat]]  
3. Nomor HP / bagian dari nomor HP [[belum dibuat]]  
a. Tipe input : textbox [[belum dibuat]]  
b. System dapat mencari data karyawan berdasarkan nomor 
keseluruhan nilai nomor HP yang diinput / bagian dari 
nomor HP yang diinput.[[belum dibuat]]  

ii. Informasi yang dimunculkan pada hasil pencarian:  
1. Kode Karyawan  
2. Nama Karyawan  
3. Tanggal Masuk Karyawan, format ( DD-MMM-YYYY )  
4. Updated Date, format ( DD-MMM-YYYY )   
![Screen Shot 2021-09-03 at 08 15 34](https://user-images.githubusercontent.com/20709687/131937301-799c2653-f4f2-4340-a95d-f1b6e2feed1b.png)  

b. Input Data Karyawan  
i. Informasi yang dibutuhkan :  
1. Kode Karyawan, auto-increment, dengan format “K-000”, dimana 
“000” adalah nilai incremental.    
2. Nama Karyawan  
3. Tanggal Masuk Kerja  
4. No HP  
5. Limit Reimbursement, ( numerik only )  
6. Created Date → di-isi dengan tanggal system saat data dibuat  
7. Updated Date → di-isi dengan tanggal system saat data di-edit   
![Screen Shot 2021-09-03 at 08 14 03](https://user-images.githubusercontent.com/20709687/131937388-a4e1d437-078e-43e4-9c8f-94ac7421d5f0.png)  

ii. Validasi pada backend: [[belum dibuat]]  
1. Tidak boleh ada karyawan dengan nama yang sama ( non-case 
sensitive →”andi” = “ANDI “ ➔ validated ( X ) ) [[belum dibuat]]  
2. Tanggal Masuk kerja tidak boleh 2 bulan lebih lama dari tanggal 
system dan 3 bulan lebih besar dari tanggal system (tanggal saat ini)[[belum dibuat]]  

c. Edit Data Karyawan  
i. Edit data karyawan berdasarkan kode karyawan   
AKAN DILAKUKAN PENGEDITAN DATA KARYAWAN DENGAN ID (34)  
![Screen Shot 2021-09-03 at 08 14 14](https://user-images.githubusercontent.com/20709687/131937559-46c615da-53bd-4b2d-99fa-c9c5ddd088ba.png)  
MASUK HALAMAN EDIT USER(DENGAN ID : 34, YANG SUDAH AUTOFILL DATA LAMA). NAMA SAYA TAMBAH ((EDITED)) SBB :  
![Screen Shot 2021-09-03 at 08 14 52](https://user-images.githubusercontent.com/20709687/131937723-1a2a4cf1-1b9c-4bb7-8e22-f2312ee9fa1f.png)  
HASIL EDIT AKAN DITAMPILKAN PADA TABEL (PERHATIKAN DATA ID 34, SUDAH TER EDIT) SBB:  
![Screen Shot 2021-09-03 at 08 15 00](https://user-images.githubusercontent.com/20709687/131937853-4a2f4ba3-e42f-4e73-8ed6-db5c8bada522.png)


ii. Validasi pada backend:
1. Tidak boleh ada karyawan dengan nama yang sama
2. Tanggal Masuk kerja tidak boleh 2 bulan lebih lama dari tanggal 
system dan 3 bulan lebih besar dari tanggal system (tanggal saat ini)  

d. Hapus Data Karyawan
i. Hapus data karyawan berdasarkan kode karyawan  
DATA YANG AKAN DIHAPUS ADALAHD ATA DENGAN ID (34), SEHINGGA TAMPILAN TABEL BARU SBB  
![Screen Shot 2021-09-03 at 08 15 34](https://user-images.githubusercontent.com/20709687/131937996-a11e09e5-9f7b-48c6-ae0f-ed79dc5ad4a3.png)  
TABEL TAMPILAN HTML DIATAS SAMA DENGAN TABEL YANG ADA PADA DATABASE SBB:  
<img width="464" alt="Screen Shot 2021-09-03 at 08 16 28" src="https://user-images.githubusercontent.com/20709687/131938109-d7eb91e1-857e-47c2-8bc3-5a7d7d85046a.png">  
DATABASE  
<img width="191" alt="Screen Shot 2021-09-03 at 08 09 05" src="https://user-images.githubusercontent.com/20709687/131938754-f0249af7-bb2b-4bac-ab38-a2ca930d8cb9.png">  
