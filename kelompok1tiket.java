public class tiket extends cust {

    private String kode;
    private int harga;
    private String jam;

    public String getKode(){
        return this.kode;
    }
    public void setKode(String kd){
        this.kode = kd;
    }
    public int getHarga(){
        return this.harga;
    }
    public void setHarga(int hg){
        this.harga = hg;
    }
    public String getJam(){
        return this.jam;
    }
    public void setJam(String waktu){
        this.jam = waktu;
    }
}
