/**
 * The Container class represents a rectangular container with a position and size.
 */
public class Container {
    private int x1; // The x-coordinate of the top-left corner
    private int y1; // The y-coordinate of the top-left corner
    private int x2; // The x-coordinate of the bottom-right corner
    private int y2; // The y-coordinate of the bottom-right corner

    /**
     * Constructs a new Container with the given position and size.
     *
     * @param x      The x-coordinate of the top-left corner
     * @param y      The y-coordinate of the top-left corner
     * @param width  The width of the container
     * @param height The height of the container
     */
    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x1 + width - 1;
        this.y2 = y1 + height - 1;
    }

    /**
     * Returns the x-coordinate of the top-left corner of the container.
     *
     * @return The x-coordinate of the top-left corner
     */
    public int getX() {
        return x1;
    }

    /**
     * Returns the y-coordinate of the top-left corner of the container.
     *
     * @return The y-coordinate of the top-left corner
     */
    public int getY() {
        return y1;
    }

    /**
     * Returns the width of the container.
     *
     * @return The width of the container
     */
    public int getWidth() {
        return x2 - x1 + 1;
    }

    /**
     * Returns the height of the container.
     *
     * @return The height of the container
     */
    public int getHeight() {
        return y2 - y1 + 1;
    }

    /**
     * Checks if the given Ball object collides with this container.
     * If a collision occurs, the Ball's direction is reflected accordingly,
     * and a message is printed to the console.
     *
     * @param ball The Ball object to check for collision
     * @return true if a collision occurred, false otherwise
     */
    public boolean collidesWith(Ball ball) {
        if (ball.getX() - ball.getRadius() <= this.x1 || ball.getX() + ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            System.out.println("collide!");
            return true;
        }
        if (ball.getY() - ball.getRadius() <= this.y1 || ball.getY() + ball.getRadius() >= this.y2) {
            ball.reflectVertical();
            System.out.println("collide!");
            return true;
        }
        return false;
    }

    /**
     * Returns a string representation of this container in the format:
     * "Container at (x1,y1) to (x2, y2)"
     *
     * @return A string representation of this container
     */
    public String toString() {
        return String.format("Container at (%d,%d) to (%d, %d)", x1, y1, x2, y2);
    }
}
