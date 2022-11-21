package week3.day1;

public class Automation extends MultipleLangauge implements TestTool {
	public void Java() {
		System.out.println("Language is Java");
		
	}

	public void Selenium() {
		System.out.println("Language is Selenium");
		
	}

	@Override
	public void ruby() {
		System.out.println("Language is Ruby");
		
	}


	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Java();
		auto.python();
		auto.ruby();
		auto.Selenium();

	}

	
}
