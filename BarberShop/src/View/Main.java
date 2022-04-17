/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//MVC model view controller
package View;

import Model.Service;
import Model.Client;
import Model.Scheduling;
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
        
        Service servico = new Service(1, "corte cabelo", 25);
        
        System.out.println(servico.getDescription());
        System.out.println(servico.getValue());
        
        Client Cliente = new Client(1, "Antonio", "rua noxus", "4666-9798");
        System.out.println(Cliente.getName());
        
        User usuario = new User(1, "barbeiro", "senha");
        System.out.println(usuario.getName());
        
        
        Scheduling agendamento = new Scheduling(1, Cliente, servico, 25, "14/04/2022 08:30");
        System.out.println(agendamento.getCliente());    
}
    
}