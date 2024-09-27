import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        float[]valor = new float [3];
        float[]op = new float [4];


        System.out.println("Introducir tres valores: ");
        float valor1 = input1.nextFloat();
        float valor2 = input2.nextFloat();
        float valor3 = input3.nextFloat();



        valor[0] = valor1;
        valor[1] = valor2;
        valor[2] = valor3;

        System.out.println("El valor 1 es: " + valor1);
        System.out.println("El valor 2 es: " + valor2);
        System.out.println("El valor 3 es: " + valor3);

        /*Codigo hace lo mismo que lo de arriba pero resumido
        for(int i = 0; i < valor.length; i++){
            System.out.println("El valor " + (i+1) + " es igual a valor {" +i+ "] =" + valor[i]);
        }*/

        //Suma el primer valor más el segundo valor y al resultado réstale el tercer valor.
        op[0] = valor[0] + valor[1] - valor[2];

        //Resta el segundo valor menos el tercer valor y multiplica el resultado por el primer valor.
        op[1] = (valor[1] - valor[2]) * valor[0];

        //Multiplica el primer valor por el segundo valor y el resultado multiplícalo por el tercer valor.
        op[2] = (valor[0] * valor[1]) * valor[2];

        //Divide el tercer valor entre el primer valor y al resultado súmale el segundo valor.
        op[3] = (valor[2] / valor[0]) + valor[1];

        for(int j = 0; j < op.length; j++){
            System.out.println("La operacion " + (j+1) + " es: " + op[j]);
        }

    }
}