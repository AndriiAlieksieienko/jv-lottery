package core.basesyntax;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = colorSupplier.getRandomNumber();

        return new Ball(color, number);
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }
}
