package com.trabalho.entidade;

/**
 *
 * @author Daniel F
 */
public abstract class Poligono {

    private int qtdeLados;

    public Poligono() {
    }

    public Poligono(int qtdeLados) {
        this.qtdeLados = qtdeLados;
    }

    public int getQtdeLados() {
        return qtdeLados;
    }

    public void setQtdeLados(int qtdeLados) {
        this.qtdeLados = qtdeLados;
    }
    
    public void imprimir() {
        System.out.println("O polígono possui " + this.getQtdeLados() + " lados");
    }

    /**
     * Calcula a área do polígono.
     * @return 
     */
    public abstract double calcularArea();

}
