package BaiTap.InterfaceResizeableGeometry;

public class TotalTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0]= new Circle(5,"red",true);
        shapes[1]= new Rectangle(5,10,"blue",false);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Before : " + shapes[i]);
        }
        for (Shape shape : shapes) {
            shape.resize(Math.random() * 100);
            System.out.println(shape);
        }

    }
}
