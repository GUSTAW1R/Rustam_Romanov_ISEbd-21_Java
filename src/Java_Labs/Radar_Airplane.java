package Java_Labs;

import java.awt.*;

public class Radar_Airplane extends  Airplane {

    private Color DopColor;
    void getDopColor(Color DopColor) {this.DopColor=DopColor;}
    Color setDopColor() {return this.DopColor;}

    public Radar_Airplane(int maxSpeed, int weight, Color mainColor, Color dopColor)
    {
        super(maxSpeed, weight, mainColor);
        MaxSpeed = maxSpeed;
        Weight = weight;
        MainColor = mainColor;
        DopColor = dopColor;
    }
    public void DrawAirplane(Graphics g)
    {
        super.DrawAirplane(g);

        int x3points[] = {_startPosX + 50, _startPosX + 50, _startPosX + 40, _startPosX + 70, _startPosX + 60, _startPosX + 60};
        int y3points[] = {_startPosY, _startPosY - 10, _startPosY - 10, _startPosY - 10, _startPosY - 10, _startPosY};
        int n3points = 6;

        g.setColor(DopColor);
        g.drawPolygon(x3points, y3points, n3points);
        g.fillPolygon(x3points, y3points, n3points);

    }
}
