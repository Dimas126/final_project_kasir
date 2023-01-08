package antrian;
import  java.util.Scanner;

public class app {
    public static void main (String[] args){
        int menu;
        Scanner input= new Scanner(System.in);
        DataLink DL=new DataLink();

        System.out.println ("==================================================");
        System.out.println ("|          Selamat Datang Di Bank ABC            |");
        System.out.println ("|            Kantor Cabang Sumenep               |");
        System.out.println ("|            Jl Dokter Cipto No 126              |");
        System.out.println ("==================================================");

        do {
            System.out.println("\n");
            System.out.println("____________________________________");
            System.out.println("|     1. Ambil Nomor Antrian       |");
            System.out.println("|     2. Panggil Nomor Antrian     |");
            System.out.println("|     3. Data Antrian              |");
            System.out.println("|     4. Selesai                   |");
            System.out.println("|__________________________________|");

            System.out.print(" Silahkan Pilih Pelayanan : ");
            menu = input.nextInt();

            if (menu == 1) {
                DL.dataantrian2();
            } else if (menu ==2) {
                DL.dataantrian3();
            } else if (menu ==3) {
                DL.view();
            } else if (menu == 4) {
                System.out.println("\n");
                System.out.println("  Terimakasih Sudah Berkunjung ");
                System.out.println("\n");
            } else {
                System.out.println("\n");
                System.out.println("  data Yang Anda Inputkan Salah ");
            }
        }while (menu!=4);
    }
}
