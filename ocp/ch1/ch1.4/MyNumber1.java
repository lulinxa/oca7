class MyNumber1 {
	long number;
	MyNumber1(long number) {
		this.number = number;
	}
	public int hashCode(){
//		int sum = 0;
//		long num = number;
//		do {
//			sum += num % 10;
//			num /= 10;
//		} while(num != 0);
//		return sum;
		return (int)number;
	}
	public boolean equals(Object o){
		if(o != null && o instanceof MyNumber1)
			return (number == ((MyNumber1)o).number);
		else
			return false;
	}
	public static void main(String args[]){
		MyNumber1 n1 = new MyNumber1(9);
		MyNumber1 n2 = new MyNumber1(18);
		MyNumber1 n3 = new MyNumber1(18);
		System.out.println(n1.equals(n2)+":"+n1.hashCode()+":"+n2.hashCode());
		System.out.println(n2.equals(n3)+":"+n2.hashCode()+":"+n3.hashCode());
	}
}
