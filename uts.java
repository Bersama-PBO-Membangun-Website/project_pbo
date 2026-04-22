import java.util.Scanner;

// SUPERCLASS
class Smartphone {
    private String merk;
    private double harga;
    private int ram;

    Smartphone(String merk, double harga, int ram) {
        this.merk = merk;
        this.harga = harga;
        this.ram = ram;
    }

    public String getMerk() {
        return merk;
    }

    public double getHarga() {
        return harga;
    }

    public int getRam() {
        return ram;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void tampilData() {
        System.out.println("Merk: " + merk +
                           ", Harga: " + harga +
                           ", RAM: " + ram + "GB");
    }
}

// SUBCLASS
class SmartphoneGaming extends Smartphone {
    private int refreshRate;

    SmartphoneGaming(String merk, double harga, int ram, int refreshRate) {
        super(merk, harga, ram);
        this.refreshRate = refreshRate;
    }

    @Override
    public void tampilData() {
        System.out.println("Merk: " + getMerk() +
                           ", Harga: " + getHarga() +
                           ", RAM: " + getRam() + "GB" +
                           ", Refresh Rate: " + refreshRate + "Hz");
    }
}

public class UTS {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("TUGAS INDIVIDU: SISTEM INVENTORI INPUT");
        System.out.println("NAMA : GIGIH JUANG PRANANTA");
        System.out.println("NIM  : 25051204416");
        System.out.println("=========================================");

        System.out.print("Masukkan jumlah data: ");
