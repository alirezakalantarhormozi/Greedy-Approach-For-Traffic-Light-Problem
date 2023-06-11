package pakageproject;

public class Main {

    public static void main(String[] args) {
        Graph g = new Graph();
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);
        Vertex v6 = new Vertex(6);
        Vertex v7 = new Vertex(7);
        Vertex v8 = new Vertex(8);
        Vertex v9 = new Vertex(9);
        Vertex v10 = new Vertex(10);
        Vertex v11 = new Vertex(11);
        Vertex v12 = new Vertex(12);
        Vertex v13 = new Vertex(13);


        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);
        g.addVertex(v5);
        g.addVertex(v6);
        g.addVertex(v7);
        g.addVertex(v8);
        g.addVertex(v9);
        g.addVertex(v10);
        g.addVertex(v11);
        g.addVertex(v12);
        g.addVertex(v13);


        g.addEdge(new Edge(v1,v2));
        g.addEdge(new Edge(v1,v3));
        g.addEdge(new Edge(v1,v4));
        g.addEdge(new Edge(v2,v8));
        g.addEdge(new Edge(v2,v6));
        g.addEdge(new Edge(v2,v7));
        g.addEdge(new Edge(v3,v8));
        g.addEdge(new Edge(v3,v9));
        g.addEdge(new Edge(v3,v11));
        g.addEdge(new Edge(v3,v7));
        g.addEdge(new Edge(v4,v11));
        g.addEdge(new Edge(v4,v12));
        g.addEdge(new Edge(v6,v9));
        g.addEdge(new Edge(v6,v11));
        g.addEdge(new Edge(v7,v8));
        g.addEdge(new Edge(v7,v11));
        g.addEdge(new Edge(v7,v12));
        g.addEdge(new Edge(v8,v11));
        g.addEdge(new Edge(v8,v12));
        g.addEdge(new Edge(v9,v12));

        GraphGreedyALG graphGreedyALG = new GraphGreedyALG();
        graphGreedyALG.greedyALG(g);
        System.out.println(g.toString());

    }
}
