import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static int pointsUtilisateur = 0;
    public static int pointsOrdinateur = 0;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       // pointsOrdinateur = 0;
        String choix;
        boolean termine = false;

        do{


            int nombreAleatoire = (int) (Math.random()*3);
            String [] tableau = {"pierre", "papier", "ciseaux"};
            String trouveMoi = tableau[nombreAleatoire];

            System.out.println("***********************");
            System.out.println("Pierre, papier, ciseaux ");
            System.out.println(" un, deux, trois !");
            System.out.println(" touche q pour quitter le jeu");
            System.out.println("***********************\n");

            System.out.println("Entrez votre choix");
            choix = scan.nextLine();

            switch (choix){
                case "pierre" -> comparePierre(choix, trouveMoi);
                case "papier" -> comparePapier(choix, trouveMoi);
                case "ciseaux"-> compareCiseaux(choix, trouveMoi);
                case "q" -> {
                    System.out.println("Merci pour votre parti");
                    termine = true;
                    afficherScore(pointsUtilisateur,pointsOrdinateur);
                }
                default -> System.out.println("Vous devez entrez que les mots pierre, papier et ciseaux ");

            }
        }while(!termine);

    }

    private static void afficherScore(int pointsUtilisateur, int pointsOrdinateur) {
        if(Objects.equals(pointsUtilisateur, pointsOrdinateur)){
            System.out.println("vous êtes ex aequo \n" +
                    "Vous avez : "+ pointsUtilisateur+" \n" +
                    "L'ordi : " + pointsOrdinateur+".");
        } else if(pointsUtilisateur>pointsOrdinateur){
            System.out.println("vous avez gagné \n" +
                    "Vous avez : "+ pointsUtilisateur+" \n" +
                    "L'ordi : " + pointsOrdinateur+".");
        } else{
            System.out.println("vous avez perdu \n" +
                    "L'ordi : "+ pointsOrdinateur +" \n" +
                    "Vous : " + pointsUtilisateur+".");
        }
    }

    private static void compareCiseaux(String choix, String trouveMoi) {
        if(choix.equals(trouveMoi)){
            System.out.println("Vous avez choisi la même chose !");
        } else if (trouveMoi.equals("papier")) {
            System.out.println("Le ciseaux coupe le papier");
            pointsUtilisateur += 1;
        } else {
            System.out.println("La pierre casse le ciseaux");
            pointsOrdinateur += 1;
        }
    }

    private static void comparePapier(String choix, String trouveMoi) {
        if( choix.equals(trouveMoi)){
            System.out.println("Vous avez choisi la même chose !");
        } else if (trouveMoi.equals("pierre")) {
            System.out.println("Le papier enveloppe la pierre");
            pointsUtilisateur += 1;
        } else {
            System.out.println("le ciseaux coupe le papier");
            pointsOrdinateur += 1;
        }
    }

    private static void comparePierre(String choix, String trouveMoi) {
        if( choix.equals(trouveMoi)){
            System.out.println("Vous avez choisi la même chose !");
        } else if (trouveMoi.equals("pierre")) {
            System.out.println("La pierre casse le ciseaux");
            pointsUtilisateur += 1;
        } else {
            System.out.println("Le papier enveloppe la pierre");
            pointsOrdinateur += 1;
        }
    }

}