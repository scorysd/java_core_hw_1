package homework;

import homework.Calculater;
import homework.UI;

public class App {
    public static void main(String[] args) {
        UI.show(Calculater.plus(4, 5));
        UI.show(Calculater.mult(4, 5));
        UI.show(Calculater.minus(4, 5));
        UI.show(Calculater.div(10, 5));
    ;
    }
}
