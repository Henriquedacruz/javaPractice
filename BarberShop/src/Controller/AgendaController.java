/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.DAO.AgendamentoDAO;
import Model.Scheduling;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author henrique
 */
public class AgendaController {
    
   private final Agenda view;
   private final AgendaHelper helper;
   
    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
   
    public void atualizaTabela(){
        
        //Buscar lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        agendamentoDAO.selectAll();
        ArrayList<Scheduling> agendamentos = agendamentoDAO.selectAll();
        
        //Exibir a lista na View
        helper.preencherTabela(agendamentos);
    }
}
