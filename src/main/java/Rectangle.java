public class Rectangle {
    private final int length;
    private final int breadth;

    public Rectangle(int side) {
        if(side <= 0){
            throw new IllegalArgumentException("Side Of a Square should not have a negative value");
        }
        this.length = side;
        this.breadth = side;
    }

    public Rectangle(int length, int breadth) {
        if(length <= 0 || breadth <= 0){
            throw new IllegalArgumentException("Sides Of a Rectangle should not have a negative value");
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
