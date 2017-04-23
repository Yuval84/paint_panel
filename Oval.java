import javafx.scene.shape.Ellipse;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Created by yuval_edelman on 4/10/2015.
 */
public class Oval extends BoundedShape {

    public Oval (){
        super();
    }

    public Oval(Oval other){
        super(other);
    }

    public Oval( int x1,int y1,int x2,int y2,Color color,boolean full){
        super(x1,y1,x2,y2,color,full);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.getColor());
        if (this.full()){
            g.fillOval(this.getX1(),this.getY1(),this.getX2(),this.getY2());
        }else{
            g.drawOval(this.getX1(),this.getY1(),this.getX2(),this.getY2());
        }
    }
}

