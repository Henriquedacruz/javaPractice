/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.User;
import View.Login;

/**
 *
 * @author henrique
 */
public class LoginHelper {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public User obterModelo(){
        
    String name = view.getTextUser().getText();
    String password = view.getTextPassword().getText();
       
    User modelo = new User(0, name, password);
    
    return modelo;
}   
    public void setarModelo(User modelo){
        String name = modelo.getName();
        String password = modelo.getPassword();
        
        view.getTextUser().setText(name);
        view.getTextPassword().setText(password);
    }
    
    public void limparTela(){
        view.getTextUser().setText("");
        view.getTextPassword().setText("");
    }
    
}