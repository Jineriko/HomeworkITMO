****** Задача фитнес *******

   1. Не реализовывать ввод данных с консоли.
   2. Экземпляры классов (данные о владельце, абонемент, фитнес и тд) можно создать в методе main отдельного класса (
      например, Application).
   3. Информацию о дате сохраняем в тип LocalDate, информацию о времени в тип LocalTime, информацию о дате+времени в тип
       LocalDateTime. Способы создания и сравнения объектов в файле Dates.java
   4. Необходимо корректно использовать модификаторы доступа и производить проверку устанавливаемых значений
   
В фитнес клубе есть три типа абонементов:
    1. Разовый (на один день). По разовому абонементу клиенты могут посещать бассейн и тренажерный зал с 8 до 22 часов.
    2. Дневной (срок действия может быть любым). По данному абонементу клиенты могут посещать тренажерный зал и групповые
   занятия (но не бассейн) с 8 до 16 часов.
    3. Полный (срок действия может быть любым). По данному абонементу клиенты могут посещать тренажерный зал, бассейн и
   групповые занятия с 8 до 22 часов.
   
    Каждый абонемент хранит номер, дату регистрации (текущая дата) и дату окончания регистрации. Каждый абонемент хранит
    информацию о владельце (НЕ НАОБОРОТ). Данные о владельце: имя, фамилия, год рождения.
   
Фитнес содержит информацию об абонементах, которые:
    1. зарегистрированы в тренажерном зале (массив абонементов);
    2. зарегистрированы в бассейне (массив абонементов);
    3. зарегистрированы на групповых занятиях (массив абонементов).
   
В каждой зоне (бассейн, тренажерный зал, групповые занятия) одновременно может быть зарегистрировано 20 абонементов.
У Фитнеса должен быть реализован функционал по заполнению массивов абонементов дефолтными значениями.
У Фитнеса должен быть реализован функционал добавления абонемента в одну из зон:
    1. Метод принимает на вход желаемую зону (тренажерный зал или бассейн, или групповые занятия) и абонемент.
    2. Перед добавлением абонемента в соответствующий массив необходимо проверить:
        1) можно ли по данному абонементу пройти в желаемую зону и есть ли в ней свободные места
        2) не просрочен ли абонемент
        3) не зарегистрирован ли абонемент в одной из зон
    3. Если абонемент проходит проверку п.2, то он добавляется в выбранную зону, в противном случае в консоль необходимо
        вывести причину отказа
   
Реализовать возможность вывода информации о текущих абонементах: сначала посетителях тренажерного зала, потом бассейна,
потом групповых занятий.
Реализовать возможность выводить информацию в консоль каждый раз, когда абонемент регистрируется в одной из зон
(добавляется в массив).
1. Фамилия Имя Посещаемая зона (бассейн/тренажерный зал/групповые занятия)
2. Дата и время посещения