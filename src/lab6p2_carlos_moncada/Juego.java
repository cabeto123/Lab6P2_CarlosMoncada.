/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_carlos_moncada;

import java.util.Date;

/**
 *
 * @author calol
 */
public class Juego {
 String nombre;
 String descripcion;
 Date fechalanzamiento;
 double precio;
 String estado;
 boolean rentable;
 boolean agregado;
 int cantdisponibles;

    public Juego(String nombre, String descripcion, Date fechalanzamiento, double precio, String estado, boolean rentable, boolean agregado, int cantdisponibles) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechalanzamiento = fechalanzamiento;
        this.precio = precio;
        this.estado = estado;
        this.rentable = rentable;
        this.agregado = agregado;
        this.cantdisponibles = cantdisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechalanzamiento() {
        return fechalanzamiento;
    }

    public void setFechalanzamiento(Date fechalanzamiento) {
        this.fechalanzamiento = fechalanzamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }

    public int getCantdisponibles() {
        return cantdisponibles;
    }

    public void setCantdisponibles(int cantdisponibles) {
        this.cantdisponibles = cantdisponibles;
    }

    @Override
    public String toString() {
        return nombre ;
    }
 
}
