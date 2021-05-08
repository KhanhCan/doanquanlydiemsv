/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Monhoc {
    private String MAMH;
    private String TENMH;
    private String SOTINCHI;
    private String TINHCHATMH;

    public Monhoc() {
        
    }

    public Monhoc(String MAMH, String TENMH, String SOTINCHI, String TINHCHATMH) {
        this.MAMH = MAMH;
        this.TENMH = TENMH;
        this.SOTINCHI = SOTINCHI;
        this.TINHCHATMH = TINHCHATMH;
    }
    
    public String getMAMH() {
        return MAMH;
    }

    public void setMAMH(String MAMH) {
        this.MAMH = MAMH;
    }

    public String getTENMH() {
        return TENMH;
    }

    public void setTENMH(String TENMH) {
        this.TENMH = TENMH;
    }

    public String getSOTINCHI() {
        return SOTINCHI;
    }

    public void setSOTINCHI(String SOTINCHI) {
        this.SOTINCHI = SOTINCHI;
    }

    public String getTINHCHATMH() {
        return TINHCHATMH;
    }

    public void setTINHCHATMH(String TINHCHATMH) {
        this.TINHCHATMH = TINHCHATMH;
    }
}
