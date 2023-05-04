import java.util.Scanner;
import java.io.IOException;

public class Toko {
    public static void main(String[] args) throws IOException {
        int jmlPpn = 0;
        int jmlTotBiaya = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah Data Iklan : ");
        int n = input.nextInt();
        System.out.println();
        PasangIklan[] data = new PasangIklan[n];
        for (int i = 0; i < n; i++) {
            data[i] = new PasangIklan("Semarang");
            data[i].noNota = 100000 + i;
            data[i].setNota();
            data[i].inputIklan();
            data[i].inputJumlah();
            data[i].inputDurasi();
            data[i].cetak();
        }

        data[0].cetakList();
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "\t" + data[i].noNota + "\t" + data[i].namaIklan + "\t" +
            data[i].getTarifIklan() + "\t" + data[i].jmlIklan + "\t\t" + data[i].durasi + "\t" +
            data[i].ppn + "\t" + data[i].getTotal() + "\t\t" + data[i].getSouvenir());
        }

        System.out.println("================================================================================================");
        for (int i = 0; i < n; i++) {
            jmlPpn += data[i].ppn;
            jmlTotBiaya += data[i].getTotal();
        }
        System.out.println("\t\t\t\t\t***Total***\t\t" + jmlPpn + "\t" + jmlTotBiaya);
        System.out.println("================================================================================================");
    }
}