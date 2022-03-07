package Pattern.Command;

public class HottubOnCommand implements Command {
    private Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
        hottub.setTemperature(45);
        hottub.circulate();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
