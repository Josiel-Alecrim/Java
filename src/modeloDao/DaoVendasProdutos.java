
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansVendas;
import modeloBeans.BeansVendasProdutos;
import modeloConection.ConexaoBD;


public class DaoVendasProdutos {
    
    //INSTANCIANDO CONEXÃO
    ConexaoBD conex = new ConexaoBD();  // INSTANCIANDO OBJETO DA CONEXAO
    //INSTANCIANDO MODELO
    BeansVendasProdutos mod = new BeansVendasProdutos();      //INSTANCIANDO MODELO CADASTRO
    
    
          //MÉTODO DE SALVAR OS DADOS DO USUARIO
    public void Salvar(BeansVendasProdutos mod){
        conex.conexao();    //ABRINDO CONEXÃO COM O BANCO DE DADOS;
        try {
                PreparedStatement pst = conex.con.prepareStatement("insert into vendas_produtos("
                        //+ "pk_cod_vendas_Produtos,"
                        + "fk_produto,"
                        + "fk_vendas,"
                        + "ven_pro_valor,"
                        + "ven_pro_quantidade,"
                        + "valor_desconto)"
                        + "VALUES(?,?,?,?,?)");  //PREENCHENDO CAMPOS NO BANCO DE DADOS SEGUINDO ORDEM DAS TABELAS QUE ESTÃO NO BD NOME, NASCIMENTO, SEXO
            pst.setInt(1,mod.getProduto());                                                                                 //VALUES SERVE PARA ADICIONAR OS VALORES QUE DESEJAR PREENCHER 
            pst.setInt(2,mod.getVendas());
            pst.setDouble(3,mod.getVenProValor());
            pst.setInt(4,mod.getVenProQuantidade());
            
            pst.execute();      //EXECUTANDOOS DADOS ACIMA, INSERINDO AS INFORMAÇÕES NO BANCO DE DADOS
            JOptionPane.showMessageDialog(null,"Dados inseridos no banco de dados com sucesso!", "ATENÇÃO",JOptionPane.WARNING_MESSAGE);       //SE OS DADOS FOR INSERIDOS CORRETAMENTE,MOSTRAR MENSAGEM DE CONFIRMAÇÃO
        } catch (SQLException ex) {
            Logger.getLogger(DaoCadastro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados!\nERRO: " + ex, "ERRO",JOptionPane.ERROR_MESSAGE);                  // SE NÃO FOR INSERIDOS MOSTRAR MENSAGEM DE ERRO
        }
        
        conex.desconecta();     //DESCONECTAR DO BANCO DE DADOS
    } 
    
    
    
    public  BeansVendasProdutos buscaVendasProdutos(BeansVendasProdutos mod) {
        conex.conexao();
        conex.executaSql("select *from vendas_produtos where pk_cod_vendas_Produtos like'%"+mod.getPesquisa()+"%'");//%?%
        try {
            conex.rs.first();
            mod.setProduto(conex.rs.getInt("pk_cod_vendas_Produtos"));
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Venda não cadastrada");  
        }
        conex.desconecta();
        return mod;
    }
    
    
}
