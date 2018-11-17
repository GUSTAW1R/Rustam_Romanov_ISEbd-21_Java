package Java_Labs;

import java.awt.Color;
import java.awt.Graphics;

import Java_Labs.ClassDirection.Direction;

public class Airplane extends Vehicle {

	private final int AirplaneWidth = 140;

	private final int AirplaneHeight = 60;

	private Color DopColor;
	void getDopColor(Color DopColor) {this.DopColor=DopColor;}
	Color setDopColor() {return this.DopColor;}

	public Airplane(int maxSpeed, int weight, Color mainColor)
	{
		MaxSpeed = maxSpeed;
		Weight = weight;
		MainColor = mainColor;
	}


	public void MoveTransport(Direction direction)
	{
		float step = MaxSpeed;
		switch (direction)
		{
			case Left:
			{
				if (_startPosX - step > 0)
				{
					_startPosX -= step;
				}
				break;
			}
			case Right:
			{
				if (_startPosX + step + AirplaneWidth < _pictureWidth)
				{
					_startPosX += step;
				}
				break;
			}
			case Up:
			{
				if (_startPosY - step > 0)
				{
					_startPosY -= step;
				}
				break;
			}
			case Down:
			{
				if (_startPosY + step + AirplaneHeight <= _pictureHeight)
				{
					_startPosY += step;
				}
				break;
			}
		}
	}
	public void DrawAirplane(Graphics g)
	{

		int xpoints[] = {_startPosX,_startPosX + 120,_startPosX + 130,_startPosX + 130,_startPosX + 120, _startPosX + 10, _startPosX - 30};
		int ypoints[] = {_startPosY,_startPosY,_startPosY + 10,_startPosY + 30,_startPosY + 40, _startPosY + 40, _startPosY + 10};
		int npoints = 7;
		int x1points[] = {_startPosX + 100, _startPosX + 100, _startPosX + 130, _startPosX + 120};
		int y1points[] = {_startPosY, _startPosY + 10, _startPosY + 10, _startPosY};
		int n1points = 4;
		int x2_1points[] = {_startPosX + 40, _startPosX + 20, _startPosX + 50, _startPosX + 90};
		int y2_1points[] = {_startPosY, _startPosY + 30, _startPosY + 30, _startPosY};
		int n2_1points = 4;
		int x2_2points[] = {_startPosX, _startPosX - 20, _startPosX - 30, _startPosX + 10, _startPosX, _startPosX + 20};
		int y2_2points[] = {_startPosY, _startPosY - 30, _startPosY - 30, _startPosY - 30, _startPosY - 30, _startPosY};
		int n2_2points = 6;
		g.setColor(MainColor);
		g.drawPolygon(xpoints, ypoints, npoints);
		g.fillPolygon(xpoints, ypoints, npoints);
		g.setColor(Color.BLACK);
		g.fillRect(_startPosX + 60, _startPosY + 10, 20, 10);
		g.fillRect(_startPosX + 40, _startPosY + 20, 20, 10);
		g.fillOval(_startPosX + 20, _startPosY + 40, 10, 10);
		g.fillOval(_startPosX + 30, _startPosY + 40, 10, 10);
		g.fillOval(_startPosX + 40, _startPosY + 40, 10, 10);
		g.fillOval(_startPosX + 50, _startPosY + 40, 10, 10);
		g.fillOval(_startPosX + 90, _startPosY + 40, 10, 10);
		g.setColor(Color.BLUE);
		g.drawPolyline(x1points, y1points, n1points);
		g.fillPolygon(x1points, y1points, n1points);
		g.setColor(Color.DARK_GRAY);
		g.fillPolygon(x2_1points, y2_1points, n2_1points);
		g.setColor(Color.DARK_GRAY);
		g.drawPolygon(x2_2points, y2_2points, n2_2points);
		g.fillPolygon(x2_2points, y2_2points, n2_2points);

	}

}