/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerHerencia;

/**
 *
 * @author mundo joven
 */
public class EmpleadoPorSueldo extends Empleado {
    
    protected double sueldoMensual;
    protected double salud;
    protected double pension;
  
    public EmpleadoPorSueldo(String cedula, String nombre, String apellido, String numeroSeguroSocial, double salarioBase, double solidaridad, double retencionFuente, double sueldoMensual, double salud, double pension  ) {
        super(cedula, nombre, apellido, numeroSeguroSocial, salarioBase, solidaridad, retencionFuente);
        this.pension = pension;
        this.salud = salud;
        this.sueldoMensual = sueldoMensual;
    }
     @Override
    public double calcularSalarioDevengado() {
        return sueldoMensual; // El salario devengado es el sueldo mensual
    }
    @Override
    public double calcularDeducciones() {
        return salud + pension; // La suma de las deducciones de salud y pensión
    }
     @Override
    public double calcularSalarioNeto() {
        // Calcula el salario neto utilizando el salario devengado y las deducciones
        double salarioDevengado = calcularSalarioDevengado();
        double deducciones = calcularDeducciones() + (salarioDevengado * retencionFuente) + solidaridad; // Sumar deducciones, retención de fuente y solidaridad
        return salarioDevengado - deducciones; // Salario neto
    }
    
}
