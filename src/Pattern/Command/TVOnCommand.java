package Pattern.Command;

public class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
        tv.setChanel(5);
        tv.setVolume(10);
    }

    @Override
    public void undo() {
        tv.off();
    }
}
