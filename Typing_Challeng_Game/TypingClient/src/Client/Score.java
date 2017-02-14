package Client;

public class Score {

    String name;
    int hour;
    int score;

    Score(String name, int hour, int score) {
        this.name = name;
        this.hour = hour;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
