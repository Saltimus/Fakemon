/*
nm - name of pokemon
df - defense points
hp - hit points
sp - speed
*/
// object: new pokemon("name",hp,def,spd);

public class masterDex{

  pokemon pDex_array[] = new pokemon[5];
  moves moves_arr[] = new moves[12];
  int move_count = moves_arr.length;
  int poke_count = pDex_array.length;
    
    public masterDex(){ 	
   	  // pokemon
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
      pDex_array[4] = new pokemon("Psyduck",50,20,30);
      pDex_array[4].setmoves(0,2,5,8);
 
      // moves
      moves_arr[0] = new moves("scratch",40,20);
      moves_arr[1] = new moves("pound",40,20);
      moves_arr[2] = new moves("ember",60,10);
      moves_arr[3] = new moves("bite",50,15);
      moves_arr[4] = new moves("tackle",40,20);
      moves_arr[5] = new moves("bubble",55,10);
      moves_arr[6] = new moves("stomp",50,15);
      moves_arr[7] = new moves("headbutt",60,10);
      moves_arr[8] = new moves("quickattack",30,30);
      moves_arr[9] = new moves("shockwave",55,10);
      moves_arr[10] = new moves("bodyslam",60,10);
      moves_arr[11] = new moves("crunch",65,10);

      }
}