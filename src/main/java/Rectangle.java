
public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length,int breadth)
    {
        this.length  = negateIfNegativeValuedSide( length );
        this.breadth = negateIfNegativeValuedSide( breadth );
    }

    public int negateIfNegativeValuedSide(int inputSideValue)
    {
        return (inputSideValue<0)? inputSideValue*(-1) : inputSideValue;
    }

    public int area(){
        return length * breadth;
    }

    public int perimeter(){
        return 2 * ( length + breadth );
    }

}
