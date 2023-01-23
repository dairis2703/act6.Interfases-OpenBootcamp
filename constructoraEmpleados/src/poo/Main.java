package poo;
import java.util.List;
public class Main {
    public static void main(String[] args) {



        empleadosCRUD empleadosCRUD = new empleadosCRUD();
        //ingriseo de empleados
        Empleado andres= new Empleado(30,2500000,true, "andres");
        Empleado camilo = new Empleado(35,1500000,true, "camilo");
        Empleado karen = new Empleado(25,3500000,true, "karen");
        System.out.println("karen = " + karen);
        //guardar empleados
        empleadosCRUD.guardar(andres);
        empleadosCRUD.guardar(camilo);
        empleadosCRUD.guardar(karen);

        //consulta de empleados
        List<Empleado> empleados = empleadosCRUD.verEmpleado();


}}