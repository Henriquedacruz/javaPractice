/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
//escrever as importações manualmente para funcionar
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author henrique
 */
public class Conexao {

  
    
    public Connection  getConnection() throws SQLException{

        
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5433/loginJava", "postgres", "postgres");
        return conexao;
    }

}
