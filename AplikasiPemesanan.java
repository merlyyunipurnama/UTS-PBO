package utsPBO;

public class AplikasiPemesanan {
    private String[][] pelanggan;
    private Object[][] pesanan;
    private int totalHarga;
    
    public void setPelanggan(String nama, String telepon) {
        this.pelanggan = new String[][]{{"Data Pelanggan: "+ "\nNama: " + nama, "Nomor Telepon: " + telepon}};
    }
    
    public void setPesanan(String jenisMakanan, int jumlahPesanan) {
        this.pesanan = new Object[][]{{"Data Pesanan Makanan: "+ "\nJenis Makanan: " +jenisMakanan, "Jumlah Pesanan: " + jumlahPesanan, "Harga Per Porsi: Rp. 10000,-"}};
        this.totalHarga = jumlahPesanan;
    }
    
    public void hitungTotalHarga(int harga) {
        this.totalHarga = 10000 * (int) this.pesanan[0][1];
    }
    
    public String[][] getpelanggan() {
        return this.pelanggan;
    }
    
    public Object[][] getpesanan() {
        return this.pesanan;
    }
    
    public int gettotalHarga() {
        return this.totalHarga*10000;
    }
}
