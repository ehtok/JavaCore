package Pattern.Command;

public class CeilingFanOn implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanOn(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.setHigh();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
