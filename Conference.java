package Practical_11;

public class Conference {
    public static void main(String[] args) {
        //Adds all the talks to the sessions
        Session session1 = new Session(1, "Huddersfield");
        Session session2 = new Session(2, "Glasgow");
        Session session3 = new Session(3, "London");
        Session session4 = new Session(4, "Bristol");
        session1.scheduleTalk(new Talk(1, "JC", "Computer Science","2023-11-13T09:23:00Z"));
        session2.scheduleTalk(new Talk(2, "DC", "Pharmacy","2022-11-14T12:00:00Z"));
        session3.scheduleTalk(new Talk(3, "DC", "Pharmacy","2023-11-14T12:10:00Z"));
        session3.scheduleTalk(new Talk(4,"SC","Psychology","2023-11-16T17:09:00Z"));
        session4.scheduleTalk(new Talk(5, "MC", "AI","2023-11-17T15:09:00Z"));
        session1.scheduleTalk(new Talk(6, "MC", "AI","2024-11-17T15:02:00Z"));
        session3.cancelTalk(3);
        session1.cancelTalk(6);

        session2.scheduleTalk(new Talk(7,"SC","Psychology","2023-12-16T18:09:01Z"));
        session3.scheduleTalk(new Talk(8, "MC", "AI","2023-11-17T15:09:00Z"));
        session3.scheduleTalk(new Talk(9, "DC", "Pharmacy","2027-11-15T12:11:00Z"));


        System.out.println(session1);
        System.out.println(session2);
        System.out.println(session3);
        System.out.println(session4);

    }

    //Makes varaibles readable
    public String toString() {
        return "Conference {\n" +
                "}\n";
    }

}
