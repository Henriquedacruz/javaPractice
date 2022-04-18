/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/*importar classe para usar Date*/

/**
 *
 * @author henrique
 */
public class Client extends People {
 /*atributos para cliente*/  

    private String address;
    private String cep;

    public Client(int id, String name, char gender, String birthdate, String phonenumber, String email, String rg, String password, String accesslevel ) {
        super (id, name, gender, birthdate, phonenumber, email, rg);
        this.address = address;
        this.cep = cep;
    }

    public Client(int id, String name, String address, String cep) {
        super(id, name);
        this.address = address;
        this.cep = cep;
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
    
    @Override
    public String toString(){
        return getName();
    }
    
}
