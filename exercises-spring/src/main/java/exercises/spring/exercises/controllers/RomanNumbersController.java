package exercises.spring.exercises.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanNumbersController {
    public int [] indoArabicNumbers = {1, 2, 3, 4, 5, 7, 10, 13, 50, 100, 500, 1000};
    public String [] romanNumbers = {"I", "II", "III", "IV", "V", "VII", "X", "XIII", "L", "C", "D", "M"};

    @GetMapping("/number/{num}")
    public String roman(@PathVariable int num){
        StringBuilder roman = new StringBuilder();
        for (int i= 0; i<indoArabicNumbers.length; i++){
            while (num >= indoArabicNumbers[i]){
                num -= indoArabicNumbers[i];
                roman.append(romanNumbers[i]);
            }
        }

        return roman.toString();
    }

}
