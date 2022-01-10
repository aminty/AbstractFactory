import abstraction.AbstractFactory;
import abstraction.Color;
import abstraction.Shape;

public class Client {
    public static void main(String[] args) {

        AbstractFactory getFactory1=FactoryProducer.getFactory("color");
        Color color=getFactory1.getColor("pink");
        color.fill();


        AbstractFactory getFactory2=FactoryProducer.getFactory("shape");
        Shape shape=getFactory2.getShape("circle");
        shape.draw();

    }
}
