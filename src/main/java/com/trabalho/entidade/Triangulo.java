package com.trabalho.entidade;

/**
 *
 * @author Daniel F
 */
public class Triangulo extends Poligono {

    private int base;

    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.setQtdeLados(3);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (this.getBase() * this.getAltura()) / 2;
    }
    
    @Override
    public void imprimir() {
        System.out.println("O triângulo possui " + this.getQtdeLados() + " lados e área de " + this.calcularArea());
    }

}
