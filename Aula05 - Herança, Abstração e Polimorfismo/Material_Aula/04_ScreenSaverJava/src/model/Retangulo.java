package model;

public class Retangulo extends Forma {

    private int base;
    private int altura;

    public Retangulo(int X, int Y, int altura, int base) {

        super(X, Y);
        this.base = base;
        this.altura = altura;
    }
    public void mover(){
        X+=VelX;
    }
}
