package pakageproject;

import sun.awt.windows.WPrinterJob;

import java.util.LinkedList;

public class GraphGreedyALG {
    public void greedyALG(Graph g) {
        int colorID = 1;
        boolean f;
        do {
            f = true;
            LinkedList<Vertex> VT = g.getVertices();
            for (int i = 0; i < VT.size(); i++) {
                Vertex v = VT.get(i);
                if (!v.isColored()){
                    f = false;
                    boolean isColorable= true;
                    LinkedList<Vertex> adj = g.getAdjacent(v);
                    for (int j = 0; j < adj.size() ; j++) {
                        Vertex adjV = adj.get(j);
                        for (int k = 0; k < adjV.getColors().size() ; k++) {
                            int cid = adjV.getColors().get(k);
                            if(cid == colorID){
                                isColorable = false;
                            }
                        }
                    }
                    if(isColorable){
                        v.addColor(colorID);
                    }

                }
//
            }
            colorID++;
        } while (!f);

        LinkedList<Vertex> VT = g.getVertices();
        for (int i = 0; i < VT.size(); i++) {
            LinkedList<Integer> colorIDs = new LinkedList<>();
            for (int j = 1; j <= colorID-2 ; j++) {
                colorIDs.add(j);
            }

            Vertex v = VT.get(i);
            colorIDs.remove(v.getColors().get(0));
            LinkedList<Vertex> adj = g.getAdjacent(v);

            for (int j = 0; j < adj.size() ; j++) {
                Vertex adjV = adj.get(j);
                    int cid = adjV.getColors().get(0);
                    Integer t = new Integer(cid);
                    colorIDs.remove(t);
//                    for (int l = 0; l <colorIDs.size(); l++) {
//                        int temp = colorIDs.get(l);
//                        if (temp == cid ){
//                            colorIDs.remove()
//                        }
//                    }
            }
            for (int j = 0; j <colorIDs.size() ; j++) {
                int temp = colorIDs.get(j);
                v.addColor(temp);
            }
        }
    }
}