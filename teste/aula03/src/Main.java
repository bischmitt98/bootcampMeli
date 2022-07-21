import models.Circle;
import models.GeometricFigure;
import models.Square;
import util.ShowScreen;

public class Main {
    public static void main(String[] args) {
        // GeometricFigure gf1 = new GeometricFigure();
        ShowScreen sh = new ShowScreen();

        Circle c = new Circle(sh);
        Square s = new Square(sh);
        GeometricFigure gf = new Circle(sh);

        c.position();
        s.position();
        gf.position();
    }
}
