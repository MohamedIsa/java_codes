public class Player
 {
  String name,team;
  int scoredGoals;
  public Player()
   {
    name="NewName";
    team="NewTeam";
    scoredGoals=0;
   }
   public Player(String n,String t, int g)
    {
     name=n;
     team=t;
     scoredGoals=g;
    }
    public String getName()
    {
    return name;
    }
    public String getTeam()
    {
    return team;
    }
    public int getSGoals()
    {
    return scoredGoals;
    }    
    public static void bestPlayer(Player[] list)
    {
     int maxgoals=0;
     String maxteam="";
     String maxname="";
     for(Player player:list)
     {
      if(player.getSGoals()>maxgoals)
      {
      maxgoals=player.getSGoals();
      maxteam=player.getTeam();
      maxname=player.getName();
      
      }
      
     }
     System.out.println("The name of the player with the most goals is "+maxname);
     System.out.println("the team of the player that have the most goals is "+maxteam);
     System.out.println("the maximum number of goals is "+maxgoals);
    }
 }