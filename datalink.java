package antrian;

public class DataLink {
    public DataAntrian CostumerService, Taller;

    public DataLink() {
        CostumerService = null;
        Taller = null;
    }

    public void dataantrian2() {
        DataAntrian DS = new DataAntrian();
        DS.input();
        if (CostumerService == null)
            CostumerService = DS;
        else
            Taller.next = DS;
        Taller = DS;
    }


    public void dataantrian3() {
        if (CostumerService == null) {
            System.out.println("\n" );
            System.out.println("       Data kosong / Sudah Ditampilkan !!" );
        } else {
            System.out.println("\n" );
            System.out.println("            Nomer Antri Dengan KODE : " + CostumerService.kode + " || A/N : " + CostumerService.nama);
            CostumerService = CostumerService.next;
        }
    }
    public void view() {
        if (CostumerService == null) {
            System.out.println("\n" );
            System.out.println(" Data kosong / Sudah Ditampilkan !! " );
        } else {
            System.out.println("\n" );
            System.out.println("=======================================================" );
            System.out.println("   ||KODE \t\t  ||  NAMA \t\t  || TUJUAN \t||" );
            for (DataAntrian a = CostumerService; a!= null; a = a.next) a.read();
            System.out.println("=======================================================" );

        }
    }
}
