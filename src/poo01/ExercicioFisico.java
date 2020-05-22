
package poo01;

public class ExercicioFisico {
    public String tipo;
    public String local;
    public String material;
    public int pse;
    protected float duracao;
    protected int frequencia;
    
  public void status (){
       System.out.println("Tipo de exercício: " + this.tipo);
       System.out.println("Local da prática: " + this.local);
       System.out.println("Material utilizado: " + this.material);
       System.out.println("Intensidade do exercício: " + this.pse);
       System.out.println("Duração do exercício: " + this.duracao + " min.");
       System.out.println("Frequência semanal: " + this.frequencia);
   }
   public void intensidade(){
        if (pse<=2){
            System.out.println("O exercício está leve!");
        }
        else if (pse>2 && pse<=5) {
            System.out.println("Intesidade moderada!");
            }
        else{
            System.out.println("O exercício está pesado!");
            }
    }
}
