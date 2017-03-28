class Outer{
	Object foo() {
		return new Object() {
			public String toString() {
				return "anonymous";
			}
		};
	}
}
