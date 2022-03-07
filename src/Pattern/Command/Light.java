package Pattern.Command;

public class Light {
    private String location = " ";

    public Light(String location) {
        this.location = location;
    }

    public void On() {
        System.out.println(location + " Light is on");
    }

    public void Off() {
        System.out.println(location + " Light is off");
    }
}
