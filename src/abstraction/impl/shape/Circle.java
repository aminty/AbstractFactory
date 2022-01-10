package abstraction.impl.shape;

import abstraction.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Call draw inside circle class");
    }
}
