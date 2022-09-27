package com.alejrest;

import java.util.Arrays;

public class Correa {
    private int tamanioCorrea;
    private String[] colores;
    private boolean intercambiable;

    public Correa(){}

    public Correa(int tamanioCorrea, String[] colores, boolean intercambiable) {
        this.tamanioCorrea = tamanioCorrea;
        this.colores = colores;
        this.intercambiable = intercambiable;
    }

    public int getTamanioCorrea() {
        return tamanioCorrea;
    }

    public void setTamanioCorrea(int tamanioCorrea) {
        this.tamanioCorrea = tamanioCorrea;
    }

    public String[] getColores() {
        return colores;
    }

    public void setColores(String[] colores) {
        this.colores = colores;
    }

    public boolean isIntercambiable() {
        return intercambiable;
    }

    public void setIntercambiable(boolean intercambiable) {
        this.intercambiable = intercambiable;
    }

    public String toString(){
        return tamanioCorrea + "mm "+ (intercambiable? "intercambiable " : "no intercambiable" )
                + Arrays.toString(colores);
    }
}
