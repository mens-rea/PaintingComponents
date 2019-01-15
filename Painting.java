import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){

		super.paintComponent(g);
		g.setColor(Color.PINK);
		g.fillOval(650, 250, 100, 100);
		g.setColor(Color.PINK);
		g.fillRect(500, 250, 100, 100);

	}




	public static void main(String args[]){
		
        JFrame myFrame = new JFrame("Painting");
         //JPanel panel1 = new JPanel();

        Painting myPainting = new Painting();

        myPainting.setBackground(Color.BLACK);

         //panel1.setBackground(Color.BLACK);

        myFrame.add(myPainting);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(700, 500);
        myFrame.setVisible(true);



        }
    }