package inheritance;

class sales {
	protected int totalSales = 3564;
	protected int yearSales = totalSales * 12;
}

class industry extends sales {
	protected String industry = "computers";
	public void purpose() {
		System.out.println("These companies manufacture " + industry + ".");
	}
}

class company extends industry{
	private String name = "Razor";
	public static void main (String args[]) {
		company razor = new company();
		razor.purpose();
		
		System.out.println("The " + razor.name + " company is one that makes " + razor.industry + ".");
		System.out.println("They sell upwards of " + razor.totalSales + " units per month and " + razor.yearSales + " units per year!");
		
	}
}