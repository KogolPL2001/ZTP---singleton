public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(TestSetGet());
        System.out.println(TestHashCode());
    }
    public static String TestSetGet(){
        IPolaczenie pol1,pol2,pol3,pol4;
        pol1=Baza.getPolaczenie();
        pol2=Baza.getPolaczenie();
        pol3=Baza.getPolaczenie();
        pol4=Baza.getPolaczenie();
        pol1.set(1, 'x');
        pol2.set(2,'y');
        String odpowiedz;
        if('x'==pol3.get(1)&&'y'==pol4.get(2))
        {
            odpowiedz= "Polaczenia korzystaja z tej samej bazy";
        }
        else
        {
            odpowiedz= "Polaczenia nie korzystaja z tej samej bazy";
        }
        return odpowiedz;

    }
    public static String TestHashCode(){
        IPolaczenie pol1,pol2,pol3,pol4;
        pol1=Baza.getPolaczenie();
        pol2=Baza.getPolaczenie();
        pol3=Baza.getPolaczenie();
        pol4=Baza.getPolaczenie();
        String odpowiedz;
        if(pol1.hashCode()==pol4.hashCode())
        {
            odpowiedz= "Polaczenia sa uzywane w kolejnosci";
        }
        else
        {
            odpowiedz= "Polaczenia nie sa uzywane w kolejnosci";
        }
        return odpowiedz;
    }
}
