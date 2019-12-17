package ass3;

public class Teacher implements Speaker {
	String speak;
	public void speak() {
		System.out.println("Teacher:");
	}
	
	public void announce(String speech) {
		speak = speech;
		System.out.println(speak);
	}
}
