public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(0, 0, 5, 2, 30);

        // Display initial state of the ball
        System.out.println("Initial state:");
        System.out.println(b1);

        // Test getX and setX methods
        System.out.println("\nTesting getX and setX:");
        System.out.println("Initial x position: " + b1.getX());
        b1.setX(5.5f);
        System.out.println("New x position: " + b1.getX());

        // Test getY and setY methods
        System.out.println("\nTesting getY and setY");
        System.out.println("Initial y position: " + b1.getY());
        b1.setY(9.0f);
        System.out.println("New y position: " + b1.getY());

        // Test getRadius and setRadius methods
        System.out.println("\nTesting getRadius and setRadius:");
        System.out.println("Initial radius: " + b1.getRadius());
        b1.setRadius(7);
        System.out.println("New radius: " + b1.getRadius());

        // Test getXDelta and setXDelta methods
        System.out.println("\nTesting getXDelta and setXDelta:");
        System.out.println("Initial xDelta: " + b1.getXDelta());
        b1.setXDelta(5.2f);
        System.out.println("New xDelta: " + b1.getXDelta());

        // Test getYDelta and setYDelta methods
        System.out.println("\nTesting getYDelta and setYDelta:");
        System.out.println("Initial yDelta: " + b1.getYDelta());
        b1.setYDelta(3);
        System.out.println("New yDelta: " + b1.getYDelta());

        // Test move method
        System.out.println("\nTesting move:");
        System.out.println("Initial position: " + b1);
        b1.move();
        System.out.println("New position: " + b1);

        // Test reflectHorizontal method
        System.out.println("\nTesting reflectHorizontal:");
        System.out.println("Initial velocity: " + b1);
        b1.reflectHorizontal();
        System.out.println("New velocity: " + b1);

        // Test reflectVertical method
        System.out.println("\nTesting reflectVertical:");
        System.out.println("Initial velocity: " + b1);
        b1.reflectVertical();
        System.out.println("New velocity: " + b1);

    }
}
