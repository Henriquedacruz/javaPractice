/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author henrique
 */
public class Service {
    
    /*private para não permitir o acesso de outra classe*/
    private int id;
    private String description;
    private float value;

    /*alt + insert atalho para gerar construtor*/
    public Service(int id, String description, float value) {
        this.id = id;
        this.description = description;
        this.value = value;
    }
    /*getter and setter, getter retorna o valor da variavel e setter 
    define ou atualiza*//*acessar dados de fora*/
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
        return getDescription();
    }
}
