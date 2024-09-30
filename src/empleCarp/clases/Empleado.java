package empleCarp.clases;

import empleCarp.datos.*;

import java.lang.annotation.Annotation;

public abstract class Empleado implements DatoEmpleado {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private int telefono;

    public Empleado(String nombre, String apellido, String dni, String direccion, int telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public String apellido() {
        return apellido;
    }

    @Override
    public String dni() {
        return dni;
    }

    @Override
    public String direccion() {
        return direccion;
    }

    @Override
    public int telefono() {
        return telefono;
    }

    @Override
    public String clase() {
        return "";
    }

    @Override
    public int codigoDespacho() {
        return 0;
    }

    @Override
    public int codigoTaller() {
        return 0;
    }

    @Override
    public String perfil() {
        return "";
    }

    @Override
    public String categoria() {
        return "";
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono;
    }
}
