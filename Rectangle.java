public class Rectangle {
    private int width;
    private int height;
    public Rectangle(int w, int h) {
        this.width=w;
        this.height=h;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int calcArea() {
        return width*height;
    }
}