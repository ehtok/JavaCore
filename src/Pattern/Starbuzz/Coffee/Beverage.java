package Pattern.Starbuzz.Coffee;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public enum Size {TALL, GRANDE, VENTI}

    private Size size = Size.TALL;


    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
