import javax.swing.*;
import java.awt.*;

public class Painting extends JPanel{
   public void paintComponent(Graphics g){

       super.paintComponent(g);
       g.fillOval(50, 150, 200, 250);
       g.fillOval(150, 200, 255, 300);
       g.fillOval(250, 300, 300, 250);
       g.fillOval(350, 400, 200, 200);
       g.setColor(Color.YELLOW);
   }

   public static void main(String args[]){

   JFrame myFrame = new JFrame("Painting");
   JPanel Panel1 = new JPanel();

   Painting myPainting = new Painting();
   Panel1.setBackground(Color.RED);

   				myFrame.add(myPainting);
   			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   		myFrame.setSize(700,600);
   	myFrame.setVisible(true);

       }
}