package Pattern.Command;

public class HottubOffCommand implements Command {
    protected Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.off();
        hottub.setTemperature(30);
    }

    @Override
    public void undo() {
        hottub.on();
    }
}
