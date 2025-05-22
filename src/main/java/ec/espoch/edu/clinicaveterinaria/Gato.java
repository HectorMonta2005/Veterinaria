/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espoch.edu.clinicaveterinaria;

/**
 *
 * @author KARLA
 */
public class Gato {

    String nombre;
    double peso;
    boolean vacunado;
    int edad;

    public Gato(String nombre, double peso, boolean vacunado, int edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.vacunado = vacunado;
        this.edad = edad;
    }

    public String obtenerEstadoPesoGato() {
        return (peso >= 3 && peso <= 6) ? "Peso saludable" : "Peso fuera de rango";

    }

    public String obtenerEstadosVacunasGato() {
        return vacunado ? "Vacunado" : "No vacunado";
    }

    public void mostrarDatos() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Peso:" + peso);
        System.out.println("Estado de peso:" + obtenerEstadoPesoGato());
        System.out.println("Vacunacion:" + obtenerEstadosVacunasGato());

    }
}
