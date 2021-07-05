package models;

import exceptions.Valida_desc_Exception;

import java.util.ArrayList;

public class Categoria  {
    private Integer id_categ;
    private String desc_categ;

    public Categoria(Integer id_categ, String desc_categ){
        this.id_categ = id_categ;
        if (desc_categ.length() > 50) {
            throw new Valida_desc_Exception();
        } else
            this.desc_categ = desc_categ;
    }
    public Categoria(Integer id_categ){
        this.id_categ = id_categ;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id_categ=" + id_categ +
                ", desc_categ='" + desc_categ + '\'' +
                '}';
    }

    public Integer getId_categ() {
        return id_categ;
    }

    public void setId_categ(Integer id_categ) {
        this.id_categ = id_categ;
    }

    public String getDesc_categ() {
        return desc_categ;
    }

    public void setDesc_categ(String desc_categ) {
        if (desc_categ.length() > 50 ) {
            throw new Valida_desc_Exception();
        } else
            this.desc_categ = desc_categ;
    }

}

