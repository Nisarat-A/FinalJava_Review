package DecoratorDesignPattern2;

public class ShapeDecorator  implements Shape{
    private final Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape ;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
