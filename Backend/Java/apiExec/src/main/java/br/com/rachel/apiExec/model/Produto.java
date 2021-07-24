package br.com.rachel.apiExec.model;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Integer idProduto;

    @Column(nullable = false, name = "desc_fornecedor")
    private String descFornecedor;

    @Column(nullable = false, name = "descricao_prdt")
    private String descProduto;

    @Column(nullable = false)
    private Double preco;

    public Produto(Integer idProduto, String descFornecedor, String descProduto, Double preco) {
        this.idProduto = idProduto;
        this.descFornecedor = descFornecedor;
        this.descProduto = descProduto;
        this.preco = preco;
    }

    public Produto(){}

    public Produto(int idProduto, String descricao) {
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", descFornecedor='" + descFornecedor + '\'' +
                ", descProduto='" + descProduto + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) { this.descProduto = descProduto; }

    public String getDescFornecedor() {
        return descFornecedor;
    }

    public void setDescFornecedor(String descFornecedor) { this.descFornecedor = descFornecedor; }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}