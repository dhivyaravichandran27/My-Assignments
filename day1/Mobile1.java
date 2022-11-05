package week1.day1;

public class Mobile1 {
      String mobileBrandName = "Poko";
      char mobileLogo = 'P';
      short noOfMobilePiece =2;
      int modelNumber = 637826;
      long mobileImeiNumber = 9876543211233L;
      float mobilePrice = 20000.50F;
      boolean isDamaged = false;
      
      
	public static void main(String[] args) {
		Mobile1 info = new Mobile1();
		System.out.println("Mobile Brand name="+info.mobileBrandName);
		System.out.println("Mobile Logo="+info.mobileLogo);
		System.out.println("No of mobiles="+info.noOfMobilePiece);
		System.out.println("Model Number="+info.modelNumber);
		System.out.println("Mobile Imei Number="+info.mobileImeiNumber);
		System.out.println("Mobile price="+info.mobilePrice);
		System.out.println("is Damaged="+info.isDamaged);
		

	}

}
