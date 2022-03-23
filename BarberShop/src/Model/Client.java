/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/*importar classe para usar Date*/
import java.util.Date;

/**
 *
 * @author henrique
 */
public class Client {
 /*atributos para cliente*/  
    private int id;
    private String name;
    private char gender;
    private Date birthdate;
    private String phonenumber ;
    private String email;
    private String rg;
    private String address;
    private String cep;

    public Client(int id, String name, char gender, Date birthdate, String phonenumber, String email, String rg, String address, String cep) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
        this.phonenumber = phonenumber;
        this.email = email;
        this.rg = rg;
        this.address = address;
        this.cep = cep;
    }

    public Client(int id, String name, char gender, String phonenumber, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phonenumber = phonenumber;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
        
    
    
}
