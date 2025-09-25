import java.util.Scanner;

public class KasirCB{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int pilih, total = 0, totMakan = 0, totMinum = 0, jumlah = 0;
        int nasgor = 0, abm = 0, soto = 0, teh = 0, jrk = 0, diskon = 0;
        int setelah;
        String hari, makan;
        String lanjut = "Y";
        System.out.println("------ Selamat Pagi ------");
        System.out.print("Masukkan Hari: ");
        hari = in.nextLine();

        while (lanjut.equalsIgnoreCase("Y")) {
            System.out.println("========= Warung Makan =========");
            System.out.println("1. Nasi Goreng Spesial Rp 15.000"); // nasgor
            System.out.println("2. Ayam Bakar Madu Rp 25.000"); // abm
            System.out.println("3. Soto Ayam Lamongan Rp 12.000"); //soto
            System.out.println("4. Es Teh Manis Rp 5.000"); //teh
            System.out.println("5. Es Jeruk Rp. 7.000"); // jrk
            System.out.println("----------------------------------");
            System.out.print("Masukkan pilihan: ");
            pilih = in.nextInt();
            System.out.print("Masukkan jumlah : ");
            jumlah = in.nextInt();

            if (pilih == 1) { // PERHITUNGAN KESELURUHAN MENU
                nasgor = 15000 * jumlah;
                totMakan += nasgor;
            } else if ( pilih == 2){
                abm = 25000 * jumlah;
                totMakan += abm;
            } else if (pilih == 3) {
                soto = 12000 * jumlah;
                totMakan += soto;
            } else if (pilih == 4){
                teh = 5000 * jumlah;
                totMinum += teh;
            } else if (pilih == 5) {
                jrk = 7000 * jumlah;
                totMinum += jrk;
            }else {
                System.out.println("Menu Tidak Valid!!!");
            }

            in.nextLine();
            System.out.print("Pesanan lain (Y/T) :");
            lanjut = in.nextLine();
        }

        System.out.print("Bungkus / takeaway: ");
        makan = in.nextLine();

        
        total = totMakan + totMinum;

            if (total > 50000) { // DISKON BELANJA
                setelah = total - (total * 10/100);
                diskon = total * 10/100;
            } else if (total > 100000) {
                setelah = total - (total * 15/100);
                diskon = total * 15/100;
            } else {
                setelah = 0;
                diskon = 0;
            }

            if (hari.equalsIgnoreCase("Jumat") && abm > 0) { //DISKON HARI JUMAT
                diskon += 5000;
            }
        
    }
}