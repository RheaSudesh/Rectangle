import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleTest {

    @Test
    public void testPositiveValuedAreaForPositiveValuedSides() {
        int length = 5;
        int breadth = 4;
        int expectedArea = 20;

        Rectangle rectangleWithPositiveValuedSides = new Rectangle(length,breadth);
        int actualArea = rectangleWithPositiveValuedSides.area();

        assertEquals(expectedArea,actualArea);
    }

    @Test
    public void testZeroValuedAreaForZeroValuedSides() {
        int length = 0;
        int breadth = 0;
        int expectedArea = 0;

        Rectangle rectangleWithZeroValuedSides = new Rectangle(length,breadth);
        int actualArea = rectangleWithZeroValuedSides.area();

        assertEquals(expectedArea,actualArea);
    }

    @Test
    public void testThrowsExceptionForNegativeValuedSides() {
        int length = 5;
        int breadth = -4;

        Exception exception = (Exception) assertThrows(ArithmeticException.class, () ->{ new Rectangle(length,breadth); });
    }

    @Test
    public void testPositiveValuedPerimeterForPositiveValuedSides() {
        int length = 5;
        int breadth = 4;
        int expectedPerimeter = 18;

        Rectangle rectangleWithPositiveValuedSides = new Rectangle(length,breadth);

        int actualPerimeter = rectangleWithPositiveValuedSides.perimeter();
        assertEquals(expectedPerimeter,actualPerimeter);
    }

    @Test
    public void testZeroValuedPerimeterForZeroValuedSides() {
        int length = 0;
        int breadth = 0;
        int expectedPerimeter = 0;

        Rectangle rectangleWithNullValuedSides = new Rectangle(length,breadth);
        int actualPerimeter = rectangleWithNullValuedSides.perimeter();

        assertEquals(expectedPerimeter,actualPerimeter);
    }

    @Test
    public void testPositiveValuedAreaForPositiveValuedSideOfSquare() {
        int side = 3;
        int expectedArea = 9;

        Rectangle squareWithPositiveValuedSide = new Rectangle(side);
        int actualArea = squareWithPositiveValuedSide.area();

        assertEquals(expectedArea,actualArea);
    }

    @Test
    public void testZeroValuedAreaForZeroValuedSidesOfSquare() {
        int side = 0;
        int expectedArea = 0;

        Rectangle squareWithZeroValuedSide = new Rectangle(side);
        int actualArea = squareWithZeroValuedSide.area();

        assertEquals(expectedArea,actualArea);
    }

    @Test
    public void testPositiveValuedPerimeterForPositiveValuedSideOfSquare() {
        int side = 3;
        int expectedArea = 12;

        Rectangle squareWithPositiveValuedSide = new Rectangle(side);
        int actualArea = squareWithPositiveValuedSide.perimeter();

        assertEquals(expectedArea,actualArea);
    }

    @Test
    public void testZeroValuedPerimeterForZeroValuedSidesOfSquare() {
        int side = 0;
        int expectedArea = 0;

        Rectangle squareWithZeroValuedSide = new Rectangle(side);
        int actualArea = squareWithZeroValuedSide.perimeter();

        assertEquals(expectedArea,actualArea);
    }


}