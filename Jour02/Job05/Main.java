package Jour02.Job05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("entrer vôtre âge : ");
        int age = scanner.nextInt();

        if(age < 16){System.out.println("Trop jeune pas de travail pour toi");}

        else if(age < 55){System.out.println("Va taffer");}

        else if(age > 55 && age < 67){System.out.println("Tu auras du mal à trouvé un taff l'ami(e)");}

        else if(age > 67){System.out.println("Profite de ta retraite l'ancien");}

        scanner.close();
    }
}
