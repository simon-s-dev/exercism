class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int[] digits = new int[Integer.toString(numberToCheck).length()];
        int number = numberToCheck;
        int sum = 0;
        
        for (int i = 0; i < digits.length; i++){
            digits[i] = number % 10;
            sum += Math.pow(digits[i], digits.length); 
            number = number/10;
        }

        return sum == numberToCheck;
    }

}
