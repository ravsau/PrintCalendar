
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarConsole {

	public static void main(String[] args) {

		String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		String days[] = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		Scanner sc= new Scanner (System.in);

		System.out.println("Enter the month(0-11)");
		int month = sc.nextInt();
		month=month-1;
		sc.nextLine();

		System.out.println("Enter the year ");
		int year = sc.nextInt();



		System.out.println("\t\t "+months[month]+" "+year);

		System.out.print(" ");

		for (int i=0;i<7;i++){

			System.out.print(days[i]+"   ");


		}
		//Creating an instance of the Gregorian Calendar class
		GregorianCalendar gc = new GregorianCalendar(year,month,1);

		System.out.println(" ");


		int firstDay=gc.get(Calendar.DAY_OF_WEEK); //first day of the month (1-7)



		int no_days=dayMonth(gc.get(Calendar.MONTH)); //no of days in a given month

		System.out.print(spaces((firstDay-1)*6));
		for (int i=1;i<=no_days;i++){



			if (i<10){

				System.out.print(" ");
				System.out.print("0"+i);
				System.out.print("   ");

			}

			else 

			{
				System.out.print(" ");
				System.out.print(i);
				System.out.print("   ");

			}



			if ((firstDay+i-1)%7==0){
				System.out.println("  ");


			}




		}


	}
	//this method returns the no of days in a month passed in
	public static int dayMonth(int monthh){

		int month=monthh;
		int monthDays=0;


		switch(month){

		case 0:
		case 2:
		case 4:
		case 6:
		case 7:
		case 9:
		case 11:
			monthDays=31;
			break;
		case 3:
		case 5:
		case 8:
		case 10:
			monthDays=30;
			break;
		case 1:
			monthDays=28;
			break;

		}

		return monthDays;


	}


	//this method was made for formatting the spaces to print the calendar properly
	public static String spaces(int num){

		int size=num;

		String arr= "";

		for (int i=1;i<=num;i++){

			arr=arr+ " ";


		}
		return arr;
	}

}

