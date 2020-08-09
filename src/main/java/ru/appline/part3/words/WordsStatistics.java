package ru.appline.part3.words;

import java.io.*;
import java.util.*;

public class WordsStatistics {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/ru/appline/part3/words/testWords.txt");
        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            ArrayList<String> lines = new ArrayList<>();
            ArrayList<String> words = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            for (String line1 : lines) {
                String[] arrayStr = line1.split(" ");
                for (String word : arrayStr) {
                    if(word.equals("")) continue;
                    else words.add(word);
                }
            }
            words.replaceAll(String::toLowerCase);
            Collections.sort(words);
            System.out.println("Список слов из файла:");
            TreeMap<String,Integer> statistics = new TreeMap<>();
            for (String list : words) {
                System.out.println(list);
                statistics.put(list,0);
            }
            Integer count;
            for (String s : words) {
                count=statistics.get(s);
                statistics.put(s, count+1);
            }
            System.out.println();
            System.out.println("Статистика слов:");
            System.out.println(statistics.toString());

            int max = Collections.max(statistics.values());
            System.out.println();
            for (Map.Entry<String,Integer> entry : statistics.entrySet()){
                if(entry.getValue()==max){
                    System.out.println("Максимальное число раз встречается слово: \"" + entry.getKey()
                            + "\", встречается " + max + " раз(-а)");
                }
            }
        }
        else {
            System.out.println("Файла не существует");
        }
    }
}
