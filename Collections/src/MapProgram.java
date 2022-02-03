import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independant language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Begginers All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        System.out.println("Nadpisanie key java" + languages.put("Java", "this course is about Java"));
        System.out.println(languages.get("Java"));


        System.out.println(languages.get("Java"));

        System.out.println("==================================================");
//        languages.remove("Lisp");
        if (languages.remove("Algol", "a family of algorithmic languages")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }
        if (languages.replace("Lisp", "Therein lies madness", "a functional programming language with iperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
//        System.out.println(languages.replace("Scala", "this will not be added"));

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
