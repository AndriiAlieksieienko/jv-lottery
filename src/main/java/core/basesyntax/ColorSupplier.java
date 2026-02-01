package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final int numberAmount = 101;

    public Color getRandomColor() {
        int randomIndex = random.nextInt(Color.values().length);
        return Color.values()[randomIndex];
    }

    public int getRandomNumber() {
        return random.nextInt(numberAmount);
    }

    public Random getRandom() {
        return random;
    }

    public int getNumberAmount() {
        return numberAmount;
    }
}
