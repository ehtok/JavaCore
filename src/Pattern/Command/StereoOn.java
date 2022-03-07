package Pattern.Command;

public class StereoOn implements Command{
    private Stereo stereo;

    public StereoOn(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(10);

    }

    @Override
    public void undo() {
        stereo.off();
    }
}
