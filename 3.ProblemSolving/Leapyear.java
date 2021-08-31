class Leapyear{
	public static void main(String[] args){
	//divide by 4
	//not divide by 100
	//leap year

	int year=3100;

	//MY leap year program...
	//if(year%4!=0){
	//	System.out.println("This is not a leap year");
	//}
	//else if(year%100==0 && year%400!=0){
		//System.out.println("This is not a leap year");
	//}
	//else{
	//			System.out.println("This is a leap year");
	//}

	//Simple way...
	
	if(year%4==0 || (year%400==0 && year%100!=0)){
		System.out.println("This is a leap year");
	}
	else{
				System.out.println("This is not a leap year");
	}
	}
		
}