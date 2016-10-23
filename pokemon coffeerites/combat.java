import java.util.Scanner;
class combat{
   
	public static void main(String [] args){

   Scanner no= new Scanner(System.in);
   
   int limit=1;
   int pchoice=0;
   String name;
   int hp,def,spd;
   int limita=0;
   int n=0;
   int i=2;
   int ni=0;
   boolean yeah= true;

   String player[] = new String[i]; 
   
   player[0] = "Player 1" ;
   player[1] = "Player 2" ;
   
   
   System.out.println("\t\tWelcome to Pokemon Beta");
   System.out.println();
   
   for(limit=2 ; limit>=1; limit--){
   
      System.out.println("Hello" + player[ni++]);
      System.out.println("Pick your pokemon");
      System.out.println("1. Charmander");
      System.out.println("2. Squirtle");
      System.out.println("3. Pikachu");
      System.out.println("4. Cyndaquil");
      System.out.println("5. Machop");
      System.out.println("------------------");
       
        do{
            try{
                System.out.print("Pokemon Choice:");
                pchoice= no.nextInt();
                yeah=false;
            }catch(Exception e)
             {
             System.out.println("--Invalid Input**");
               }
        }while(yeah);
        
   }   
         switch(pchoice){
         case 1:
            limita=1;
            System.out.println("Charmander");

            break;
            
         case 2:
            limita=1;
            System.out.println("Squirtle");

            break;
            
         case 3:
            limita=1;
            System.out.println("Pikachu");

            break;
            
         case 4:
            limita=1;
            System.out.println("Cyndaquil");

            break;
            
         case 5:
            limita=1;
            System.out.println("Machop");

            break;
            
         default:
            System.out.println("--go die--");
          }
}
}
