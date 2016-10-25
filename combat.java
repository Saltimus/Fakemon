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
3-sp

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

public class combat extends masterDex{

	int moveList_count = move_count;
	int isFirst;
	boolean done = false;
	boolean knock_out = false;
	Object player[][] = new Object[2][8];
	Object moveSets [][][] = new Object[2][4][3];

	public void startScreen()
	{
		System.out.println("*******       ");
		System.out.println("********      ");
		System.out.println("**     **     ");
		System.out.println("********      ");
		System.out.println("*******       ");
		System.out.println("**            ");
		System.out.println("**            ");
		System.out.println();
	}
	
	public void catalog(int pl)
	{	
		int select=0;
		boolean end = false;
		// Pokemon Selection
		while(!end)
		{
			int pl_num = pl+1;
			Scanner in = new Scanner(System.in);

			System.out.println("Player " + pl_num);
			System.out.println("Select Pokemon:");
			
			for(int x=0; x < poke_count; x++)
			{
				System.out.println(x+1 + ".)" + pDex_array[x].getName() );
			}

			System.out.print("Select? :");
			select = in.nextInt();
			select--;

			if(select < poke_count || select > 0)
			{
				end = true;
			}
			
			else
			{
				System.out.println("Invalid Entry");
				System.out.println();
			}
		}

		done = true;

		// The Player will get the pokemon unique stats & moves
		player[pl][0] = pDex_array[select].getName();
		player[pl][1] = pDex_array[select].getHp();
		player[pl][2] = pDex_array[select].getDf();
		player[pl][3] = pDex_array[select].getSp();
		player[pl][4] = pDex_array[select].getMoves1();
		player[pl][5] = pDex_array[select].getMoves2();
		player[pl][6] = pDex_array[select].getMoves3();
		player[pl][7] = pDex_array[select].getMoves4();
		
		int temp_m1 = (Integer)player[pl][4];
		int temp_m2 = (Integer)player[pl][5];
		int temp_m3 = (Integer)player[pl][6];
		int temp_m4 = (Integer)player[pl][7];
		
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
	public void statHud(int pl)
	{
		int pl_num = pl+1;
		System.out.println("Player " +pl_num + ":"+ player[pl][0] + " HP:"+ player[pl][1]);
	}
	
	public void fight(int pl)
	{		
			Scanner in = new Scanner(System.in);
			int select=0;
			int pp_cap[] = new int[4];
			int temp_pp;
		
			for(int x=0; x < 4; x++)
			{
				pp_cap[x] = (Integer)moveSets[pl][x][2];
			}
			int pl_num = pl+1;
			//System.out.println("Player " +pl_num + ":"+ player[pl][0] + " HP:"+ player[pl][1]);
			System.out.println("Player " +pl_num + " Moves:");
			
			for(int x=4; x<=7; x++)
			{	
				int num = x-3;
				System.out.println(num + ".) " + moveSets[pl][num-1][0] + moveSets[pl][num-1][2] + "/" + pp_cap[num-1]);
			}
			System.out.print("Select:");
			select = in.nextInt();
			System.out.print(player[pl][0] + " does " + moveSets[pl][select-1][0] );

			temp_pp = (Integer)moveSets[pl][select-1][2];
			temp_pp--;
			moveSets[pl][select-1][2] = temp_pp;
		
		int temp_a=0;
		int temp_b=0;
		if(pl==0)
		{
			temp_a = (Integer)player[1][1] - ( (Integer)moveSets[pl][select-1][1] - (Integer)player[1][2] );
			player[1][1] = temp_a;

		}

		else if(pl==1)
		{
			temp_b = (Integer)player[0][1] - ( (Integer)moveSets[pl][select-1][1] - (Integer)player[0][2] );
			player[0][1] = temp_b;
		}

		if(temp_b < 0 )
		{
			knock_out = true;
			System.out.println();
			System.out.println(player[0][0] + " has fainted!");
		}

		else if(temp_a < 0 )
		{
			knock_out = true;
			System.out.println();
			System.out.println(player[1][0] + " has fainted!");
		}

	}

	// Debug/Test uses only
	public void statTest(int pl)
	{	
		int num = pl+1;
		System.out.println("Player " + num + " Stats :");
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
		combat cmb = new combat();
		boolean end = false;
		cmb.startScreen();
		
		while(!cmb.done)
		{
			cmb.catalog(0);
			System.out.println();
			System.out.println();
			cmb.catalog(1);
			System.out.println();
		}

		//cmb.statTest(0);
		//cmb.statTest(1);
		//cmb.fight(0);
		while(!cmb.knock_out)
		{
		cmb.statHud(0);
		cmb.statHud(1);
		System.out.println();
		cmb.fight(0);
		System.out.println();
		System.out.println();
		cmb.fight(1);
		System.out.println();
		}


	}
}
