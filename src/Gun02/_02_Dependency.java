package Gun02;

import org.testng.annotations.Test;

public class _02_Dependency {

    @Test
    public void startCar() {
        System.out.println("startCar");
    }

    @Test
    public void driveCar() {
        System.out.println("DriveCar");
    }

    @Test
    public void parkCar() {
        System.out.println("ParkCar");
    }

    @Test
    public void stopCar() {
        System.out.println("StopCar");
    }


}
