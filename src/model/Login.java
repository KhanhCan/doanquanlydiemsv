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
public class Login {
    private String UserName;
    private String Password;
    private String Ten;
    private String Chucvu;

    public Login() {
    }
    
    
    
    public Login(String UserName, String PassWord, String Ten, String Chucvu) {
            this.UserName = UserName;
            this.Password = PassWord;
            this.Ten = Ten;
            this.Chucvu = Chucvu;
	}

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    public String getPassword() {
        return Password;
    }
    
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getChucvu() {
        return Chucvu;
    }

    public void setChucvu(String Chucvu) {
        this.Chucvu = Chucvu;
    }
     
}
