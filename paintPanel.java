import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


/**
 * Created by yuval_edelman on 5/15/2015.
 */
public class paintPanel extends JPanel {
    private Picture picture;
    private JButton addShape;
    private int shape;

    paintPanel(int shape){
        picture=new Picture();
        this.shape=shape;
        setBackground(Color.WHITE);
        addShape=new JButton("add shape");
        addShape.addActionListener(new ActionListener() { //when pressing add button

            @Override
            public void actionPerformed(ActionEvent e) {
                setPicture(); //create new shape and insert her to the list
                repaint();
            }
        });

        add(addShape,BorderLayout.EAST);

        addMouseListener(new MouseAdapter() { //to remove shapes from the panel
            @Override
            public void mouseClicked(MouseEvent e) {
                picture.remove(e.getPoint());
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        picture.show(g);

    }

    private void setPicture(){//randomize the chosen shape and adding it to the list
        Random rand=new Random();
        if (shape==0){ //lines
            Color c=new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
            Line line=new Line(rand.nextInt(800),rand.nextInt(800),rand.nextInt(800),rand.nextInt(800),c);
            picture.add(line);
        }
        if (shape==1){ //bounded shapes
            Color c=new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
            boolean randomTheBoundedShape=rand.nextBoolean(); //random chose between oval and rectangle
            if (randomTheBoundedShape){ //chose oval
                Oval oval=new Oval(rand.nextInt(500),rand.nextInt(500),rand.nextInt(500),rand.nextInt(500),c,rand.nextBoolean());
                picture.add(oval);
            }else {//chose rectangle
                Rectangle rect=new Rectangle(rand.nextInt(800),rand.nextInt(500),rand.nextInt(500),rand.nextInt(500),c,rand.nextBoolean());
                picture.add(rect);
            }
        }
        if (shape==2){//all shapes
            shape=rand.nextInt(2);//random the shape and call the set picture method
            setPicture();
            shape=2; //set back the shape to all shapes
        }
    }
}//end










































