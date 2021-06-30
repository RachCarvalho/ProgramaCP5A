package models;

import java.util.ArrayList;

public class Volume extends Peca{
    String volume;


    @Override
    public String toString() {
        return "Volume{" +
                "volume='" + volume + '\'' +
                '}';
    }

    public Volume(String volume){
        this.volume = volume;

    }

    public String getVolume() {
    return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

}
