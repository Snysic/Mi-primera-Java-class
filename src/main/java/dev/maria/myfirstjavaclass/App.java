package dev.maria.myfirstjavaclass;

public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Jon", "Pérez", "12345678", 2000, "Argentina", 'H');
        Persona persona2 = new Persona("María", "Vasilenko", "87654321", 2001, "Rusia", 'M');

        System.out.println("Datos de la Persona 1:");
        persona1.imprimir();

        System.out.println("Datos de la Persona 2:");
        persona2.imprimir();
    }
}
