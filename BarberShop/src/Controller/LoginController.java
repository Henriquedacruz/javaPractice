/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.User;
import View.Login;
import View.MainMenu;

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
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        User usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        this.view.dispose();
        if(usuarioAutenticado != null){
            MainMenu menu = new MainMenu();
            menu.setVisible(true);
    }else{
            view.exibeMensagem("Usuario ou senha invalidos");
        }
    
    }
     public void FizTarefa(){
         System.out.println("GOTCHA");
         
         this.view.exibeMensagem("Executei o fiz tarefa");
     }
}
