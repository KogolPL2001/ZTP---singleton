public class App {
    public static void main(String[] args) throws Exception {
        IPolaczenie pol1,pol2,pol3,pol4;
        pol1=Baza.getPolaczenie();
        pol2=Baza.getPolaczenie();
        pol3=Baza.getPolaczenie();
        pol4=Baza.getPolaczenie();
        pol1.set(1, 'x');
        System.out.println(pol1.get(1));
        System.out.println(pol2.get(1));
        System.out.println(pol3.get(1));
        System.out.println(pol4.get(1));
        pol3.set(1, 'y');
        System.out.println(pol1.get(1));
        System.out.println(pol2.get(1));
        System.out.println(pol3.get(1));
        System.out.println(pol4.get(1));
        System.out.println(pol1.hashCode());
        System.out.println(pol2.hashCode());
        System.out.println(pol3.hashCode());
        System.out.println(pol4.hashCode());
    }
}
