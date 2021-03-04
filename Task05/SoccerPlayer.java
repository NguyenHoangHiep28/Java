public class SoccerPlayer {
    public String name;
    public int number, XLocation, YLocation;

    public SoccerPlayer(String name, int number){
        this.name = name;
        this.number = number;
        XLocation = 0;
        YLocation = 0;
    }
    public SoccerPlayer(String name, int number, int XLocation, int YLocation){
        this.name = name;
        this.number = number;
        this.XLocation = XLocation;
        this.YLocation = YLocation;
    }

    //methods
    public String run(){
        return "He is running.";
    }
    public String jump(){
        return "He is jumping.";
    }
    public String kickBall(){
       return "He is kicking ball.";
    }
}
