package HomeWork;

import java.util.Scanner;

public class MenuWhile {
    public static void main(String[] args)
    {
        int i = 1;

        while (i != 0)
        {
            System.out.println("Menu ");
            System.out.println("1. Pogoda ");
            System.out.println("2. Kursy walut ");
            System.out.println("3. Rozkład jazdy tramwaju ");
            System.out.println("4. Grafik biegania ");
            System.out.println("0. Wyjście z menu ");
            System.out.println("Podaj cyfrę żeby zobaczyć interesujące Cię informacje: ");

            Scanner scan = new Scanner(System.in);

            int number = scan.nextInt();

            switch (number)
            {
                case 1:
                    System.out.println("Pogoda jest do bani, pada i zimno.");
                    break;

                case 2:
                {
                    System.out.println("Kursy walut na dziś:");
                    System.out.println("1 USD 3,6458 ");
                    System.out.println("1 EUR 4,4425 ");
                    System.out.println("1 CHF 3,9487 ");

                    break;
                }

                case 3:
                    System.out.println("Dzisiaj tramwaj nie jeżdźi.");
                    break;

                case 4:
                    System.out.println("Codziennie o 7 trening. W niedzielę wolne ;-)");
                    break;

                case 0:
                {
                    System.out.println("Opuść menu. ");
                    i = 0;
                    break;
                }

                default:
                    System.out.println("Nie ma takiej opcji. Podaj właściwą cyfrę.");

            }
        }
    }
}
