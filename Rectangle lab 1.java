

/*Write a class Rectangle with attributes length and width. Use a constructor to set these values. Add methods to calculate the area and perimeter of the rectangle. 
 Create an object to test your class.*/
class Rectangle {

    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return (length * width);
    }

    public int perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle(2, 3);
        System.out.println("Area = " + obj.area());
        System.out.println("Perimeter = " + obj.perimeter());
    }

}
