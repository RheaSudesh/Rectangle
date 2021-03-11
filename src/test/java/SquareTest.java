import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {

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
