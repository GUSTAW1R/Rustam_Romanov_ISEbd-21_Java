package Java_Labs;

import java.awt.Graphics;
import javax.swing.JPanel;
public class MyPanel extends JPanel {
	Airplane airplane;
	public MyPanel(Airplane air) {
		airplane=air;
	}
	public void paint(Graphics g) {
		super.paint(g);
		airplane.DrawAirplane(g);
	}
}
