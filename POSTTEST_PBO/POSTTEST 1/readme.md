
Program ini merupakan aplikasi berbasis Java yang digunakan untuk mengelola data mahasiswa beserta tipe kepribadian MBTI dan status keaktifannya. Program ini dibuat dengan menerapkan konsep **Object-Oriented Programming (OOP)**, khususnya:

* Inheritance (Pewarisan)
* Polymorphism (Statis & Dinamis)

---

##  Tujuan

* Memahami dan mengimplementasikan konsep OOP dalam Java
* Menerapkan polymorphism secara **logis dan tidak mengada-ada**
* Mengelola data mahasiswa dengan pendekatan berbasis objek

---

##  Struktur Class

### 1. `Mahasiswa` (Superclass)

Class induk yang menyimpan atribut dasar:

* NIM
* Nama
* Jurusan

Method:

* `tampilData()` → menampilkan data dasar
* `tampilData(boolean detail)` → **overloading (polymorphism statis)**

---

### 2. `MahasiswaMBTI` (Subclass)

Turunan dari `Mahasiswa` yang menambahkan:

* Tipe MBTI

Method:

* Override `tampilData()` → menampilkan data + MBTI

---

### 3. `MahasiswaAktif` (Subclass)

Turunan dari `Mahasiswa` yang menambahkan:

* Status mahasiswa

Method:

* Override `tampilData()` → menampilkan data + status

---

### 4. `Main`

Class utama untuk menjalankan program:

* Menyimpan data dalam `ArrayList<Mahasiswa>`
* Menu interaktif:

  1. Tambah Data
  2. Lihat Data
  3. Exit

---

##  Konsep OOP yang Digunakan

###  1. Inheritance (Pewarisan)

Subclass:

* `MahasiswaMBTI`
* `MahasiswaAktif`

Mewarisi atribut dan method dari class `Mahasiswa`.

---

###  2. Polymorphism Statis (Method Overloading)

Terdapat pada class `Mahasiswa`:

```java
public void tampilData()
public void tampilData(boolean detail)
```

Penjelasan:

* Method memiliki nama sama
* Parameter berbeda
* Digunakan untuk menampilkan informasi tambahan

---

###  3. Polymorphism Dinamis (Method Overriding)

Terjadi pada:

```java
@Override
public void tampilData()
```

di:

* `MahasiswaMBTI`
* `MahasiswaAktif`

Dipanggil melalui:

```java
for (Mahasiswa m : dataMahasiswa) {
    m.tampilData();
}
```

Penjelasan:

* Method yang dijalankan bergantung pada objek (runtime)
* Jika objek `MahasiswaMBTI` → tampil MBTI
* Jika objek `MahasiswaAktif` → tampil status

---

##  Cara Menjalankan Program

1. Buka project di IDE (IntelliJ IDEA / VS Code / NetBeans)
2. Pastikan semua file berada dalam package yang sama (`Posttest3`)
3. Jalankan `Main.java`
4. Gunakan menu:

   * Tambah data mahasiswa
   * Lihat data yang telah disimpan

---

##  Contoh Output

```
===== SISTEM MANAJEMEN MBTI =====
1. Tambah Data
2. Lihat Data
3. Exit

=== DATA MAHASISWA ===
NIM     : 123
Nama    : Andi
Jurusan : Informatika
Tipe MBTI : INTJ
----------------------
```

---

##  Kelebihan Program

* Struktur OOP jelas dan rapi
* Menggunakan polymorphism secara nyata dan logis
* Mudah dikembangkan (fitur tambah/edit/hapus)

---

##  Pengembangan Selanjutnya

* Menambahkan fitur:

  * Edit data
  * Hapus data
  * Simpan ke file (File Handling)
* Menambahkan GUI (Java Swing / JavaFX)

---

##  Kesimpulan

Program ini berhasil mengimplementasikan konsep:

* Inheritance
* Polymorphism statis (overloading)
* Polymorphism dinamis (overriding)

Dengan struktur yang modular dan logis, program ini memenuhi seluruh instruksi tugas serta siap untuk dikembangkan lebih lanjut.

---

 Dibuat untuk memenuhi tugas praktikum Pemrograman Berbasis Objek (PBO)
