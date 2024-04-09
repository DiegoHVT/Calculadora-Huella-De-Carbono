import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienbenido a la calculadora");
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Tienes Lavavajillas? (True o False): ");
        boolean sitienelavavajilla = scanner.nextBoolean();
        int lavavajilla = 0;
        float resultado1 = 0;
        if (sitienelavavajilla) {
            System.out.println("¿Cuantos tienes?");
            lavavajilla = scanner.nextInt();
            resultado1 = lavavajilla * 60;
            //el lavavajillas. Este electrodoméstico también emplea calor para ejercer su función, y sus emisiones se cuantifican en 60 kgCO₂e
            System.out.println("El total de contaminacion de tu lavavajilla en KgCo2 es de : " + resultado1);

        } else {
            System.out.println("Mejor que no tienes guey");
        }
        System.out.println("¿Tienes Televisor? (True o False) :");
        boolean sitienetelevisor = scanner.nextBoolean();
        int televisor1 = 0;
        float resultado2 = 0;
        if (sitienetelevisor) {
            System.out.println("¿Cuantos tienes?");
            //factor de emisión es la cantidad de gases de efecto invernadero emitidos por cada unidad medida del "dato de actividad". Por ejemplo, para la energía eléctrica, el factor de emisión sería de 0,41 kg CO2 eq/kWh consumido.
            televisor1 = scanner.nextInt();
            resultado2 = (float) (televisor1 * 0.41 / 198.75);
            System.out.println("El total de contaminacion de tu televisor en KgCo2 es de : " + resultado2);

        } else {
            System.out.println("La capa de ozono te lo agradece");
        }

        System.out.println("Tienes lavadora? (True o False) :");
        boolean sitienelavadora = scanner.nextBoolean();

        int nevera1 = 0;
        float resultado3 = 0;
        if (sitienelavadora) {
            System.out.println("¿Cuantas tienes?");
            nevera1 = scanner.nextInt();
            resultado3 = nevera1 * 65;
            //La lavadora destina casi toda la energía eléctrica que utiliza en calentar el agua. Sus emisiones se sitúan en 62 kgCO₂e,
            System.out.println("El total de contaminacion de tu lavadora en KgCo2 es de : " + resultado3);

        } else {
            System.out.println(" Mucho mejor que no tienes");
        }
        float resultado = resultado1 + resultado2 + resultado3;
        System.out.println("El total de tu huella de carbono en KgCo2 es de :"+resultado);


        scanner.close();

    }


}
