package Service;

import domain.Solicitante;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class SolicitanteService {
    private static final Map<String, Solicitante> solicitantes = new HashMap<>();

    public void incluirSolicitante(Solicitante solicitante) {
        solicitantes.put(solicitante.getNome(), solicitante);
    }

    public List<Solicitante> obterListaSolicitantes() {
        return new ArrayList<>(solicitantes.values());
    }
}
