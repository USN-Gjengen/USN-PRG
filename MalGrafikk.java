public class MalGrafikk extends EasyGraphics {
    public static void main(String[] args) {
        launch(args);
    }

    public void run() {
        makeWindow("Grafikk", 250, 150);

        drawCircle(150, 70, 60);
    }
}
