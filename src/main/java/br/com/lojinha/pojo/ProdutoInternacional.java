package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;


public class ProdutoInternacional extends Produto implements Favorito {

    private double taxaImportacao;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public void setValor(double valor) {
        if (valor > -100) {
            this.valor = valor;
        }
        else {
            throw new IllegalArgumentException("Valores devem ser maiores que -100");
        }

    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor() ;
    }
}
