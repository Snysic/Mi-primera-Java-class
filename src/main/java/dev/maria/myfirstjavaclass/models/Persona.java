package dev.maria.myfirstjavaclass.models;

public class Persona {
    private String nombre;
    private String apellido;
    private String documentoIdentidad;
    private int anioNacimiento;
    private String paisNacimiento;
    private char genero;

    public Persona(String nombre, String apellido, String documentoIdentidad, int anioNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentidad = documentoIdentidad;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDocumentoIdentidad() { return documentoIdentidad; }
    public int getAnioNacimiento() { return anioNacimiento; }
    public String getPaisNacimiento() { return paisNacimiento; }
    public char getGenero() { return genero; }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Documento de Identidad: " + documentoIdentidad);
        System.out.println("Año de Nacimiento: " + anioNacimiento);
        System.out.println("País de Nacimiento: " + paisNacimiento);
        System.out.println("Género: " + genero);
    }
}


