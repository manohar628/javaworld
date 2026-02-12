package myProject;

public class student {
	static int collegeId=503217;
	static String collegeName="SMEC";
	
	int studentId;
	String studentName;

	public static void main(String[] args) {
		System.out.println("welcome to SMEC COLLEGE PORTAL");
		System.out.println("COOLEGE ID : "+collegeId);
		System.out.println("COLEGE NAME : "+collegeName);
		
		student s1=new student();
		
		s1.studentId=515;
		s1.studentName="Venkatamanohar";
		System.out.println("STUDENT ID : "+s1.studentId);
		System.out.println("STUDENT NAME : "+s1.studentName);
		
		System.out.println("_________________________");
		
		student s2=new student();
		collegeId=001;
		collegeName="MLRIT";
		System.out.println("COOLEGE ID : "+collegeId);
		System.out.println("COLEGE NAME : "+collegeName);
		s2.studentId=512;
		s2.studentName="madan";
		System.out.println("STUDENT ID : "+s2.studentId);
		System.out.println("STUDNET NAME : "+s2.studentName);
		
		System.out.println("_______________________");
		
		
		student s3=new student();
	
		System.out.println("COOLEGE ID : "+collegeId);
		System.out.println("COLEGE NAME : "+collegeName);
		s3.studentId=510;
		s3.studentName="madan";
		System.out.println("STUDENT ID : "+s3.studentId);
		System.out.println("STUDNET NAME : "+s3.studentName);
		
		
		
		

	}

}
