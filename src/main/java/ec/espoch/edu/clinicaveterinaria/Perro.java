/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espoch.edu.clinicaveterinaria;

/**
 *
 * @author KARLA
 */
public class Perro {

    String nombre;
    int edad;
    double peso;
    boolean vacunado;

    public Perro(String nombre, double peso, boolean vacunado, int edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.vacunado = vacunado;
        this.edad = edad;
    }

    public String obtenerEstadoPesoPerro() {
        return (peso >= 8 && peso <= 15) ? "Peso saludable" : "Peso fuera de rango";

    }

    public String obtenerEstadosVacunasPerro() {
        return vacunado ? "Vacunado" : "No vacunado";
    }

    public void mostrarDatos() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Peso:" + peso);
        System.out.println("Estado de peso:" + obtenerEstadoPesoPerro());
        System.out.println("Vacunacion:" + obtenerEstadosVacunasPerro());

    }

}
