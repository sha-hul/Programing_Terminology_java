class Toyato{
   int cc=1500;
   void car(){
      System.out.println("This is Toyato car");
   }
}
class Honda extends Toyato{
   void car(){
      System.out.println("This is Honda car");
   }
   void speed(){
      
      super.car();
      System.out.println("The car is 120km/p"+ " "+super.cc);
   }
   public static void main(String[] args) {
      Honda h=new Honda();
      h.speed();
   }
}