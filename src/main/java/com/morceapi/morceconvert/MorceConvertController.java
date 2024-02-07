package com.morceapi.morceconvert;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Objects;

@RestController
@RequestMapping("/traducir")
public class MorceConvertController {

    @GetMapping("/{codigo}")
    public String traducir(@PathVariable String codigo) {
        String[] letras = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
                "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "?", "!",
                ".", ",", " "
        };

        String[] arrayFrase=codigo.split("");

        String[] codigos = {
                ".-",
                "-...",
                "-.-.",
                "-..",
                ".",
                "..-.",
                "--.",
                "....",
                "..",
                ".---",
                "-.-",
                ".-..",
                "--",
                "-.",
                "---",
                ".--.",
                "--.-",
                ".-.",
                "...",
                "-",
                "..-",
                "...-",
                ".--",
                "-..-",
                "-.--",
                "--..",
                ".----",
                "..---",
                "...--",
                "....-",
                ".....",
                "-....",
                "--...",
                "---..",
                "----.",
                "-----",
                "..--..",
                "-.-.--",
                ".-.-.-",
                "--..--",
                " "
        };

        // HOLA
        StringBuilder result=new StringBuilder();

        for(int i=0; i<arrayFrase.length;i++){
            for (int j=0;j<letras.length;j++){
                if(Objects.equals(arrayFrase[i], letras[j])){
                    result.append(codigos[j]).append(" ");
                }
            }
        }

        return result.toString();
    }
}
