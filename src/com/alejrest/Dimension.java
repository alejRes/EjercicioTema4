package com.alejrest;

public class Dimension {
    private double alto;
    private double ancho;
    private double fondo;

    public Dimension(){}

    public Dimension(double alto, double ancho, double fonfo) {
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fonfo;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getFondo() {
        return fondo;
    }

    public String toString(){
        return alto + " x " + ancho + " x " + fondo +" mm";
    }
}
