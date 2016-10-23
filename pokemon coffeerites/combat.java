public class combat extends pokeDex{
   
   static Scanner n= new Scanner(System.in);
	public static void main(String [] args){
   
   int limit=1;
   String pchoice;
   String name;
   int hp,def,spd;

   
   player players[]= new player[2]; 
   
   players[0] = new player();
   players[1] = new player();
   
   
   System.out.println("\t\tWelcome to Pokemon Beta");
   System.out.println();
   
   do{
   if(limit==1 || limit==2){
      if(limit==1){
      System.out.println("Hello Player 1");
      System.out.println("Pick your pokemon");
      System.out.println("1. Charmander");
      System.out.println("2. Squirtle");
      System.out.println("3. Pikachu");
      System.out.println("4. Cyndaquil");
      System.out.println("5. Machop");
      System.out.println("------------------");
   try{
      System.out.print("Pokemon Choice:");
      pchoice= n.nextLine();
   }catch(Exception e){
   System.out.println("--**Choice not Found--");
   input.next();
   }
     do{ 
         switch(pchoice){
         case '1':
            System.out.println("Charmander");
            pokeDex.pDex_array[0];
            break;
         case '2':
            System.out.println("Squirtle");
            break;
         case '3':
            System.out.println("Pikachu");
            break;
         case '4':
            System.out.println("Cyndaquil");
            break;
         case '5':
            System.out.println("Machop");
            break;
         default:
            System.out.println("--Invalid Input--");
          }
      }while();
    
      }
      else if(limit==2){
      System.out.println("Hello Player 2");
      }
   } 
    else;
    
   
   }while(limit!=2);
   
   }
}