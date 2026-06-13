// Number of Employees Who Met the Target

public class NumberOfEmployeesMetTheTarget {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i=0;i<hours.length;i++) {
            if(hours[i] >= target) count++;
        }
        return count;
    }
    public static void main(String[] args) {
     int[] hours = {5,1,4,2,2};
     int target = 6;
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));   
    }
}
