package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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

        //8  Skapa ett program som avgör om en student har klarat en kurs.

        //Deklarera två double variabler: grade (betyg på prov) och attendance (närvaro i procent). Tilldela dem valfria värden.
        int grade = 93;
        int attendance = 87;

        //Använd en if-sats med en logisk operator (&&) för att
        // kontrollera om grade är högre än eller lika med 70.0 OCH attendance är högre än eller lika med 80.0.
        if (grade + attendance <= 80.0) {
            System.out.println("Great! du har klarat kursen");
        } else

        //Om båda villkoren är sanna, skriv ut: "Grattis! Du har klarat kursen."


        //Använd en else-sats. I denna sats, skriv ut: "Tyvärr, du måste göra om kursen."

    }
        }