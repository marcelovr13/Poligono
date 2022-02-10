public class Punto {

    private int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }


    private int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }


    public Punto(){
        x = 0;
        y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveTo(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setOffset(int x, int y){
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "Punto: " + "(" + x + "," + y + ")";
    }
}
