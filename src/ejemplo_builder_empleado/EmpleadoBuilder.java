package ejemplo_builder_empleado;

/**
 * CLASE HECHA POR NOSOTROS donde haremos el Builder
 *
 * @author luis-
 */
public class EmpleadoBuilder {

    //Tiene los mismos atributos
    //Se inicializan con un valor arbitrario SOLO LOS ATRIBUTOS OPCIONALES
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

    //El Builder tendrá un constructor SOLO CON LOS PARÁMETROS OBLIGATORIOS y 
    //puestos como FINAL (para evitar errores)
    public EmpleadoBuilder(final String nombre, final String apellido1, final String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
    }

    ////////
    ////////
    //Creamos SETTERS DE ATRIBUTOS OPCIONALES y los MODIFICAMOS asi:
    public EmpleadoBuilder setApellido2(String nuevoApellido2) {
        this.apellido2 = nuevoApellido2;
        return this;
        //Devuelve un objeto de la clase EmpleadoBuilder con este atributo
        //Se supone que este apellido va a ser diferente al original
    }

    //(HACERLO CON TODOS)
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
    //Finalmente, creamos el método para CREAR NUESTRO OBJETO
    public Empleado crearEmpleado() {

        return new Empleado(nombre, apellido1, apellido2, dia, mes, anho, altura, pie, diamCabeza, sueldo, dni, cargo, formacion);
        //DEVUELVE EL OBJETO COMPLEJO CREADO, CUYOS PARÁMETROS SE PONDRÁN
        //EN EL CLIENT
    }

}
