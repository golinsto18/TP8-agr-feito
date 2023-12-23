package Loader.example;

import domain.Solicitante;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class SolicitanteLoader {
    public static List<Solicitante> carregarSolicitantes(String caminhoArquivo) throws IOException {
        List<Solicitante> solicitantes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                Solicitante solicitante = new Solicitante(dados[0], Integer.parseInt(dados[1]), Boolean.parseBoolean(dados[2]));
                // Adicione mais lógica para carregar relacionamentos, se necessário
                solicitantes.add(solicitante);
            }
        }

        return solicitantes;
    }
}
