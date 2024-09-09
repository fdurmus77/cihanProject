package com.fd.serverWebServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

@RestController
@RequestMapping(method = RequestMethod.GET, value = "ReaderHello")
public class ReaderHello {
    private RestTemplate restTemplate;

    @Autowired
    public ReaderHello(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping({"/TestMerhaba", "/TestMerhaba/{name}"})
    public String ReaderMerhaba(@PathVariable(required = false) String name) {
        return "Merhaba. " + (name == null ? "" : name);
    }

    @GetMapping({"/ReaderMerhaba", "/ReaderMerhaba/{name}"})
    public String getApiResponse(@PathVariable(required = false) String name) {
        try {
            String url = "http://localhost:8080/Hello/merhaba" + (name == null ? "" : "/" + name);  // Çağrı yapılacak API URL'si
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                return "READ SERVİCE ==> " + response.getBody() + " " + new Date().getTime();  // Başarılı yanıtı döndür
            } else {
                return "API çağrısı başarısız oldu: " + response.getStatusCode();
            }
        } catch (Exception e) {
            return "API SERVİSE ULAŞILAMIYOR  ==> " + e.getLocalizedMessage();
        }

    }
}
