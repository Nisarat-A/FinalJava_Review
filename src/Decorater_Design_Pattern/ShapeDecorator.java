package Decorater_Design_Pattern;

public abstract class ShapeDecorator  implements Shape {
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShaped){
        this.decoratedShape = decoratedShape;
    }
    public void draw() { decoratedShape.draw(); }

}
