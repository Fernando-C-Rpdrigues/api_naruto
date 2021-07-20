package rodrigues.fernando.api.naruto.controller;

import net.minidev.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Random;

    @RestController
    public class NarutoController {

        @GetMapping("/your-element")
        public ResponseEntity<Object> yourelement(){

            ArrayList<String> element = new ArrayList<String>();
            element.add("Fogo(katon)");
            element.add("Vento(Fuuton)");
            element.add("Raio(Raiton)");
            element.add("Terra(Doton)");
            element.add("Água(Suiton)");

            Random number = new Random();
            int generateNumber = number.nextInt(5);

            JSONObject entity = new JSONObject();
            entity.put("element",element.get(generateNumber));

            return new ResponseEntity<Object>(entity, HttpStatus.ACCEPTED);
        }
    }