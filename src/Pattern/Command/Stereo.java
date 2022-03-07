package Pattern.Command;

public class Stereo {
    private String location = "";

    public Stereo(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " Stereo system on");
    }


    public void off(){
        System.out.println(location + " Stereo system off");
    }

    public void setCD(){

    }

    public void setDvd(){

    }

    public void setRadio(){

    }

    public void setVolume(int volume){
        System.out.println("Volume set " + volume);
    }
}
