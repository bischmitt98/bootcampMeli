package exercises.spring.exercises.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/code")
@RestController
public class MorseCodeController {

    private Map<String, Character> morseToEnglish = new HashMap<String, Character>(){{
        put(".-", 'A');
        put("-...", 'B');
        put("-.-.", 'C');
        put("-..", 'D');
        put(".", 'E');
        put("..-.", 'F');
        put("--.", 'G');
        put("....", 'H');
        put("..", 'I');
        put(".---", 'J');
        put("-.-", 'K');
        put(".-..", 'L');
        put("--", 'M');
        put("-.", 'N');
        put("---", 'O');
        put(".--.", 'P');
        put("--.-", 'Q');
        put(".-.", 'R');
        put("...", 'S');
        put("-", 'T');
        put("..-", 'U');
        put("...-", 'V');
        put(".--", 'W');
        put("-..-", 'X');
        put("-.--", 'Y');
        put("--..", 'Z');

        put(".----", '1');
        put("..---", '2');
        put("...--", '3');
        put("....-", '4');
        put(".....", '5');
        put("-....", '6');
        put("--...", '7');
        put("---..", '8');
        put("----.", '9');
        put("-----", '0');

        put("..--..", '?');
        put("-.-.--", '!');
        put(".-.-.-", '.');
        put("--..--", ',');
    }};

    @GetMapping("/{letter}")
    public ResponseEntity<String> MorseCode(@PathVariable String letter) {
        String englishText = "";

        for(String cod: letter.split("   ")){
            for(String s: cod.split(" ")){
                englishText += morseToEnglish.get(s);
            }
            englishText += " ";
        }

        return ResponseEntity.ok(englishText);
    }
}
