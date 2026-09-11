public class Planet {
    double myXPos; // current x positio
    double myYPos; // current y positio
    double myXVel; // current velocity
    double myYVel; // current velocity
    double myMass; // mass of planet
    String myFileName;

    public Planet(double xp, double yp, double xv,
                  double yv, double mass, String filename) {
        myXPos = xp;
        myYPos = yp;
        myXVel = xv;
        myYVel = yv;
        myMass = mass;
        myFileName = filename;
    }

    public Planet(Planet p) {
        myXPos = p.myXPos;
        myYPos = p.myYPos;
        myXVel = p.myXVel;
        myYVel = p.myYVel;
        myMass = p.myMass;
        myFileName = p.myFileName;
    }

    public double calcDistance(Planet p) {
        return Math.sqrt(Math.pow(p.myXPos - myXPos, 2) + Math.pow(p.myYPos - myYPos, 2));
    }
}
