//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());

        Samosa s2 = Samosa.getSamosa();
        System.out.println(s2.hashCode());
    }
}