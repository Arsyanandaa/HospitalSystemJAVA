# 🍽️ Aplikasi Nota Pemesanan Restoran

Proyek ini merupakan aplikasi sederhana untuk membuat **nota pemesanan makanan** di sebuah restoran.  
Aplikasi ini dibuat menggunakan **Java (Swing GUI)** sebagai bagian dari tugas praktikum.  
Fitur utama meliputi pemilihan menu, input jumlah pesanan, perhitungan subtotal dan total harga, serta menampilkan nota akhir.

---

## ✨ Fitur Utama

- ✅ Input nama pelanggan
- ✅ Pemilihan **menu utama** dan **menu tambahan**
- ✅ Input jumlah pesanan
- ✅ Perhitungan subtotal dan total otomatis
- ✅ Default value "Tamu" bila nama pelanggan tidak diisi
- ✅ Implementasi **Autocomplete** (CTRL + SPACE) untuk efisiensi coding
- ✅ Implementasi **Custom Live Template** pada blok perhitungan

---

## 🧠 Penjelasan Teknis

### 1. Struktur Kode

- **Class `ItemMenu`**  
  Menyimpan data menu (nama dan harga).

- **Class `ambijumlahpesanan`**  
  Menampung jumlah pesanan menu utama dan tambahan.

- **Method `hitungSubTotal()`**  
  Menghitung subtotal tiap menu (harga × jumlah).

- **Bagian Event Handler Tombol “Hitung”**  
  Melakukan:
    - Parsing input jumlah dari `JTextField`
    - Mengambil item menu dari `JComboBox`
    - Menghitung subtotal dan total
    - Menampilkan hasil ke area nota

---

### 2. Autocomplete
Fitur **Autocomplete (Ctrl + Space)** digunakan untuk mempercepat penulisan kode, misalnya:
```java
int jumlah1 = Integer.parseInt(qtyUtama.getText().trim());
