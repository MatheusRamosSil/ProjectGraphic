
// Este é um exemplo simples de implementação de grafo representado por lista
// de adjacências

import java.util.List;
import java.util.ArrayList;

public class Graphic {
    List<Vertices> vertices;
    List<Edges> arestas;
    private String[][] matrizAdjacencia;

    public Graphic() {
        vertices = new ArrayList<Vertices>();
        arestas = new ArrayList<Edges>();
    }

    Vertices addVertice(String nome) {
        Vertices v = new Vertices(nome);
        vertices.add(v);
        return v;
    }

    Edges addAresta(Vertices origem, Vertices destino, int peso) {
        Edges e = new Edges(origem, destino, peso);
        origem.addAdj(e);
        arestas.add(e);
        return e;
    }

    public String toString() {
        String r = "";
        for (Vertices u : vertices) {
            r += u.nome + " -> ";
            for (Edges e : u.adj) {
                Vertices v = e.destino;
                r += v.nome + ", ";
            }
            r += "\n";
        }
        return r;
    }


    private void inicializaMatrizAdjacencia(Graphic grafo){

        int sizeMatrixLine = vertices.size();
        int sizeMatrixColu = sizeMatrixLine;

        matrizAdjacencia =  new String [sizeMatrixLine][sizeMatrixColu];
        
        for(int i = 0; i < sizeMatrixLine; i++){
            for(int j = 0; j < sizeMatrixColu; j++){
                matrizAdjacencia[i][j] = "0";
            }
        }
    }

}
