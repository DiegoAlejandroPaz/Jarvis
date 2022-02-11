package Assignment7;

public class Class2 {
	public static void systemOn () {
		String array[] = { "Systems running at 100% capacity", "Database Connection Successful", "Initiating Jarvis system in 3, 2, 1..." };
		
		for (String x : array) {
			System.out.println(x);
		}
	}
	static void musicOn() {
		System.out.println("Creating queque...");
		int a = 1;
		while(a < 5) {
			System.out.println(" Adding Soundtrack " + a);
			a++;
		}
	}
}
