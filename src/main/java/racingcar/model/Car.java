package racingcar.model;

public class Car {
    public static final int MOVE_STANDARD = 4;
    public static final int MOVE_DISTANCE = 1;
    private int distance = 0;

    public int getDistance() {
        return this.distance;
    }

    public void move(int data) {
        if (data >= MOVE_STANDARD) {
            distance += MOVE_DISTANCE;
        }
    }
}
