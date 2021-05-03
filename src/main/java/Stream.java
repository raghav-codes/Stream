public class Stream {

    static int x = 20;
    //public String start();

    public static void main(String args[]){

        //Vehicle v = ()-> "Honda car";
        x = x+1;
        startCar((x) ->{
            int temp = x*2;
            x  = x + 20;
            System.out.println("Honda car started@"+x*2);


            return "Honda";
        }
        );


        startCar((speed) -> "Toyota car started@"+speed*2);

        System.out.println("Hello World!!");

   }


   public static void startCar(Vehicle v){

        int speed = 50;
       System.out.println(v.start( speed));
   }
}
