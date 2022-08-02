public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int drink() {
        return volume - 10;
    }

    public int empty() {
        volume = 0;
        return volume;
    }

    public int fill() {
        volume = 100;
        return volume;
    }
}
