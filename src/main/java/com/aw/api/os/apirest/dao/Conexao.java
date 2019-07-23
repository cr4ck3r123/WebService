package com.aw.api.os.apirest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Fernando
 */
public class Conexao {

    //METODO RESPONSAVEL DE ESTABELECER A CONEXAO COM O BANCO DBUSUARIO
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //A LINHA ABAIXO CHAMA O DRIVER 
        String driver = "org.postgresql.Driver";
        // ARMAZENANDO INFORMA��ES REFERENTES AO BANCO DE DADOS
        String url = "postgres://zkwhyymawqbzpd:94b6dae63adedc831c33c4e6b4173443b8a7d3bba70c659c1d2077d1297924e6@ec2-50-16-197-244.compute-1.amazonaws.com:5432/d91bkl3n4oqfpf\r\n" + 
        		"";
        String user = "zkwhyymawqbzpd";
        String password = "94b6dae63adedc831c33c4e6b4173443b8a7d3bba70c659c1d2077d1297924e6";
        
        //ESTABELECENDO A CONEXAO COM O BANCO DE DADOS
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user, password);
            return conexao;
            
        } catch (Exception e) {
            System.out.println("erro "+e);
           return null; 
        }
    }
    
    
    
        //METODO RESPONSAVEL DE ESTABELECER A CONEXAO COM O BANCO DBMSG
        public static Connection conector2() {
            java.sql.Connection conexao = null;
            //A LINHA ABAIXO CHAMA O DRIVER 
            String driver = "org.postgresql.Driver";
            // ARMAZENANDO INFORMA��ES REFERENTES AO BANCO DE DADOS
            String url = "postgres://zkwhyymawqbzpd:94b6dae63adedc831c33c4e6b4173443b8a7d3bba70c659c1d2077d1297924e6@ec2-50-16-197-244.compute-1.amazonaws.com:5432/d91bkl3n4oqfpf\r\n" + 
            		"";
            String user = "zkwhyymawqbzpd";
            String password = "94b6dae63adedc831c33c4e6b4173443b8a7d3bba70c659c1d2077d1297924e6";
            
            //ESTABELECENDO A CONEXAO COM O BANCO DE DADOS
            try {
                Class.forName(driver);
                conexao = DriverManager.getConnection(url,user, password);
                return conexao;
                
            } catch (Exception e) {
                System.out.println("erro "+e);
               return null; 
            }
        
    }

}
