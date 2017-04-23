import java.awt.*;

/**
 * Created by yuval_edelman on 4/10/2015.
 */
public class BoundedShape extends Shape {
    private boolean isFull; //is the shape full or not

    public BoundedShape(){
        super();
        isFull=false;
    }

    public BoundedShape(BoundedShape other){
        super(other);
        isFull=other.isFull;
    }

    public BoundedShape(int x1,int x2,int y1,int y2,Color color,boolean isFull){
        super(x1,y1,x2,y2,color);
        this.isFull=isFull;
    }
    public boolean full(){
        return isFull;
    }

    public void draw (Graphics g) {}

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        BoundedShape s = (BoundedShape) obj;
        if (this.getX2()==s.getX2()&&this.getY2()==s.getY2()){
            return true;
        }
        return false;
    }

    public boolean contains(Point point){
        java.awt.Rectangle rectangle=new java.awt.Rectangle(getX1(),getY1(),getX2(),getY2());
        return rectangle.contains(point);
    }
}
