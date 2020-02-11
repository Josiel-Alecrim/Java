package modeloConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.Statement;
 

public class ConexaoBD {
    

    public Statement stm;//Responsavel por realizar a pesquisa no Banco de Dados
    public ResultSet rs;//Responsavel de armazenar o resultado da pesquisa
    private String driver = "com.mysql.jdbc.Driver";//responsavel por identificar o serviço do Banco de dados
    private String caminho = "jdbc:mysql://localhost:3306/projeto_deposito";//responsavel por dizefr aonde esta locado o Banco de dados
    private String usuario = "root";
    private String senha = "";
    
   
    public Connection con;//responsavel pela conexão no Banco de Dados
    
    public void conexao() {//MÉTODO RESPONSÁVEL POR REALIZAR A CONEXÃO COM O BANCO DE DADOS
         try {//
            System.setProperty("jdbc.mysql", driver);
            con=DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão Efetuada com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados:\n" + ex.getMessage());
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void executaSql(String sql) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ExecutaSql:\n" + ex.getMessage());
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public void desconecta() {
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "Banco de Dados Desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o Banco de Dados:\n" + ex.getMessage());
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}    