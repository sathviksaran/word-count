import java.util.*;
public class MatchesProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of teams: ");
        int n=sc.nextInt();
        ArrayList<String>teams=new ArrayList<>();
        ArrayList<Object>obj=new ArrayList<>();
        System.out.println("Enter Team Names: ");
        for(int i=0;i<n;i++)
        {
            teams.add(sc.next());
            Match m=new Match(teams.get(i));
            obj.add(m);
        }
        new Match(obj);
    }
}
class Match
{
    String s;
    Match(String s)
    {
        this.s=s;
    }
    public String toString()
    {
        return s;
    }
    Match(ArrayList<Object> obj)
    {
        System.out.println("Match Schedule: ");
        for(int i=0;i<=obj.size()-1;i++)
        {
            for(int j=0;j<obj.size()/2;j++)
            {   
                int t1=(i+j)%(obj.size()-1);
                int t2=(obj.size()-1-j+i)%(obj.size()-1);
                if(j==0)
                {
                    t2=obj.size()-1;
                }
                System.out.println(obj.get(t1)+" vs "+obj.get(t2));
            }
        }
    }
}
