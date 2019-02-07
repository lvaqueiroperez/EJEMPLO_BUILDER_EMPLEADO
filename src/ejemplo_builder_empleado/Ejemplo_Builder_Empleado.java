package ejemplo_builder_empleado;

public class Ejemplo_Builder_Empleado {

    public static void main(String[] args) {

        //como es un ejemplo sin usar el Builder, tenemos que rellenar todos 
        //los campos para que el constructor funcione
        //en este caso, los campos que no queramos, dejarlos a 0 o en String sin nada
        Empleado emp1 = new Empleado("juan", "vazquez", "rodriguez", 1, 1, 1999, 1.80f, 0, 0, 0, "158877U", "", "");

        Empleado emp2 = new Empleado("ter", "vazquez", "garcia", 2, 2, 1998, 1.70f, 0, 0, 0, "158877U", "", "");
        //hacemos un debug para comprobar que crea los objetos correctamente

    }

}
