package seminars.second.hw;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class VehicleTest {

    // проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    void isCarVehicle() {
        Car car = new Car("Porsche","911",1968);
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    // проверка того, объект Car создается с 4-мя колесами
    @Test
    void isCarHave4Vehicles(){
        Car car = new Car("Porsche","911",1968);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    // проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    void isMotorcycleHave2Vehicles(){
        Motorcycle motorcycle = new Motorcycle("Ural", "M-77", 1978);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    // проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void isCarCanDrive60inTest(){
        Car car = new Car("Porsche","911",1968);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void isMotorcycleCanDrive75inTest(){
        Motorcycle motorcycle = new Motorcycle("Ural", "M-77", 1978);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    // проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void isCarCanStop(){
        Car car = new Car("Porsche","911",1968);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    // проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void isMotorcycleCanStop(){
        Motorcycle motorcycle = new Motorcycle("Ural", "M-77", 1978);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}