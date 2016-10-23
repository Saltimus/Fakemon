/*
nm - name of pokemon
df - defense points
hp - hit points
sp - speed
*/
// object: new pokemon("name",hp,def,spd);

public class pokeDex{

   public pokeDex(){
   	pokemon pDex_array[] = new pokemon[5];
   	
   	// How to create pokemon
   	pDex_array[0] = new pokemon("Charmander",39,43,65);
      pDex_array[0].setmoves(0,1,2,3);
     	pDex_array[1] = new pokemon("Squirtle", 44,65,43);
     	pDex_array[1].setmoves(4,5,3,6);
     	pDex_array[2] = new pokemon("Pikachu", 35, 40, 90);
     	pDex_array[2].setmoves(8,9,7,4);
     	pDex_array[3] = new pokemon("Cyndaquil", 39, 43, 65);
     	pDex_array[3].setmoves(2,4,10,1);
     	pDex_array[4] = new pokemon("Machop",70,55,35);
      pDex_array[4].setmoves(11,8,1,10);
      }
}