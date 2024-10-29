package dev.maria.myfirstjavaclass.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PersonaTest {

    private Persona persona;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        persona = new Persona("Jon", "Pérez", "12345678", 2000, "Argentina", 'H');
    }

    @Test
    public void testPersonaConstructor() {
        assertEquals("Jon", persona.getNombre());
        assertEquals("Pérez", persona.getApellido());
        assertEquals("12345678", persona.getDocumentoIdentidad());
        assertEquals(2000, persona.getAnioNacimiento());
        assertEquals("Argentina", persona.getPaisNacimiento());
        assertEquals('H', persona.getGenero());
    }

    @Test
    public void testImprimir() {
        persona.imprimir();
        String expectedOutput = "Nombre: Jon\n" +
                                "Apellido: Pérez\n" +
                                "Documento de Identidad: 12345678\n" +
                                "Año de Nacimiento: 2000\n" +
                                "País de Nacimiento: Argentina\n" +
                                "Género: H\n";
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}
