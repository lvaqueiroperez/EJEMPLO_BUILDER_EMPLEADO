package ejemplo_builder_empleado;

public class EmpleadoBuilder {

    //aqui haremos el builder de la clase Empleado
    //tendra los mismos atributos 
    private String nombre;
    private String apellido1;
    private String apellido2 = "";
    private int dia = 0;
    private int mes = 0;
    private int anho = 0;
    private float altura = 0;
    private float pie = 0;
    private float diamCabeza = 0;
    private float sueldo = 0;
    private String dni;
    private String cargo = "";
    private String formacion = "";

    

    //esta clase se encargara de poner valores por defecto a los atributos
    //tendra los mismos atributos, pero aqui se asignaran valores por defecto
    //a aquellos que no sean obligatorios
}
