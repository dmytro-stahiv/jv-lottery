package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int index;

    public String getRandomColor() {
        index = new Random().nextInt(Color.values().length);
        return String.valueOf(Color.values()[index]);
    }
}
