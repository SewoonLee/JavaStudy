package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

class GradientPanel extends JPanel{
    
    
    
    public void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2.setStroke(new BasicStroke(3));
        GradientPaint gp=new GradientPaint(0,10,Color.WHITE,0,70,Color.RED);
        
        g2.setPaint(Color.RED);
        g2.fill(new Rectangle2D.Float(10,10,70,80));
        
        g2.setPaint(gp);
        g2.fill(new RoundRectangle2D.Float(110,10,70,80,20,20));
        
        g2.setPaint(Color.RED);
        g2.fill(new Ellipse2D.Float(210,10,80,80));
        
        g2.setPaint(gp);
        g2.fill(new Arc2D.Float(310,10,80,80,45,240,Arc2D.OPEN));
        
        g2.setPaint(Color.RED);
        g2.fill(new Arc2D.Float(410,10,80,80,45,240,Arc2D.CHORD));
        
        g2.setPaint(gp);
        g2.fill(new Arc2D.Float(510,10,80,80,54,240,Arc2D.PIE));
        
    }
}

public class FillShapes extends JFrame{
    public FillShapes(){
        this.setSize(600,130);
        this.setTitle("Java 2D Fill Shapes");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel=new GradientPanel();
        this.add(panel);
        this.setVisible(true);
    }
    
    public static void main(String[] args){
        new FillShapes();
    }
}