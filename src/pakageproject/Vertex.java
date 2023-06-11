package pakageproject;

import java.util.ArrayList;

public class Vertex {
    private int number;
    private boolean colored;
    private ArrayList<Integer> colors;

    public Vertex(int number) {
        this.number = number;
        this.colored = false;
        this.colors = new ArrayList<Integer>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Integer> getColors() {
        return colors;
    }

    public void addColor(int colorID) {
        this.colors.add(colorID);
        setColored(true);
    }

    public boolean isColored() {
        return colored;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }

    @Override
    public String toString(){
        String col = "";
        for (int i = 0; i < this.colors.size() ; i++) {
            int temp  = this.colors.get(i);
            String converted = String.valueOf(temp);
            col += converted + " ";
        }
        return "node number " + number + " : " + col;
    }

    @Override
    public boolean equals (Object o){
        try {
            if(o.getClass() == Class.forName("pakageproject.Vertex") && ((Vertex) o).getNumber() == this.number){
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
