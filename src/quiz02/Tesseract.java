/**
 * This class represents a rectangular solid known as a tesseract. It uses 3 doubles to represent x, y, and z along with an integer value for the number of anomalies.
 *
 * @author  Austin Li
 * @version October 8, 2021
 **/

package quiz02;

public class Tesseract {
    private double x, y, z;
    private int anomalies;

    /**
     * Constructor Method
     *
     * @param x x-value (length)
     * @param y y-value (width)
     * @param z z-value (height)
     * @param anomalies number of anomalies contained within this tesseract object
     */
    public Tesseract (double x, double y, double z, int anomalies) {

        this.x = x;
        this.y = y;
        this.z = z;
        this.anomalies = anomalies;

    }

    /**
     * @param anomalies updated number of anomalies
     */
    public void setAnomalies(int anomalies) {
        this.anomalies = anomalies;
    }

    /**
     * Computes the volume of this tesseract and returns it as a double
     * @return volume
     */
    public double getVolume() {
        return x*y*z;
    }

    /**
     * Computes the surface area of this tesseract and returns it as a double
     * @return surface area
     */
    public double getSArea() {
        return(2*(x*y + x*z + y*z));
    }

    /**
     * @return the x-value (length) of this tesseract
     */
    public double getX() {
        return x;
    }

    /**
     * @return the y-value (width) of this tesseract
     */
    public double getY() {
        return y;
    }

    /**
     * @return the z-value (height) of this tesseract
     */
    public double getZ() {
        return z;
    }

    /**
     * @return the number of anomalies contained within this tesseract
     */
    public int getAnomalies() {
        return anomalies;
    }

    /**
     * Prints out information about this tesseract
     * @return volume, surface area, and # of anomalies
     */
    public String toString() {
        return("This tesseract has dimensions (" + x + ", " + y + ", " + z + ") a volume of " + getVolume() + " and a surface area of " + getSArea() + "." +
                "\nIt contains " + getAnomalies() + " anomalies." );
    }
}
