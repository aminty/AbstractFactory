package abstraction.impl.shape;

import abstraction.Shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Call draw method inside Triangle method");
    }
}
