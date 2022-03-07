package Pattern.Command;

public class GarageDoorClose implements Command {
    private GarageDoor garageDoor;

    public GarageDoorClose(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();

    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
