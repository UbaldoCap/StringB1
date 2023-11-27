public class Main {

    public static void main(String[] args) {
        System.out.println(areSame("ciao, mondo", "ciao, mondo"));
    }

    public static StringBuilder areSame (String prima, String seconda) {
        StringBuilder risultato = new StringBuilder("Le due stringhe sono ");
        if (prima.equals(seconda)) {
            risultato.append("uguali");
            return risultato;
        } else  {
            risultato.append("differenti");
            return risultato;
        }
    }
}