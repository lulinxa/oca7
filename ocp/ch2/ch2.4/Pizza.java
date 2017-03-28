class Pizza {
	Object margarita() {
		final String ingredient = "Cheese";
		return new Pizza() {
			public String toString() {
				System.out.println(ingredient);
				return "margarita";
			}
		};
	}
}
