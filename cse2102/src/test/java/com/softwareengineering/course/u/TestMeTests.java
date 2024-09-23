package u;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import c.Hybrid;

public class TestMeTests {

    Hybrid hybrid;

    @Before
    public void setUp() throws Exception {
        hybrid = new Hybrid();
        hybrid.setCostPerGallon(3.50);
        hybrid.setCostPerKWh(0.24);
    }

    @Test
    public void testCalcGasMPG() {
        hybrid.setMilesfromGas(300);
        hybrid.setGallonsfromGas(15);
        assertEquals(20.0, hybrid.calcGasMPG(), 0.01);
    }
    @Test
    public void testCalcGasMPG2() {
        hybrid.setMilesfromGas(600);
        hybrid.setGallonsfromGas(15);
        assertEquals(40.0, hybrid.calcGasMPG(), 0.01);
    }

    @Test
    public void testCalcMPGe() {
        hybrid.setElectricMiles(300);
        hybrid.setTotalkWh(70);
        assertEquals(144.43, hybrid.calcMPGe(), 0.01);
    }
    @Test
    public void testCalcMPGeExample2() {
    hybrid.setElectricMiles(150);  
    hybrid.setTotalkWh(45);        
    assertEquals(112.33, hybrid.calcMPGe(), 0.01);  
    }

    @Test
    public void testAverageMPG() {
        hybrid.setMilesfromGas(120);
        hybrid.setGallonsfromGas(6);
        hybrid.setElectricMiles(120);
        hybrid.setTotalkWh(33.7);
        assertEquals(70.0, hybrid.calcAverageMPG(), 0.01);
    }
}