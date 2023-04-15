import java.util.ArrayList;
import java.util.List;

public class Vertices {
    String nome;
    List<Edges> adj;

    Vertices(String nome) {
        this.nome = nome;
        this.adj = new ArrayList<Edges>();
    }

    

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public List<Edges> getAdj() {
        return adj;
    }



    public void setAdj(List<Edges> adj) {
        this.adj = adj;
    }



    void addAdj(Edges e) {
        adj.add(e);
    }
}
