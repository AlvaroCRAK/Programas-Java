package modelo;
public class Donacion {
    double monto;
    double salud, comedor, bolsa;

    public Donacion(double monto){
        this.monto = monto;
    }
    public String reparticion(){
        if(monto >= 10000){
            salud = monto * 0.3;
            comedor = monto * 0.5;
            bolsa = monto * 0.2;
        }else{
            salud = monto * 0.25;
            comedor = monto * 0.6;
            bolsa = monto * 0.15;
        }
        return String.format("Parte para el Centro de Salud: %.2f\nParte para el Comedor de ninhos: %.2f\nParte para Inversion en bolsa: %.2f",
                salud, comedor, bolsa);
    }
}