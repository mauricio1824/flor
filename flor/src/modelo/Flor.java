/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Flor {
    private Integer codigo;
    private Integer ano;
    private String nomepopular;
    private String nomecientifico;
    private Double tamanhodapetala;
    private Double tamanhodasepala;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getNomepopular() {
        return nomepopular;
    }

    public void setNomepopular(String nomepopular) {
        this.nomepopular = nomepopular;
    }

    public String getNomecientifico() {
        return nomecientifico;
    }

    public void setNomecientifico(String nomecientifico) {
        this.nomecientifico = nomecientifico;
    }

    public Double getTamanhodapetala() {
        return tamanhodapetala;
    }

    public void setTamanhodapetala(Double tamanhodapetala) {
        this.tamanhodapetala = tamanhodapetala;
    }

    public Double getTamanhodasepala() {
        return tamanhodasepala;
    }

    public void setTamanhodasepala(Double tamanhodasepala) {
        this.tamanhodasepala = tamanhodasepala;
    }

    @Override
    public String toString() {
        return nomepopular;
    }
}
