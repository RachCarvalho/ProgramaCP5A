package models;

public class Estoque {
    private Integer id_estoque;
    private Produto prodt_estoque;


    public Estoque(Integer id_prodt, Produto desc_prodt) {
        this.id_estoque = id_prodt;
        this.prodt_estoque = desc_prodt;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "id_estoque=" + id_estoque +
                ", prodt_estoque=" + prodt_estoque +
                '}';
    }

    public Integer getId_estoque() {
        return id_estoque;
    }

    public void setId_estoque(Integer id_estoque) {
        this.id_estoque = id_estoque;
    }

    public Produto getProdt_estoque() {
        return prodt_estoque;
    }

    public void setProdt_estoque(Produto prodt_estoque) {
        this.prodt_estoque = prodt_estoque;
    }
}

//    private static Map<Integer, ArrayList> produtoBuscado = new HashMap<>();
//
//    private ArrayList<Estoque> estoque = new ArrayList<>();
//
//    public Map getProdt_estoque(Map<Integer, ArrayList> produtoBuscado) {
//        estoque.add()
//        produtoBuscado.put(id_estoque,)
//        produtoBuscado.put() id_estoque.toString();
//        + prodt_estoque.toString() +qtd_estoque.toString();
//        (this.id_estoque.toString());
//        produtoBuscado.add(this.id_estoque.toString());
//        + this.prodt_estoque.toString() + this.qtd_estoque.toString();
//        if (produtoBuscado == null){
//            throw new Estoque_prodt_nao_encontrado_Exception();
//        }
//        return produtoBuscado;
//    }