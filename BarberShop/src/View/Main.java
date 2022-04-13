/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Service;
import Model.Client;
import Model.User;

/**
 *
 * @author henrique
 */
public class Main {
    /*teste de modelo*/
    public static void main(String[] args){
        
        String name = "thiago";
        System.out.println(name);
        
        Service corte = new Service(1, "corte cabelo", 25);
        
        System.out.println(corte.getDescription());
        System.out.println(corte.getValue());
        
        Client Cliente = new Client(1, "Antonio", "rua noxus", "4666-9798");
        System.out.println(Cliente.getName());
        
        User usuario = new User(1, "barbeiro", "senha");
        System.out.println(usuario.getName());
        
    }
    
}
