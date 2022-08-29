package example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        int a = 0 + (int) (Math.random() * 3);
        switch (a) {
            case (0):
                return "Classical Music #1";
            case (1):
                return "Classical Music #2";
            case (2):
                return "Classical Music #3";
            default:
                return "Classical Problem";
        }
    }
}
