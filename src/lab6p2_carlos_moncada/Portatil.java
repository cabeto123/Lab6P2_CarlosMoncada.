/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_carlos_moncada;

/**
 *
 * @author calol
 */
public class Portatil extends Consola{
    String tamañopantalla;
    int bateria;
    boolean estuche;

    public Portatil(String tamañopantalla, int bateria, boolean estuche, String identificacion, String fabricante, int añosdeuso, double precio, String modelo) {
        super(identificacion, fabricante, añosdeuso, precio, modelo);
        this.tamañopantalla = tamañopantalla;
        this.bateria = bateria;
        this.estuche = estuche;
    }

    
    public String getTamañopantalla() {
        return tamañopantalla;
    }

    public void setTamañopantalla(String tamañopantalla) {
        this.tamañopantalla = tamañopantalla;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isEstuche() {
        return estuche;
    }

    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAñosdeuso() {
        return añosdeuso;
    }

    public void setAñosdeuso(int añosdeuso) {
        this.añosdeuso = añosdeuso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
