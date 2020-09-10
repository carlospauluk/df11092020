package com.trabalho.entidade;

/**
 *
 * @author Daniel F
 */
public class Retangulo extends Poligono {

    private int lado1;

    private int lado2;

    public Retangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.setQtdeLados(4);
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return this.getLado1() * this.getLado2();
    }
    
    @Override
    public void imprimir() {
        System.out.println("O retângulo possui " + this.getQtdeLados() + " lados e área de " + this.calcularArea());
    }

}
