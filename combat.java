/*
______________________________________________________________________________________________________
player[y-axis][x-axis] 2d array element guide

y-axis
0 - player 1
1 - player 2

x - axis
0-name
1-hp
2-df
3-df

4-m1
5-m2
6-m3
7-m3
_______________________________________________________________________________________________________
moveSets [y-axis][x-axis][z-axis] 3d array element guide

y-axis
0 - player 1
1- player 2

x-axis
0 - m1
1 - m2
2 - m3
3 - m4

z-axis
0 - move name
1 - move damage
2 - move pp
*/

import java.util.Scanner;

public class combat extends pokeDex{

	int moveList_count = movesList.move_count;
	int isFirst;
	Object player[][] = new Object[2][8];
	Object moveSets [][][] = new moveSets[2][4][3];
	
	public void catalog(int pl)
	{	
		int select=1;
		// Pokemon Selection
		while(select > moveList_count || select < 0)
		{
			
			Scanner in = new Scanner(System.in);

			System.out.println("Player " + pl+1);
			System.out.print.out("Select Pokemon:");
			
			for(int x=0; x<= moveList_count; x++)
			{
				System.out.println(x+1 + ".)" + pDex_array[x].getName() );
			}

			System.out.print("Select? :");
			select = in.nextInt();

			if(select > moveList_count || select < 0)
			{
				System.out.println("Invalid Entry");
				System.out.println();
			}
		}

		// The Player will get the pokemon unique stats & moves
		player[pl][0] = pDex_array[select].getName();
		player[pl][1] = pDex_array[select].getHp();
		player[pl][2] = pDex_array[select].getDf();
		player[pl][3] = pDex_array[select].getSp();
		player[pl][4] = pDex_array[select].getMoves1();
		player[pl][5] = pDex_array[select].getMoves2();
		player[pl][6] = pDex_array[select].getMoves3();
		player[pl][7] = pDex_array[select].getMoves4();
		
		int temp_m1 = player[pl][4];
		int temp_m2 = player[pl][5];
		int temp_m3 = player[pl][6];
		int temp_m4 = player[pl][7];
		
		// Move Stats need fixing
		//m1 stats
		moveSets[pl][0][0] = moves_arr[temp_m1].getName();
		moveSets[pl][0][1] = moves_arr[temp_m1].getDamage();
		moveSets[pl][0][2] = moves_arr[temp_m1].getPoints();

		//m2 stats
		moveSets[pl][1][0] = moves_arr[temp_m2].getName();
		moveSets[pl][1][1] = moves_arr[temp_m2].getDamage();
		moveSets[pl][1][2] = moves_arr[temp_m2].getPoints();

		//m3 stats
		moveSets[pl][2][0] = moves_arr[temp_m3].getName();
		moveSets[pl][2][1] = moves_arr[temp_m3].getDamage();
		moveSets[pl][2][2] = moves_arr[temp_m3].getPoints();

		//m4 stats
		moveSets[pl][3][0] = moves_arr[temp_m4].getName();
		moveSets[pl][3][1] = moves_arr[temp_m4].getDamage();
		moveSets[pl][3][2] = moves_arr[temp_m4].getPoints();
	}

	public void fight(int pl)
	{
			System.out.println("Player "+pl+":"+player[pl][0] + " HP:"+player[pl][1]);
			System.out.println("Moves:");
			
			for(x=4; x<=7; x++)
			{
				System.out.println(x-3 +".) " + player[pl][x] + "PP" + var1 +"/" + var2);
			}
	}

	// Debug/Test uses only
	public void statTest(int pl)
	{	
		int num = pl+1;
		System.out.println("Player " + num + ":");
		System.out.println("Name:" + player[pl][0]);
		System.out.println("HP:" + player[pl][1]);
		System.out.println("DEF:" + player[pl][2]);
		System.out.println("SPEED:" + player[pl][3]);

		System.out.println("Move 1:" + moveSets[pl][0][0]);
		System.out.println("DMG:" + moveSets[pl][0][1]);
		System.out.println("PP:" + moveSets[pl][0][2]);

		System.out.println("Move 2:" + moveSets[pl][1][0]);
		System.out.println("DMG:" + moveSets[pl][1][1]);
		System.out.println("PP:" + moveSets[pl][1][2]);

		System.out.println("Move 3:" + moveSets[pl][2][0]);
		System.out.println("DMG:" + moveSets[pl][2][1]);
		System.out.println("PP:" + moveSets[pl][2][2]);

		System.out.println("Move 4:" + moveSets[pl][3][0]);
		System.out.println("DMG:" + moveSets[pl][3][1]);
		System.out.println("PP:" + moveSets[pl][3][2]);
	}

	public static void main (String [] args)
	{
		catalog(0);
		catalog(1);
	}
}
