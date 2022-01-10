package abstraction.impl.color;

import abstraction.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Call fill method inside green class");
    }
}
