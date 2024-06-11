import unittest
import automatic_bike
from automatic_bike import test_bike_if_it_can_turn_on


class MyTestCase(unittest.TestCase):
    def test_check_if_bike_can_turnOn(self):
        bike = automatic_bike.AutomaticBike()
        bike.turnOff()
        bike.turnOn()
        self.assertTrue(bike.isOn)

    def test_check_if_bike_can_turn_off(self):
        bike = automatic_bike.AutomaticBike()
        bike.turnOn()
        bike.turnOff()
        self.assertFalse(bike.isOn)

    def test_if_bike_can_accelerate(self):
        bike = automatic_bike.AutomaticBike()
        bike.turnOn()
        bike.setAcceleration(22)
        assert bike.getAcceleration()== 22

    def test_if_bike_can_accelerate_by_gear_1(self):
        bike = automatic_bike.AutomaticBike()
        bike.turnOn()
        bike.setCurrentSpeed(15)
        bike.setGear(1)
        bike.accelerate()
        assert bike.currentSpeed() == 16


if __name__ == '__main__':
    unittest.main()
