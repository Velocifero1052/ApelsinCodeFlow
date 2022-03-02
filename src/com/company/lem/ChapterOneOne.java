package com.company.lem;

public class ChapterOneOne {

    public static void execute(){

        System.out.println("Some test code was executed");

        //1.1 not formatted

      /*  System.out.print(31);
        System.out.print(" ");
        System.out.print(18);
        System.out.print(" ");
        System.out.print(79);*/

        //1.1 formatted

        /*  System.out.printf("%d %d %d", 31, 18, 79);*/

        //1.1 String.format solution
        /*System.out.println(String.format("%d %d %d", 31, 18, 79));*/

        //1.2 not formatted
        /*System.out.print(47);
        System.out.print(" ");
        System.out.print(52);
        System.out.print(" ");
        System.out.print(150);*/

        //1.2 formatted
        /*System.out.printf("%d %d %d", 47, 52, 150);*/

        //1.2 String.format solution
        /* System.out.print(String.format("%d %d %d", 47, 52, 150));*/

        //1.3.1 not formatted
/*        System.out.println(50);
        System.out.print(10);*/

        //1.3.2 formatted
        /* System.out.printf("%d\n%d", 50, 10);*/

        //1.3.3 String.format solution
        /*System.out.print(String.format("%d\n%d",50, 10));*/

        //1.6 straight solution
        /*System.out.printf("%.3f", 3.1415926);*/

        //1.6 with variable introduction
        /*var piNumber = 3.1415926;
        System.out.printf("%.3f", piNumber);*/

        //1.7 e = 2.71828
        /*System.out.printf("%.1f", 2.71828);*/

        //1.7 with variable introduction
        /*var eNumber = 2.71828;
        System.out.printf("%.1f", eNumber);*/

        //scanner example
       /* var scanner = new Scanner(System.in);
        var message = scanner.nextLine();
        System.out.println(message);*/

        //1.8
//        var scanner = new Scanner(System.in);
//        var number = scanner.nextInt();
//        System.out.printf("Вы ввели число: %d", number);

        //1.10
        /*System.out.print("Введите имя: ");
        var scanner = new Scanner(System.in);
        var name = scanner.nextLine();
        System.out.print(name);*/

        //1.12
       /* var scanner = new Scanner(System.in);
        var name = scanner.nextLine();
        System.out.printf("Привет, %s!", name);*/




    }

}
