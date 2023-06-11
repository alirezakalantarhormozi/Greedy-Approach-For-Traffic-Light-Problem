package pakageproject;

public class Edge {
    private Vertex vertex1 , vertex2 ;

    public Edge(Vertex vertex1, Vertex vertex2) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }

    public Vertex getVertex1() {
        return vertex1;
    }

    public void setVertex1(Vertex vertex1) {
        this.vertex1 = vertex1;
    }

    public Vertex getVertex2() {
        return vertex2;
    }

    public void setVertex2(Vertex vertex2) {
        this.vertex2 = vertex2;
    }

    @Override
    public String toString(){
        return "Edge between :\n " + vertex1.toString()  + "\n and \n " + vertex2.toString() + "\n";
    }


    // test to equality between to edge which are the same but in a different direction (swap Vertex)
    @Override
    public boolean equals (Object o){
        try {
            if(o.getClass() == Class.forName("pakageproject.Edge") && ( ( ((Edge) o).getVertex1().equals(vertex1) && ((Edge) o).getVertex2().equals(vertex2) ) || ( ((Edge) o).getVertex1().equals(vertex2) && ((Edge) o).getVertex2().equals(vertex1) )  )){
                return true;
            }
            else{
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
