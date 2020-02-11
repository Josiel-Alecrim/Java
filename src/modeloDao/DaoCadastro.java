package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansCadastro;


public class DaoCadastro {
    //INSTANCIANDO CONEXÃO
    ConexaoBD conex = new ConexaoBD();  // INSTANCIANDO OBJETO DA CONEXAO
    //INSTANCIANDO MODELO
    BeansCadastro mod = new BeansCadastro();      //INSTANCIANDO MODELO CADASTRO
    
    
          //MÉTODO DE SALVAR OS DADOS DO USUARIO
    public void Salvar(BeansCadastro mod){
        conex.conexao();    //ABRINDO CONEXÃO COM O BANCO DE DADOS;
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into clientes(nome,"
                    + "cpf,telefone,sexo,endereco,numero,complemento,bairro,cep) values(?,?,?,?,?,?,?,?,?)");  //PREENCHENDO CAMPOS NO BANCO DE DADOS SEGUINDO ORDEM DAS TABELAS QUE ESTÃO NO BD NOME, NASCIMENTO, SEXO
            pst.setString(1,mod.getNome());                                                            //VALUES SERVE PARA ADICIONAR OS VALORES QUE DESEJAR PREENCHER 
            pst.setString(2,mod.getCpf());
            pst.setInt(3,mod.getTelefone());
            pst.setString(4,mod.getSexo());
            pst.setString(5,mod.getEndereco());
            pst.setInt(6,mod.getNumero());
            pst.setString(7,mod.getComplemento());
            pst.setString(8,mod.getBairro());
            pst.setString(9,mod.getCep());
            pst.execute();      //EXECUTANDOOS DADOS ACIMA, INSERINDO AS INFORMAÇÕES NO BANCO DE DADOS
            JOptionPane.showMessageDialog(null,"Dados inseridos no banco de dados com sucesso!");       //SE OS DADOS FOR INSERIDOS CORRETAMENTE,MOSTRAR MENSAGEM DE CONFIRMAÇÃO
        } catch (SQLException ex) {
            Logger.getLogger(DaoCadastro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados!\nERRO: " + ex);                  // SE NÃO FOR INSERIDOS MOSTRAR MENSAGEM DE ERRO
        }
        
        conex.desconecta();     //DESCONECTAR DO BANCO DE DADOS
    }    
    
    public void Editar(BeansCadastro mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update clientes set nome=?,cpf=?,telefone=?,sexo=?,endereco=?,numero=?,"
                    + "complemento=?,bairro=?,cep=? where id_cliente=?");//CRIANDO CONEXÃO COM O BANCO DE DADOS PARA EDITAR AS INFORMAÇOES
            pst.setString(1,mod.getNome());                                                            //VALUES SERVE PARA ADICIONAR OS VALORES QUE DESEJAR PREENCHER 
            pst.setString(2,mod.getCpf());
            pst.setInt(3,mod.getTelefone());
            pst.setString(4,mod.getSexo());
            pst.setString(5,mod.getEndereco());
            pst.setInt(6,mod.getNumero());
            pst.setString(7,mod.getComplemento());
            pst.setString(8,mod.getBairro());
            pst.setString(9,mod.getCep());
            pst.setInt(10, mod.getId_cliente());
            pst.execute();//EXECUTANDO A AÇÃO DO UPDATE ALTERANDO  OS PARAMETROS
            JOptionPane.showConfirmDialog(null,"Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null,"Erro na alteração dos dasos!\nErro:" + ex);
        }
        
        conex.desconecta();
    }
    
    public void Excluir (BeansCadastro mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("Delete from clientes where id_cliente=?");
            pst.setInt(1, mod.getId_cliente());
        pst.execute();
        JOptionPane.showMessageDialog(null,"Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao exluir dados!\nErro:"+ex);
        }
        
        conex.desconecta();
    }
    
    
    public BeansCadastro buscaUsuario(BeansCadastro mod) {
        conex.conexao();
        conex.executaSql("select *from clientes where nome like'%"+mod.getPesquisar()+"%'");//%?%
        try {
            conex.rs.first();
            mod.setId_cliente(conex.rs.getInt("id_cliente"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setCpf(conex.rs.getString("cpf"));
            mod.setTelefone(conex.rs.getInt("telefone"));
            mod.setSexo(conex.rs.getString("sexo"));
            mod.setEndereco(conex.rs.getString("endereco"));
            mod.setNumero(conex.rs.getInt("numero"));
            mod.setComplemento(conex.rs.getString("complemento"));
            mod.setBairro(conex.rs.getString("bairro"));
            mod.setCep(conex.rs.getString("cep"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cliente não cadastrado");  
        }
        conex.desconecta();
        return mod;
    }
}