public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię ");
        String name = scanner.nextLine();
        System.out.println("Jak masz na nazwisko?");
        String lastname = scanner.nextLine();
        System.out.println("Podaj swój wiek ");
        String age = scanner.nextLine();
        System.out.println("Cześć " + name + " " + lastname);}
}
