package oldFiles;

import java.util.ArrayList;
import java.util.List;

public class GenericTypes {
    public static List<String> languages = new ArrayList();

    public static void main(String[] args) {
        languages.add("English");
        languages.add("French");
        System.out.println(languages);
        System.out.println(languages.isEmpty());

    }
}
