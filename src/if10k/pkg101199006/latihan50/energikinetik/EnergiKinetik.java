/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg101199006.latihan50.energikinetik;

/**
 *
 * @author senenngahenen
 */
public class EnergiKinetik {
    private double massa, kecepatan;
    
    public EnergiKinetik(double massa, double kecepatan) {
        this.massa = massa;
        this.kecepatan = kecepatan;
    }
    
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getMassa() {
        return massa;
    }
    
    public double getKecepatan() {
        return kecepatan;
    }
    
    public double hitungEnergiKinetik(double massa, double kecepatan) {
        return (massa * kecepatan * kecepatan) / 2;
    }
    
    public double usahaKetikaDiam(double energiKinetik) {
        return energiKinetik;
    }
    
}
