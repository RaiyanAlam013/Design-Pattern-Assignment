package Shapes;


import java.util.ArrayList;
import java.util.List;


public class Create implements Shapes{

    private List<Shapes> shapes = new ArrayList<Shapes>();

    @Override
    public void draw(String creatingStructure) {
        for(Shapes sh : shapes)
        {
            sh.draw(creatingStructure);
        }
    }


    public void add(Shapes s){
        this.shapes.add(s);
    }

    public void remove(Shapes s){
        shapes.remove(s);
    }

    
    
    public void clear(){
        System.out.println("Destroying All objects");
        this.shapes.clear();
    }
}
