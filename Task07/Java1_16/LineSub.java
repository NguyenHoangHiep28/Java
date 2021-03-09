package Java1_16;

public class LineSub extends Point2D{
    Point2D end;
    public LineSub(int x1, int y1, int x2, int y2){
        super(x1, y1);
        this.end = new Point2D(x2, y2);
    }

    public LineSub(Point2D begin, Point2D end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    //Getters and Setters
    public Point2D getBegin(){
        return this;
    }

    public Point2D getEnd() {
        return end;
    }
    public void setBegin(Point2D begin){
        super.setX(begin.getX());
        super.setY(begin.getY());
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }
    //Other Get and Set methods
    public int getBeginX(){
        return super.getX();
    }
    public void setBeginX(int x){
        super.setX(x);
    }
    public int getBeginY(){
        return super.getY();
    }
    public void setBeginY(int y) {
        super.setY(y);
    }
//    public int[] getBeginXY(){
//        return super.getXY(x,y);
//    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }
//    public int[] getEndXY(){
//        return end.getXY();
//    }
//    public void setEndXY(int x, int y){
//        end.setXY(x, y);
//    }
    /**
     * Returns a self-descriptive string
     */
    public String toString(){
        return "LineSub[begin=" + super.toString() + ",end=" + end + "]";
    }
    /**
     * Returns the length of this line
     */
//    public double getLength(){
//        return super.distance(end);
//    }
}
