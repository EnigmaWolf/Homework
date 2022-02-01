package employee;
import java.util.*;


public class Salaryapp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
	    
	    // hour and minute entries
	    int Hour;
	    do {
	    System.out.println("Please enter your starting hour [0-23]:");
	        Hour = keyboard.nextInt();
	    } while (Hour<0||Hour>23);
	    
	    if (Hour<=7) {
	    	System.out.println("Your starting hour is after midnight.");	
	    	}
	    	else {
	    	System.out.println("Your starting time is before midnight.");
	    }
	    
	    int Minutes;
	    do {
	        System.out.println("Please enter your starting minutes [0-59]:");
	        Minutes = keyboard.nextInt();
	    }while (Minutes<0||Minutes>59);
	   
	    //System.out.println("Your starting time is:" + Hour + ":" + Minutes);
	    
	    int EndHour;
	    do {
	    System.out.println("Please enter your ending hour [0-23]:");
	        EndHour = keyboard.nextInt();
	    } while (EndHour<0||EndHour>23);
	   
	    int EndMinutes;
	    do {
	        System.out.println("Please enter your ending time minutes [0-59]:");
	        EndMinutes = keyboard.nextInt();
	    }while (EndMinutes<0||EndMinutes>59);
	      
	    
	    
	    // output hour and minute entries
	   
	    //System.out.println("Your ending time is:" + EndHour + ":" + EndMinutes);
	     
	    int TotalHours;
	    if (Hour<=EndHour) {
	    TotalHours=EndHour-Hour;
	    } else {
	    TotalHours=(EndHour-Hour)+24;
	    }
	    
	    //System.out.println("Total Hours worked:" + TotalHours);
	   
	    int TotalMinutes;
	    if (Minutes<=EndMinutes) {
	    TotalMinutes=EndMinutes-Minutes;
	    } else {
	    TotalMinutes=(EndMinutes-Minutes)+60;
	    }
	    System.out.println("Total time worked:" + TotalHours + ":" + TotalMinutes);
	 
	    double RateHour = 11.5;
	    double MinToHour = (TotalMinutes/(double)60);
	    double Salary = (TotalHours*RateHour)+(MinToHour*RateHour);  
	   
	    String[] weekdays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	   
	    // Day of the week code
	    int WeekDay;
	    System.out.println("Please fill in a number corresponding to the day\n[1] Monday\n[2] Tuesday\n...\n[7] Sunday");
	    WeekDay = keyboard.nextInt();
	    System.out.println("Your day of the week is: " + weekdays[WeekDay -1]);  
	   
	    double SatRateHour = (11.5)*(1+0.25);
	    double SatMinToHour = (TotalMinutes/(double)60);
	    double SatSalary = (TotalHours*SatRateHour)+(SatMinToHour*SatRateHour);
	   
	    double SunRateHour = (11.5)*(1+0.50);
	    double SunMinToHour = (TotalMinutes/(double)60);
	    double SunSalary = (TotalHours*SunRateHour)+(SunMinToHour*SunRateHour);
	   
	    String dayType;
	   
	    switch (WeekDay) {
	    case 1:
	    case 2:
	    case 3:
	    case 4:
	    case 5:
	        dayType = "Weekday";
	        System.out.printf("Your total earnings for this Weekday are: €%.2f", Salary);
	        break;
	    case 6:
	    dayType = "Weekend";
	    System.out.printf("Your total earnings for this Saturday are: €%.2f", SatSalary);
	    break;
	    case 7:
	        dayType = "Weekend";
	        System.out.printf("Your total earnings for this Sunday are: €%.2f", SunSalary);
	        break;
	       
	    default:
	        dayType = "Invalid daytype";
	   
	    }
	    System.out.println("");
	    System.out.println( "You've worked on a day in the: " + dayType);
	   
	}

		
	}


