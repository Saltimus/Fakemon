/*
nm - name of pokemon
df - defense points
hp - hit points
sp - speed
*/
// object: new pokemon("name",hp,def,spd);

public class masterDex{

  pokemon pDex_array[] = new pokemon[6];
  moves moves_arr[] = new moves[12];
  int move_count = moves_arr.length;
  int poke_count = pDex_array.length;
    
    public masterDex(){ 	
   	  // pokemon
   	  pDex_array[0] = new pokemon("Charmander",39,5,65);
      pDex_array[0].setmoves(0,1,2,3);
     	pDex_array[1] = new pokemon("Squirtle", 44,2,43);
     	pDex_array[1].setmoves(4,5,3,6);
     	pDex_array[2] = new pokemon("Pikachu", 35, 3, 90);
     	pDex_array[2].setmoves(8,9,7,4);
     	pDex_array[3] = new pokemon("Cyndaquil", 39, 6, 65);
     	pDex_array[3].setmoves(2,4,10,1);
     	pDex_array[4] = new pokemon("Machop",70,1,35);
      pDex_array[4].setmoves(11,8,1,10);
      pDex_array[4] = new pokemon("Psyduck",50,7,30);
      pDex_array[4].setmoves(0,2,5,8);
      pDex_array[5] = new pokemon("Voltorb",25,7,70);
      pDex_array[5].setmoves(7,9,10,2);
 
      // moves
      moves_arr[0] = new moves("scratch",7,20);
      moves_arr[1] = new moves("pound",8,20);
      moves_arr[2] = new moves("ember",11,10);
      moves_arr[3] = new moves("bite",8,15);
      moves_arr[4] = new moves("tackle",7,20);
      moves_arr[5] = new moves("bubble",8,10);
      moves_arr[6] = new moves("stomp",13,15);
      moves_arr[7] = new moves("headbutt",15,10);
      moves_arr[8] = new moves("quickattack",7,30);
      moves_arr[9] = new moves("shockwave",9,10);
      moves_arr[10] = new moves("bodyslam",12,10);
      moves_arr[11] = new moves("crunch",10,10);

      }
}