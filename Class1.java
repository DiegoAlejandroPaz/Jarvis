package Assignment7;

public class Class1 {
	
	static void tempOutside() { 
	int temp = 9;
		
	if (temp >= 30) {
		System.out.println("Today is a sunny day full of clear skies with a temperature of " + temp + "°C");
	}
	else {
		System.out.println("Today is rainy and cloudy day with a temperature of " + temp +"°C");
		}	
	}
	 static void user() {
		String fName = "Diego";
		String sName = "Alejandro";
		String result = fName.equals("Diego") ? fName + " " + sName : "Invalid Login";
		  
		System.out.println("Welcome back, " + result);
		}
	 static void dayProtocol(String day) {
		 switch (day) {
		 case "MONDAY" : { System.out.println("Initiating Monday Protocol"); break;}
		 case "TUESDAY" : { System.out.println("Initiating Tuesday Protocol"); break;}
		 case "WEDNESDAY" : { System.out.println("Initiating Wednesday Protocol"); break;}
		 case "THURSDAY" : { System.out.println("Initiating Thursday Protocol"); break;}
		 case "FRIDAY" : { System.out.println("Initiating Friday Protocol"); break;}
		
		 default : { System.out.println("There is no protocol for " + day + " please rest");}

		 }	
	 }
}