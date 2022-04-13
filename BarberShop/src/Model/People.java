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
//classe abstrata para que people não seja  instânciada em outra classe.
abstract public class People {
    //PROTECTED PARA ATRIBUTOS PROTEGIDOS s
    protected int id;
    protected String name;
    protected char gender;
    protected Date birthdate;
    protected String phonenumber ;
    protected String email;
    protected String rg;

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public People(int id, String name, char gender, Date birthdate, String phonenumber, String email, String rg) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
        this.phonenumber = phonenumber;
        this.email = email;
        this.rg = rg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
        
    
}
