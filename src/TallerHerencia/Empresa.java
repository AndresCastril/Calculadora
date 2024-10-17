package TallerHerencia;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<EmpleadoPorHoras> empleadoPorHora;
    private ArrayList<EmpleadoPorSueldo> empleadoPorSueldo;
    private ArrayList<EmpleadoGerente> empleadoGerente;

    public boolean agregarEmpleadoPorHoras(String cedula, String nombre, String apellido, String numeroSeguroSocial, double salarioBase, double solidaridad, double retencionFuente, double horasTrabajadas, double tarifaPorHora) {
        
        EmpleadoPorHoras nuevoEmpleado = new EmpleadoPorHoras(cedula, nombre, apellido,
                numeroSeguroSocial, salarioBase,
                solidaridad, retencionFuente,
                horasTrabajadas, tarifaPorHora);

        empleadoPorHora.add(nuevoEmpleado); // Agrega a la lista de empleados por hora
        return true;
    }

    public boolean agregarEmpleadoPorSueldo(String cedula, String nombre, String apellido,String numeroSeguroSocial, double salarioBase,double solidaridad, double retencionFuente,double sueldoMensual, double salud, double pension) {
        EmpleadoPorSueldo nuevoEmpleado = new EmpleadoPorSueldo(cedula, nombre, apellido,numeroSeguroSocial, salarioBase,solidaridad, retencionFuente,sueldoMensual, salud, pension);
        empleadoPorSueldo.add(nuevoEmpleado); // Agrega a la lista de empleados por sueldo
        return true;
    }

    public boolean agregarEmpleadoGerente(String cedula, String nombre, String apellido,
            String numeroSeguroSocial, double salarioBase,
            double solidaridad, double retencionFuente,
            double sueldoMensual, double salud,
            double pension, double bonoMensual,
            double impuestoRiqueza) {
        EmpleadoGerente nuevoGerente = new EmpleadoGerente(cedula, nombre, apellido,
                numeroSeguroSocial, salarioBase,
                solidaridad, retencionFuente,
                sueldoMensual, salud, pension,
                bonoMensual, impuestoRiqueza);

        empleadoGerente.add(nuevoGerente); // Agrega a la lista de empleados gerentes
        return true;
    }

}
