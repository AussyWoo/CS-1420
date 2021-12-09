package quiz04;

/**
 * Contains a single linked list of Boxes
 */
public class StackOfBoxes {
    Box topBox;

    /**
     * Sets top box to null
     */
    public StackOfBoxes() {
        topBox = null;
    }

    /**
     * Returns the top Box
     * @return the top Box
     */
    public Box getTop() {
        return topBox;
    }

    /**
     * Adds a new Box to the top of the stack
     * @param topBox the new top Box
     */
    public void addBox (Box topBox){
        topBox.setUnder(this.topBox);
        this.topBox = topBox;
    }

    /**
     * Removes and returns the current top Box from the stack
     * @return the current top Box
     */
    public Box removeBox() {
        Box tempBox = this.topBox;
        this.topBox = this.topBox.getUnder();
        return tempBox;
    }

    /**
     * Returns the height of the top Box
     * @return the height of the top Box
     */
    public int getHeight() {
        return this.topBox.getHeight();
    }
}
