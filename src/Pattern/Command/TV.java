package Pattern.Command;

public class TV {
    private String location = " ";
    private int chanel;
    private int volume;

    public TV(String location) {
        this.location = location;
    }

    public void setChanel(int chanel) {
        System.out.println("Chanel: " + chanel);
    }

    public void setVolume(int volume) {
        System.out.println("Volume set " + volume);
    }

    public void on() {
        System.out.println(location + " TV is on!");
    }

    public void off() {
        System.out.println(location + "TV is off");
    }
}
