package test;

import model.IPersoana;
import model.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import test.categorii.TesteEroare;
import test.categorii.TesteRange;

import static org.junit.Assert.*;

public class PersoanaTests {

    @Test
    @Category(TesteRange.class)
    public void getSexTestMasculin() {
        IPersoana persoana = new Persoana("Florin", "50234431324531");
        assertEquals(persoana.getSex(), "M");
    }

    @Test
    @Category(TesteRange.class)
    public void getSexTestFeminin() {
        IPersoana persoana = new Persoana("Ramona", "20234431324531");
        assertEquals(persoana.getSex(), "F");
    }

    @Test
    @Category(TesteRange.class)
    public void getBoundariesMinTest() {
        IPersoana persoana = new Persoana("Ramona", "10234431324531");
        assertEquals("M", persoana.getSex());
    }

    @Test
    @Category(TesteRange.class)
    public void getBoundariesMaxTest() {
        IPersoana persoana = new Persoana("Ramona", "60234431324531");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void testCrossCheck() {
        Persoana persoana = new Persoana("Ramona", "60234431324531");
        int cifra = persoana.CNP.charAt(0);
        String caracter = (cifra % 2 == 0 ? "F" : "M");
        assertEquals(caracter,persoana.getSex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testErrorCheck() {
        Persoana persoana = new Persoana("Ramona", "-0234431324531");
        persoana.getSex();
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(TesteEroare.class)
    public void testNoCNP(){
        Persoana persoana = new Persoana("Ramona", "");
        persoana.getSex();
    }

    @Test(timeout = 10)
    public void testPerformanceGetSex(){
        Persoana persoana = new Persoana("Ramona", "20234431324531");
        persoana.getSex();
    }

    @Test
    public  void testConformance(){
        Persoana persoana = new Persoana("Ramona", "20234431324531");
        String rez = persoana.getSex();

        assertTrue(rez == "F" || rez == "M");
    }

    @Test
    public void testOrderSex(){
        Persoana persoana = new Persoana("Ramona", "60234431324531");
        Persoana persoana1 = new Persoana("Ramona", "10234431324531");

        assertTrue(persoana.getSex().compareTo(persoana1.getSex()) < 0);
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(TesteEroare.class)
    public void testExistenceTest(){
        Persoana persoana = new Persoana("Ramona", null);
        persoana.getSex();
    }
}