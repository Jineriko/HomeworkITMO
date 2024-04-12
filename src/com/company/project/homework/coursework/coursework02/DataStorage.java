package com.company.project.homework.coursework.coursework02;

import java.util.HashMap;
import java.util.List;

public class DataStorage {
    private static DataStorage data;
    private DataStorage(){}

    private static List<String> paragraphName = List.of("Лисенок", "Вернуться домой", "Отправиться на поиски",
            "Попытаться разузнать о Бельчонке у лесных жителей", "Искать Бельчонка в одиночку",
            "Расспросить Сову", "Расспросить Волка", "Поверить Сове и отправиться вглубь леса",
            "Нужно воспользоваться шансом и раздобыть мёд", "Подождать, вдруг пчёлы улетят",
            "Нужно попытаться выкрасть мёд немедленно", "Поесть немного и передохнуть",
            "Скорее отнести мёд Медвежонку");
    private static List<String> paragraphText = List.of("Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. " +
                    "Это утро не было исключением. Лисёнок пришёл на их обычное место встречи, но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга. \n\"" +
                    "Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду.\" - подумал Лисёнок. Как поступить Лисенку?",
            "Вернувшись домой, Лисёнок нашёл там Бельчонка. Оказалось, что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел. " +
                    "Он поспешил предупредить об этом Лисёнка, но они разминулись. Наконец-то друзья нашли друг друга! Игра завершилась успехом",
            "Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему. Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему.",
            "Пока Лисёнок принимал решение, лесные жители разошлись кто куда. Остались только Сова и Волк. Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. Кого выбрать?",
            "Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил, как заблудился. Теперь его самого нужно искать. Игра завершилась неудачей",
            "Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, бежавшего вглубь леса. Все лесные жители знают, что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь.",
            "Волк оказался вполне дружелюбным, но помочь не смог. Лишь сказал, что маленькому лисенку не стоит бродить по лесу одному. И как теперь поступить?",
            "В глубине леса Лисёнок встретил Медвежонка. Ленивый Медвежонок был готов рассказать все, что знает, если Лисёнок принесёт ему мёда.",
            "Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.",
            "Лисёнок подождал немного, и пчёлы разлетелись. Лисёнок без проблем набрал мёда. Вдруг он понял, что очень голоден. Что же делать?",
            "Это была не лучшая идея. Пчёлы покусали Лисёнка, теперь ему самому нужна помощь. Игра завершилась неудачей",
            "Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. Лисёнку нужна помощь, он не сможет продолжить поиски. Игра завершилась неудачей",
            "Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен, что Бельчонок никогда не пошёл бы в глубь леса. " +
                    "Он заверял Лисёнка, что Белки не попадают в неприятности, и что Совам нельзя верить, он также уговаривал Лисёнка вернуться домой.");


//    private static final HashMap<String, String> paragraphs = new HashMap<>(13);
    public static DataStorage getData(){ // singlton вместо конструктора
        if (data == null)
            data = new DataStorage();
        return data;
    }

    public static List<String> getParagraphName() {
        return paragraphName;
    }

    public static List<String> getParagraphText() {
        return paragraphText;
    }
}
