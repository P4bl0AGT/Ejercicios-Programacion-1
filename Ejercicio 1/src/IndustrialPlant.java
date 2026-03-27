package Ejercicio1;

import java.util.Random;

public class IndustrialPlant{
    public static void main(String[] args){
        for(int i = 1 ; i <=10; i++){
            new Sensor(i).start();
        }
    }
}


