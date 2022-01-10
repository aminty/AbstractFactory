package abstraction.impl.shape;

import abstraction.AbstractFactory;
import abstraction.Color;
import abstraction.Shape;

public class AbstractShapeFactoryImpl extends AbstractFactory {


    @Override
    public Shape getShape(String type) {
        if (type==null){
            return null;
        }else if (type.equalsIgnoreCase("circle")){
            return new Circle();
        }else if (type.equalsIgnoreCase("triangle")){
            return new Triangle();
        }else if(type.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
