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

    public double calcForceExertedBy(Planet p) {
        return (6.67 * Math.pow(10,-11) * p.myMass * myMass) / Math.pow(p.calcDistance(this),2);
    }

    public double calcForceExertedByX(Planet p) {
        return calcForceExertedBy(p) * (p.myXPos - myXPos) / calcDistance(p);
    }

    public double calcForceExertedByY(Planet p) {
        return calcForceExertedBy(p) * (p.myYPos - myYPos) / calcDistance(p);
    }

    public double calcNetForceExertedByX(Planet[] planets) {
        double result = 0;
        for (Planet p : planets) {
            if (!p.equals(this)) {
                result += calcForceExertedByX(p);
            }
        }
        return result;
    }

    public double calcNetForceExertedByY(Planet[] planets) {
        double result = 0;
        for (Planet p : planets) {
            if (!p.equals(this)) {
                result += calcForceExertedByY(p);
            }
        }
        return result;
    }

    public void update(double seconds, double xforce, double yforce) {
        double accX = xforce / myMass;
        double accY = yforce / myMass;

    }

}
