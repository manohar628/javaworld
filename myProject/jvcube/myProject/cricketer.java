package myProject;

public class cricketer {
	static int countryId;
	static String countryName;
	int jerseyNo;
	String CricketerName;


	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("welcome to india cricket team ");
		countryId=92;
		countryName="india";
		System.out.println(" COUNTRY ID :" +countryId);
		System.out.println("COUNTRY NAME :" +countryName);
//	reference variables must be differ for differ cricketer
		cricketer msd=new cricketer();
		msd.jerseyNo=07;
		msd.CricketerName="mahendra singh dhoni";
		System.out.println("JERSEY NUMBER ; "+msd.jerseyNo);
		System.out.println("CRICKETER NAME"+msd.CricketerName);
		System.out.println("****************");

		System.out.println(" COUNTRY ID :" +countryId);
		System.out.println("COUNTRY NAME :" +countryName);
//	reference variables must be differ for differ cricketer
		cricketer virat=new cricketer();
		virat.jerseyNo=18;
		virat.CricketerName="virat kohli";
		System.out.println("JERSEY NUMBER ; "+virat.jerseyNo);
		System.out.println("CRICKETER NAME"+virat.CricketerName);
		
		System.out.println("main method endedd");
				
	}

}
