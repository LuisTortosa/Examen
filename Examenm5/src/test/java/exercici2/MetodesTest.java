/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package exercici2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis
 */
public class MetodesTest {
    
    public MetodesTest() {
    }

   
    @org.junit.jupiter.api.Test
    public void testExisteixNom() {
        System.out.println("existeixNom");
        String[] llista = new String[3];
        llista[0] = "Julio";
        llista[1] = "Pablo";
        llista[2] = "Pablo";
        String busqueda = "Julio";
        boolean ResultadoEsperado = true;
        boolean Resultado = Metodes.existeixNom(llista, busqueda);
        assertEquals(ResultadoEsperado, Resultado);
        
        busqueda = "Marcos";
        ResultadoEsperado = false;
        Resultado = Metodes.existeixNom(llista, busqueda);
        assertEquals(ResultadoEsperado, Resultado);
        
    }

    /**
     * Test of posicioArray method, of class Metodes.
     */
    @org.junit.jupiter.api.Test
    public void testPosicioArray() {
        System.out.println("posicioArray");
        String[] llista = new String[3];
        llista[0] = "Julio";
        llista[1] = "Pablo";
        llista[2] = "Pablo";
        String busqueda = "Julio";
        int ResultadoEsperado = 0;
        int Resultado = Metodes.posicioArray(llista, busqueda);
        assertEquals(ResultadoEsperado, Resultado);
        
        busqueda = "Marcos";
        ResultadoEsperado = -1;
        Resultado = Metodes.posicioArray(llista, busqueda);
        assertEquals(ResultadoEsperado, Resultado);
        
    }

    /**
     
    @org.junit.jupiter.api.Test
    public void testIntroduirLlistaGrup() {
        System.out.println("introduirLlistaGrup");
        String[] llista = null;
        Metodes.introduirLlistaGrup(llista);
        
    }

    
    @org.junit.jupiter.api.Test
    public void testIntroduirNomBuscat() {
        System.out.println("introduirNomBuscat");
        String expResult = "";
        String result = Metodes.introduirNomBuscat();
        assertEquals(expResult, result);
        
    }
    */
}
