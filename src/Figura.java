// Создать новый проект на тему шахмат
//
//Класс Фигура
//
//(самостоятельно решить, какие нужны свойства)
//
//обязательно должны быть название и цвет
//
//Сделать класс с методом main, в котором будет создан массив из нескольких Фигур. Подсчитать количество белых, количество черных.
// Вычислить процент количества белых и процент количества черных от общего количества.
//
//Подсчитать количество пешек, количество коней
//
//* опционально: проверить возможность хода для Фигуры

import java.awt.*;

public class Figura {

    private String name;
    private  String color;

    public Figura(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isBlack(){
        return "черный".equalsIgnoreCase(color);
    }
    public boolean isWhite(){
        return "белый".equalsIgnoreCase(color);
    }
    }


