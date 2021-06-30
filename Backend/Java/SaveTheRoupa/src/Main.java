import models.GuardaVolumes;
import models.Volume;

public class Main {

    public static void main(String[] args){
         GuardaVolumes gVolumes = new GuardaVolumes();

            Volume volume = new Volume("Tênis");
            gVolumes.guardarVolumes(volume);

            Volume volume4 = new Volume("Chaves");
            gVolumes.guardarVolumes(volume4);

            Volume volume2 = new Volume("Celular");

            Volume volume3 = new Volume("Bolsa");

            gVolumes.guardarVolumes(volume2);
            gVolumes.guardarVolumes(volume3);

            gVolumes.mostrarPecas();
            gVolumes.devolverPeca(4);
            gVolumes.mostrarPecas();
     }

}
