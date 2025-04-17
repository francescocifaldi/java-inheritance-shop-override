import java.util.Scanner;
import java.math.BigDecimal;
import org.lessons.java.shop.*;

public class Carrello {
        private Prodotto[] prodotti = new Prodotto[0];

        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                Carrello carrello = new Carrello();
                boolean fidelytyOwner = false;

                System.out.println("Benvenuto nel carrello!");
                System.out.println("Hai una carta fedeltà? (si/no)");
                String cartaFedelta = scanner.nextLine();

                if (cartaFedelta.equalsIgnoreCase("si")) {
                        fidelytyOwner = true;
                }

                while (true) {
                        System.out.println("Vuoi aggiungere un prodotto al carrello? (si/no)");
                        String risposta = scanner.nextLine();

                        if (!risposta.equalsIgnoreCase("si"))
                                break;

                        System.out.println(
                                        "Che tipo di prodotto vuoi aggiungere? \n1. Cuffie\n2. Smartphone\n3. Televisore");
                        int scelta = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Inserisci il nome del prodotto: ");
                        String nome = scanner.nextLine();
                        System.out.print("Inserisci la marca del prodotto: ");
                        String marca = scanner.nextLine();
                        System.out.print("Inserisci il prezzo: ");
                        double prezzo = scanner.nextDouble();
                        System.out.print("Inserisci l'IVA (%): ");
                        int iva = scanner.nextInt();
                        scanner.nextLine();

                        Prodotto nuovoProdotto;

                        switch (scelta) {
                                case 1:
                                        System.out.print("Sono wireless? (true/false): ");
                                        boolean wireless = scanner.nextBoolean();
                                        scanner.nextLine();
                                        System.out.print("Inserisci il colore: ");
                                        String colore = scanner.nextLine();
                                        nuovoProdotto = new Cuffie(nome, marca, prezzo, iva, colore, wireless);
                                        break;
                                case 2:
                                        System.out.print("Inserisci la memoria (GB): ");
                                        int memoria = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.println("Inserisci il codice IMEI: ");
                                        String codiceIMEI = scanner.nextLine();
                                        nuovoProdotto = new Smartphone(nome, marca, prezzo, iva, codiceIMEI, memoria);
                                        break;
                                case 3:
                                        System.out.print("Inserisci le dimensioni (pollici): ");
                                        int dimensioni = scanner.nextInt();
                                        System.out.print("È smart? (true/false): ");
                                        boolean smart = scanner.nextBoolean();
                                        scanner.nextLine();
                                        nuovoProdotto = new Televisore(nome, marca, prezzo, iva, dimensioni, smart);
                                        break;
                                default:
                                        System.out.println("Scelta non valida.");
                                        continue;
                        }

                        carrello.prodotti = aggiungiProdotto(carrello.prodotti, nuovoProdotto);

                        System.out.println("Prodotto aggiunto!\n");
                }

                double totale = 0.0;
                System.out.println("\nEcco il tuo carrello:");
                for (Prodotto p : carrello.prodotti) {
                        System.out.println(p);
                        if (fidelytyOwner) {
                                totale += p.getPrezzoScontato();
                        } else {
                                totale += p.calcolaPrezzoFinale();
                        }
                }
                System.out.printf("Totale" + (fidelytyOwner ? "scontato " : "") + ": € %.2f%n", totale);

                scanner.close();
        }

        private static Prodotto[] aggiungiProdotto(Prodotto[] originali, Prodotto nuovo) {
                Prodotto[] nuovi = new Prodotto[originali.length + 1];
                for (int i = 0; i < originali.length; i++) {
                        nuovi[i] = originali[i];
                }
                nuovi[nuovi.length - 1] = nuovo;
                return nuovi;
        }
}