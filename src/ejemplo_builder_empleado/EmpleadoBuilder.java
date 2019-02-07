package ejemplo_builder_empleado;
//CLASE HECHA A MANO

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

    //su constructor solo tendra los atributos que consideremos "obligatorios"
    //los ponemos como final para evitar errores de modificacion SOLO EN EL CONSTRUCTOR
    public EmpleadoBuilder(final String nombre, final String apellido1, final String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
    }

    //esta clase se encargara de poner valores por defecto a los atributos
    //tendra los mismos atributos, pero aqui se asignaran valores por defecto
    //a aquellos que no sean obligatorios
    ////////
    ////////
    //creamos setters de atributos no-obligatorios y los modificamos asi:
    public EmpleadoBuilder setApellido2(String nuevoApellido2) {
        this.apellido2 = nuevoApellido2;
        return this; //devuelve el objeto de la clase EpleadoBuilder con este atributo
        //se supone que este apellido va a ser diferente al original

    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPie(float pie) {
        this.pie = pie;
    }

    public void setDiamCabeza(float diamCabeza) {
        this.diamCabeza = diamCabeza;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    ///////////////////////////////////////////////////////////
    public Empleado crearEmpleado() {

        return new EmpleadoBuilderAUTO().setNombre(nombre).setApellido1(apellido1).setApellido2(apellido2).setDia(dia).setMes(mes).setAnho(anho).setAltura(altura).setPie(pie).setDiamCabeza(diamCabeza).setSueldo(sueldo).setDni(dni).setCargo(cargo).setFormacion(formacion).createEmpleado();

    }

}
