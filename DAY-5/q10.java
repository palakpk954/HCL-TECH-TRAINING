public class q10 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		Fan fan = new CeilingFan();

		System.out.print("Enter fan operation (on/off): ");
		String operation = scanner.nextLine().trim().toLowerCase();
		new Switch().operate(fan, operation);

		scanner.close();
        
	}
}

abstract class Fan {
	abstract void turnOn();
	abstract void turnOff();
}

class CeilingFan extends Fan {
	@Override
	void turnOn() {
		System.out.println("Fan switched on.");
	}

	@Override
	void turnOff() {
		System.out.println("Fan switched off.");
	}
}

class Switch {
	void operate(Fan fan, String operation) {
		switch (operation) {
			case "on":
				fan.turnOn();
				break;
			case "off":
				fan.turnOff();
				break;
			default:
				System.out.println("Invalid operation. Enter on or off.");
		}
	}
}
