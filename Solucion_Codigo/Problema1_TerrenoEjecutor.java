package taller3poo;

public class Problema1_TerrenoEjecutor {

    public static void main(String[] args) {
        //variables
        //objeto
        Problema1_TerrenoBase Terreno = new Problema1_TerrenoBase();
        
        
        //sets
        Terreno.setAncho(16.0);
        Terreno.setLargo(32.0);
        Terreno.setValorMetroCuadrado(30.0);
        

        //metodo
   
        Terreno.calcularArea();
        Terreno.calcularCostoTerreno();
        System.out.println(Terreno);
     
        
    }
}

    