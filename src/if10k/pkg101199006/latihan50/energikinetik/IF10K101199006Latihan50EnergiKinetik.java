/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg101199006.latihan50.energikinetik;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class IF10K101199006Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnergiKinetik energiKinetik = new EnergiKinetik(0.145, 25);
        
        double kinetik = energiKinetik.hitungEnergiKinetik(energiKinetik.getMassa(), energiKinetik.getKecepatan());
        
        System.out.println("========= Energi Kinetik =========");
        System.out.println("Diketahui :");
        System.out.println("Massa \t\t\t = " + energiKinetik.getMassa() + " kg");
        System.out.println("Kecepatan \t\t = " + energiKinetik.getKecepatan() + " m/s");
        System.out.println("Maka :");
        System.out.printf("Energi Kinetik \t\t = %.4f J%n", kinetik);
        System.out.printf("Usaha Saat Diam \t = %.4f J%n", energiKinetik.usahaKetikaDiam(kinetik));
        System.out.println("");
        System.out.printf("Jadi energi kinetik dan usahanya bernilai sama yaitu sebesar %.4f J%n", kinetik );
    }
    
}
