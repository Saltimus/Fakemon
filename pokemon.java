/*
nm - name of pokemon
df - defense points
hp - hit points
sp - speed
*/

public class pokemon{
	private String name;
	private int def;
	private int health;
	private int speed;

	private int poke_moves1;
	private int poke_moves2;
	private int poke_moves3;
	private int poke_moves4;

	public pokemon(String nm, int hp, int df, int sp)
	{
		name = nm;
		def = df;
		health = hp;
		speed = sp;
	}
		
	public void setmoves(int m1, int m2, int m3, int m4)
	{
		poke_moves1 = m1;
		poke_moves2 = m2;
		poke_moves3 = m3;
		poke_moves4 = m4;
	}

	public int getMoves1()
	{
		return poke_moves1;
	}

	public int getMoves2()
	{
		return poke_moves2;
	}

	public int getMoves3()
	{
		return poke_moves3;
	}

	public int getMoves4()
	{
		return poke_moves4;
	}
}