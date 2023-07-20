import java.util.*;
import java.time.*;  
public class AgeCalculator {
    public static void main(String args[]) {
        LocalDate dob = LocalDate.of(2004, 9,19);
        LocalDate curDate = LocalDate.now(); 
        Period period = Period.between(dob, curDate);
        System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());
    }
}



// import java.time.*;  
// import java.util.*;  
// public class AgeCalculator 
// {    
// public static void main(String args[])  
// {  
// //obtains an instance of LocalDate from a year, month and date  
// LocalDate dob = LocalDate.of(2004, 9, 19);  
// //obtains the current date from the system clock  
// LocalDate curDate = LocalDate.now();  
// //calculates the difference betwween two dates  
// Period period = Period.between(dob, curDate);  
// //prints the differnce in years, months, and days  
// System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());  
// }  
// }  
