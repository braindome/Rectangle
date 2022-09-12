import java.util.Scanner;

public class Rectangle {
    //Instance fields
    double x;
    double y;
    double width;
    double length;
    Scanner sc = new Scanner(System.in);


    //Constructor 1: Reset to zero
    public void reset() {
        x = 0;
        y = 0;
        width = 0;
        length = 0;
    }

    //Constructor 2: Input width and length, reset x and y
    public void widthLength(double width, double length) {
        this.width = width;
        this.length = length;
        x = 0;
        y = 0;
    }

    //Constructor 3: input all four variables
    public void sidesAndCoordinates(double width, double length, double x, double y) {
        this.width = width;
        this.length = length;
        this.x = x;
        this.y = y;
    }

    //Method to return area
    public double calculateArea() {
        return this.width * this.length;
    }

    //Method to return perimeter
    public double calculatePerimeter() {

        return (this.width*2) + (this.length*2);
    }

    //Set vars through parameters
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Width-setter
    public void setWidth(double width) {
        this.width = width;
    }

    //Length-setter
    public void setLength(double length) {
        this.length = length;
    }

    //Method to check for collision
    //No collision IF 1) one rectangle is above the top of the other; 2) left edge of one is on the left side of the other.
    public void checkCollision(Rectangle second) {
        double topLeftThisX = this.x;
        double topLeftThisY = this.y;
        double topLeftSecondX = second.x;
        double topLeftSecondY = second.y;
        double bottomRightThisX = this.x + this.length;
        double bottomRightThisY = this.y - this.width;
        double bottomRightSecondX = second.x + second.length;
        double bottomRightSecondY = second.y - second.width;

        if (topLeftThisX >= bottomRightSecondX || topLeftSecondX >= bottomRightThisX) {
            System.out.println("They do NOT collide.");
            return;
        }

        if (topLeftThisY <= bottomRightSecondY || topLeftSecondY <= bottomRightThisY) {
            System.out.println("They do NOT collide.");
            return;
        }
        System.out.println("COLLISION!");

    }

}