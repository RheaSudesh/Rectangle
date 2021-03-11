public class Rectangle {
    private final int length;
    private final int breadth;

    public static Rectangle createSquare(int side) {
        return new Rectangle(side, side);
    }

    public Rectangle(int length, int breadth) {
        if (length <= 0 || breadth <= 0) {
            throw new IllegalArgumentException("Sides Of a Geometrical Shape should not have a negative or zero value");
        }
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

}
