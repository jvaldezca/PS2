package MainPackage;

public class MyInteger {
	// Data field
	private int value;

	// Get Method
	public int getValue() {
		return value;
	}

	// Set Method
	public void setValue(int value) {
		this.value = value;
	}

	// Constructor for specified value
	public MyInteger(int value) {
		setValue(value);
	}

	// isEven method
	public boolean isEven() {
		if (this.getValue() % 2 == 0) {
			return true;
		}

		else {
			return false;
		}
	}

	// isOdd method
	public boolean isOdd() {
		if (this.getValue() % 2 == 1) {
			return true;
		}

		else {
			return false;
		}
	}

	// isPrime method
	public boolean isPrime() {
		for (int i = 2; i < this.getValue(); i++) {
			if (this.getValue() % i == 0) {
				return false;
			}
		}
		return true;
	}

	// isEven(int) method
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}

		else {
			return false;
		}
	}

	// isOdd(int) method
	public static boolean isOdd(int value) {
		if (value % 2 == 1) {
			return true;
		}

		else {
			return false;
		}
	}

	// isPrime(int) method
	public static boolean isPrime(int value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	// isEven(MyInteger)
	public static boolean isEven(MyInteger myInt) {
		return myInt.isEven();
	}

	// isOdd(MyInteger)
	public static boolean isOdd(MyInteger myInt) {
		return myInt.isOdd();
	}

	// isPrime(MyInteger)
	public static boolean isPrime(MyInteger myInt) {
		return myInt.isPrime();
	}

	// equals(int) method
	public boolean equals(int value) {
		if (this.getValue() == value) {
			return true;
		} else {
			return false;
		}
	}

	// equals(MyInteger) method
	public boolean equals(MyInteger myInt) {
		return myInt.equals(value);
	}

	// parseInt(char[]) method
	public static int parseInt(char[] Array) {
		int number = Integer.parseInt(new String(Array));
		return number;
	}

	// parseInt(String) method
	public static int parseInt(String StringNumber) {
		int number = Integer.parseInt(StringNumber);
		return number;

	}
}
