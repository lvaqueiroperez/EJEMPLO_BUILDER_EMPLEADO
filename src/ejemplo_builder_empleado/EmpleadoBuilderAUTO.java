/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_builder_empleado;

public class EmpleadoBuilderAUTO {

    private String nombre;
    private String apellido1;
    private String apellido2 = "apellido";
    private int dia = 1;
    private int mes = 1;
    private int anho = 1;
    private float altura = 1;
    private float pie = 1;
    private float diamCabeza = 1;
    private float sueldo = 1;
    private String dni = "15151515P";
    private String cargo = "nada";
    private String formacion = "nada";

    public EmpleadoBuilderAUTO() {
    }

    public EmpleadoBuilderAUTO setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public EmpleadoBuilderAUTO setApellido1(String apellido1) {
        this.apellido1 = apellido1;
        return this;
    }

    public EmpleadoBuilderAUTO setApellido2(String apellido2) {
        this.apellido2 = apellido2;
        return this;
    }

    public EmpleadoBuilderAUTO setDia(int dia) {
        this.dia = dia;
        return this;
    }

    public EmpleadoBuilderAUTO setMes(int mes) {
        this.mes = mes;
        return this;
    }

    public EmpleadoBuilderAUTO setAnho(int anho) {
        this.anho = anho;
        return this;
    }

    public EmpleadoBuilderAUTO setAltura(float altura) {
        this.altura = altura;
        return this;
    }

    public EmpleadoBuilderAUTO setPie(float pie) {
        this.pie = pie;
        return this;
    }

    public EmpleadoBuilderAUTO setDiamCabeza(float diamCabeza) {
        this.diamCabeza = diamCabeza;
        return this;
    }

    public EmpleadoBuilderAUTO setSueldo(float sueldo) {
        this.sueldo = sueldo;
        return this;
    }

    public EmpleadoBuilderAUTO setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public EmpleadoBuilderAUTO setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public EmpleadoBuilderAUTO setFormacion(String formacion) {
        this.formacion = formacion;
        return this;
    }

    public Empleado createEmpleado() {
        return new Empleado(nombre, apellido1, apellido2, dia, mes, anho, altura, pie, diamCabeza, sueldo, dni, cargo, formacion);
    }

}
