/**
 * This class demonstrates the usage of the Container and Ball classes by simulating
 * a bouncing ball inside a container.
 */
public class TestContainer {
    public static void main(String[] args) {
        // Create a Ball object with initial position (50, 50), radius 5, and velocity (10, 30)
        Ball ball = new Ball(50, 50, 5, 10, 30);

        // Create a Container object with top-left corner at (0, 0) and size 100x100
        Container box = new Container(0, 0, 100, 100);

        // Simulate the ball's movement and collision with the container for 100 steps
        for (int step = 0; step < 100; ++step) {
            // Move the ball
            ball.move();

            // Check for collision with the container and reflect the ball if necessary
            box.collidesWith(ball);

            // Print the ball's current position for manual verification
            System.out.println(ball);
        }
    }
}