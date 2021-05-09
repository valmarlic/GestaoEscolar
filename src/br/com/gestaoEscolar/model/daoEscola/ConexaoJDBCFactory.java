package br.com.gestaoEscolar.model.daoEscola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJDBCFactory {   
    static String url="jdbc:postgresql://127.0.0.1:5432/gestaoescolar";   
    static String driver="org.postgresql.Driver";   
    static String usuario="postgres";   
   // static String senha="1q2w3e4r";   
    static String senha="CPD@416472";  
         
         
public static Connection getConexao() throws SQLException {   
        try { 
            System.out.println(url);
            Class.forName(driver);   
            System.out.println("Conectando ao banco...");   
            return DriverManager.getConnection(url,usuario,senha);   
        } catch (Exception e ) {   
            System.out.println(e.getMessage());   
        }
		return null;   
    }   
       
}  

