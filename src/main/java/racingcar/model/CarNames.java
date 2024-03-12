package racingcar.model;

import java.util.Arrays;
import java.util.List;

public class CarNames {
    private final List<String> carNames;

    public CarNames(String carNames) {
        this.carNames = Arrays.asList(carNames.split(","));
    }

    public List<String> getCarNames() {
        return this.carNames;
    }

    public String getCarName(int index) {
        return this.carNames.get(index);
    }

    public int getCarNameCount() {
        return this.carNames.size();
    }
}
