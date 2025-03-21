/*
* Complete the code in your editor by writing an overridden
* getNumberOfTeamMembers method that prints the same statement
* as the superclass' getNumberOfTeamMembers method, except that it replaces
* with  (the number of players on a Soccer team).
*
*
*
* I0
* Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class*/

class Sports{
    public String getName(){
        return "Generic Sports";
    }
    public void getNumberOfTeamMembers(){
        System.out.println("Each team has n players in Generic Sports");
    }

}

class Soccer extends Sports{
    public String getName(){
        return "Soccer Class";
    }
    public void getNumberOfTeamMembers(int n){
        System.out.printf("Each team has %d players in %s%n",n,getName());
    }

}

public class MethodOverriding {
    public static void main(String[] args) {
        Sports sport =new Sports();
        Soccer football =new Soccer();

        System.out.println(sport.getName());
        sport.getNumberOfTeamMembers();
        System.out.println(football.getName());
        football.getNumberOfTeamMembers(11);

    }
}
