package com.alejrest;

public class Pantalla {
    private double tamanioPulgadas;
    private String tipoPantalla;
    private String tipoResolucion;

    public Pantalla(){}

    public Pantalla(double tamanioPulgadas, String tipoPantalla, String tipoResolucion) {
        this.tamanioPulgadas = tamanioPulgadas;
        this.tipoPantalla = tipoPantalla;
        this.tipoResolucion = tipoResolucion;
    }

    public double getTamanioPulgadas() {
        return tamanioPulgadas;
    }

    public void setTamanioPulgadas(double tamanioPulgadas) {
        this.tamanioPulgadas = tamanioPulgadas;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public String getTipoResolucion() {
        return tipoResolucion;
    }

    public void setTipoResolucion(String tipoResolucion) {
        this.tipoResolucion = tipoResolucion;
    }

    public String toString(){
        return tipoPantalla +" "+ tamanioPulgadas +" pulgadas\n\t\t\t"+
                tipoResolucion;
    }
}
