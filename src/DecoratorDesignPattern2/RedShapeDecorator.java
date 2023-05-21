package DecoratorDesignPattern2;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shape){
        super(shape);
    }
    @Override public void draw(){
        System.out.println("Border : red");
    }
}
