package flight.reservation.plane;

public interface Helicopter extends Vehicle {

    public Helicopter(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }
}
