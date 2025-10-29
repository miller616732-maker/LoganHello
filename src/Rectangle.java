public class Rectangle {
    //Class attributes (Variables that will be used throughout the class)
    private int length;
    private int width;
    //Constructor - used to build a Rectangle object
    //Must match the class name
    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    //Methods
    public int getArea() {
        int area = length * width;
        return area;
    }
    public int getPerimeter() {
        int perimeter = 2*length + 2*width;
        return perimeter;
    }

    public void printRectangle() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area " + getArea());
        System.out.println("Perimeter " + getPerimeter());
    }

    public void setLength(int l) {
        length = l;
    }
    public void setWidth(int w) {
        width = w;
    }
}
