package pakageproject;

import java.util.LinkedList;

public class Graph {
    private LinkedList<Vertex> vertices = new LinkedList();
    private LinkedList<Edge> edges = new LinkedList();

    public Graph() {
    }

    public LinkedList<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(LinkedList<Vertex> vertices) {
        this.vertices = vertices;
    }

    public LinkedList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(LinkedList<Edge> edges) {
        this.edges = edges;
    }

    public void addVertex(Vertex v){
        if(!vertices.contains(v)){
            vertices.add(v);
        }
    }
    public void removeVertex(Vertex v){
        for (int i = 0; i < vertices.size() ; i++) {
            Vertex temp = vertices.get(i);
            if (temp.equals(v)){
                vertices.remove(i);
                return;
            }

        }
    }

    public void addEdge(Edge e){
        if(!edges.contains(e)){
            edges.add(e);
        }
    }
    public void removeEdge(Edge e){
        for (int i = 0; i < edges.size() ; i++) {
            Edge temp = edges.get(i);
            if (temp.equals(e)){
                edges.remove(i);
                return;
            }

        }
    }
    public LinkedList<Vertex> getAdjacent(Vertex v){
        LinkedList<Vertex> adj = new LinkedList<Vertex>();
        for (int i = 0; i <edges.size() ; i++) {
            Edge e = edges.get(i);
            if(e.getVertex1().equals(v)){
                adj.add(e.getVertex2());
            }
            if(e.getVertex2().equals(v)){
                adj.add(e.getVertex1());
            }
        }
        return adj;
    }

    @Override
    public String toString(){
        String temp = "Graph : Vertices \n";
        for (int i = 0; i < vertices.size() ; i++) {
            Vertex v = vertices.get(i);
           temp += v.toString()+ "\n";

        }
        temp += "Edges : \n";
        for (int i = 0; i <edges.size() ; i++) {
            Edge e = edges.get(i);
           temp += e.toString();
        }
        return temp;
    }
}
