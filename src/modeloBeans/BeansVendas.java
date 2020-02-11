
package modeloBeans;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Time;
import java.text.DecimalFormat;
import java.util.Date;

public class BeansVendas {
    private int id_venda;
    private String nome_cliente;
    private String endereco;
    private int complemento;
    private String bairro;
    private String intens_da_venda;
    private double total_venda;
    private double valor_entrega;
    private double valor_pago;
    private double valor_troco;
    private String credito;
    private String debito;
    private Date data_venda;
    private Time hora_venda;
    
    private String pesquisa;

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getComplemento() {
        return complemento;
    }

    public void setComplemento(int complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getIntens_da_venda() {
        return intens_da_venda;
    }

    public void setIntens_da_venda(String intens_da_venda) {
        this.intens_da_venda = intens_da_venda;
    }

    public double getTotal_venda() {
        return total_venda;
    }

    public void setTotal_venda(double total_venda) {
        this.total_venda = total_venda;
    }

    public double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public double getValor_troco() {
        return valor_troco;
    }

    public void setValor_troco(double valor_troco) {
        this.valor_troco = valor_troco;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getDebito() {
        return debito;
    }

    public void setDebito(String debito) {
        this.debito = debito;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public Time getHora_venda() {
        return hora_venda;
    }

    public void setHora_venda(Time hora_venda) {
        this.hora_venda = hora_venda;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public void setid_cliente(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getValor_entrega() {
        return valor_entrega;
    }

    public void setValor_entrega(double valor_entrega) {
        this.valor_entrega = valor_entrega;
    }

    public String getintens_da_venda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getid_cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
            
    

}