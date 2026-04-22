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
