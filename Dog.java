public class Dog extends Animal {
	@Override
	public void eat(){
		System.out.print("Dog loves to eat Bone");
	}
	@Override
	public void sleep(){
		System.out.println("and sleeps for 6 hours a day");
	}
	
	@Override
		public void makesound() {
		System.out.println("AARRFF GRRR");
	}
	
}