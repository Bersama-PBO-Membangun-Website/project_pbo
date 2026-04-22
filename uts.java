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
