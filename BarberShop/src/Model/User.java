/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author henrique
 */
public class User extends People {
    
    protected String accesslevel;
    protected String password;

    public User(int id, String name, String password) {
        super(id, name);
        this.password = password;
    }

    public User(int id, String name, char gender, String birthdate, String phonenumber, String email, String rg, String password, String accesslevel ) {
        super(id, name, gender, birthdate, phonenumber, email, rg);
        this.accesslevel = accesslevel;
        this.password = password;
    }
    
    public String getAccesslevel() {
        return accesslevel;
    }

    public void setAccesslevel(String accesslevel) {
        this.accesslevel = accesslevel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
