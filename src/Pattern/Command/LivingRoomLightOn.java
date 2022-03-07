package Pattern.Command;

public class LivingRoomLightOn implements Command {
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
