package decorator;

public class SausageDecorator extends BattercakeDecorator {
    SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    int getPrice() {
        return this.battercake.getPrice() + 2;
    }
}