import abstraction.AbstractFactory;
import abstraction.impl.color.AbstractColorFactoryImpl;
import abstraction.impl.shape.AbstractShapeFactoryImpl;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice==null){
            return null;
        }else if (choice.equalsIgnoreCase("shape")){
            return new AbstractShapeFactoryImpl();
        }else if (choice.equalsIgnoreCase("color")){
            return new AbstractColorFactoryImpl();
        }
        return null;
    }
}
