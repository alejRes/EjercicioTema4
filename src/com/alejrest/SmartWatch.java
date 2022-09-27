package com.alejrest;

import java.util.Arrays;

public class SmartWatch extends SmartDevice{
    private Correa correa;
    private String[] sensores;
    private String[] compatibilidad;

    public SmartWatch() {

    }

    public SmartWatch(String nombreDispositivo, String marcaDispositivo, Pantalla pantalla, Dimension dimension, int peso, String procesador, int capacidadBateria, String sistemaOperativo, int cantidadMemoriaRam, String[] conectividad, Correa correa, String[] sensores, String[] compatibilidad) {
        super(nombreDispositivo, marcaDispositivo, pantalla, dimension, peso, procesador, capacidadBateria, sistemaOperativo, cantidadMemoriaRam, conectividad);
        this.correa = correa;
        this.sensores = sensores;
        this.compatibilidad = compatibilidad;
    }

    public Correa getCorrea() {
        return correa;
    }

    public void setCorrea(Correa correa) {
        this.correa = correa;
    }

    public String[] getSensores() {
        return sensores;
    }

    public void setSensores(String[] sensores) {
        this.sensores = sensores;
    }

    public String[] getCompatibilidad() {
        return compatibilidad;
    }

    public void setCompatibilidad(String[] compatibilidad) {
        this.compatibilidad = compatibilidad;
    }

    @Override
    public String toString() {
        return "SmartWatch:\n\t" +
                super.toString() +
                "\n\tcorrea:" + correa +
                "\n\tsensores:" + Arrays.toString(sensores) +
                "\n\tcompatibilidad:" + Arrays.toString(compatibilidad);
    }
}
