//Класс Primes исполняем и выводит в консоль все простые числа от 2 до 100.
public class Primes {
    public static void main(String[] args) {
        System.out.println("Простые числа между 2 и 100:");

        for (int n = 2; n <= 100; n++)
        {
            if (isPrime(n))
                System.out.print(n + " ");
        }
    }
//Метод определяет, просто ли переданное ему натуральное число,
//и возвращает соответственно true или false.
    public static boolean isPrime(int n) {
        boolean prime = true;

        if (n < 2)
            prime = false;

        for (int m = 2; m < n; m++) {
            if (n % m == 0)
            {
                prime = false;
                break;
            }
        }

        return prime;
    }
}
