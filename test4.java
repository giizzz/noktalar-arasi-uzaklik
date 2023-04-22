public class test4 {
    public static void main(String[] args) {
        Nokta n1= new Nokta(3,4);
        Nokta n2=new Nokta(7,9);
        System.out.println("X koordinatı "+n1.getX());
        System.out.println("Y koordinatı "+n1.getY());
        n1.orijineUzaklik();
        n2.ikiNoktaUzaklik(1,1);// parametre şeklinde yazılırsa
        n2.ikiNoktaUzaklik(n1);
    }

}
