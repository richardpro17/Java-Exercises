public class Prueba2Coche {
    public static void main(String[] args){
        Coche miCoche = new Coche();
        miCoche.AgregaPuerta();
        System.out.println(miCoche.numPuertas);
    }
}

class Coche{
    public int numPuertas = 4;
    
    public void AgregaPuerta(){
        this.numPuertas++;
    }
}
