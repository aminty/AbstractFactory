package abstraction.impl.shape;

import abstraction.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Call draw inside rectangle class");
    }
}
