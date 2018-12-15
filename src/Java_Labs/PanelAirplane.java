package Java_Labs;

import java.awt.Graphics;
import javax.swing.JPanel;
public class PanelAirplane extends JPanel {
	public static ITransport airplane;
	public static boolean initialization = false;

	void setAir(ITransport transport){
		airplane = transport;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if(airplane != null) {
			airplane.DrawAirplane(g);
		}
	}
}
