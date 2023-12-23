package Service;

import domain.Produto;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ProdutoService {
    private static final Map<String, Produto> produtos = new HashMap<>();

    public void incluirProduto(Produto produto) {
        produtos.put(produto.getNome(), produto);
    }

    public List<Produto> obterListaProdutos() {
        return new ArrayList<>(produtos.values());
    }
}
