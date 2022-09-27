package com.alejrest;

import java.util.Arrays;

public abstract class SmartDevice {
    private String nombreDispositivo;
    private String marcaDispositivo;
    private Pantalla pantalla;
    private Dimension dimension;
    private int peso;
    private String procesador;
    private int capacidadBateria;
    private String sistemaOperativo;
    private int cantidadMemoriaRam;
    private String[] conectividad;

    public SmartDevice(){

    }

    public SmartDevice(String nombreDispositivo, String marcaDispositivo, Pantalla pantalla, Dimension dimension, int peso, String procesador, int capacidadBateria, String sistemaOperativo, int cantidadMemoriaRam, String[] conectividad) {
        this.nombreDispositivo = nombreDispositivo;
        this.marcaDispositivo = marcaDispositivo;
        this.pantalla = pantalla;
        this.dimension = dimension;
        this.peso = peso;
        this.procesador = procesador;
        this.capacidadBateria = capacidadBateria;
        this.sistemaOperativo = sistemaOperativo;
        this.cantidadMemoriaRam = cantidadMemoriaRam;
        this.conectividad = conectividad;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    public String getMarcaDispositivo() {
        return marcaDispositivo;
    }

    public void setMarcaDispositivo(String marcaDispositivo) {
        this.marcaDispositivo = marcaDispositivo;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getCantidadMemoriaRam() {
        return cantidadMemoriaRam;
    }

    public void setCantidadMemoriaRam(int cantidadMemoriaRam) {
        this.cantidadMemoriaRam = cantidadMemoriaRam;
    }

    public String[] getConectividad() {
        return conectividad;
    }

    public void setConectividad(String[] conectividad) {
        this.conectividad = conectividad;
    }

    @Override
    public String toString() {
        return  "nombreDispositivo='" + nombreDispositivo + '\'' +
                "\n\tmarcaDispositivo='" + marcaDispositivo + '\'' +
                "\n\tpantalla=" + pantalla +
                "\n\tdimension=" + dimension +
                "\n\tpeso=" + peso +
                "\n\tprocesador='" + procesador + '\'' +
                "\n\tcapacidadBateria=" + capacidadBateria +
                "\n\tsistemaOperativo='" + sistemaOperativo + '\'' +
                "\n\tcantidadMemoriaRam=" + cantidadMemoriaRam +
                "\n\tconectividad=" + Arrays.toString(conectividad);
    }
}
