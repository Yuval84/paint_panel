import java.awt.*;
import java.util.ArrayList;

/**
 * Created by yuval_edelman on 5/13/2015.
 */
public class Picture <T extends Shape> {
    ArrayList<T> list;

    public Picture()
    {
        list=new ArrayList<T>();
    }

    public void add (T shape)
    {
        list.add(shape);
    }

    public int remove(Point point)
    {
        int count=0; //the number of shapes removed
        for (int i=0;i<list.size();i++){
            if (list.get(i).contains(point)){
                list.remove(i);
                count++;
            }
        }
     // System.out.println(count+" shapes removed"); //for testing
        return count;
    }

    public String get(Point point)
    {
        String str=null;
        for (int i=0;i<=list.size();i++) {
            if (list.get(i).contains(point)) {
                str+=printShape(list.get(i));
            }
            return str;
        }
       return null;
    }

    private String printShape(T shape)
    {
        String s="";
        if (shape instanceof Line){
            s="Line \n";
        }
        if (shape instanceof Oval){
            s="Oval \n";
        }
        if (shape instanceof Rectangle){
            s="Rectangle \n";
        }
        return s;
    }

    public void show(Graphics g)
    {
        for (int i=0;i<list.size();i++){
            list.get(i).draw(g);
        }
    }
}//end
