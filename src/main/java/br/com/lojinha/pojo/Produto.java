package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {

    private String nome;
    private String marca;
    protected double valor;
    private List<ItemIncluso> itensInclusos;
    private Tamanho tamanho;


    public Produto(String marcaInicial, Tamanho tamanhoInicial){
        //Definir comandos que serão iniciados durante a instanciação
        this.marca = marcaInicial;
        //Por padrão a marca será sony
        this.tamanho = tamanhoInicial;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        }
        else {
           throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }

    }

    public List<ItemIncluso> getItensInclusos() {
        return this.itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> itensInclusos) {
        this.itensInclusos = itensInclusos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;

    }

    }




