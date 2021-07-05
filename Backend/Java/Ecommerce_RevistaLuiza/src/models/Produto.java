package models;

import exceptions.Valida_desc_Exception;

import java.util.HashMap;
import java.util.Map;

public class Produto {
    private Integer id_prodt;
    private String codigo;
    private String nome;
    private String desc_prodt;
    private Double preco;
    private Categoria categoria;
    private Integer qtd_estoque;

    public Produto(Integer id_prodt, String codigo, String nome, String desc_prodt, Double preco, Categoria categoria, Integer qtd_estoque) {
        this.id_prodt = id_prodt;
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.qtd_estoque = qtd_estoque;
        if (desc_prodt.length() > 50) {
            throw new Valida_desc_Exception();
        } else
            this.desc_prodt = desc_prodt;
    }

    public Produto(int id_produto, String descricao) {
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id_prodt=" + id_prodt +
                ", desc_prodt='" + desc_prodt + '\'' +
                ", preco=" + preco +
                ", categoria=" + categoria +
                ", qtd_estoque=" + qtd_estoque +
                '}';
    }

    public Integer getId_prodt() {
        return id_prodt;
    }

    public void setId_prodt(Integer id_prodt) {
        this.id_prodt = id_prodt;
    }

    public String getCodigo() {  return codigo;  }

    public void setCodigo(String codigo) { this.codigo = codigo; }


    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public Integer getIdCategoria() { return categoria.getId_categ(); }

    public String getDescCategoria() { return categoria.getDesc_categ(); }

    public void setIdCategoria(Categoria categoria) { this.categoria = categoria; }

    public String getDesc_prodt() {
        return desc_prodt;
    }

    public void setDesc_prodt(String desc_prodt) {
        if (desc_prodt.length() > 50) {
            throw new Valida_desc_Exception();
        } else
            this.desc_prodt = desc_prodt;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(Integer qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

}
