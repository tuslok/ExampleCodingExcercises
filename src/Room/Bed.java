package Room;

public class Bed {

    private int pillow;
    private String colorDuvet;

    public Bed(int pillow, String colorDuvet) {
        this.pillow = pillow;
        this.colorDuvet = colorDuvet;
    }

    public int getPillow() {
        return pillow;
    }

    public String getColorDuvet() {
        return colorDuvet;
    }

    public void sleep(int pillow, String colorDuvet){
        System.out.println("Sleeping with " + pillow + " pillow/s and " + colorDuvet + " duvet.");
    }

    public void goSleep(){
        System.out.println("Go sleep. Nice dreams.");
    }

}
