class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    
    private int metersDriven = 0;
    private int batteryPercentage = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryPercentage < batteryDrain;
    }

    public int distanceDriven() {
        return metersDriven;
    }

    public void drive() {
        if(batteryPercentage >= batteryDrain){
            metersDriven += speed;
            batteryPercentage -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (!car.batteryDrained()){
            car.drive();
        }
        return car.distanceDriven() >= distance;
    }
}
