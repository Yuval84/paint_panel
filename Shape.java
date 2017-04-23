import java.awt.*;
/**
 * Created by yuval_edelman on 5/13/2015.
 */
    public class Shape implements Cloneable {
        private int x1,x2,y1,y2;
        private Color color;

        public Shape(){
            x1=0;
            y1=0;
            x2=0;
            y2=0;
            color=color.BLACK;
        }
        public Shape(Shape other){
            x1=other.x1;
            x2=other.x2;
            y1=other.y1;
            y2=other.y2;
            color=other.color;
        }

        public Shape(int x1, int y1, int x2, int y2, Color color){
            this.x1=x1;
            this.x2=x2;
            this.y1=y1;
            this.y2=y2;
            this.color=color;
        }
        public void setX1(int x1){
            this.x1=x1;
        }
        public void setX2(int x2){
            this.x2=x2;
        }
        public void setY1(int y1){
            this.y1=y1;
        }
        public void setY2(int y2){
            this.y2=y2;
        }
        public void setColor(Color color){
            this.color=color;
        }
        public int getX1(){
            return x1;
        }
        public int getX2(){
            return x2;
        }
        public int getY1(){
            return y1;
        }
        public int getY2(){
            return y2;
        }
        public Color getColor(){
            return color;
        }

        public void draw (Graphics g) {}

        public boolean contains(Point point){return false;}

        @Override
        protected  Object clone() throws CloneNotSupportedException {
            Shape s;
            try {
                s = (Shape) super.clone();
                return s;
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                throw new RuntimeException();
            }
        }
 }

