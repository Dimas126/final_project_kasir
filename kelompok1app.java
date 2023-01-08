import java.util.Scanner;

public class app{
  
    public static void main(String[]args){
        String kode;
        String jam;

        int harga = 35000;
        try (Scanner input = new Scanner(System.in)) {
            tiket user = new tiket();
            System.out.println("**** PEMESANAN TIKET KONSER ****");
            System.out.print("Masukkan Nama : ");
            String nama = input.next();
            System.out.print("Masukkan No. Telpon : ");
            String nomor = input.next();

            user.setNama(nama);
            user.setTelp(nomor);

            System.out.println("===========================================");
            System.out.println(">>List Konser Yang Akan Tampil<<");
            System.out.println("1. BTS");
            System.out.println("2. PETERPAN");
            System.out.println("3. ARMADA");
            System.out.println("4. TIPE-X");
            System.out.println("5. TULUS");
            System.out.print("-> Masukkan Pilihan : ");
            int n = input.nextInt();
            if (n==1){
                kode = "A001";
            }else if(n==2){
                kode = "A002";
            }else if(n==3){
                kode = "A003";
            }else if(n==4){
                kode = "A004";
            }else{
                kode = "A005";
            }

            System.out.println("====================================");
            System.out.println(">>Pilih Jam Perfom<<");
            System.out.println("1. 08.00");
            System.out.println("2. 11.00");
            System.out.println("3. 14.00");
            System.out.println("4. 17.00");
            System.out.println("5. 20.00");
            System.out.print("-> Masukkan Pilihan : ");
            int i = input.nextInt();
            if (i==1){
                jam = "08.00";
            }else if(i==2){
                jam = "11.00";
            }else if(i==3){
                jam = "14.00";
            }else if(i==4){
                jam = "17.00";
            }else{
                jam = "20.00";
            }

            user.setKode(kode);
            user.setJam(jam);
            user.setHarga(harga);

            System.out.println(" ");
            System.out.println(" ");
            System.out.println("=========== INVOICE PEMESANAN TIKET ==========");
            System.out.println("Nama Pelanggan\t\t: " + user.getNama());
            System.out.println("No. Telpon\t\t: " + user.getTelp());
            System.out.println("==============================================");
            System.out.println("Kode Konser\t\t: " + user.getKode());
            System.out.println("Jam Perfom\t\t: " + user.getJam() + "WIB");
                    System.out.println("Harga Tiket\t\t: " + user.getHarga());
        }
        System.out.println("==============================================");
        System.out.println("\n");
    }
}
