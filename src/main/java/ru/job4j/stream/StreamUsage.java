package ru.job4j.stream;

import java.util.List;

public class StreamUsage {
    public static class Task {

        /**
         * создаем строковую переменную
         * создаем переменную long
         */
        private final String name;
        private final long spent;

        /**
         * создаем конструктор и инициализируем поля
         * @param name инициальзация по имени
         * @param spent инициализация по значению
         */
        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 10),
                new Task("Task #2", 20),
                new Task("Bug #3", 40)
        );
        tasks.stream() /**запускаем поток элементов из созданного листа
               (если метод возвращает true то элемент передается дальше)*/
                .filter(task -> task.name.contains("Bug")) /** применяем фильтр где есть "Bug" */
                .filter(task -> task.spent > 30) /** применяем фильтр где значение меньше 30 */
                .map(task -> task.name + ", " + task.spent) /** записываем в Map */
                /** .collect(Collectors.toList()) - прошедшие фильтрацию элементы
                  * записываются в list */
                .forEach(System.out::println); /** выводим печать */у
    }
}
