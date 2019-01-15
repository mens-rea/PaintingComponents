import java.awt.*;
import javax.swing.*;
import javax.swing.JLabel;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.fillOval(0, 250, 50, 100);
		g.fillRect(20, 300, 60, 500);
		g.setColor(Color.ORANGE);

	


	}



	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		JPanel panel1 = new JPanel();
         JLabel label = new JLabel("James Allen Maye III");
         label.setVisible(true);
         label.setSize(500,100);
         myFrame.setResizable(false);
         label.setBounds(100,200,200,200);
		Painting myPainting = new Painting();

		panel1.setBackground(Color.BLUE);


  myFrame.add(label);
		myFrame.add(myPainting);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
}
