public class Plane {
    private float fuelLevel;
    private String pilotCallSign;
    private String squadNumber;
    private boolean flaps;
    private boolean landingGear;
    private boolean ejectionSystem;
    private boolean seatOccupation;
    public Plane(float fuelLevel, String pilotCallSign, String squadNumber) {
        this.fuelLevel = fuelLevel;
        this.pilotCallSign = pilotCallSign;
        this.squadNumber = squadNumber;
        this.flaps = false;
        this.landingGear = true;
        this.ejectionSystem = false;
        this.seatOccupation = true;
// Completa el código para cumplir con los requisitos.
    }
    public void toggleFlaps() {
        flaps = !flaps;
    }
    public void toggleLandingGear() {
        landingGear = !landingGear;
    }
    public void ejectionSystem() {
        ejectionSystem = !ejectionSystem;
    }
    public boolean isEjectionArmed(){
        return ejectionSystem;
    }
    public void setSeatOccupation(boolean pilotSeated) {
        seatOccupation = pilotSeated;
    }

    private  String showFlaps(){
        if (flaps){
            return "abajo";
        }else{
            return "arriba";
        }
    }

    private String undercarriage(){
        if (landingGear){
            return "arriba";
        }else{
            return "abajo";
        }
    }

    private String showEjecuteSistem(){
        if(ejectionSystem){
            return "armado";
        }else{
            return "desarmado";
        }
    }

    private String showEjectPilot(){
        if (seatOccupation){
            return "ocupado";
        }else{
            return "desocupado";
        }
    }
    @Override
    public String toString() {
        return "Plane{" +
                "fuelLevel=" + fuelLevel +
                ", pilotCallSign='" + pilotCallSign + '\'' +
                ", squadNumber='" + squadNumber + '\'' +
                ", flaps=" + showFlaps() +
                ", landingGear=" + undercarriage() +
                ", ejectionSystem=" + showEjecuteSistem() +
                ", seatOccupation=" + showEjectPilot() +
                '}';
    }
    }
