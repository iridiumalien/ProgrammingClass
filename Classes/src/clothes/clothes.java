package clothes;

public class clothes {
	private String name;
	private int amount;

	public clothes() {
		name = "Converse";
		amount = 4;
	}

	public clothes(String whatItem, int number) {
		name = whatItem;
		amount = number;
	}

	public String getName() {
		return name;
	}

	public int getAmount() {
		return amount;
	}

	public void addAmount(int times) {
		amount = times + amount;
	}

}
