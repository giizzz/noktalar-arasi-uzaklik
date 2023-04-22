public class Nokta {

    private int x=0;
    private int y=0;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x>=0)
            this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y>=0)
            this.y = y;
    }

    public Nokta(int x, int y){
        setX(x);
        setY(y);
    }

    public void orijineUzaklik(){
        double distance = Math.sqrt(x*x+y*y);
        System.out.println("Noktanın orijine olan uzaklığı->"+distance);

    }
    public void ikiNoktaUzaklik(int a,int b){
        double distance = Math.sqrt(Math.pow(x-a,2)+Math.pow(y-b,2));
        System.out.println("İki nokta arasındaki uzaklık "+distance);
    }

    public void ikiNoktaUzaklik(Nokta n3){
        
    }

}
