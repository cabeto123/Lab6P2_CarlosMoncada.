/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_carlos_moncada;

/**
 *
 * @author calol
 */
public class Estacionaria extends Consola{
    int numerodecontroles;
    int almacenamiento;
    String tipoconexion;

    public Estacionaria(int numerodecontroles, int almacenamiento, String tipoconexion, String identificacion, String fabricante, int añosdeuso, double precio, String modelo) {
        super(identificacion, fabricante, añosdeuso, precio, modelo);
        this.numerodecontroles = numerodecontroles;
        this.almacenamiento = almacenamiento;
        this.tipoconexion = tipoconexion;
    }

    

    public int getNumerodecontroles() {
        return numerodecontroles;
    }

    public void setNumerodecontroles(int numerodecontroles) {
        this.numerodecontroles = numerodecontroles;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoconexion() {
        return tipoconexion;
    }

    public void setTipoconexion(String tipoconexion) {
        this.tipoconexion = tipoconexion;
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
