/*
    The class Pilot who is a star. The skills will be calculated in a different way in relation with
    other pilots.
    Override the method calculateSkills that is abstract in the class Pilot
 */
public class StarPilot extends Pilot{
    /*
        Initialize the beginner pilot. This Parameterized constructor calls the super constructor
        which is protected.
        @param Name of the pilot as a String, The car assigned as a Car, The concentration as Concentration
     */
    protected StarPilot(String namePilot, Car carPilot, Concentration concentration) {
        super(namePilot, carPilot, concentration);
    }
    /*
        This method is override from Pilot. Calculate the skills of the pilot with
        specific constant.
        @return The skills of a pilot as a Double
    */
    @Override
    public double calculateSkills() {
        double v = (((getConcentration().getConcentrationPilot() + 6) / 140)*1.06) + 0.05;
        return v;
    }
    /*
       Override the toString method
       @return The output of a pilot as a String
    */
    @Override
    public String toString() {
        return "Pilot: " + getNamePilot() + ", Tipo: Star" + ", Skills: " + calculateSkills() + ", Conc: " + getConcentration().getName() + "("+ getConcentration().getConcentrationPilot() + ")" + ", Descalificado: " + getDisqualifyPilot();
    }
}