package utsPBO;
 import java.util.Scanner;
  public class MainClass {
   public static void main(String[] args) {
       
    Scanner scanner = new Scanner(System.in);
  
        AplikasiPemesanan pesan = new AplikasiPemesanan();
        
        System.out.println("Selamat datang di aplikasi pemesanan makanan!");
        
        System.out.println("\nSilakan masukkan data pelanggan: "); 
       
        System.out.print("Nama: ");
        String nama = scanner.nextLine(); 
        System.out.print("Nomor Telepon: ");
        String telepon = scanner.nextLine();
        
        pesan.setPelanggan(nama, telepon); 
        
        System.out.println("\nSilakan masukkan data pesanan makanan: ");
        
        System.out.print("Jenis Makanan: ");
        String jenisMakanan = scanner.nextLine(); 
        System.out.print("Jumlah Pesanan: ");
        int jumlahPesanan = scanner.nextInt(); 
       
        pesan.setPesanan(jenisMakanan, jumlahPesanan);
        
        System.out.println("\n" + pesan.getpelanggan()[0][0]); 
        System.out.println(pesan.getpelanggan()[0][1]); 
        
        System.out.println("\n" + pesan.getpesanan()[0][0]); 
        System.out.println(pesan.getpesanan()[0][1]); 
        
        System.out.println("\nTotal harga pesanan: Rp. " + pesan.gettotalHarga() + ",-");
    }
}
   
   
   
   
           

