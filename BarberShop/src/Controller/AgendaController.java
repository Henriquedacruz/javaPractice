/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Client;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Scheduling;
import Model.Service;
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
    
    public void atualizaCliente(){
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.selectAll();
        ArrayList<Client> clientes = clienteDAO.selectAll();
        
        helper.preencherClientes(clientes);
    }
    
    public void atualizaServico(){
        ServicoDAO servicoDAO = new ServicoDAO();
        servicoDAO.selectAll();
        ArrayList<Service> servicos = servicoDAO.selectAll();
        
        helper.preencherServicos(servicos);
    }
}
