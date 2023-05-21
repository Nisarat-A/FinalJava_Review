package DecoratorDesignPattern2;

public class ShapeDecorator  implements Shape{

    protected  Shape DecoShape ;

    public ShapeDecorator(Shape DecoShape){
        this.DecoShape = this.DecoShape;
    }
    public void draw() {
        DecoShape.draw();
    }
}
