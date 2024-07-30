import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class CarTests {
    Car obj1;
    @Test

    public void testconstructor(){
        obj1=new Car(1,2,4.9f);
        assertNotNull(obj1);
    }
    @Test
    public void testgetId(){
        obj1=new Car(1,2,4.9f);
        assertEquals(1,obj1.getId());

    }
    @Test
    public void testsetId(){
        obj1=new Car(3,1,8);
        obj1.setId(5);
        assertEquals(5, obj1.getId());
    }
    @Test
    public void testGetPowerSource() {
        Car c=new Car(1,1,3.7f);
        assertEquals(1,c.getPowerSource());
    }

    @Test
    public void testSetPowerSource() {
        Car c=new Car(1,1,100);
        c.setPowerSource(2);
        assertEquals(2,c.getPowerSource());
    }

    @Test
    public void testGetPricePerDay() {
        Car c=new Car(1,1,100);
        assertEquals(100f,c.getPricePerDay(),0.01);
    }

    @Test
    public void testSetPricePerDay() {
        Car c=new Car(1,1,100);
        c.setPricePerDay(125f);
        assertEquals(125f,c.getPricePerDay(),0.01);
    }




    
}