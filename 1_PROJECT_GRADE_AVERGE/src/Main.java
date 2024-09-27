import java.util.Scanner;

public class Main {

    public static void main (String[] args)
    {

        int fizik , kimya , matematik , turkce , muzik , Tarih ;
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen fizik notunuzu giriniz :");
        fizik = input.nextInt();

        System.out.print("Lutfen kimya notunuzu giriniz :");
        kimya = input.nextInt();

        System.out.print("Lutfen matematik  notunuzu giriniz :");
        matematik = input.nextInt();

        System.out.print("Lutfen turkce notunuzu giriniz :");
        turkce = input.nextInt();

        System.out.print("Lutfen muzik notunuzu giriniz :");
        muzik = input.nextInt();

        System.out.print("Lutfen Tarih  notunuzu giriniz :");
        Tarih  = input.nextInt();

        System.out.println(" ");

        double ortalama ;
        ortalama =((fizik+kimya+matematik+turkce+muzik+Tarih)/6) ;
        System.out.println("Ortalamaniz :" + ortalama);

        while (ortalama < 60)
        { System.out.println("you can not past lesson ") ; break ;}

        while(ortalama >= 60)
        {System.out.println("you can past this lesson "); break ;}










    }





}
