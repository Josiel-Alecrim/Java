
package modeloBeans;

import java.sql.Date;


public class BeansProdutos {
    private int id_produto;
    private String nome_produto;
    private String oficina;
    private String civil;
    private String eletrica;
    private String refrigeracao;
    private int entrada_inicial;
    private float valor_compra;
    private String tipo;
    private float valor_venda;
    private float valor_lucro;
    private Date data_entrada;
    private String pesquisa;

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String Oficina) {
        this.oficina = Oficina;
    }

    public String getCivil() {
        return civil;
    }

    public void setCivil(String civil) {
        this.civil = civil;
    }

    public String getEletrica() {
        return eletrica;
    }

    public void setEletrica(String eletrica) {
        this.eletrica = eletrica;
    }

    public String getRefrigeracao() {
        return refrigeracao;
    }

    public void setRefrigeracao(String refrigeracao) {
        this.refrigeracao = refrigeracao;
    }

    public int getEntrada_inicial() {
        return entrada_inicial;
    }

    public void setEntrada_inicial(int entrada_inicial) {
        this.entrada_inicial = entrada_inicial;
    }

    public float getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(float valor_compra) {
        this.valor_compra = valor_compra;
    }

    public float getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(float valor_venda) {
        this.valor_venda = valor_venda;
    }

    public float getValor_lucro() {
        return valor_lucro;
    }

    public void setValor_lucro(float valor_lucro) {
        this.valor_lucro = valor_lucro;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public Date getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    
}
