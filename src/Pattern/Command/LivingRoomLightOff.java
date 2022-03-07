package Pattern.Command;

import Pattern.Command.Command;
import Pattern.Command.Light;

public class LivingRoomLightOff implements Command {
    private Light light;

    @Override
    public void execute() {
        light.Off();
    }

    @Override
    public void undo() {
        light.On();
    }
}
