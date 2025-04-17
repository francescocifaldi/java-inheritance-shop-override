import org.lessons.java.shop.*;

public class App {
    public static void main(String[] args) throws Exception {
        Prodotto p1 = new Prodotto("MyProduct", "MyBrand", 100.0, 22);
        Prodotto p2 = new Prodotto(200.0);
        Cuffie c1 = new Cuffie("BestHeadphone", "JBL", 50.0, 22, "Nero", true);
        Cuffie c2 = new Cuffie(30.0, "Blu");
        Televisore t1 = new Televisore("MySmartTV", "TCL", 500.0, 22, 55, true);
        Televisore t2 = new Televisore(400.0, 42);
        Smartphone s1 = new Smartphone("IPhone 18", "Apple", 300.0, 22, "123456789012345", 128);
        Smartphone s2 = new Smartphone(250.0, 64);

        System.out.println("Prodotto 1: " + p1.getNome() + ", Marca: " + p1.getMarca() + ", Prezzo: " + p1.getPrezzo()
                + ", IVA: " + p1.getIva());
        System.out.println("Prodotto 2: " + p2.getNome() + ", Marca: " + p2.getMarca() + ", Prezzo: " + p2.getPrezzo()
                + ", IVA: " + p2.getIva());
        System.out.println("Cuffie 1: " + c1.getNome() + ", Marca: " + c1.getMarca() + ", Prezzo: " + c1.getPrezzo()
                + ", IVA: " + c1.getIva() + ", Colore: " + c1.getColore() + ", Wireless: " + c1.isWireless());
        System.out.println("Cuffie 2: " + c2.getNome() + ", Marca: " + c2.getMarca() + ", Prezzo: " + c2.getPrezzo()
                + ", IVA: " + c2.getIva() + ", Colore: " + c2.getColore() + ", Wireless: " + c2.isWireless());
        System.out.println("Televisore 1: " + t1.getNome() + ", Marca: " + t1.getMarca() + ", Prezzo: " + t1.getPrezzo()
                + ", IVA: " + t1.getIva() + ", Dimensioni: " + t1.getDimensioni() + ", Smart: " + t1.isSmart());
        System.out.println("Televisore 2: " + t2.getNome() + ", Marca: " + t2.getMarca() + ", Prezzo: " + t2.getPrezzo()
                + ", IVA: " + t2.getIva() + ", Dimensioni: " + t2.getDimensioni() + ", Smart: " + t2.isSmart());
        System.out.println("Smartphone 1: " + s1.getNome() + ", Marca: " + s1.getMarca() + ", Prezzo: " + s1.getPrezzo()
                + ", IVA: " + s1.getIva() + ", Codice IMEI: " + s1.getCodiceIMEI() + ", Memoria: " + s1.getMemoria());
        System.out.println("Smartphone 2: " + s2.getNome() + ", Marca: " + s2.getMarca() + ", Prezzo: " + s2.getPrezzo()
                + ", IVA: " + s2.getIva() + ", Codice IMEI: " + s2.getCodiceIMEI() + ", Memoria: " + s2.getMemoria());

        System.out.println("Prezzo totale del prodotto " + p1.getFullname() + " con IVA: " + p1.calcolaPrezzoFinale());
        System.out.println("Prezzo totale del prodotto " + p2.getFullname() + " con IVA: " + p2.calcolaPrezzoFinale());
        System.out.println("Prezzo totale delle cuffie " + c1.getFullname() + " con IVA: " + c1.calcolaPrezzoFinale());
        System.out.println("Prezzo totale delle cuffie " + c2.getFullname() + " con IVA: " + c2.calcolaPrezzoFinale());
        System.out
                .println("Prezzo totale del televisore " + t1.getFullname() + " con IVA: " + t1.calcolaPrezzoFinale());
        System.out
                .println("Prezzo totale del televisore " + t2.getFullname() + " con IVA: " + t2.calcolaPrezzoFinale());
        System.out.println(
                "Prezzo totale dello smartphone " + s1.getFullname() + " con IVA: " + s1.calcolaPrezzoFinale());
        System.out.println(
                "Prezzo totale dello smartphone " + s2.getFullname() + " con IVA: " + s2.calcolaPrezzoFinale());
    }
}
