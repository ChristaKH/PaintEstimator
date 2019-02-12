package chatch.cs134.miracosta.paintestimator.Model;

/**
 * The <code>InteriorRoom</code> class calculates the amount of paint needed
 * to re-coat a room.
 *
 * @author Christa Hatch
 * @verison 1.0
 */
public class InteriorRoom
{
    // Fields: private
    private int mDoors;
    private int mWindows;

    private double mWidth;
    private double Height;
    private double mLength;

    // Hit psfi then ENTER
    // Doesn't work for doubles
    /**
     * Standard door area (3 feet x 7 feet)
     */
    public static final double DOOR_AREA  = 21.0;

    /**
     * Standard window area (4 feet x 4 feet)
     */
    public static final double WINDOW_AREA = 16.0;

    /**
     * Square footage able to be covered by one gallon of paint
     */
    public static final double SQUARE_FEET_PER_GALLON = 275.0;

    /**
     * Instantiates a new <code>InteriorRoom</code> provided with the number of doors, windows
     * and its dimensions: width, height, and length
     * @param doors The number of doors in a room
     * @param windows The number of windows in a room
     * @param width The width of the room
     * @param height The height of the room
     * @param length The length of the room
     */
    public InteriorRoom(int doors, int windows, int width, int height, int length) {
        mDoors = doors;
        mWindows = windows;
        mWidth = width;
        Height = height;
        mLength = length;
    }

    /**
     * Method to get the number of doors in a room
     * @return the number of doors in a room (mDoors)
     */
    public int getDoors() {
        return mDoors;
    }

    /**
     * Changes the number of doors in the room
     * @param doors New number of doors in the room
     */
    public void setDoors(int doors) {
        mDoors = doors;
    }

    /**
     * 
     * @return
     */
    public int getWindows() {
        return mWindows;
    }

    public void setWindows(int windows) {
        mWindows = windows;
    }

    public double getWidth() {
        return mWidth;
    }

    public void setWidth(int width) {
        mWidth = width;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public double getLength() {
        return mLength;
    }

    public void setLength(int length) {
        mLength = length;
    }

    public double doorAndWindowArea()
    {
        return mDoors * DOOR_AREA + mWindows * WINDOW_AREA;
    }

    public double totalSurfaceArea()
    {
        return (2* mWidth * Height) + (2 * mLength * Height);
    }

    public double wallSurfaceArea()
    {
        return totalSurfaceArea() - doorAndWindowArea();
    }

    public double gallonsOfPaintRequired()
    {
        return totalSurfaceArea() / SQUARE_FEET_PER_GALLON;
    }

    @Override
    public String toString() {
        return "InteriorRoom{" +
                "mDoors=" + mDoors +
                ", mWindows=" + mWindows +
                ", mWidth=" + mWidth +
                ", Height=" + Height +
                ", mLength=" + mLength +
                '}';
    }
}
