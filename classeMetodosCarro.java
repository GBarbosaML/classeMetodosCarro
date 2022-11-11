package com.mycompany.mavenproject1;


public class Mavenproject1 {
    
static public class Carro{
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    void exibirAutonomia(){
        System.out.println("a autonomia "
                + "do carro é:" +capCombustivel*consumoCombustivel+"KM");
    }    
}


    public static void main(String[] args) {
        
       Carro jeta = new Carro();
       jeta.numPassageiros=5;
       jeta.modelo= "jeta";
       jeta.marca="wolkswagem";
       jeta.capCombustivel=50;
       jeta.consumoCombustivel=0.7;
       
        System.out.println("o modelo é "+jeta.modelo +" da marca:"+jeta.marca);
       jeta.exibirAutonomia();
        System.out.println("suportando ate "+jeta.numPassageiros+" passageiros");
       
       
       
           }
}
