public class Main {
    public static void main(String[] args) {
      
        GrafoNaoOrientado grafo = new GrafoNaoOrientado(5);
        grafo.adicionarVertice("PB");
        grafo.adicionarVertice("PE");
        grafo.adicionarVertice("RN");
        grafo.adicionarVertice("BA");
        grafo.adicionarVertice("MA");

        grafo.adicionarAresta("PB", "PE",120000);
        
        grafo.adicionarAresta("PB", "RN",80000);
        grafo.adicionarAresta("BA", "MA",200000);
        grafo.adicionarAresta("PE", "PB",400000);
        grafo.adicionarAresta("PB", "BA",300);
        

        grafo.imprimirMatrizAdj();
    }
}
