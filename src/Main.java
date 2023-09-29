public class Main {
    public static void main(String[] args) {
        Product mleko = new Product("Łaciate", 5, 4.25, 23);
        Product czekolada = new Product("Milka", 10, 10.99, 17);
        Product platki = new Product("Mlekołaki", 25, 7.99, 20);
        System.out.println(mleko);
        System.out.println(czekolada);
        System.out.println(platki);

        double priceWithVat = mleko.calculateBrutto();
        System.out.println("Wartość produktu to " + priceWithVat);

        priceWithVat = czekolada.calculateBrutto();
        System.out.println("Wartość produktu to " + priceWithVat);

        priceWithVat = platki.calculateBrutto();
        System.out.println("Wartość produktu to " + priceWithVat);
    }



}