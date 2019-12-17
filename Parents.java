package ass3;

public class Parents implements Speaker{
	String speak;
	public void speak() {
		System.out.println("Parents");
	}
	
	public void announce(String speech) {
		speak = speech;
	}

}
