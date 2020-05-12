package demo02;

public class GraphicsEditor {
    public void show(Geometry geometry){
        geometry.display();
    }

    public static void main(String[] args) {
        Geometry a = new Polygon();
        GraphicsEditor b = new GraphicsEditor();
        b.show(a);
    }
}
