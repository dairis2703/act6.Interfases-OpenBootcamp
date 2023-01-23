package poo;

public class Empleado {

    // atributos
     String nombre;
     int edad;
     double salario;
     boolean estadoDelEmpleado;

    public Empleado(int edad,double salario,boolean estadoDelEmpleado , String nombre) {
        this.edad = edad;
        this.salario= salario;
        this.estadoDelEmpleado= estadoDelEmpleado;
        this.nombre = nombre;

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", estadoDelEmpleado=" + estadoDelEmpleado +
                '}';
    }
}

