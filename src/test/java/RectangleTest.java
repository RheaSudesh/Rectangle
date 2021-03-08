import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    public void testAreaOfRectangleWithPositiveValuedSides() {
        int length=5;
        int breadth=4;
        int expectedArea=length*breadth;
        Rectangle rectangleWithPositiveValuedSides=new Rectangle(length,breadth);
        int actualArea=rectangleWithPositiveValuedSides.area();
        assertEquals(expectedArea,actualArea);

    }

    @Test
    public void testAreaOfRectangleWithNullValuedSides() {
        int length=0;
        int breadth=0;
        int expectedArea=0;
        Rectangle rectangleWithZeroValuedSides=new Rectangle(length,breadth);
        int actualArea=rectangleWithZeroValuedSides.area();
        assertEquals(expectedArea,actualArea);
    }

    @Test
    public void testAreaOfRectangleWithNegativeValuedSides() {
        int length=5;
        int breadth=-4;
        int expectedArea=20;
        Rectangle rectangleWithNegativeValuedSides=new Rectangle(length,breadth);
        int actualArea=rectangleWithNegativeValuedSides.area();
        assertEquals(expectedArea,actualArea);
    }

}