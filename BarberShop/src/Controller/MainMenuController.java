/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import View.Agenda;
import View.MainMenu;

/**
 *
 * @author henrique
 */
public class MainMenuController {
    
    private final MainMenu view;

    public MainMenuController(MainMenu view) {
        this.view = view;
    }
    
    public void navegarParaAgenda(){
        
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }
   
}
