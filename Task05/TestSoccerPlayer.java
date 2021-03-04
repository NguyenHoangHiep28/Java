public class TestSoccerPlayer {
    public static void main(String[] args){
        SoccerPlayer player1 = new SoccerPlayer("Ronaldo", 7);
        System.out.println(player1.name + " | Number: " + player1.number +
                " | XLocation: " + player1.XLocation + " | YLocation: " +
                player1.YLocation + " | "+ player1.kickBall());
        SoccerPlayer player2 = new SoccerPlayer("Messi", 10, 100, 125);
        System.out.println(player2.name + " | Number: " + player2.number +
                " | XLocation: " + player2.XLocation + " | YLocation: " +
                player2.YLocation + " | "+ player2.run());
        SoccerPlayer player3 = new SoccerPlayer("Mbappé", 7, 80, 90);
        System.out.println(player3.name + " | Number: " + player3.number +
                " | XLocation: " + player3.XLocation + " | YLocation: " +
                player3.YLocation + " | "+ player3.jump());
    }
}
