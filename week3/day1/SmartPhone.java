package week3.day1;

public class SmartPhone extends AndroidPhone{
	public void connectWhatsapp() {
		System.out.println("Connect to whatsapp");
	}
	public void takeVideo() {
		System.out.println("Take the video in smart phone");
	}

	public static void main(String[] args) {
    SmartPhone smart = new SmartPhone();
    smart.connectWhatsapp();
    smart.saveContact();
    smart.sendMsg();
    smart.takeVideo();
    

	}

}
