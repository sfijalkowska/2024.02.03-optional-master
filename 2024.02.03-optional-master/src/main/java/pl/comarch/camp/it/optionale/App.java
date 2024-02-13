package pl.comarch.camp.it.optionale;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        //Optional<String>
        Optional<String> stringBox = getById(7);
        String s = stringBox.orElse("nic");

        System.out.println(s);
    }

    private static Optional<String> getById(int id) {
        if(id == 5) {
            return Optional.of("cos");
        }
        return Optional.empty();
    }
}
