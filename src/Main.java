import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor1 = 0 ;
        double valor2 = 0;
        int opc=0;
        double resultado = 0;
        System.out.println("===== Calculadaora =====");
        System.out.println("1. Suma\n2. Resta\n3. Division\n4. Multiplicación\n5. Salir");

        System.out.println("Que operación vas a realizar? ");
        opc = Integer.parseInt(sc.nextLine());

        if (opc >= 1 && opc <= 4){
            System.out.println("Ingresa el primer valor: ");
            valor1 = Double.parseDouble(sc.nextLine());
            System.out.println("Ingresa el segundo valor: ");
            valor2 = Double.parseDouble(sc.nextLine());
        }else if (opc == 5) {
            System.out.println("Saliendo .....");
            System.exit(0);
        }else {
            System.out.println("No existe esa opción");
            main(args);
        }

        switch (opc){
            case 1 -> {
                resultado = valor1 + valor2;
            }
            case 2 -> {
                resultado = valor1 - valor2;
            }
            case 3 -> {
                resultado = valor1 / valor2;
            }
            case 4 -> {
                resultado = valor1 * valor2;
            }
        }
        System.out.println("Resultado de la opreacion: " + resultado);
        main(args);
    }
}