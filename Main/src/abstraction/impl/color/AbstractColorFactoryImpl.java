package abstraction.impl.color;

import abstraction.AbstractFactory;
import abstraction.Color;
import abstraction.Shape;

public class AbstractColorFactoryImpl extends AbstractFactory {

    @Override
    public Shape getShape(String type) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color==null){
            return null;
        }else if (color.equalsIgnoreCase("pink")){
            return new Pink();
        }else if (color.equalsIgnoreCase("blue")){
            return  new Blue();
        }else if (color.equalsIgnoreCase("green")){
            return new Green();
        }
        return null;
    }
}
