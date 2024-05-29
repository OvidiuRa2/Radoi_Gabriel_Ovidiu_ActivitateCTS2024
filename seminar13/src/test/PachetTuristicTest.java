package test;

import dubluri.PersoanaFake;
import model.IPersoana;
import model.PachetTuristic;
import model.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import test.categorii.TesteEroare;
import test.categorii.TesteRange;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    @Category(TesteRange.class)
    public void corectAplicaDiscountVarstnici() {
        PachetTuristic pachetTuristic = new PachetTuristic(new Persoana("Florin", "1240304316754"), "Dubai", 250d);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(Double.valueOf(225), pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(TesteRange.class)
    public void limitBOundaryAplicaDiscountVarstnici() {
        PachetTuristic pachetTuristic = new PachetTuristic(new Persoana("Florin", "1590304316754"), "Dubai", 100d);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(90,pachetTuristic.getPret(),0.01);
    }

     @Test
     @Category(TesteRange.class)
     public void correctTestGetVarstaFake(){
         PersoanaFake persoanaFake = new PersoanaFake();
         persoanaFake.setVarsta(66);
         PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake,"Dubai",250d);
         pachetTuristic.aplicaDiscountVarstnici(20);
         assertEquals(200d,pachetTuristic.getPret(),0.01);
     }

    @Test
    @Category(TesteRange.class)
    public void correctTestGetVarstaFakeNoDiscount(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(20);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake,"Dubai",250d);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(250d,pachetTuristic.getPret(),0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    @Category({TesteEroare.class, TesteRange.class})
    public void correctTestGetVarstaFakeThrowsError(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(20);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake,"Dubai",250d);
        pachetTuristic.aplicaDiscountVarstnici(-2);
        assertEquals(250d,pachetTuristic.getPret(),0.01);
    }

    @Test(timeout = 0)
    public void correctTestGetDiscountPerformance(){
        IPersoana persoanaFake = new PersoanaFake();
        ((PersoanaFake)persoanaFake).setVarsta(67);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake,"Dubai",250d);
        pachetTuristic.aplicaDiscountVarstnici(10);
    }

}