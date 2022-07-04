package exercises.spring.exercises.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MorseCodeController {
    String[] dictionaryCode
            = { ".-",   "-...", "-.-.", "-..",  ".",
            "..-.", "--.",  "....", "..",   ".---",
            "-.-",  ".-..", "--",   "-.",   "---",
            ".--.", "--.-", ".-.",  "...",  "-",
            "..-",  "...-", ".--",  "-..-", "-.--",
            "--..", "|" };

    String morseCode;
    String englishText;

    Map<String, Character> morseToEnglish = new HashMap<>();

//    @GetMapping("/morse")
//    public String morseCode(PathVariable String letter){
//    String[] arrayMorse = morseCode.split("");
//    for(String morse : arrayMorse){
//        String dc = dictionaryCode.get(morse);
//    }
//        for(int i = 0; i <= 26; i++){
//            morseToEnglish.put(code[i], (char)('a' + i));
//        }
//        for(int i = 0; i <arrayMorse.length; i++){
//            return morseToEnglish.get(arrayMorse[i]);
//        }
//        return null;
//    }
    
}
