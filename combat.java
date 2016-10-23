/*
0-name
1-hp
2-df
3-df

4-m1
5-m2
6-m3
7-m3
*/
import java.util.Scanner;

public class combat extends pokeDex{

	int moveList_count = movesList.move_count;
	Object player[][] = new Object[2][8];
	
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
	}

	public static void main (String [] args)
	{
		catalog(0);
		catalog(1);
	}
}
