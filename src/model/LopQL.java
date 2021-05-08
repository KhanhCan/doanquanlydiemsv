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
public class LopQL {
     private String LOPQL;
    private float KHOA;
    private int SISO;
    
    public LopQL(){
        
    }
    public LopQL(String LOPQL, float KHOA, int SISO) {
        this.LOPQL = LOPQL;
        this.KHOA = KHOA;
        this.SISO = SISO;
    }

    public String getLOPQL() {
        return LOPQL;
    }

    public void setLOPQL(String LOPQL) {
        this.LOPQL = LOPQL;
    }
    
    public void setKHOA(float KHOA) {
        this.KHOA = KHOA;
    }
    
    public float getKHOA() {
        return KHOA;
    }

    public int getSISO() {
        return SISO;
    }

    public void setSISO(int SISO) {
        this.SISO = SISO;
    }
    
}
