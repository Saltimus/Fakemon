public class moves{
   private int dmg;
   private int pp;
   private String skillName;

   public moves(String name, int d, int p)
   {
      skillName = name;
      dmg = d;
      pp = p;
   }	
		
   public String getName()
   {
      return skillName;
   }

   public int getDamage()
   {
      return dmg;
   }

   public int getPoints()
   {
      return pp;
   }
}