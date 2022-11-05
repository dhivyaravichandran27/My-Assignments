package week1.day1;

public class TwoWheeler {
	int noOfWheels = 4;
	   short noOfMirrors =2;
	   long chassisNumber = 987654321L;
	   boolean isPunctured = true;
	   String bikeName = "unicorn";
	   double runningKm = 65000.23;
	   
	public static void main(String[] args) {
	   TwoWheeler features = new TwoWheeler();
	   System.out.println("No of wheels="+features.noOfWheels);
	   System.out.println("No of mirrors="+features.noOfMirrors);
	   System.out.println("Chassis Number="+features.chassisNumber);
	   System.out.println("Punctured="+features.isPunctured); 
	   System.out.println("Bike Name="+features.bikeName);
	   System.out.println("Running KM="+features.runningKm);
	}
	   
	   }


