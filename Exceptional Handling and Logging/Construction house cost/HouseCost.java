import java.io.IOException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 
import java.util .*;
class StandardMaterial
{    private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);   

	void calculateCost(int stdmaterial,double area)
	{
		double cost=stdmaterial*area;
        LOGGER.log(Level.WARNING, "House Construction Cost :  " +String.valueOf(cost)); 	
	}
}
class AboveStandardMaterial
{    private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);   

	void calculateCost(int abovestdmaterial,double area)
	{
		double cost=abovestdmaterial*area;
        LOGGER.log(Level.WARNING, "House Construction Cost :  " +String.valueOf(cost)); 	
	}
}
class HighStandardMaterial
{    private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);   

	void calculateCost(int highstdmaterial,double area)
	{
		double cost=highstdmaterial*area;
        LOGGER.log(Level.WARNING, "House Construction Cost :  " +String.valueOf(cost)); 	
	}
}
class HighStandardMaterialAndAutomated
{    private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);   

	void calculateCost(int highstdmaterialAutomated,double area)
	{
		double cost=highstdmaterialAutomated*area;
        LOGGER.log(Level.WARNING, "House Construction Cost :  " +String.valueOf(cost)); 	
	}
}
class HouseCost
{   private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);   

    public static void main (String argu[ ])
{
	LOGGER.log(Level.WARNING,"CalculateCost:\n1.1200INR if we use standard materials\n2.1500INR if we use above standard materials\n3.1800INR if you need high standard material\n4.2500INR if you need high standard material and fully automated\n Enter your choice:");
    Scanner sc=new Scanner (System. in);
    int materialstandard=sc.nextInt();
    double Area;
    LOGGER.log(Level.WARNING,"Enter the area:");
    Area=sc.nextDouble();
    
    LOGGER.log(Level.WARNING,"Do you need fully automated? : YES/NO");
    String needautomated=sc.next();

	switch(materialstandard)
	{
		case 1:
		StandardMaterial obj1=new StandardMaterial();
		int stdmaterial=1200;
		obj1.calculateCost(stdmaterial,Area);
		break;
		case 2:
		AboveStandardMaterial obj2=new AboveStandardMaterial();
		int abovestdmaterial=1500;
		obj2.calculateCost(abovestdmaterial,Area);
		break;
		case 3:
		HighStandardMaterial obj3=new HighStandardMaterial();
		int highstdmaterial=1800;
		obj3.calculateCost(highstdmaterial,Area);
		break;
		case 4:
		HighStandardMaterialAndAutomated obj4=new HighStandardMaterialAndAutomated();
		int highstdmaterialAutomated=1200;
		obj4.calculateCost(highstdmaterialAutomated,Area);
		break;
		
	}
     
   }
}