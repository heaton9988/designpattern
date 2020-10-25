package decorator;

public abstract class BattercakeDecorator extends Battercake {
    Battercake battercake;

    BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    int getPrice() {
        return this.battercake.getPrice();
    }
}