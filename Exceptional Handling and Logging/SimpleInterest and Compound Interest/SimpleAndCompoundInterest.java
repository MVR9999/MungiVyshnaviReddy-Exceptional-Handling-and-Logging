import java.io.IOException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 
import java.util .*;
class SimpleInterest
{    private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);   

	void calculate(double PrincipalAmount,double Time,double InterestRate)
	{
		double interest=(PrincipalAmount * Time * InterestRate)/100;
               LOGGER.log(Level.WARNING, "SimpleInterest : " +String.valueOf(interest)); 	
	}
}
class CompoundInterest
{    private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);   

	void calculate(double PrincipalAmount,double Time,double InterestRate)
	{
		    double interest=PrincipalAmount * Math.pow(1.0+InterestRate/100.0,Time) - PrincipalAmount;
            LOGGER.log(Level.WARNING, "CompoundInterest : "+String.valueOf(interest));	}
}
class SimpleAndCompoundInterest
{    private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);   

    public static void main (String argu[ ])
{
	LOGGER.log(Level.WARNING, "Calculate:\n1.Simple Interest\n2.Compound Interest\nEnter your choice:");
    Scanner sc=new Scanner (System. in);
    int option=sc.nextInt();
    double PrincipalAmount, InterestRate, Time;
    LOGGER.log(Level.WARNING, "Enter the amount:");
    PrincipalAmount=sc.nextDouble();
    LOGGER.log(Level.WARNING, "Enter the No.of years:");
    Time=sc.nextDouble();
    LOGGER.log(Level.WARNING, "Enter the Rate of  interest");
    InterestRate=sc.nextDouble();

	switch(option)
	{
		case 1:
		SimpleInterest objs=new SimpleInterest();
		objs.calculate(PrincipalAmount,Time,InterestRate);
		break;
		case 2:
		CompoundInterest objc=new CompoundInterest();
		objc.calculate(PrincipalAmount,Time,InterestRate);
		break;
		
	}
     
   }
}