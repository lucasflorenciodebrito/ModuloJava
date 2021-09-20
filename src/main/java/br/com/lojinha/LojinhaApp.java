package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {

    public static void main(String[] args) {
        Produto meuProduto= new Produto("Sony", Tamanho.MEDIO);
        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(40);
        meuProduto.setMarca("JL");
        meuProduto.setTamanho(Tamanho.GRANDE);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso(2, "Controle");
        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso(3, "Jogo");
        itensInclusos.add(segundoItemIncluso);

        ItemIncluso terceiroItemIncluso = new ItemIncluso(2, "Cabo de energia");
        itensInclusos.add(terceiroItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);

        // 0 -> 2 controles
        // 1 -> 3 jogos
        // 2 -> 2 cabos de energia
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getItensInclusos().size());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());

        for(ItemIncluso itemAtual: meuProduto.getItensInclusos()){
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony",Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.55789);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Sony",Tamanho.MEDIO);
        meuProdutoInternacional.setValor(-99.99);
        System.out.println(meuProdutoInternacional.getValor());




    }
}
