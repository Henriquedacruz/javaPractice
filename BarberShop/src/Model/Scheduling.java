/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author henrique
 */
public class Scheduling {
    
    private int id;
    private Client cliente;
    private Service servico;
    private float value;
    private Date data;
    private String description;

    public Scheduling(int id, Client cliente, Service servico, float value, String data) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.value = value;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Scheduling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getId() {
        return id;
    }

    public Client getCliente() {
        return cliente;
    }

    public Service getServico() {
        return servico;
    }

    public float getValue() {
        return value;
    }

    public Date getData() {
        return data;
    }

    public String getDescription() {
        return description;
    }
    
}
