class Patient {
    public String name;
    public int age;
    
    Patient () {
        name = "name_here";
        age = 18;
    }
}

class CovidParameters extends Patient {
    public float CTScore, dDimer;
    public int platelet;
    
    CovidParameters () {
        super();
        CTScore = 0;
        dDimer = 0;
        platelet = 0;
    }
    
    CovidParameters (float CTScore, float dDimer, int platelet) {
        this.CTScore = CTScore;
        this.dDimer = dDimer;
        this.platelet = platelet;
    }
}

public class P6 {
    public static void main(String[] args) {
        CovidParameters p1 = new CovidParameters(), p2 = new CovidParameters(1, 2, 3);

        System.out.println("Details of Patient 1");
        System.out.println("CTScore: " + p1.CTScore);
        System.out.println("dDimer: " + p1.dDimer);
        System.out.println("Platelet: " + p1.platelet);

        System.out.println("\nDetails of Patient 2");
        System.out.println("CTScore: " + p2.CTScore);
        System.out.println("dDimer: " + p2.dDimer);
        System.out.println("Platelet: " + p2.platelet);
    }
}