package DecoratorDesignPattern2;

public class DemoTest {
    public static void main(String[] args) {
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRec = new RedShapeDecorator(new Rectangle());
        redCircle.draw();
        redRec.draw();
    }
}
