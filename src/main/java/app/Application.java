package app;

import io.github.humbleui.jwm.*;

import java.util.function.Consumer;

/**
 * класс приложения
 */

public class Application implements Consumer<Event> {

    /**
     * окно приложения
     */
    private final Window window;

    /**
     * конструктор приложения
      */
    public Application() {
        /**
         * создаём окно
         */

        window = App.makeWindow();
        /**
         * задаём обработчиком событий текущий объект
         */
        window.setEventListener(this);
        /**
         * делаем окно видимым
         */
        window.setVisible(true);
    }

    /**
     * Обработчик событий
     * @param e the input argument
     */
    @Override
    public void accept(Event e) {
        /**
         * если событие - это закрытие окна
         */
        if (e instanceof EventWindowClose) {
            /**
             * завершаем работу приложения
             */
            App.terminate();
        } else if (e instanceof EventWindowCloseRequest) {
            window.close();
        }
    }
}