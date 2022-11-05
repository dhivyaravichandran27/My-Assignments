package week1.day1;

public class Mobile {
	public void makeCall() {
		System.out.println("make call to friend");

	}
	public void sendMsg() {
		System.out.println("Send voice message");

	}

	public static void main(String[] args) {
		Mobile myMobile =new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();

	}

}
