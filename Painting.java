import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 700, 350);
		g.setColor(Color.BLACK);
		g.fillRect(0, 360, 700, 100);
		g.setColor(Color.WHITE);
		g.fillOval(10, 25, 70, 70);
		g.fillOval(25, 50, 70, 70);
		g.fillOval(35, 10, 70, 70);
		g.fillOval(60, 45, 70, 70);
		g.fillOval(80, 15, 70, 70);
		g.fillOval(100, 50, 70, 70);
		g.fillOval(110, 20, 70, 70);
		g.fillOval(110, 20, 70, 70);
		g.fillOval(600, 20, 70, 70);
		g.setColor(Color.BLACK);
		g.fillRect(550, 300, 5, 50);
		g.setColor(Color.GREEN);
		g.fillRect(0, 350, 700, 10);
		g.fillOval(555, 300, 20, 20);
		g.fillOval(530, 300, 20, 20);
		g.fillOval(535, 290, 20, 20);
		g.fillOval(550, 290, 20, 20);
		g.fillOval(540, 280, 20, 20);
		g.fillOval(545, 280, 20, 20);
		g.fillOval(545, 300, 20, 20);
		g.setColor(Color.GRAY);
		g.fillRect(0, 360, 700, 20);
		g.setColor(Color.WHITE);
		g.fillRect(0, 415, 100, 10);
		g.fillRect(300, 415, 100, 10);
		g.fillRect(600, 415, 100, 10);
		g.setColor(Color.BLACK);
		g.fillRect(350, 300, 5, 50);
		g.setColor(Color.GREEN);
		g.fillOval(355, 300, 20, 20);
		g.fillOval(330, 300, 20, 20);
		g.fillOval(335, 290, 20, 20);
		g.fillOval(350, 290, 20, 20);
		g.fillOval(340, 280, 20, 20);
		g.fillOval(345, 280, 20, 20);
		g.fillOval(345, 300, 20, 20);
		g.setColor(Color.BLACK);
		g.fillRect(150, 300, 5, 50);
		g.setColor(Color.GREEN);
		g.fillOval(155, 300, 20, 20);
		g.fillOval(130, 300, 20, 20);
		g.fillOval(135, 290, 20, 20);
		g.fillOval(150, 290, 20, 20);
		g.fillOval(140, 280, 20, 20);
		g.fillOval(145, 280, 20, 20);
		g.fillOval(145, 300, 20, 20);
		g.setColor(Color.BLACK);
		g.fillRect(450, 300, 5, 50);
		g.setColor(Color.GREEN);
		g.fillOval(455, 300, 20, 20);
		g.fillOval(430, 300, 20, 20);
		g.fillOval(435, 290, 20, 20);
		g.fillOval(450, 290, 20, 20);
		g.fillOval(440, 280, 20, 20);
		g.fillOval(445, 280, 20, 20);
		g.fillOval(445, 300, 20, 20);
		g.setColor(Color.BLACK);
		g.fillRect(250, 300, 5, 50);
		g.setColor(Color.GREEN);
		g.fillOval(255, 300, 20, 20);
		g.fillOval(230, 300, 20, 20);
		g.fillOval(235, 290, 20, 20);
		g.fillOval(250, 290, 20, 20);
		g.fillOval(240, 280, 20, 20);
		g.fillOval(245, 280, 20, 20);
		g.fillOval(245, 300, 20, 20);
		g.setColor(Color.YELLOW);
		g.fillOval(350, 25, 10, 10);
		g.fillOval(550, 50, 10, 10);
		g.fillOval(450, 10, 10, 10);
		g.fillOval(250, 45, 10, 10);
		g.fillOval(590, 15, 10, 10);
		g.fillOval(350, 25, 10, 10);
		g.fillOval(550, 50, 10, 10);
		g.fillOval(450, 10, 10, 10);
		g.fillOval(250, 45, 10, 10);
		g.fillOval(590, 15, 10, 10);
		g.fillOval(359, 60, 10, 10);
		g.fillOval(559, 70, 10, 10);
		g.fillOval(459, 80, 10, 10);
		g.fillOval(259, 70, 10, 10);
		g.fillOval(590, 60, 10, 10);

		
	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		// JPanel panel1 = new JPanel();

		Painting myPainting = new Painting();

		// panel1.setBackground(Color.GREEN);

		myFrame.add(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
}