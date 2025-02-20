package web.model;

import java.util.Objects;

public class Car {

    private String model;
    private String engine;
    private int horsePower;

    public Car() {
    }

    public Car(String model, String engine, int horsePower) {
        this.model = model;
        this.engine = engine;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car " + '\'' + "model= " + model + '\'' + ", engine= " +
                engine + '\'' + ", horsePower= " + horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return horsePower == car.horsePower &&
                Objects.equals(model, car.model) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, engine, horsePower);
    }
}