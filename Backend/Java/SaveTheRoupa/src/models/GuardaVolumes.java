package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GuardaVolumes {

    private Map<Integer, String> guardaVolume = new HashMap<>();

    private ArrayList<Volume> listaDeVolumes = new ArrayList<>();

    @Override
    public String toString() {
        return "GuardaVolumes{" +
                "guardaVolume=" + guardaVolume +
                ", listaDeVolumes=" + listaDeVolumes +
                '}';
    }

    public void guardarVolumes(Volume volume) {
        try{
          if(volume != null){
              listaDeVolumes.add(volume);
              guardaVolume.put(listaDeVolumes.indexOf(volume)+1, volume.getVolume());
                  System.out.println(listaDeVolumes.indexOf(volume)+1);
              }

         }catch (NullPointerException e) {
            System.out.println("Guarda volumes vazio");
        }

    }

    public void mostrarPecas() {
        HashMap<Integer, String> lista = (HashMap<Integer, String>) getGuardaVolume();
        System.out.println(lista);
    }

    public Map<Integer, String> getGuardaVolume() {
        return guardaVolume;
    }

    public void devolverPeca(Integer idVolume) {
        try{
            if(guardaVolume.containsKey(idVolume)){
              System.out.println("O volume " + guardaVolume.get(idVolume) + " será devolvido!");
                guardaVolume.remove(idVolume);
            }
        }catch (NullPointerException e) {
            System.out.println("Volume não encontrado");
        }

    }

}
