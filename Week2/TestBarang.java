package Week2;

public class TestBarang {
    public static void main(String[] args) {
        Barang brg1= new Barang();
        brg1.namaBrg="Pensil";
        brg1.jenisBrg="ATK";
        brg1.tampilBarang();
        System.out.println("Stok Batu adalah "+brg1.tambahStok(20));
    }
}
