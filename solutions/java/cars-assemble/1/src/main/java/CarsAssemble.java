public class CarsAssemble {

    final int baseProductionRatePerHour = 221;
    
    public double productionRatePerHour(int speed) {
        int allCars = baseProductionRatePerHour * speed;
        double successRate = 0.0;
        
        if (speed <= 4){
            successRate = 1;
        }
        else if (speed <= 8){
            successRate = 0.9;
        }
        else if (speed <= 9){
            successRate = 0.8;
        }
        else if (speed <= 10){
            successRate = 0.77;
        }
        
        return allCars * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
