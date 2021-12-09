package quiz04;

/**
 * Each Box holds an Object and stores what Box is underneath
 */
public class Box {
    //Fields
    Object object;
    Box under;
    private int height;

    /**
     * Sets up this Box
     * @param object The thing in this Box
     */
    public Box (Object object) {
        this.object = object;
        under = null;
    }

    /**
     * Returns this's object
     * @return object
     */
    public Object getObject() {
        return object;
    }

    /**
     * Returns the Box underneath this
     * @return Box
     */
    public Box getUnder() {
        return under;
    }

    /**
     * Sets the Box object underneath this
     * @param under The desired Box to be put underneath
     */
    public void setUnder(Box under) {
        this.under = under;
    }

    /**
     * Returns The height of the stack at the current Box by adding one to the height below it.
     * Returns 1 if there is no Box underneath
     * @return The height of the stack at the current Box
     */
    public int getHeight() {
        if(getUnder() != null) {
            height = 1 + getUnder().getHeight();
            return height;
        }

        return 1;
    }
}
