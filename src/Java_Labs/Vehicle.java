package Java_Labs;

import Java_Labs.ClassDirection.Direction;

import java.awt.*;


public abstract class Vehicle implements ITransport {
    // Координата X
    protected int _startPosX;
    // Координата Y
    protected int _startPosY;
    // Ширина окна отрисовки
    protected int _pictureWidth;
    // Высота окна отрисовки
    protected int _pictureHeight;
    // Максимальная скорость транспортного средства
    protected int MaxSpeed;
    // Вес транспортного средства
    protected float Weight;
    // Основной цвет транспортного средства
    protected Color MainColor;
    public int getMaxSpeed() {
        return MaxSpeed;
    }
    public float getWeight() {
        return Weight;
    }
    public Color getMainColor() {
        return MainColor;
    }
    // Определение места отрисовки транспортного средства
    public void SetPosition(int x, int y, int width, int height)
    {
        _startPosX = x;
        _startPosY = y;
        _pictureWidth = width;
        _pictureHeight = height;
    }
    // Метод отрисовки транспортного средства
    public abstract void DrawAirplane(Graphics g);
    // Метод перемещения транспортного средства
    public abstract void MoveTransport(Direction direction);
}
