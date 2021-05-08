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
public class Diem {
     private String MSSV;
    private String MAMH;
    private float DQT;
    private float DKT;
  
    public Diem(){
        
    }
     
      public Diem(String MSSV, String MAMH, float DQT, float DKT){
        this.MSSV = MSSV;
        this.MAMH = MAMH;
        this.DQT = DQT;
        this.DKT = DKT;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getMAMH() {
        return MAMH;
    }

    public void setMAMH(String MAMH) {
        this.MAMH = MAMH;
    }

    public float getDQT() {
        return DQT;
    }

    public void setDQT(float DQT) {
        this.DQT = DQT;
    }

    public float getDKT() {
        return DKT;
    }

    public void setDKT(float DKT) {
        this.DKT = DKT;
    }
    
   
   
}
