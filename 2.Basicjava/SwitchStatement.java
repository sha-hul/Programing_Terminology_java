import java.lang.*;
class SwitchStatement{
	public static void main(String[] args){
		int day=2;
		 switch(day){
             case(1):
			System.out.println("mon");
             break;
             case(2):
             System.out.println("tues");
             break;
             case(3):
             System.out.println("wed");
             break;
				case(4):
             System.out.println("thurs");
             break;
             case(5):
             System.out.println("fri");
            break;
             case(6):
             System.out.println("sat");
             break;
            case(7):
             System.out.println("sun");
             break;
             default:
                 System.out.println("Enter The Correct Value");
         }
	}
}