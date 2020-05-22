
package poo01;


public class Poo01 {

    public static void main(String[] args) {
     ExercicioFisico e1 = new ExercicioFisico();
     e1.tipo = "Musculação";
     e1.pse = 4;
     e1.duracao = 50;
     e1.frequencia = 3;
     e1.local = "Casa";
     e1.material = "Elástico";
     
     e1.status();
     e1.intensidade();
        System.out.println("Bom dia");
    }
    
}
