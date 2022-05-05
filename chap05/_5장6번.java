package ch4;
class Point{
    private int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    protected void move(int x, int y){
        this.x = x;
        this.y = y;
    }
}
 
class ColorPoint extends Point{
    private String color;
    public ColorPoint(){
        super(0, 0);
        this.color = "BLACK";
    }
    public ColorPoint(int x, int y){
        super(x, y);
    }
    public String toString(){
        return this.color + "���� (" + super.getX() + "," + super.getY() + ")�� ��";
    }
    public void setXY(int x, int y){
        super.move(x, y);
    }
    public void setColor(String color){
        this.color = color;
    }
}
public class _5��6��{
    public static void main(String[] args){
        ColorPoint zeroPoint = new ColorPoint();
        System.out.println(zeroPoint.toString() + "�Դϴ�.");
 
        ColorPoint cp = new ColorPoint(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "�Դϴ�.");
    }
}

