import javax.swing.*;

/**
 * Created by yuval_edelman on 5/15/2015.
 */
public class Main {
    public static void main(String[]args){
        JFrame frame=new JFrame("Picture");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Object[] options ={"Line","Bounded Shapes","All Shapes"};
        int shape = JOptionPane.showOptionDialog(null, "please chose shape", "Chose Shape", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
        if (shape>2||shape<0){System.exit(0);}//if user wont chose shape

        paintPanel paintPanel=new paintPanel(shape);
        frame.add(paintPanel);
        frame.setSize(800,800);
        frame.setVisible(true);
    }
}
