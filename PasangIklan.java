import java.io.*;

public class PasangIklan extends Iklan {
    int noNota, jmlIklan, durasi, biayaIklan, ppn, totBiaya;
    float diskon;
    String nama, alamat, souvenir, cabang;
    BufferedReader inputString = new BufferedReader(new InputStreamReader(System.in));

    PasangIklan(String cabang){
        this.cabang = cabang;
    }

    public void setNota() throws IOException{
        System.out.println("=============================================");
        System.out.println();
        System.out.println("Iklan Cetak - " + cabang);
        System.out.println();
        System.out.println("No. Nota \t\t: " + noNota);
        System.out.print("Nama Pemasang \t\t: ");
        nama = inputString.readLine();
        System.out.print("Alamat \t\t\t: ");
        alamat = inputString.readLine();
    }

    public void inputJumlah(){
        switch (kodeIklan) {
            case 1:
                System.out.print("Jumlah Baris \t\t: ");
                jmlIklan = inputInt.nextInt();
                break;
            case 2:
                System.out.print("Luas (mmk) \t\t: ");
                jmlIklan = inputInt.nextInt();
                break;
        
            default:
                break;
        }
    }
    
    int getTarifIklan(){
        return tarifIklan;
    }

    public void inputDurasi(){
        System.out.print("Durasi (hari) \t\t: ");
        durasi = inputInt.nextInt();
        System.out.print("Diskon (%) \t\t: ");
        diskon = inputInt.nextInt();
    }

    float getDiskon(){
        float hasilDiskon;
        hasilDiskon = (int)((diskon/100) * (getTarifIklan() * jmlIklan * durasi));
        return hasilDiskon;
    }

    int getBiayaIklan(){
        biayaIklan = (int)((getTarifIklan() * jmlIklan * durasi) - getDiskon());
        return biayaIklan;
    }

    String getSouvenir(){
        if (durasi >= 3 && durasi <= 6) {
            souvenir = "Mug";
        } else if (durasi >= 7 && durasi <= 10) {
            souvenir = "Payung";
        } else if (durasi >= 11 && durasi <= 14) {
            souvenir = "Tas";
        } else {
            souvenir = "";
        }
        return souvenir;
    }

    int getTotal(){
        ppn = (int)(0.1 * getBiayaIklan());
        totBiaya = getBiayaIklan() + ppn;
        return totBiaya;
    }

    public void cetak(){
        System.out.println("Biaya Iklan \t\t: " + getBiayaIklan());
        System.out.println();
        System.out.println("PPN \t\t\t: " + (int)(0.1 * biayaIklan));
        System.out.println("Total Biaya \t\t: " + getTotal());
        System.out.println("Souvenir \t\t: " + getSouvenir());
        System.out.println();
    }

    public void cetakList(){
        System.out.println("Daftar Iklan Cetak " + cabang);
        System.out.println("================================================================================================");
        System.out.println("No\tNota\tProduk Iklan\tTarif\tJml/Luas\tDurasi\tPPN\tTotal Biaya\tSouvenir");
        System.out.println("================================================================================================");
    }
}