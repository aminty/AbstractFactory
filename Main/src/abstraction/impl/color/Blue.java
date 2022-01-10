package abstraction.impl.color;

import abstraction.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Call fill method inside blue class");
    }
}
