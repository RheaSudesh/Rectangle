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
    public void testThrowsExceptionForZeroValuedSides() {
        int length = 0;
        int breadth = 0;

        assertThrows( IllegalArgumentException.class, () ->new Rectangle(length,breadth));
    }

    @Test
    public void testThrowsExceptionForNegativeValuedSides() {
        int length = 5;
        int breadth = -4;

        assertThrows( IllegalArgumentException.class, () ->new Rectangle(length,breadth));
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
    public void testPositiveValuedAreaForPositiveValuedSideOfSquare() {
        int side = 3;
        int expectedArea = 9;

        Rectangle squareWithPositiveValuedSide = new Rectangle(side);
        int actualArea = squareWithPositiveValuedSide.area();

        assertEquals(expectedArea,actualArea);
    }

    @Test
    public void testThrowsExceptionForZeroValuedSidesOfSquare() {
        int side = 0;

        assertThrows( IllegalArgumentException.class, () ->new Rectangle(side));
    }

    @Test
    public void testThrowsExceptionForNegativeValuedSideOfSqaure() {
        int side=-10;

        assertThrows( IllegalArgumentException.class, () ->new Rectangle(side));
    }

    @Test
    public void testPositiveValuedPerimeterForPositiveValuedSideOfSquare() {
        int side = 3;
        int expectedPerimeter = 12;

        Rectangle squareWithPositiveValuedSide = new Rectangle(side);
        int actualPerimeter = squareWithPositiveValuedSide.perimeter();

        assertEquals(expectedPerimeter,actualPerimeter);
    }

}