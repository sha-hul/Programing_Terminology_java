class LargestNumber{
	public static void main(String[] args){
		int a=113;
		int b=32;
		int c=21;
		if(a>b && a>c){
			System.out.println("The a="+ a +" is largest number");
		}
		else if(b>a && b>c){
			System.out.println("The b="+ b +" is largest number");
		}
		else {
			System.out.println("The c="+ c +" is largest number");
		}
	}
}