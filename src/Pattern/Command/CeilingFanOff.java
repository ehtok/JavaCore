package Pattern.Command;

public class CeilingFanOff implements Command {
    private CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanOff(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed=ceilingFan.getSpeed();
        ceilingFan.off();

    }

    @Override
    public void undo() {
        ceilingFan.setLow();
    }
}
