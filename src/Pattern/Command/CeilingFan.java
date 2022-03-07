package Pattern.Command;

public class CeilingFan {
    private String location = "";
    private int level;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;


    public CeilingFan(String location) {
        this.location = location;
    }

    public void setHigh() {
        level = HIGH;
        System.out.println(location + " Ceiling Fan turn on high speed");
    }

    public void setMedium() {
        level = MEDIUM;
        System.out.println(location + " Ceiling Fan turn on medium speed");
    }

    public void setLow() {
        level = LOW;
        System.out.println(location + " Ceiling Fan turn on low speed");
    }

    public void off() {
        level = 0;
        System.out.println("Ceiling Fan turn off");
    }

    public int getSpeed() {
        return level;
    }

}
