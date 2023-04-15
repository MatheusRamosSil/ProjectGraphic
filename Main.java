public class Main {
    public static void main(String[] args) {
        Graphic g = new Graphic();
        Vertices s = g.addVertice("s");
        Vertices t = g.addVertice("t");
        Vertices y = g.addVertice("y");
        Edges st = g.addAresta(s, t,12);
        Edges sy = g.addAresta(s, y,0);
        Edges ty = g.addAresta(t, y,1);
        Edges yt = g.addAresta(y, t,10);
        System.out.println(g);
    }
}
