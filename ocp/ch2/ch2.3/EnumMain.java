interface Smokable{}
interface Drinkable{}
enum EnumMain implements Smokable, Drinkable{
	LOSE("bad"){
		public void run(){
			System.out.println("Run from bad");
		}
	},
	DOBRO("good"){
		public void run(){
			System.out.println("Run from good");
		}
	},
	NAJBOLJE("best"){
		public String toString() {
			return "najbolje";
		}
		public void run(){
			System.out.println("Run from best");
		}
	},
	RUZNO{
		public void run(){
			System.out.println("Run from ugly");
		}
	};

	private String word;
	/* no public or proteced constructors */
	EnumMain(){
		this.word = "ugly";
	}
	EnumMain(String word){
		this.word = word;
	}

	abstract public void run();

	public String toString(){
		return this.word;
	}

	public static void main(String args[]){
		for(EnumMain em : EnumMain.values()){
			em.run();
			System.out.println(em);
		}
	}
}
