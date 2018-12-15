package Java_Labs;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelAirport extends JPanel{
    public Airport<ITransport> airport;

    public Airport<ITransport> getAirport() {
        return airport;
    }

    public PanelAirport() {
        airport = new Airport<>(20, 615, 603);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if(airport != null) {
            airport.Draw(g);
        }
    }
}