interface IPolaczenie {

    char get(int indeks);

    void set(int indeks, char c);

    int length();

}
public class Baza {
    private char[] tab = new char[100]; 

    //wczesna inicjalizacja bazy
    private Baza(){}
    private static Baza baza=new Baza();
    private static Baza getBaza(){return baza;} 
     

    public static IPolaczenie getPolaczenie() {

        return Polaczenie.getInstance();

    }

    private static class Polaczenie implements IPolaczenie {

        private Baza baza=Baza.getBaza();
        //Utworzenie trzech polaczen 
        private static Polaczenie[] polaczenia = {new Polaczenie(),new Polaczenie(),new Polaczenie()};
        private static int kolejnosc=0;
        private Polaczenie(){}

        public static IPolaczenie getInstance() {

            kolejnosc=(kolejnosc+1)%polaczenia.length;
            return polaczenia[kolejnosc];

        }

        public char get(int indeks) {

            return baza.tab[indeks];

        }

        public void set(int indeks, char c) {

            baza.tab[indeks] = c;

        }

        public int length() {

            return baza.tab.length;

        }

    }
}
