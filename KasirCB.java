import java.util.Scanner;

public class KasirCB{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int pilih, total = 0, totMakan = 0, totMinum = 0, jumlah = 0;
        int nasgor = 0, abm = 0, soto = 0, teh = 0, jrk = 0, diskon = 0;
        int totnasgor = 0, totabm = 0, totsoto = 0, totteh = 0, totjrk = 0; //total item per menu
        int bungkus = 0;
        String hari, makan;
        String lanjut = "Y";
        System.out.println("--------------- Selamat Pagi ---------------");
        System.out.print("Masukkan Hari : ");
        hari = in.nextLine();

        System.out.println("--------------------------------------------");
        System.out.println("=============== WARUNG MAKAN ===============");

        while (lanjut.equalsIgnoreCase("Y")) {
            System.out.println("--------------------------------------------");
            System.out.println("Kode\t| Menu Makanan/Minuman\t| Harga");
            System.out.println("1.\t| Nasi Goreng Spesial\t| Rp. 15.000"); // nasgor
            System.out.println("2.\t| Ayam Bakar Madu\t| Rp. 25.000"); // abm
            System.out.println("3.\t| Soto Ayam Lamongan\t| Rp. 12.000"); //soto
            System.out.println("4.\t| Es Teh Manis\t\t| Rp. 5.000"); //teh
            System.out.println("5.\t| Es Jeruk\t\t| Rp. 7.000"); // jrk
            System.out.println("--------------------------------------------");
            System.out.print("Masukkan Kode Menu : ");
            pilih = in.nextInt();
            System.out.print("Masukkan Jumlah : ");
            jumlah = in.nextInt();

            if (pilih == 1) { // PERHITUNGAN KESELURUHAN MENU
                nasgor = 15000 * jumlah;
                totMakan += nasgor;
                totnasgor += jumlah;
            } else if ( pilih == 2){
                abm = 25000 * jumlah;
                totMakan += abm;
                totabm += jumlah;
            } else if (pilih == 3) {
                soto = 12000 * jumlah;
                totMakan += soto;
                totsoto += jumlah;
            } else if (pilih == 4){
                teh = 5000 * jumlah;
                totMinum += teh;
                totteh += jumlah;
            } else if (pilih == 5) {
                jrk = 7000 * jumlah;
                totMinum += jrk;
                totjrk += jumlah;
            }else {
                System.out.println("Menu Tidak Valid!!!");
            }

            in.nextLine();
            System.out.print("Pesanan lain (Y/T) : ");
            lanjut = in.nextLine();
        }


        System.out.print("Bungkus / Takeaway (Y/T) : ");
        makan = in.nextLine();

        
        total = totMakan + totMinum;

            if (total > 100000) { // DISKON BELANJA
                diskon += total * 15/100;
            } else if (total > 50000) {
                diskon += total * 10/100;
            } else {
                diskon += 0;
            }

            if (hari.equalsIgnoreCase("Jumat") && abm > 0) { //DISKON HARI JUMAT
                diskon += 5000;
            }

            if (makan.equalsIgnoreCase("Y")) {
                if (nasgor > 0) bungkus += 2000;
                if (abm > 0) bungkus += 2000;
                if (soto > 0) bungkus += 2000;
            }

        System.out.println("--------------------------------------------");
        System.out.println("============= STRUK PEMBAYARAN =============");
        System.out.println("--------------------------------------------");
        System.out.println("Item Dipesan : ");
        if (nasgor > 0) System.out.printf("Nasi Goreng Spesial\tx%d  Rp. %,d\n", totnasgor, nasgor);
        if (abm > 0) System.out.printf("Ayam Bakar Madu\t\tx%d  Rp. %,d\n", totabm, abm);
        if (soto > 0) System.out.printf("Soto\t\t\tx%d  Rp. %,d\n", totsoto, soto);
        if (teh > 0) System.out.printf("Teh\t\t\tx%d  Rp. %,d\n", totteh, teh);
        if (jrk > 0) System.out.printf("Jeruk\t\t\tx%d  Rp. %,d\n", totjrk, jrk);
        System.out.println("--------------------------------------------");
        System.out.printf("Total Belanja Awal\t: Rp. %,d\n", total);
        if (diskon > 0)System.out.printf("Diskon Belanja\t\t: - Rp. %,d\n", diskon);
        if (bungkus > 0) System.out.printf("Biaya Bungkus\t\t: + Rp. %,d\n", bungkus);
        System.out.println("--------------------------------------------");
        System.out.printf("Subtotal\t\t: Rp. %,d\n", (total-diskon+bungkus));
        System.out.printf("Pajak (10%%)\t\t: + Rp. %,d\n", ((total-diskon+bungkus)*10/100));
        System.out.println("--------------------------------------------");
        System.out.printf("TOTAL PEMBAYARAN\t: Rp. %,d\n", ((total-diskon+bungkus)+((total-diskon+bungkus)*10/100)));
        System.out.println("--------------------------------------------");
    }
}