/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.User;
import View.Login;

/**
 *
 * @author henrique
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void LoginSystem(){
        //usando loginhelper no controller
        User usuario = helper.obterModelo();
        
    }
    
    
     public void FizTarefa(){
         System.out.println("GOTCHA");
         
         this.view.exibeMensagem("Executei o fiz tarefa");
     }
}
