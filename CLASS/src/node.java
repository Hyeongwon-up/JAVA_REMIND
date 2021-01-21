public class node {
    private int x;
    private int y; // private 보안을 위해.

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public node getCenter(node other) {
        return new node((this.x+other.getX())/2,(this.y+other.getY())/2);
    }
}
