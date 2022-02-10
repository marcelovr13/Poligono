public class Segmento {

    private int startPoint;
    public int getStartPoint(){
        return startPoint;
    }
    public void setStartPoint(int startPoint){
        this.startPoint = startPoint;
    }

    private int endPoint;
    public int getEndPoint(){
        return endPoint;
    }
    public void setEndPoint(int endPoint){
        this.endPoint = endPoint;
    }

    public Segmento(){
        startPoint = 0;
        endPoint = 0;
    }

    public Segmento(int punto1, int punto2){
        this.startPoint = punto1;
        this.endPoint = punto2;
    }

    public int distanciaPuntos(Segmento segmento){
        return startPoint - endPoint;
    }


    public void setOffset(int offX, int offY){
        this.startPoint += offX;
        this.endPoint += offY;
    }

    @Override
    public String toString() {
        return "Segmento: " + "(" + startPoint + "," + endPoint + ")";
    }
}
