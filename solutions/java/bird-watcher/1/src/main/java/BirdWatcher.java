
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] birdsLastWeek = {0,2,5,3,7,8,4};
        return birdsLastWeek;
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        birdsPerDay[6]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean hasDayWithoutBirds = false;
        for(int birdsOnDay: birdsPerDay){
            if (birdsOnDay == 0 && hasDayWithoutBirds == false){
                hasDayWithoutBirds = true;
            }
        }
        return hasDayWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if(numberOfDays > 7){
            numberOfDays = 7;
        }
        for (int i = 0; i < numberOfDays; i++){
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int birdsOnDay: birdsPerDay){
            if (birdsOnDay >= 5){
                busyDays++;
            }
        }
        return busyDays;
    }
}
