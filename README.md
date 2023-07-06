# Ujian Tengah Semester-PBO

Membuat aplikasi sederhana untuk menerima pesanan makanan dari pelanggan dengan menerapkan konsep encapculation dan inheritance pada programnya.

- Nama  : Merly Yuni Purnama
- NPM   : G1A022006
- Kelas : Informatika-B

## Deskripsi Singkat Mengenai Aplikasi 

Aplikasi ini adalah sebuah program sederhana untuk melakukan pemesanan makanan. Pengguna diminta untuk memasukkan data pelanggan, seperti nama dan nomor telepon, serta data pesanan makanan, seperti jenis makanan dan jumlah pesanan. Aplikasi ini akan menyimpan informasi pelanggan dan pesanan yang dimasukkan oleh pengguna. Selain itu, aplikasi ini juga menghitung total harga pesanan berdasarkan jumlah pesanan yang dimasukkan. Setelah pengguna selesai memasukkan data, informasi pelanggan, informasi pesanan, dan total harga akan ditampilkan di layar. Namun, aplikasi ini memiliki beberapa kekurangan dan perbaikan yang perlu dilakukan untuk mengoptimalkan fungsionalitasnya.

## Penjelasan Source Code

1. Package: ```package utsPBO;```
- Mendefinisikan package (kelompok) dari kelas-kelas yang terdapat dalam file ini. Dalam hal ini, kelas-kelas terdapat dalam package utsPBO.
2. Kelas AplikasiPemesanan: ```public class AplikasiPemesanan { ... }```
- Mendefinisikan kelas AplikasiPemesanan yang merupakan kelas utama dalam file ini.
3. Variabel private:
- ```private String[][] pelanggan```: Matriks dua dimensi yang menyimpan informasi pelanggan, seperti nama dan nomor telepon.
- ```private Object[][] pesanan```: Matriks dua dimensi yang menyimpan informasi pesanan makanan, seperti jenis makanan, jumlah pesanan, dan harga per porsi.
- ```private int totalHarga```: Menyimpan total harga pesanan.
4. Metode ```setPelanggan```: ```public void setPelanggan(String nama, String telepon) { ... }```
- Metode untuk mengatur informasi pelanggan.
- Menerima dua argumen string nama dan telepon untuk diatur dalam variabel pelanggan.
5. Metode ```setPesanan```: ```public void setPesanan(String jenisMakanan, int jumlahPesanan) { ... }```
- Metode untuk mengatur informasi pesanan makanan.
- Menerima argumen string ```jenisMakanan``` dan integer ```jumlahPesanan``` untuk diatur dalam variabel ```pesanan```.
6. Metode ```hitungTotalHarga```: ```public void hitungTotalHarga(int harga) { ... }```
- Metode untuk menghitung total harga pesanan.
- Menerima argumen integer ```harga``` yang tidak digunakan dalam metode ini.
- Menggunakan informasi dari ```pesanan``` untuk menghitung total harga dan menyimpannya dalam variabel ```totalHarga```.
7. Metode ```getpelanggan```: ```public String[][] getpelanggan() { ... }```
- Metode untuk mendapatkan informasi pelanggan.
- Mengembalikan nilai dari variabel ```pelanggan```.
8. Metode ```getpesanan```: ```public Object[][] getpesanan() { ... }```
- Metode untuk mendapatkan informasi pesanan makanan.
- Mengembalikan nilai dari variabel ```pesanan```.
9. Metode ```gettotalHarga```: ```public int gettotalHarga() { ... }```
- Metode untuk mendapatkan total harga pesanan.
- Mengembalikan nilai dari variabel ```totalHarga``` setelah dikalikan dengan 10000.
10. Kelas MainClass: ```public class MainClass { ... }```
- Mendefinisikan kelas ```MainClass``` yang berisi metode main sebagai titik masuk (entry point) program.
11. Metode ```main```: ```public static void main(String[] args) { ... }```
- Metode utama yang akan dieksekusi ketika program dijalankan.
- Membuat objek ```Scanner``` untuk menerima masukan dari pengguna.
- Membuat objek ```AplikasiPemesanan``` dan menggunakan objek tersebut untuk melakukan operasi pemesanan makanan.
12. Interaksi dengan Pengguna:
- Menggunakan objek ```Scanner``` untuk meminta masukan dari pengguna, seperti nama, nomor telepon, jenis makanan, dan jumlah pesanan.
- Memanggil metode ```setPelanggan``` untuk mengatur informasi pelanggan berdasarkan masukan pengguna.
- Memanggil metode ```setPesanan``` untuk mengatur informasi pesanan makanan berdasarkan masukan pengguna.
- Menampilkan informasi pelanggan dan pesanan yang telah diatur menggunakan metode ```getpelanggan``` dan ```getpesanan```.
- Menampilkan total harga pesanan menggunakan metode ```gettotalHarga```.

Dalam kode ```MainClass```, terdapat implementasi sederhana untuk menggunakan kelas ```AplikasiPemesanan``` dengan interaksi pengguna melalui konsol. Pengguna diminta untuk memasukkan data pelanggan dan data pesanan makanan, kemudian informasi tersebut ditampilkan di layar.

## Contoh Output Program

<img width="270" alt="Screenshot 2023-07-06 203327" src="https://github.com/merlyyunipurnama/UTS-PBO/assets/129154889/658b7def-481c-49ea-8757-fe94563a01a3">

## Authors

- [@merlyyunipurnama](https://www.github.com/octokatherine)
