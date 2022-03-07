package Pattern.Command;

public class KitchenLightOn implements Command {
    private Light light;

    @Override
    public void execute() {
        light.On();
    }

    @Override
    public void undo() {
        light.Off();
    }
}
