import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class GrafoNaoOrientado {

    private int numVertices;
    private int[][] matrizAdj;
    private Map<String, Integer> mapaVertices;

    public GrafoNaoOrientado(int numVertices) {
        this.numVertices = numVertices;
        this.matrizAdj = new int[numVertices][numVertices];
        this.mapaVertices = new HashMap<String, Integer>();
    }

    public void adicionarVertice(String nomeVertice) {
        if (!mapaVertices.containsKey(nomeVertice)) {
            int indiceVertice = mapaVertices.size();
            mapaVertices.put(nomeVertice, indiceVertice);
        }
    }

    public void adicionarAresta(String nomeVertice1, String nomeVertice2, int peso) {
        int indiceVertice1 = mapaVertices.get(nomeVertice1);
        int indiceVertice2 = mapaVertices.get(nomeVertice2);
        matrizAdj[indiceVertice1][indiceVertice2] = peso;
        matrizAdj[indiceVertice2][indiceVertice1] = peso;
    }

    public void imprimirMatrizAdj() {
        System.out.print("\t");
        for (String vertice : mapaVertices.keySet()) {
            System.out.print(vertice + "\t");
        }
        System.out.println();
        for (int i = 0; i < numVertices; i++) {
            System.out.print(mapaVertices.keySet().toArray()[i] + "\t");
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrizAdj[i][j] + "\t");
            }
            System.out.println();
        }
    }
   
}