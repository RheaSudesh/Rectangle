
public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length,int breadth)
    {
        //length and breadth should not be negative
        length = (length <0) ? length*(-1)  :length;
        breadth= (breadth<0) ? breadth*(-1) :breadth;
        this.length=length;
        this.breadth=breadth;
    }

    public int area(){
        return length * breadth;
    }

}
