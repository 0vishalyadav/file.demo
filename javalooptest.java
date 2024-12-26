public class javalooptest{
    public static void main(String[] args) {
        int door=2030;
        if (door == 2030) {
            System.out.println("dooropen");
            
        }
        else{
            System.out.println("please renter your password");

        }
        int mynum=-10;
        if (mynum>0) {
            System.out.println("it a postive number");
            
        }
        else if (mynum<0) {
            System.out.println("it  negative positive number");
            
        }
        else{
            System.out.println("it not write program");

        }
        int dice=0;
        while (dice<6) {
            if (dice>6) {
               System.out.println("winner"); 
            }
            else{
                System.out.println("loser");

            }
           dice ++; 
        }




    }

}



