package com.tfi.model;

import com.tfi.model.enums.Rol;

import java.util.Date;

public class Empleado {

    private int legajo;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contraseña;
    private Date fechaNacimiento;
    private Rol rol;

    public Empleado() {
    }

    public Empleado(int legajo, String nombre, String apellido, String usuario, String contraseña, Date fechaNacimiento, Rol rol) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
