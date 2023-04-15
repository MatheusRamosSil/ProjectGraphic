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

    /**
     * @param args
     */
    public static void main(String[] args) {
        GrafoNaoOrientado grafo = new GrafoNaoOrientado(27);
        String[] siglasEstados = {"AC", "AL", "AP", 
        "AM", "BA", "CE", "DF", "ES", "GO", "MA", 
        "MT", "MS", "MG", "PA", "PB", "PR", "PE", 
        "PI", "RJ", "RN", 
        "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
        List<Integer> distancias = new ArrayList<>(Arrays.asList(
    0, 2157, 1206, 3366, 1823, 2773, 1663, 1419, 981, 3295, 1421, 1575, 586, 2111, 1997, 1103, 2808, 2368, 444, 1895, 2435, 1786, 584, 734, 2532, 2008, 2844,
    2157, 0, 1984, 2354, 1411, 2774, 228, 2061, 1977, 3693, 2528, 2213, 1937, 2473, 2618, 1301, 3117, 2773, 2013, 2513, 2311, 3673, 1328, 1584, 2912, 2342, 3294,
    1206, 1984, 0, 2958, 1745, 2667, 1771, 1191, 590, 3059, 1279, 1442, 764, 2182, 2105, 1375, 2735, 2255, 775, 1839, 2328, 2166, 1157, 543, 2446, 1916, 2769,
    3366, 2354, 2958, 0, 2935, 1076, 2566, 2626, 2836, 798, 1619, 2119, 2214, 853, 1083, 2184, 1012, 867, 3224, 2729, 848, 168, 2795, 2625, 1875, 2785, 880,
    1823, 1411, 1745, 2935, 0, 2180, 1477, 961, 1220, 2919, 911, 813, 540, 1662, 1465, 555, 2048, 1680, 941, 780, 1380, 2037, 1686, 1127, 2043, 1573, 2449,
    2773, 2774, 2667, 1076, 2180, 0, 2157, 2009, 2327, 1726, 2156, 2736, 2916, 1596, 1256, 2809, 856, 758, 2984, 2577, 1256, 1117, 2531, 2727, 1019, 1667, 1906,
    1663, 228, 1771, 2566, 1477, 2157, 0, 1928, 1922, 3525, 2345, 2018, 1785, 2321, 2465, 1248, 3055, 2711, 1935, 2315, 2165, 3525)); 

        for(int i = 0; i <siglasEstados.length; i++){
            grafo.adicionarVertice(siglasEstados[i]);
        }
       
        for(int i = 0; i <siglasEstados.length; i++){
            for(int j = 0; j < siglasEstados.length; j++){
                grafo.adicionarAresta(siglasEstados[i], siglasEstados[i], distancias.get(i));
            }
        }
        
        /*grafo.adicionarVertice("PB");
        grafo.adicionarVertice("PE");
        grafo.adicionarVertice("RN");
        grafo.adicionarVertice("BA");
        grafo.adicionarVertice("MA");

        grafo.adicionarAresta("PB", "PE",120000);
        
        grafo.adicionarAresta("PB", "RN",80000);
        grafo.adicionarAresta("BA", "MA",200000);
        grafo.adicionarAresta("PE", "PB",400000);
        grafo.adicionarAresta("PB", "BA",300);
        */

        grafo.imprimirMatrizAdj();
    }
}