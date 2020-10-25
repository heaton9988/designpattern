package decorator;

public class EggDecorator extends BattercakeDecorator {
    EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    int getPrice() {
        return this.battercake.getPrice() + 1;
    }
}