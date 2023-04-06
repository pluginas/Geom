import app.Application;
import io.github.humbleui.jwm.App;

/**
 * главный класс
 */
public class Main {

    /**
     * главный метод приложения
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        App.start(Application::new);
    }

}