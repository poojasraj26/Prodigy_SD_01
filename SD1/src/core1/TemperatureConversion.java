package core1;
import java.util.*;
public class TemperatureConversion {
	void celsiusConversion(double celsius)
	{
		System.out.println("Temperature measurement in Celsius "+celsius+"°C");
		
		double f =(celsius*9/5)+32;
		double k=celsius+273.15;
		
		System.out.println("Temperature measurement in Fahrenheit "+f+"°F");
		System.out.println("Temperature measurement in kelvin "+k+"K");
		
		
	}
	void kelvinConversion(double kelvin)
	{
		System.out.println("Temperature measurement is "+kelvin+"K");
		double c=kelvin-273.15;							//c and f are localvariable only accepable in the scope 
		double f=(kelvin*9/5)-459.67;
		
		System.out.println("Temperature measurement in Celsius "+c+"°C");
		System.out.println("Temperature measurement in Fahrenheit "+f+"°F");
		
	}
	void fahrenheitConversion(double fahrenheit)
	{
		System.out.println("Temperature measurement is "+fahrenheit+"°F");
		double c=(fahrenheit-32)*5/9;					//logic
		double k=(fahrenheit+459.67)*5/9;
		
		System.out.println("Temperature measurement in Celsius "+c+"°C");
		System.out.println("Temperature measurement in kelvin "+k+"K");
	}
	

	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Welcome to Temperature convertion ");
		
		System.out.println(" Please select the Temperature measurement unit  ");
		System.out.println("F for Fahrenheit "); 
		System.out.println("K for Kelvin");
		System.out.println("C for Celsius");
		
		char values =(sc.next().toUpperCase().charAt(0));  //change char enter by user to capital 
		
		
		 TemperatureConversion t=new TemperatureConversion(); //obj creation to access non static method		
		switch(values){
		
		case 'C' :
		{
			System.out.println("Enter the Temperature ");
		    t.celsiusConversion(sc.nextDouble());			//method calling
			break;
			
		}
		case 'F' :
		{
			System.out.println("Enter the Temperature values");
			t.fahrenheitConversion(sc.nextDouble());
			break;
		}
		case 'K' :
		{
			System.out.println("Enter the Temperature values");
			t.kelvinConversion(sc.nextDouble());
			break;
		}
		default :
		{
		System.out.println("Enter the correct mesurement option");	
		break;
		}
		
		}
		sc.close();
		
	}
}

