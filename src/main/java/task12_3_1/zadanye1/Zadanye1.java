package task12_3_1.zadanye1;

import java.sql.*;

// Команда в терминале для создания базы данных MMariaDB: docker run --name mysql -d -p 3306:3306 -e MYSQL_DATABASE=somedb -e MYSQL_USER=someuser -e MYSQL_PASSWORD=123 yobasystems/alpine-mariadb
// Значения параметров для настройки соединения в DBeaver (пришли в ответ на команду в терминале: docker inspect mysql:
// Сервер (Хост): 172.17.0.2 (нужно писать localhost вместо этого)
// База данных: somedb (значение переменной окружения MYSQL_DATABASE)
// Пользователь: someuser (значение переменной окружения MYSQL_USER)
// Пароль: 123 (значение переменной окружения MYSQL_PASSWORD)
// Драйвер: MySQL

public class Zadanye1 {
    public static void main(String[] args) {
        System.out.println("""
            Задание:\s
            Модуль 12. Базы данных и Git. Задание №3:\s
            Цель задания: знакомство и формирование базовых навыков с по работе  с MySQL\s
                Задание:
                1. Что такое MySQL?

                Решение:
            \s""");

        System.out.println("""
            MySQL: Программное обеспечение MySQL обеспечивает очень быстрый, многопоточный,
            многопользовательский сервер базы данных. Сервер MySQL предназначен для критически
            важных систем производства с высокой нагрузкой, а также для внедрения в массово
            распространенное программное обеспечение.
            \s""");
    }
}
