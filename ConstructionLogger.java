package logger;


import java.util.Scanner;
import java.util.logging.Logger; 

public class ConstructionLogger {
	static
	{
		Logger log=Logger.getLogger(ConstructionLogger.class.getName());
		Scanner sc=new Scanner(System.in);
		int choice,area;
		String logMessage;
		log.info("Enter Material Quality\n1.standard\n2.above standard\n3.high standard\n4.high standard and fully automated home");
		choice=sc.nextInt();
		if(choice==1||choice==2||choice==3||choice==4)
		{
			log.info("Enter the Area of the house in sq.ft");
			area=sc.nextInt();
			Construction con=new Construction(material,area);
			logMessage=con.costCalculation();
			log.info(logMessage);
		}
		else
		{
			log.info("Invalid input");
			System.exit(0); 
		}
		sc.close();
    System.exit(0);
	}

	public static void main(String[] args) {
	}

}

public class Construction
{
	int standard,Area;
	Construction(int std,int area)
	{
		standard=std;
		Area=area;
	}
	String costCalculation()
	{
		if(standard==1)
			return("Construction Cost: "+Area*12000);
		else if(standard==2)
			return("Construction Cost: "+Area*15000);
		else if(standard==3)
			return("Construction Cost:"+Area*18000);
		else if(standard==4)
			return("Construction Cost:"+Area*25000);
		else
			return("invalid");
	}
}

