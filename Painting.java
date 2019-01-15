import javax.awt.*;
import javax.swing.*; 
 
 public class Painting extends JPanel{


	public void paintComponent(Graphics g) {
		super.paintComponent(g);


		g.setColor(Color.GREEN);
        g.fillRect(0, 0, 700, 700);
        g.setColor(Color.YELLOW);
        g.fillOval(50, 150, 110, 100);
        g.fiilOval(50, 140, 110, 100);
        g.drawOval(30, 165, 115, 120);
        g.setColor(Color.RED);
        g.fillRect(30, 30, 101, 101);
        g.drawRect(25, 25, 111, 111);
       

   }


     public static void main (String args[]){
     JFrame myFrame = new JFrame("Painting");
    // JPanel panel1 = new JPanel();

     Painting myPainting  = new Painting();
    
     //panel1.setBackground(Color.Blue);

     myFrame.add(myPainting);

     myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       myFrame.setSize(700, 500);
       myFrame.setVisible(true);
  


     }
}