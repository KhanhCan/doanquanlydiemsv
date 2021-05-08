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
public class SinhVien {
     private int MSSV;
    private String HOTEN;
    private String LOPQL;
    private int KHOA;
    private String GIOITINH;
    private String NGAYSINH;
    private String QUEQUAN;

    public SinhVien() {
        
    }

    public SinhVien(int MSSV, String HOTEN, String LOPQL, int KHOA, String GIOITINH, String NGAYSINH, String QUEQUAN) {
        this.MSSV = MSSV;
        this.HOTEN = HOTEN;
        this.LOPQL = LOPQL;
        this.KHOA = KHOA;
        this.GIOITINH = GIOITINH;
        this.NGAYSINH = NGAYSINH;
        this.QUEQUAN = QUEQUAN;
    }

    public int getMSSV() {
        return MSSV;
    }
    
    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public String getHOTEN() {
        return HOTEN;
    }
    
    public void setHOTEN(String HOTEN) {
        this.HOTEN = HOTEN;
    }

    public String getLOPQL() {
        return LOPQL;
    }
    
    public void setLOPQL(String LOPQL) {
        this.LOPQL = LOPQL;
    }

    public int getKHOA() {
        return KHOA;
    }
    
    public void setKHOA(int KHOA) {
        this.KHOA = KHOA;
    }

    public String getGIOITINH() {
        return GIOITINH;
    }
    
    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    public String getNGAYSINH() {
        return NGAYSINH;
    }
    
    public void setNGAYSINH(String NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }

    public String getQUEQUAN() {
        return QUEQUAN;
    }
    
    public void setQUEQUAN(String QUEQUAN) {
        this.QUEQUAN = QUEQUAN;
    }    
}
