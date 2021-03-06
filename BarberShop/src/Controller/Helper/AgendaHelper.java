/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Client;
import Model.Scheduling;
import Model.Service;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author henrique
 */
public class AgendaHelper {
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Scheduling> agendamentos) {
       
       DefaultTableModel tableModel =  (DefaultTableModel) view.getjTable1().getModel();
       tableModel.setNumRows(0);
       
        for (Scheduling agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{
                
                agendamento.getId(),
                agendamento.getCliente().getName(),
                agendamento.getServico().getDescription(),
                agendamento.getValue(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada()                
            });
        }
    }

    public void preencherClientes(ArrayList<Client> clientes) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
        
        for (Client cliente : clientes) {
            
            comboBoxModel.addElement(cliente); 
        }
    }

    public void preencherServicos(ArrayList<Service> servicos) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
        
        for (Service servico : servicos) {
            comboBoxModel.addElement(servico);
        }
    }
    
    public Client obterCliente(){
        //getselectedItem seleciona o item selecionado
        return (Client) view.getjComboBoxCliente().getSelectedItem();
    }
    
    public Service obterServico(){
        //getselectedItem seleciona o item selecionado
        return (Service) view.getjComboBoxServico().getSelectedItem();
    }

    public void setarValor(float value) {
        view.getTextValor().setText(value+"");
    }
    
    public Scheduling obterModelo(){
        
        String idString = view.getTextid().getText();
        int id = Integer.parseInt(idString);
        Client cliente = obterCliente();
        Service servico = obterServico();
        String valorString = view.getTextValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getjTextData().getText();
        String hora = view.getjTextHora().getText();
        String dataHora = data + " " + hora;
        
        Scheduling agendamento = new Scheduling(id, cliente, servico, valor, dataHora);
        
        return agendamento;
    
}
        public void limparTela(){
          view.getTextid().setText("");   
      }
}
