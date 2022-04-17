/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Scheduling;
import View.Agenda;
import java.util.ArrayList;
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
   
}
