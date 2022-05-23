/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apkberatbadan;

/**
 *
 * @author Unknown
 */
public class IndeksMassaTubuh {
    private double beratBadan;
    private double tinggiBadan;
    double hasil;
    
    public IndeksMassaTubuh(double beratBadan, double tinggiBadan){
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    /**
     * @return the beratBadan
     */
    public double getBeratBadan() {
        return beratBadan;
    }
    public void setBeratBadan(double beratBadan){
        this.beratBadan = beratBadan;
    }

    /**
     * @return the tinggiBadan
     */
    public double getTinggiBadan() {
        return tinggiBadan;
    }
    public void setTinggiBadan(double tinggiBadan){
        this.tinggiBadan = tinggiBadan;
    }
    
    public double getHasil() {
        return hasil;
    }
    public void setHasil(double hasil){
        this.hasil = hasil;
    }
    
    public double hitungHasil(){
        return (beratBadan / (tinggiBadan*tinggiBadan));
    }
    
}
