public class Main {
    public static void main(String[] args) {
        int numeroIf = -10;
        numero_if(numeroIf);

        System.out.println();
        System.out.println();

        
        int numeroWhile = -10;
        numero_while(numeroWhile);
    }

    public static void numero_if(int numero){
        if (numero > 0){
            System.out.println("El numero 'numeroIf' es positivo: " + numero);
        } else if (numero < 0) {
            System.out.println("El numero 'numeroIf' es negativo: " + numero);
        }else System.out.println("El numero 'numeroIf' es 0: " + numero);
    }

    public static void numero_while(int numero){
        while(numero < 3){
            System.out.println("El numero es: " + numero);
            numero++;
        }
    }


}
