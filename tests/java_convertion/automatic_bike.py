class AutomaticBike:
    def __init__(self):
        self.currentSpeed = None
        self.gear = 0
        self.isOff = False
        self.isOn = False

    def turnOff(self):
        self.isOn = False


    def turnOn(self):
        self.isOn = True

    def setAcceleration(self, value):
        self.acceleration = value

    def getAcceleration(self):
        return self.acceleration


    def setCurrentSpeed(self, speed):
        self.current_speed = speed

    def setGear(self, gear):
        self.gear = gear

    def accelerate(self):
        #return self.acceleration
        self.current_speed += 1


def test_bike_if_it_can_turn_on():
    bike = AutomaticBike()
    bike.turnOff()
    bike.turnOn()
    return True

def test_bike_if_it_can_turn_off():
    bike = AutomaticBike()
    bike.turnOn()
    bike.turnOff()
    return False


