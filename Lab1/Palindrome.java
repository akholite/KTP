
//Класс исполняем, принимает на вход произвольное число строк и для каждой
//выводит в консоль, является ли она палиндромом
public class Palindrome {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            String s = args[i];

            if (isPalindrome(s))
                System.out.println(s + " is a palindrome");
            else
                System.out.println(s + " is not a palindrome");
        }

    }
//Метод принимает строку и возвращает ее в обратном порядке
    public static String reverse(String s) {
        String r = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            r += Character.toString(s.charAt(i));
        }

        return r;
    }
//Метод возвращает true, если данное ему слово -- палиндром, и false, если нет
    public static boolean isPalindrome(String s) {
        String r = reverse(s);

        if (r.equals(s))
            return true;
        else return false;
    }
}
