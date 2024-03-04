package com.company.project.homework.lesson10.Task2;

public class LoggerTask {
    public static void main(String[] args) {

//        AppLogger logger01 = new Delimiter(new Upper(new ConsoleWriter()));

        // к сообщению будет добавлен символ точки с запятой (;) - возможности Delimiter
        // текст сообщения будет приведен к верзнему регистру  - возможности Upper
        // данные будут выведены в консоль  - возможности ConsoleWriter
//        logger01.log("сообщение");

//        AppLogger logger02 = new Upper(new Delimiter(new AppFileWriter("file.txt")));

        // текст сообщения будет приведен к верзнему регистру  - возможности Upper
        // к сообщению будет добавлен символ точки с запятой (;) - возможности Delimiter
        // данные будут записаны в файл  - возможности ConsoleWriter
//        logger02.log("сообщение");

        ConsoleWriter console = new ConsoleWriter();
        console.log("данные"); // данные будут выведены в консоль

        AppFileWriter file = new AppFileWriter("file.txt");
        file.log("данные"); // данные будут записаны в файл
    }
}
