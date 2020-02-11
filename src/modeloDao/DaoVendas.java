    
package modeloDao;

import java.sql.Date;
import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansVendas;
import modeloBeans.BeansProdutos;

public class DaoVendas {
    
    //INSTANCIANDO CONEXÃO
    ConexaoBD conex = new ConexaoBD();  // INSTANCIANDO OBJETO DA CONEXAO
    //INSTANCIANDO MODELO
  
    BeansProdutos mod = new BeansProdutos();
    
    
          //MÉTODO DE SALVAR OS DADOS DO USUARIO
    public void Salvar(BeansVendas mod){
        conex.conexao();    //ABRINDO CONEXÃO COM O BANCO DE DADOS;
        try {
                PreparedStatement pst = conex.con.prepareStatement("insert into vendas("
                        + "id_venda,"
                        + "produtos,"
                        + "id_cliente,"
                        + "nome,"
                        + "valor_venda,"
                        + "valor_entrega,"
                        + "valor_recebido,"
                        + "troco,"
                        + "valor_total)"
                        + "VALUES(?,?,?,?,?,?,?,?,?)");
                        
                           //PREENCHENDO CAMPOS NO BANCO DE DADOS SEGUINDO ORDEM DAS TABELAS QUE ESTÃO NO BD NOME, NASCIMENTO, SEXO
                          //VALUES SERVE PARA ADICIONAR OS VALORES QUE DESEJAR PREENCHER 
            pst.setInt(1,mod.getId_venda());
            pst.setString(1,mod.getintens_da_venda());
            pst.setInt(2,mod.getid_cliente());
            pst.setString(3,mod.getNome_cliente());
            pst.setDouble(4, mod.getTotal_venda());
            pst.setDouble(5,mod.getValor_entrega());
            pst.setDouble(5,mod.getValor_pago());
            pst.setDouble(5,mod.getValor_troco());
            pst.setDouble(6,mod.getTotal_venda());
            pst.execute();      //EXECUTANDOOS DADOS ACIMA, INSERINDO AS INFORMAÇÕES NO BANCO DE DADOS
            JOptionPane.showMessageDialog(null,"Dados inseridos no banco de dados com sucesso!", "ATENÇÃO",JOptionPane.WARNING_MESSAGE);       //SE OS DADOS FOR INSERIDOS CORRETAMENTE,MOSTRAR MENSAGEM DE CONFIRMAÇÃO
        } catch (SQLException ex) {
            Logger.getLogger(DaoCadastro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados!\nERRO: " + ex, "ERRO",JOptionPane.ERROR_MESSAGE);                  // SE NÃO FOR INSERIDOS MOSTRAR MENSAGEM DE ERRO
        }
        
        conex.desconecta();     //DESCONECTAR DO BANCO DE DADOS
    } 
    
    public BeansVendas buscaUsuario(BeansVendas mod) {
        conex.conexao();
        conex.executaSql("select *from clientes where nome like'%"+mod.getPesquisa()+"%'");//%?%
        try {
            conex.rs.first();
            mod.setid_cliente(conex.rs.getInt("id-cliente"));
            mod.setNome_cliente(conex.rs.getString("nome"));
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null,"Cliente não cadastrado");  
        }
        conex.desconecta();
        return mod;
    }
    
    public BeansProdutos buscaProdutos(BeansProdutos mod) {
        conex.conexao();
        conex.executaSql("select *from produtos where nome_produto like'%"+mod.getPesquisa()+"%'");//%?%
        try {
            conex.rs.first();
            mod.setId_produto(conex.rs.getInt("id_produto"));
            mod.setNome_produto(conex.rs.getString("nome_produto"));
            mod.setValor_venda(conex.rs.getFloat("valor_venda"));
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null,"Cliente não cadastrado");  
        }
        conex.desconecta();
        return mod;
    }
}
