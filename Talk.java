package Practical_11;

public class Talk implements Comparable<Talk> {

    //Defining variables
    int id;
    String speaker;
    String title;
    String startTime;


    //Making variables usable
    public Talk(int id, String speaker, String title, String startTime) {
        this.id = id;
        this.speaker = speaker;
        this.title = title;
        this.startTime = startTime;
    }

    //Makes variables readable
    @Override
    public String toString() {
        return "{Talk " + id +
                ": id = " + id + '\'' +
                ", speaker = " + speaker + '\'' +
                ", title = " + title + '\'' +
                ", startTime = " + startTime +
                "}\n";
    }

    //Allows startTime to be compared
    @Override
    public int compareTo(Talk o) {
        return this.startTime.compareTo(o.startTime);
    }
}




