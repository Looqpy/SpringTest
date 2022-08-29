package example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        int a = 0 + (int) (Math.random() * 3);
        switch (a) {
            case (0):
                return "Rock Music #1";
            case (1):
                return "Rock Music #2";
            case (2):
                return "Rock Music #3";
            default:
                return "Rock Problem";
        }
    }
}
