package Loader.example;

import domain.Produto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ProdutoLoader {
    public static List<Produto> carregarProdutos(String caminhoArquivo) throws IOException {
        List<Produto> produtos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                Produto produto = new Produto(dados[0], Double.parseDouble(dados[1]));
                // Adicione mais lógica para carregar relacionamentos, se necessário
                produtos.add(produto);
            }
        }

        return produtos;
    }
}
