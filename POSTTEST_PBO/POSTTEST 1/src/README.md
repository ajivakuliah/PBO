# Sistem Manajemen MBTI Mahasiswa

Program Sistem Manajemen MBTI Mahasiswa merupakan aplikasi berbasis Java yang dibuat menggunakan konsep Pemrograman
Berorientasi Objek (PBO)

Program ini digunakan untuk mengelola data mahasiswa beserta tipe kepribadian MBTI mereka. Data disimpan sementara
menggunakan struktur data ArrayList, sehingga program dapat melakukan operasi CRUD (Create, Read, Update, Delete)
terhadap data mahasiswa.

Program berjalan menggunakan menu interaktif di terminal, dan akan terus berjalan sampai pengguna memilih menu Exit.

---

# Struktur Program

Class ini digunakan sebagai **model data mahasiswa**.

Atribut yang dimiliki:

* NIM - Nomor induk mahasiswa
* Nama - Nama mahasiswa
* Jurusan - Program studi mahasiswa
* Tipe MBTI - Tipe kepribadian MBTI mahasiswa (contoh: INTJ, ENFP, ISTP)

Class ini juga memiliki:

* Getter dan Setter untuk mengakses dan mengubah data
* Method tampilData() untuk menampilkan data mahasiswa

---


Class ini merupakan class utama yang menjalankan program.

Fungsi utama class ini:

* Menyimpan data mahasiswa menggunakan ArrayList
* Menyediakan menu interaktif
* Menjalankan operasi CRUD

---

# Fitur Program

Program memiliki beberapa fitur utama yaitu:

Fitur ini digunakan untuk menambahkan data mahasiswa baru.

Data yang perlu diisi:

* NIM
* Nama
* Jurusan
* Tipe MBTI

Data yang dimasukkan akan disimpan ke dalam **ArrayList**.

---


Fitur ini digunakan untuk **menampilkan seluruh data mahasiswa yang tersimpan**.

Program akan menampilkan:

* Nomor data
* NIM
* Nama
* Jurusan
* Tipe MBTI

Jika belum ada data, program akan menampilkan pesan **"Belum ada data."**

---


Fitur ini digunakan untuk **mengubah data mahasiswa yang sudah ada**.

Langkah penggunaan:

1. Program menampilkan seluruh data mahasiswa.
2. Pengguna memilih **nomor data yang ingin diubah**.
3. Pengguna memasukkan **data baru** seperti:

    * Nama
    * Jurusan
    * Tipe MBTI
4. Data akan diperbarui sesuai input terbaru.

---


Fitur ini digunakan untuk **menghapus data mahasiswa dari sistem**.

Langkah penggunaan:

1. Program menampilkan seluruh data mahasiswa.
2. Pengguna memilih **nomor data yang ingin dihapus**.
3. Program akan menghapus data tersebut dari **ArrayList**.

---


Fitur ini digunakan untuk **menghentikan program**.

Jika pengguna memilih menu **Exit**, maka program akan selesai dijalankan dan keluar dari sistem.

---

# Cara Menjalankan Program

1. Buka project menggunakan **IntelliJ IDEA**.
2. Pastikan file berikut tersedia:

    * `Main.java`
    * `MahasiswaMBTI.java`
3. Jalankan file **Main.java**.
4. Program akan menampilkan menu seperti berikut:

```
===== SISTEM MANAJEMEN MBTI MAHASISWA =====
1. Tambah Data
2. Lihat Data
3. Update Data
4. Hapus Data
5. Exit
```

5. Masukkan angka sesuai menu yang ingin digunakan.

---

# Contoh Penggunaan Program

Contoh menambahkan data mahasiswa:

```
Pilih menu: 1

=== Tambah Data Mahasiswa ===
NIM: 22101145
Nama: Andi Saputra
Jurusan: Informatika
Tipe MBTI: INTJ
```

Setelah data ditambahkan, pengguna dapat melihatnya melalui menu **Lihat Data**.

---


