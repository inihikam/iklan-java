import java.util.*;

public class Iklan {
    int kodeIklan, tarifIklan;
    String namaIklan;
    Scanner inputInt = new Scanner(System.in);

    public void inputIklan(){
        do {
            System.out.println("Kode Produk \t\t: ");
            System.out.println("1. Iklan Baris");
            System.out.println("2. Iklan Display");
            System.out.print("Kode \t\t\t: ");
            kodeIklan = inputInt.nextInt();
            switch (kodeIklan) {
                case 1:
                    namaIklan = "Iklan Baris";
                    System.out.println("Produk Iklan \t\t: " + namaIklan);
                    tarifIklan = 20000;
                    System.out.println("Tarif Iklan \t\t: Rp. " + tarifIklan + "/baris");
                    break;

                case 2:
                    namaIklan = "Iklan Display";
                    System.out.println("Produk Iklan \t\t: " + namaIklan);
                    tarifIklan = 25000;
                    System.out.println("Tarif Iklan \t\t: Rp. " + tarifIklan + "/mmk");
                    break;
            
                default:
                    System.out.println("Kode iklan tidak tersedia!");
                    System.out.println();
                    break;
            }
        } while (kodeIklan < 1 || kodeIklan > 2);
    }
}