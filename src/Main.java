import javax.swing.text.Segment;

public class Main {
    public static void main(String[] args) {

        Punto punto1 = new Punto(4,5);
        Punto punto2 = new Punto(6,8);

        punto1.setOffset(4,4);
        punto2.setOffset(4,4);

        System.out.println(punto1);
        System.out.println(punto2);

        Segmento segmento1 = new Segmento(4,5);
        Segmento segmento2 = new Segmento(6,8);

        segmento1.setOffset(4,4);
        segmento2.setOffset(4,4);

        System.out.println(segmento1);
        System.out.println(segmento2);







    }
}
