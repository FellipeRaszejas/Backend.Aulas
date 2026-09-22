package model;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Forma {
    // atributos
    protected int X;
    protected int Y;
    protected int VelX;
    protected  int VelY;
    private Color cor;

    // construtor
    public Forma(int x, int y) {
        this.X = x;
        this.Y = y;
        VelX = 1;
        VelY = 0;
        cor = new Color(255, 0, 0);
    }

    public void desenhar(Graphics2D g) {
        g.setColor(cor);
        g.fillRect(X, Y, 200, 50);
    }
}