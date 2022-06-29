package com.universidad;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Usuario {

    @Setter @Getter
    private int idUsuario;

    @Setter @Getter
    private String nombre;

    @Setter @Getter
    private String apellido;

    @Setter @Getter
    private char sexo;

    @Setter @Getter
    private Date fechaNacimiento = new Date();

    @Setter @Getter
    private String statusUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String apellido, char sexo, Date fechaNacimiento, String statusUsuario) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.statusUsuario = statusUsuario;
    }


}