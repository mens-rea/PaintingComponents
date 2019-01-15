import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.WHITE);
		g.fillRect(320, 130, 50, 120);

		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(323, 133, 45, 120);

		g.setColor(Color.GRAY);
		g.fillRect(326, 136, 40, 120);

		g.setColor(Color.YELLOW);
		g.fillRect(310, 250, 70, 8);

		g.setColor(Color.BLACK);
		g.fillRect(338,258, 15, 30);

		int xpoints[] = {320, 370, 370};
		int ypoints[] = {130, 100, 130};
		int npoints = 3;

		g.setColor(Color.WHITE);
		g.fillPolygon(xpoints, ypoints, npoints);

		int apoints[] = {323, 368, 368};
		int bpoints[] = {133, 105, 133};
		int cpoints = 3;

		g.setColor(Color.LIGHT_GRAY);
		g.fillPolygon(apoints, bpoints, cpoints);

		int dpoints[] = {326, 366, 366};
		int epoints[] = {136, 110, 136};
		int fpoints = 3;

		g.setColor(Color.GRAY);
		g.fillPolygon(dpoints, epoints, fpoints);

		g.setColor(Color.YELLOW);	
		g.fillOval(332, 287, 25, 25);

		g.setColor(Color.RED);	
		g.fillOval(333, 289, 22, 22);
	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		//JPanel myPanel = new JPanel();

		Painting myPainting = new Painting();

		myPainting.setBackground(Color.RED);
	
		myFrame.add(myPainting);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
	
}