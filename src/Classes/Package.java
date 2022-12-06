package Classes;

public class Package extends Inventory {
    int volume;
    int packagePrice;
    public Package(int volume, int packagePrice) {
        this.volume = volume;
        this.packagePrice = packagePrice;
    }

    @Override
    public String toString() {
        return "Package{" +
                "volume=" + volume +
                ", packagePrice=" + packagePrice +
                '}';
    }
    public Package(){}
    public int getVolume() {
        return volume;
    }
    public int getPrice() {
        return packagePrice;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPackagePrice(int packagePrice) {
        this.packagePrice = packagePrice;
    }
}
