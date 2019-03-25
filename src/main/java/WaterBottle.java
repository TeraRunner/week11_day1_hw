public class WaterBottle {

    public double volume;

    public WaterBottle(double volume) {
        this.volume = 100;
    }

    public double drink() {
        return this.volume - 10;
    }

    public double getEmpty() {
        return this.volume = 0;
    }

    public double getFill() {
        return this.volume = 100;
    }
}