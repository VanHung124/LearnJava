package tlu.khmt.A34734.B4;

import java.util.Set;
import java.util.HashSet;

public class PointHashSet {

    private Set<Point> p;

    public PointHashSet(){
        p = new HashSet();

    }
    public void add(Point a){
        if(!p.contains(a)){
            p.add(a);
        }
    }

    public void hienThi(){
        for(Point i: p){
            System.out.println("( "+i.getX()+", "+i.getY()+" )");
        }
    }
}
