public class ProbableTopper {
    public boolean topper(int num){
        boolean result = true;
        int oddSum = 0, evenSum = 0;
        String number = String.valueOf(num);
        for(int i = 0; i < number.length(); i++){
            if(i % 2 == 0) oddSum += Integer.parseInt(number.charAt(i)+"");
            else evenSum += Integer.parseInt(number.charAt(i)+"");
        }
        if(oddSum == evenSum) result = true;
        else result = false;

        return result;
    }
}
