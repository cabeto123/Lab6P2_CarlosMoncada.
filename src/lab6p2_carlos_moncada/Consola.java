/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_carlos_moncada;

import java.util.ArrayList;

/**
 *
 * @author calol
 */
public class Consola {
 String identificacion;
 String fabricante;
 int añosdeuso;
 double precio;
 ArrayList<Juego> juegosdisponibles = new ArrayList<>();
 String modelo;

    public Consola() {
    }

    public Consola(String identificacion, String fabricante, int añosdeuso, double precio, String modelo) {
        this.identificacion = identificacion;
        this.fabricante = fabricante;
        this.añosdeuso = añosdeuso;
        this.precio = precio;
        this.modelo = modelo;
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
        return  modelo ;
    }
    
        
}