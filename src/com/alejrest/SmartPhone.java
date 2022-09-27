package com.alejrest;

import java.util.Arrays;

public class SmartPhone extends SmartDevice{
    private int pxCamaraDelantera;
    private int pxCamaraTrasera;
    private int almacenamientoInterno;
    private boolean memoriaAmpliable;
    private String[] otrasCaracteristicas;

    public SmartPhone() {

    }

    public SmartPhone(String nombreDispositivo, String marcaDispositivo, Pantalla pantalla, Dimension dimension, int peso, String procesador, int capacidadBateria, String sistemaOperativo, int cantidadMemoriaRam, String[] conectividad, int pxCamaraDelantera, int pxCamaraTrasera, int almacenamientoInterno, boolean memoriaAmpliable, String[] otrasCaracteristicas) {
        super(nombreDispositivo, marcaDispositivo, pantalla, dimension, peso, procesador, capacidadBateria, sistemaOperativo, cantidadMemoriaRam, conectividad);
        this.pxCamaraDelantera = pxCamaraDelantera;
        this.pxCamaraTrasera = pxCamaraTrasera;
        this.almacenamientoInterno = almacenamientoInterno;
        this.memoriaAmpliable = memoriaAmpliable;
        this.otrasCaracteristicas = otrasCaracteristicas;
    }

    public int getPxCamaraDelantera() {
        return pxCamaraDelantera;
    }

    public void setPxCamaraDelantera(int pxCamaraDelantera) {
        this.pxCamaraDelantera = pxCamaraDelantera;
    }

    public int getPxCamaraTrasera() {
        return pxCamaraTrasera;
    }

    public void setPxCamaraTrasera(int pxCamaraTrasera) {
        this.pxCamaraTrasera = pxCamaraTrasera;
    }

    public int getAlmacenamientoInterno() {
        return almacenamientoInterno;
    }

    public void setAlmacenamientoInterno(int almacenamientoInterno) {
        this.almacenamientoInterno = almacenamientoInterno;
    }

    public boolean isMemoriaAmpliable() {
        return memoriaAmpliable;
    }

    public void setMemoriaAmpliable(boolean memoriaAmpliable) {
        this.memoriaAmpliable = memoriaAmpliable;
    }

    public String[] getOtrasCaracteristicas() {
        return otrasCaracteristicas;
    }

    public void setOtrasCaracteristicas(String[] otrasCaracteristicas) {
        this.otrasCaracteristicas = otrasCaracteristicas;
    }

    @Override
    public String toString() {
        return "SmartPhone:\n\t" +
                super.toString() +
                "\n\tpxCamaraDelantera=" + pxCamaraDelantera +
                "\n\tpxCamaraTrasera=" + pxCamaraTrasera +
                "\n\talmacenamientoInterno=" + almacenamientoInterno +
                "\n\tmemoriaAmpliable=" + memoriaAmpliable +
                "\n\totrasCaracteristicas=" + Arrays.toString(otrasCaracteristicas);
    }
}
