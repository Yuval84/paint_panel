import java.awt.*;
/**
 * Created by yuval_edelman on 4/10/2015.
 */
public class Rectangle extends BoundedShape {

    public Rectangle(){
        super();
    }
    public Rectangle(Rectangle other){
        super(other);
    }
    public Rectangle(int x1,int y1,int x2,int y2,Color color,boolean full){
        super(x1,y1,x2,y2,color,full);
    }

    @Override
    public void draw (Graphics g){
        g.setColor(this.getColor());
        if (this.full()){
            g.fillRect(this.getX1(),this.getY1(),this.getX2(),this.getY2());
        }else{
            g.drawRect(this.getX1(),this.getY1(),this.getX2(),this.getY2());
        }
    }
}