import java.util.*;
import java.util.logging.Logger; 

public class InterestCal {

	static {
		Scanner sc = new Scanner(System.in);
		Logger logger=Logger.getLogger(Interest.class.getName());
		
		System.out.format("%s", "Enter principle amount");
		double principal = sc.nextDouble();
		System.out.format("%s", "Enter rate of interest");
		double rate_of_interest = sc.nextDouble();
		System.out.format("%s", "Enter number of years");
		double timePeriod = sc.nextDouble();
		
		Compute com = new Compute(principal, rate_of_interest, time_period);
		
		logger.info("Select 1. Calculating Simple Interest \n2. Calculating Compound Interest \n3.Both");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			logger.info(String.valueOf(com.CalSimpleInterest()));
			break;
		case 2:			
			logger.info(String.valueOf(com.calCompoundInterest()));
			break;
     case 3:
       			logger.info(String.valueOf(com.CalSimpleInterest()));
            logger.info(String.valueOf(com.calCompoundInterest()));
            break;
		}
		sc.close();
    System.exit(0);
	}

	public static void main(String[] args) {
	}
}

class Compute {
	double principal, rate_of_interest, time_period;
	
	Compute(double principal, double rate_of_interest, double time_period){
		this.principal = principal;
		this.rate_of_interest = rate_of_interest;
		this.timePeriod = timePeriod;
	}
	
	double calCompoundInterest() {
		return (principal * (Math.pow(1 + rate_of_interest / 100, time_period)));
	}

	double CalSimpleInterest() {
		return (principal * rate_of_interest * time_period) / 100;
	}

}
