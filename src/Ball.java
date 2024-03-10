/**
 * Represents a moving ball with a position(x, y), radius, and velocity.
 */
public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    /**
     * Constructs a new Ball object with the specified position, radius, speed, and direction.
     *
     * @param x         the initial x-coordinate of the ball
     * @param y         the initial y-coordinate of the ball
     * @param radius    the radius of the ball
     * @param speed     the speed of the ball
     * @param direction the direction of the ball's movement in radians
     */
    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float) (speed * Math.cos(direction));
        this.yDelta = (float) ((-1) * speed * Math.sin(direction));
    }

    /**
     * Returns the x-coordinate of the ball's position.
     *
     * @return the x-coordinate of the ball's position
     */
    public float getX() {
        return x;
    }

    /**
     * Sets the x-coordinate of the ball's position.
     *
     * @param x the new x-coordinate of the ball's position
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Returns the y-coordinate of the ball's position.
     *
     * @return the y-coordinate of the ball's position
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the y-coordinate of the ball's position.
     *
     * @param y the new y-coordinate of the ball's position
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Returns the radius of the ball.
     *
     * @return the radius of the ball
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the ball.
     *
     * @param radius the new radius of the ball
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * Returns the x-component of the ball's velocity.
     *
     * @return the x-component of the ball's velocity
     */
    public float getXDelta() {
        return xDelta;
    }

    /**
     * Sets the x-component of the ball's velocity.
     *
     * @param xDelta the new x-component of the ball's velocity
     */
    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    /**
     * Returns the y-component of the ball's velocity.
     *
     * @return the y-component of the ball's velocity
     */
    public float getYDelta() {
        return yDelta;
    }

    /**
     * Sets the y-component of the ball's velocity.
     *
     * @param yDelta the new y-component of the ball's velocity
     */
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    /**
     * Moves the ball according to its velocity.
     */
    public void move() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    /**
     * Reflects the ball's velocity horizontally (reverses the x-component).
     */
    public void reflectHorizontal() {
        this.xDelta = -(xDelta);
    }

    /**
     * Reflects the ball's velocity vertically (reverses the y-component).
     */
    public void reflectVertical() {
        this.yDelta = -(yDelta);
    }

    /**
     * Returns a string representation of the ball's position and velocity.
     *
     * @return a string representation of the ball's position and velocity
     */
    public String toString() {
        return String.format("Ball at (%f, %f) of velocity (%f, %f)", this.x, this.y, this.xDelta, this.yDelta);
    }
}