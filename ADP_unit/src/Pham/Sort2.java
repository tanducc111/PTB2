package Pham;

public class Sort2 {
	private int number1;
	private int number2;

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public Sort2(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public void sortDesc() {
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
	}
}
