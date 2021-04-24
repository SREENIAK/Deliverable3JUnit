package JUNIT_UNO;

/*
    Name: Akshita Sreenivasulu
    Student ID Number: 991592661
*/

public class RunUNO
{
    public static void main(String[] args)
    {
        UNO.getInstance().run();    //create new game
        UNO.Players().addPlayers(UNO.createPlayers());  //add players
        UNO.start();    //start match
    }
}

