package Loader.example;

import domain.Pedido;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PedidoLoader {
    public static List<Pedido> carregarPedidos(String caminhoArquivo) throws IOException {
        List<Pedido> pedidos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                Pedido pedido = new Pedido(Integer.parseInt(dados[0]), dados[1]);
                // Adicione mais lógica para carregar relacionamentos, se necessário
                pedidos.add(pedido);
            }
        }

        return pedidos;
    }
}