package uz.jl.jira.utils;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  17:53   18/06/22
 * @Project :  trelloAlfa
 */
public class Util {
    public static String right(String str, int width) {
        for (int x = str.length(); x < width; ++x)
        {
            str = ' ' + str;
        }
        return str;
    }
    public static void middle(String str) {
        Writer.yellowLine("   ***   " + str + "   ***   ");
    }

    public static void error(String str) {
        Writer.redLine("   ***   " + str + "   ***   ");
    }

    public static void success(String str) {
        Writer.greenLine("   ***   " + str + "   ***   ");
    }

    public static String left(String str, int width) {
        for (int x = str.length(); x < width; ++x)
        {
            str += ' ';
        }
        return str;
    }

    public static void pause(){
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void clear(){
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }

    public static String menu(List<String> list){
        Writer.cyanLine("+------------------------------+");

        Writer.cyan("|");
        int a = (30 - list.get(0).length()) / 2;
        for (int i = 0; i < a; i++) {
            System.out.print(" ");
        }
        Writer.yellow(list.get(0));
        for (int i = 0; i < 30 - list.get(0).length() - a; i++) {
            System.out.print(" ");
        }
        Writer.cyanLine("|");

        Writer.cyanLine("+------------------------------+");

        for (int i = 1; i < list.size(); i++) {
            Writer.cyan("|");
            System.out.print(list.get(i));
            for (int j = 0; j < 30 - list.get(i).length(); j++) {
                System.out.print(" ");
            }
            Writer.cyanLine("|");
        }
        Writer.cyanLine("+------------------------------+");

        return Reader.option();
    }
}
