public class Lasagna {

    final int fullMinutesInOven = 40;
    final int minutesPerPreparationLayer = 2;
    
    public int expectedMinutesInOven() {
        return fullMinutesInOven;
    }

    public int remainingMinutesInOven(int currentMinutesInOven) {
        return fullMinutesInOven - currentMinutesInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * minutesPerPreparationLayer;
    }

    public int totalTimeInMinutes(int layers, int currentMinutesInOven) {
        return layers * minutesPerPreparationLayer + currentMinutesInOven;
    }
}
