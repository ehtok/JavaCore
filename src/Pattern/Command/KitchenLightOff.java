package Pattern.Command;

public class KitchenLightOff implements Command {
    private Light light;

    public KitchenLightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.Off();
    }

    @Override
    public void undo() {
        light.Off();
    }
}
