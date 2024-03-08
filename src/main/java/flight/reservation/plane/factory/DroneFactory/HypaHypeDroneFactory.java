

public class HypaHypeDroneFactory extends DroneFactory {
    public HypaHypeDroneFactory() {
        super("HypaHypeDrone");
    }
    @Override
    public Drone CreateHypaHypeDrone() {
        return new HypaHypeDrone();
    }
}