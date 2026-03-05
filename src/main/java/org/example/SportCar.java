package org.example;

public final class SportCar extends Car {
    private double maxSpeed;

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "marka='" + getMarka() + '\'' +
                ", carClass='" + getCarClass() + '\'' +
                ", driver=" + getDriver() +
                ", engine=" + getEngine() +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
