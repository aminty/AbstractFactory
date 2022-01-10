package abstraction.impl.color;

import abstraction.Color;

public class Pink implements Color {
    @Override
    public void fill() {
        System.out.println("Call fill method inside pink class");
    }
}
