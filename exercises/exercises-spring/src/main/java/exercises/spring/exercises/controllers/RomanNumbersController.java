package exercises.spring.exercises.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanNumbersController {
    // não funcionou. tentar usar o hashmap
    public int [] indoArabicNumbers = {1, 2, 3, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    public String [] romanNumbers = {"I", "II", "III", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    @GetMapping("/number/{num}")
    public String roman(@PathVariable int num){
        StringBuilder roman = new StringBuilder();
        for (int i= indoArabicNumbers.length-1; i >= 0; i--){
            while (num >= indoArabicNumbers[i]){
                num -= indoArabicNumbers[i];
                roman.append(romanNumbers[i]);
            }
        }

        return roman.toString();
    }

}
