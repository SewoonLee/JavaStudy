package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class AnimationBasic extends JPanel implements ActionListener{
    
    private BufferedImage image;
    private Timer timer;
    private int x, y;
    private final int START_X=0, START_Y=250;
    private boolean xUp=true, yUp=true;

    public AnimationBasic(){
        File input = new File("./image/ship.png");
        try{
            image = ImageIO.read(input);
        }catch(IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        x=START_X;
        y=START_Y;
        
        timer =new Timer(20, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
            g.drawImage(image, x, y, this);
            System.out.println(x + ", " + y);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (y<20 && xUp==true){
            xUp=true;
            yUp=false;
        }else if (y>150 && xUp==true){
            xUp=true;
            yUp=true;
        }else if (x>400 && yUp==true){
            xUp=false; 
            yUp=true;
        }else if (x>400 && yUp==false){
            xUp=false;
            yUp=false;
        }else if (y<20 && xUp==false){
            xUp=false;
            yUp=false;
        }else if (y>150 && xUp==false){
            xUp=false;
            yUp=true;
        }else if (x<20 && yUp==false){
            xUp=true;
            yUp=false;
        }



        if (xUp==true)
            x+=1;
        else
            x-=1;
        
        if (yUp==true)
            y-=1;
        else
            y+=1;
        
        
        repaint();
    }

    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.add(new AnimationBasic());
        frame.setTitle("Animation Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setVisible(true);
    }
    
}
