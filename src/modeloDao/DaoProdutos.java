    
package modeloDao;

import java.sql.Date;
import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansCadastro;
import modeloBeans.BeansProdutos;

public class DaoProdutos {
    
        //INSTANCIANDO CONEXÃO
    ConexaoBD conex = new ConexaoBD();  // INSTANCIANDO OBJETO DA CONEXAO
    //INSTANCIANDO MODELO
    BeansProdutos mod = new BeansProdutos();      //INSTANCIANDO MODELO CADASTRO
    
    
          //MÉTODO DE SALVAR OS DADOS DO USUARIO
    public void Salvar(BeansProdutos mod){
        conex.conexao();    //ABRINDO CONEXÃO COM O BANCO DE DADOS;
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into produtos"
                    + "(id_produtos,nome_produto,oficina,entrada_inicial,tipo,valor_compra,valor_venda,valor_lucro,data_entrada) values(?,?,?,?,?,?,?,?,?)");  //PREENCHENDO CAMPOS NO BANCO DE DADOS SEGUINDO ORDEM DAS TABELAS QUE ESTÃO NO BD NOME, NASCIMENTO, SEXO
            pst.setInt(1,mod.getId_produto());
            pst.setString(2,mod.getNome_produto());                          //VALUES SERVE PARA ADICIONAR OS VALORES QUE DESEJAR PREENCHER 
            pst.setString(3,mod.getOficina());                          //VALUES SERVE PARA ADICIONAR OS VALORES QUE DESEJAR PREENCHER 
            pst.setInt(4,mod.getEntrada_inicial());
            pst.setString(5,mod.getTipo());
            pst.setFloat(6,mod.getValor_compra());
            pst.setFloat(7,mod.getValor_venda());
            pst.setFloat(8,mod.getValor_lucro());
            pst.setDate(9, new Date(mod.getData_entrada().getTime()));
            pst.execute();      //EXECUTANDOOS DADOS ACIMA, INSERINDO AS INFORMAÇÕES NO BANCO DE DADOS
            JOptionPane.showMessageDialog(null,"Dados inseridos no banco de dados com sucesso!", "ATENÇÃO",JOptionPane.WARNING_MESSAGE);       //SE OS DADOS FOR INSERIDOS CORRETAMENTE,MOSTRAR MENSAGEM DE CONFIRMAÇÃO
        } catch (SQLException ex) {
            Logger.getLogger(DaoCadastro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados!\nERRO: " + ex, "ERRO",JOptionPane.ERROR_MESSAGE);                  // SE NÃO FOR INSERIDOS MOSTRAR MENSAGEM DE ERRO
        }
        
        conex.desconecta();     //DESCONECTAR DO BANCO DE DADOS
    }    
    
    public void Editar(BeansProdutos mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update produtos set nome=?,entradas=?,saidas=?,atual=? where cod=?");//CRIANDO CONEXÃO COM O BANCO DE DADOS PARA EDITAR AS INFORMAÇOES
            pst.setString(1, mod.getNome_produto());//PASSANDO OS PARAMETR0S DE ACORDO COM A SEQUENCIA ACIMA DO UPDATE
            pst.setInt(2, mod.getEntrada_inicial());
            
            pst.setInt(5, mod.getId_produto());
            pst.execute();//EXECUTANDO A AÇÃO DO UPDATE ALTERANDO  OS PARAMETROS
            JOptionPane.showConfirmDialog(null,"Dados alterados com sucesso!", "ATENÇÃO",JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null,"Erro na alteração dos dasos!\nErro:" + ex, "ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
        conex.desconecta();
    }
    
    public void Excluir (BeansProdutos mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("Delete from produtos where cod=?");
            pst.setInt(1, mod.getId_produto());
        pst.execute();
        JOptionPane.showMessageDialog(null,"Dados excluidos com sucesso!", "ATENÇÃO",JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao exluir dados!\nErro:"+ex, "ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
        conex.desconecta();
    }
    
    
    public BeansProdutos buscaProdutos(BeansProdutos mod) {
        conex.conexao();
        conex.executaSql("select *from produtos where nome_produto like'%"+mod.getPesquisa()+"%'");//%?%
        try {
            conex.rs.first();
            mod.setId_produto(conex.rs.getInt("id_produto"));
            mod.setNome_produto(conex.rs.getString("nome_produto"));
            mod.setEntrada_inicial(conex.rs.getInt("entrada_inicial"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Produto não cadastrado");  
        }
        conex.desconecta();
        return mod;
    }
    
}
