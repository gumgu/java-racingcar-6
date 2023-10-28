package racingcar.business;

public class Car {

    private static final int FORWARD_DECISION_NUMBER = 4;

    private String name;
    private Integer distance;

    public Car(String name) {
        this.name = name;
        this.distance = 0;
    }

    public Integer getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    public void moveCar(Integer randomNumber) {
        if (randomNumber.intValue() >= FORWARD_DECISION_NUMBER) {
            forward();
        }
    }

    private void forward() {
        distance ++;
    }

}
