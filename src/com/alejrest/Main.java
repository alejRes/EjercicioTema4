package com.alejrest;

public class Main {
    public static void main(String[] args) {

        Pantalla pantallaSmartPhone = new Pantalla(6.6,"TFT/LCD","FullHD+");
        Dimension dimensonSmartPhone = new Dimension(165.4,76.9,8.4);
        String[] otrasCaracteristicas = new String[]{"Lector de huellas lateral", "Sonido Dolby Atmos", "Jack de auriculares"};

        SmartDevice smartDevice1 = new SmartPhone("Galaxy A23","Samsung",pantallaSmartPhone,dimensonSmartPhone,197,"Snapdragon 695", 5000,"Android 12 con OneUI 4.1"
        ,4,new String[]{"Dual-nanoSIM","5G","4G","NFC"},50,8,64,true, otrasCaracteristicas);

        String[] sensores = new String[]{"Acelerómetro", "Giroscopio", "Barometro", "HRM"};
        String[] compatibilidad = new String[]{"Android 5.0 o posterior", "iPhone 5 o superior", "iOs 9.0 o superior"};

        SmartDevice smartDevice2 = new SmartWatch("Galaxy Watch", "Samsung", new Pantalla(1.3,"AMOLED","Corning Gorilla DX+"),
                new Dimension(46,49,13),63,"Exynos 9110 Dual Core 1.15Ghz",472,"Tizen basado en wearable OS 4.0",2,new String[]{"3G/LTE", "Bluetooth 4.2"},
                new Correa(22,new String[]{"Azul Marino", "Rojo Terracota"},true),sensores, compatibilidad);

        System.out.println(smartDevice1);
        System.out.println(smartDevice2);
    }
}