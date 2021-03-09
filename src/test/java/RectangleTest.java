import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    public void testPositiveValuedAreaForPositiveValuedSides() { //testForAreaOfRectangle
        int length=5;
        int breadth=4;
        int expectedArea=length*breadth;
        Rectangle rectangleWithPositiveValuedSides=new Rectangle(length,breadth);
        int actualArea=rectangleWithPositiveValuedSides.area();
        assertEquals(expectedArea,actualArea);
    }

    @Test
    public void testNullValuedAreaForNullValuedSides() {
        int length=0;
        int breadth=0;
        int expectedArea=0;
        Rectangle rectangleWithZeroValuedSides=new Rectangle(length,breadth);
        int actualArea=rectangleWithZeroValuedSides.area();
        assertEquals(expectedArea,actualArea);
    }

    @Test
    public void testChangedToPositiveValuedAreaForNegativeValuedSides() {
        int length=5;
        int breadth=-4;
        int expectedArea=20;
        Rectangle rectangleWithNegativeValuedSides=new Rectangle(length,breadth);
        int actualArea=rectangleWithNegativeValuedSides.area();
        assertEquals(expectedArea,actualArea);
    }

    @Test
    public void testPositiveValuedPerimeterForPositiveValuedSides() {
        int length=5;
        int breadth=4;
        int expectedArea=2*(length+breadth);
        Rectangle rectangleWithPositiveValuedSides=new Rectangle(length,breadth);
        int actualArea=rectangleWithPositiveValuedSides.perimeter();
        assertEquals(expectedArea,actualArea);
    }

    @Test
    public void testNullValuedPerimeterForNullValuedSides() {
        int length=0;
        int breadth=0;
        int expectedArea=0;
        Rectangle rectangleWithNullValuedSides=new Rectangle(length,breadth);
        int actualArea=rectangleWithNullValuedSides.perimeter();
        assertEquals(expectedArea,actualArea);
    }

    @Test
    public void testChangedToPositiveValuedPerimeterForNegativeValuedSides() {
        int length=5;
        int breadth=-4;
        int expectedArea=18;
        Rectangle rectangleWithNegativeValuedSides=new Rectangle(length,breadth);
        int actualArea=rectangleWithNegativeValuedSides.perimeter();
        assertEquals(expectedArea,actualArea);
    }

}