package org.example;


public class Main {
//
     //Tillhör uppgift 10
//    public static double calculateAverage(double num1, double num2, double num3) {
//        //Inuti metoden, beräkna medelvärdet: (num1 + num2 + num3) / 3.0. Returnera resultatet.
//        return (num1 + num2 + num3) / 3.0;
//    }

    public static void main(String[] args) {


        // 1. Grundläggande syntax, datatyper och felsökning

        //1.1
//        int x;
//        x = 15;
//        System.out.println(x);
//        // 15
//
//        int x = 10;
//        int y = x - 1;
//        System.out.println(y);
//        // 9

//        int x, y;
//        x = (int)120.954;
//        y = x * 2;
//        System.out.println(x + y);
        //360

//        String s = "amm";
//        s = "fäkt";
//        System.out.println("An" + s + "a");
//        // Anfäkta

//        String a = "an", b = "be", d= "do";
//        System.out.println(a + b + a + d + b);
//        anbeandobe

//        int x = 2, y = 4, z = 8;
//        System.out.println( (x * y + z) / y - z + y / (x * z / x) );
//        //-4


//        // 2.
//
//        int age = 29;
//        double weight =70.1;
//        char initial = 'L';
//
//        System.out.println("age: " + age + " Weight: " + weight +  " initial: " + initial);

        //3 Skriv ett program som frågar efter användarens namn
        // och skriver ut en hälsning på konsolen. Tex om namnet är "Kalle" ska det skriva ut "Hej Kalle!"
//
//        String name = System.console().readln("Vad heter du? ");
//        System.out.println("Hej " + name + "!");

        //4 Skapa ett program som beräknar ytan av en rektangel.

//        //Deklarera två variabler av typen double,
//        // en för width (bredd) och en för height (höjd). Tilldela dem valfria värden.
//        double height = 2;
//        double width = 5;
//
//        //Skapa en tredje variabel, area, och tilldela den resultatet av att multiplicera width med height.
//        double area = height * width /2;
//        //Skriv ut värdet av area till konsolen.
//        System.out.println("Area is: " + area);

        // 5 Skapa ett program som avgör om en person är gammal nog att köra bil.

//        //Deklarera en int variabel age och tilldela den ett värde (t.ex. 17).
//        int age = 4;
//
//        //Använd en if-sats för att kontrollera om age är större än eller lika med 18.
//        if (age >= 18) {
//            System.out.println("you can take your drivers license today");
//        } else {
//            int yearsLeft = 18 - age;
//            System.out.println("you have to wait " + yearsLeft + " until youre allowed to drive.");
//        };

        // 6 Skriv ett program som frågar användaren efter två tal och skriver ut deras medelvärde
        // samt det största av de två talen.. Exempel: om talen är 3 och 5 ska programmet skriva ut 4 och 5.
//
//        float a = Float.parseFloat(System.console().readLine("Första talet: "));
//        float b = Integer.parseInt(System.console().readLine("Andra talet: "));
//
//        float medel = (a + b) / 2.0f;
//        float storst = (a > b) ? a : b;
//
//        System.out.println("Medelvärde: " + medel);
//        System.out.println("Störst: " + storst);

        //7 Skriv ett program som räknar ut hur mycket moms det blir om vi handlar för en viss summa.
        // Momsen kan vara 6%, 12% eller 25% beroende på vad det är för varor.
        // Programmet  ska fråga efter hur mycket pengar användaren har handlat för och vilken moms det är.
        // Programmet ska sen skriva ut informationen. Tänk på att vi vill supporta inläsning
        // och utskrifter enligt svensk standard med komma (,) som decimalavgränsare.
        // Kan behöva använda NumberFormat.

//        String beloppText = System.console().readLine("Belopp exkl. moms (t.ex. 123,45): "); //låter användaren skriva summa i consolen
//        beloppText = beloppText.replace(',', '.'); // byter ut punkt mot kommatecken enligt svensk standard.
//        double belopp = Double.parseDouble(beloppText); // tar in värdet användaren skrev i consolen. gör om texten till en double.
//
//        String momsText = System.console().readLine("Moms (6, 12 eller 25): "); // frågar användaren om vilken moms
//        momsText = momsText.replace("%", "").replace(',', '.').trim(); // byter ut . till komma och tar bort % tecknet.
//        double moms = Double.parseDouble(momsText); // tolkar momsen
//        if (moms > 1) moms /= 100.0; // gör om till 0.xx istället för om använadren skrev procenten alltås 6, 12 eller 25
//
//        double momsBelopp = belopp * moms; // variabeln som lagrar momsen i kronor utifrån beloppet.
//        double totalt = belopp + momsBelopp; // momsbeloppet plus användarens belopp
//
//        String b = String.format("%.2f", belopp).replace('.', ',') + " kr"; // räknar ut belopp ex moms
//        String m = String.format("%.2f", momsBelopp).replace('.', ',') + " kr"; // räknar ut momsen
//        String t = String.format("%.2f", totalt).replace('.', ',') + " kr"; // räknar ut belopp + moms
//        int momsProcent = (int)(moms * 100); // lagrar momssatsen som användaren valde
//
//        System.out.println("Belopp exkl. moms: " + b); // skriver ut pris ex moms
//        System.out.println("Moms (" + momsProcent + " %): " + m); // skriver momsen
//        System.out.println("Totalt inkl. moms: " + t); // skriver ut totalen ink moms

//        //8  Skapa ett program som avgör om en student har klarat en kurs.
//
//        //Deklarera två double variabler: grade (betyg på prov) och attendance (närvaro i procent). Tilldela dem valfria värden.
//        int grade = 80;
//        int attendance = 87;
//
//        //Använd en if-sats med en logisk operator (&&) för att
//        // kontrollera om grade är högre än eller lika med 70.0 OCH attendance är högre än eller lika med 80.0.
//        if (grade >= 70.0 && attendance >= 80.0) {
//            //Om båda villkoren är sanna, skriv ut: "Grattis! Du har klarat kursen."
//            System.out.println("Great! du har klarat kursen");
//            //Använd en else-sats. I denna sats, skriv ut: "Tyvärr, du måste göra om kursen."
//
//        } else {
//            System.out.println("Tyvärr nu får du göra om den här kursen");
//        }

//        // 9 Skapa ett program som bedömer ett betyg.
//        //Deklarera en char variabel grade och tilldela den ett värde (t.ex. 'B').
//        char grade = 'D';
//
//        //Använd en switch-sats för att kontrollera grade.
//        switch (grade) {
//            case 'A':    //För fallet 'A', skriv ut: "Utmärkt!".
//                System.out.println("Utmärkt!");
//                break;
//            case 'B':          //För fallet 'B', skiver ut: "Bra jobbat!".
//                System.out.println("Bra jobbat!");
//                break;
//            case 'C':
//            case 'D'://För fallen 'C' och 'D', skriv ut: "Godkänt.".
//                    System.out.println("godkänt!");
//                    break;
//                    default:
//                        System.out.println("underkänt!");        //Använd default-satsen för alla andra fall och skriv ut: "Underkänt."
//        }

        //10 Skapa ett program som använder en statisk metod för att beräkna medelvärdet av tre tal.

        //Skapa en statisk metod med namnet calculateAverage som tar tre double parametrar (num1, num2, num3).
//        // FINNS UTANFÖR MAIN
//
//        //Inuti metoden, beräkna medelvärdet: (num1 + num2 + num3) / 3.0. Returnera resultatet.
//        //finns utanför main
//
//        //I din main-metod, deklarera tre double variabler, tilldela dem valfria värden.
//        double a = 85.0;
//        double b = 23.5;
//        double c = 95.0;
//
//        //Kalla på calculateAverage metoden med dessa tre variabler och lagra resultatet i en ny variabel averageResult.
//        double averageResult = calculateAverage(a, b, c);
//
//        //Använd en if/else if/else-struktur för att bedöma medelvärdet:
//        if (averageResult > 90.0){
//            System.out.println("Mycket Bra jobbat");
//        } else if (averageResult >= 70.0) {
//            System.out.println("Bra jobbat! ");
//        } else {
//            System.out.println("Öva lite mer");
//        }
//
//        System.out.println("medelvärdet är: " + averageResult);


    }
        }