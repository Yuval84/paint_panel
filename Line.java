import java.awt.*;
/**
 * Created by yuval_edelman on 4/9/2015.
 */
public class Line extends Shape {

    public Line(){
        super();
    }

    public Line(Line other){
        super(other);
    }

    public Line(int x1,int y1,int x2,int y2,Color color){
        super(x1,y1,x2,y2,color);
    }

    @Override
    public void draw(Graphics g){
        super.draw(g);
        g.setColor(getColor());
        g.drawLine(getX1(),getY1(),getX2(),getY2());

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (obj == null || obj.getClass() != this.getClass()) { return false; }
        Line line=(Line)obj;
        if (this.lineDis(this.getX1(),this.getY1(),this.getX2(),this.getY2()) == ((Line) line).lineDis(line.getX1(),line.getY1(),line.getX2(),line.getY2())){
            return true;
        }
        return false;
    }

    private double lineDis(int x1,int y1,int x2,int y2){
        double result=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean contains(Point point){
        return (java.awt.geom.Line2D.ptSegDistSq(getX1(), getY1(), getX2(), getY2(), point.getX(), point.getY()) < 9);
    }
}