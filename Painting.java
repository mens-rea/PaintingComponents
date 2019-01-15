import java.awt.*;
import javax.swing.*;
import javax.swing.JLabel;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.fillOval(0, 250, 50, 100);
		g.fillOval(0, 300, 60, 500);
		g.fillOval(20, 300, 60, 500);
		g.fillOval(50, 300, 60, 500);
		g.setColor(Color.YELLOW);

		g.fillRect(100,200,200,200);
		g.fillRect(500,200,300,400);
	


	}



	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		JPanel panel1 = new JPanel();
         JLabel label = new JLabel("LOUIE ALDRIN CABRAL");
         label.setVisible(true);
         label.setSize(500,100);
         myFrame.setResizable(false);
         label.setBounds(100,200,200,200);
		Painting myPainting = new Painting();

		panel1.setBackground(Color.GREEN);

          
  myFrame.add(label);
		myFrame.add(myPainting);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
}