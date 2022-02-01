package employee;
import java.util.*;


public class Salaryapp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);

	    int Hour;
	    do {
	    System.out.println("Please enter your starting hour [0-23]:");
	        Hour = keyboard.nextInt();
	    } while (Hour<0||Hour>23); 
	    
	    int Minutes;
	    do {
	        System.out.println("Please enter your starting minutes [0-59]:");
	        Minutes = keyboard.nextInt();
	    }while (Minutes<0||Minutes>59);
	   	
	    String[] weekdays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	    
	    int StartDay;
	    System.out.println("Please choose the the day corresponding to your start of work\n[1] Monday\n[2] Tuesday\n...\n[7] Sunday");
	    StartDay = keyboard.nextInt();
	    System.out.println("Your start day of work is a: " + weekdays[StartDay -1]);
	    
	    
	    
	  //  System.out.println("");
	    //System.out.println( "You've worked starting on a day in the: " + dayType);
	    
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
	    
	    int EndDay;
	    System.out.println("Please choose the day corresponding to your end day of work\n[1] Monday\n[2] Tuesday\n...\n[7] Sunday");
	    EndDay = keyboard.nextInt();
	    System.out.println("Your end day of work is a: " + weekdays[EndDay -1]);
	    
	    
	      	     
	    int TotalHours;
	    if (Hour<=EndHour) {
	    TotalHours=EndHour-Hour;
	    } else {
	    TotalHours=(EndHour-Hour)+24;
	    }
	    
	    int TotalHourstoMin;
	    TotalHourstoMin=(TotalHours/60);
	    System.out.println("Total hours in minutes is:"+ TotalHourstoMin);
	    	   
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
	    	
	    double SatRateHour = (11.5)*(1+0.25);
	    double SatMinToHour = (TotalMinutes/(double)60);
	    double SatSalary = (TotalHours*SatRateHour)+(SatMinToHour*SatRateHour);
	   
	    double SunRateHour = (11.5)*(1+0.50);
	    double SunMinToHour = (TotalMinutes/(double)60);
	    double SunSalary = (TotalHours*SunRateHour)+(SunMinToHour*SunRateHour);
	    
	    String dayType;
		   
	    switch (StartDay) {
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

 
