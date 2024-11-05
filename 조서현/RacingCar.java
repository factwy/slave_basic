import java.util.Random;

public class RacingCar {
    public RacingCar(String name) {
        this.name = name;
        this.position = 0;
        this.rng = new Random();
    }

    public void move() {
        if (rng.nextInt() % 10 >= 4) {
            position++;
        }
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append(name);
        sb.append(" : ");
        sb.append("- ".repeat(Math.max(0, position)));
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    private String name;
    private int position;
    private final Random rng;
}
