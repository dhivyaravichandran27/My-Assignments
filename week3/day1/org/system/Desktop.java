package week3.day1.org.system;

public class Desktop extends Computer {
	public void desktopSize(){
		System.out.println("size of Desktop is 15 inch");
	}
	public static void main(String[] args) {
		Desktop com = new Desktop();
		com.computerModel();
		com.desktopSize();

	}

}
