package antrian;

import java.util.Scanner;
public class DataAntrian {
    public int kode;
    public String nama, antrian;
    public DataAntrian next;
    public Scanner in = new Scanner(System.in);
    public Scanner str = new Scanner(System.in);


    public void input(){
        System.out.println();
        System.out.print( " Masukkan nomer antrian   :   ");
        kode = in.nextInt();
        System.out.print( " Masukkan Nama     :   ");
        nama=str.nextLine();
        System.out.print( " Silahkan Masukkan Tujuan Anda    :   ");
        antrian=str.nextLine();
        next=null;
    }

    public void read(){
        System.out.println("   || "+kode+"\t\t   || "+nama+"\t\t|| "+antrian+"\t\t ||  " );
    }
}
