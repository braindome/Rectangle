public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.sidesAndCoordinates(3.00,2.00, 0.00, 3.00);

        Rectangle rect2 = new Rectangle();
        rect2.sidesAndCoordinates(2.00, 2.00, 2.00, 5.00);

        System.out.println("Do the rectangles collide?");
        rect1.checkCollision(rect2);

    }
}