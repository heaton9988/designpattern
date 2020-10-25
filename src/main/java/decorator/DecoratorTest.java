package decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Battercake battercake = new SausageDecorator(new EggDecorator(new EggDecorator(new BaseBattercake())));
        System.out.println("msg=" + battercake.getMsg());
        System.out.println("总价=" + battercake.getPrice());
    }
}