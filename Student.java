package ass3;

public class Student implements Speaker{
	String speak;
	public void speak() {
		System.out.println("Students:");
	}
	
	public void announce(String speech) {
		speak = speech;
		System.out.println(speak);
	}

}
