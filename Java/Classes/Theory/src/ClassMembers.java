public class ClassMembers {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 8);
        Rectangle r2 = new Rectangle(3, 6);

        System.out.println(Rectangle.rectanglesCreated);

        System.out.println(r1.getArea());
        System.out.println(r2.getArea());

        System.out.println(Rectangle.getArea(5, 10));
    }

}

class Rectangle {

    static {
        System.out.println("Se instancía por primera vez un objeto rectángulo");
    }
    static int rectanglesCreated = 0;
    int x;
    int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
        rectanglesCreated++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getArea() {
        return Rectangle.getArea(x, y);
    }
    public static int getArea(int x, int y) {
        return x * y;
    }
}
