package pl.altkom.mojedemo.fastfood.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequiredArgsConstructor
public class MultiLanguageController {

    private final MessageSource messageSource;

    @GetMapping(path = "/hello-header")
    public String getHello(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        return messageSource.getMessage("morning.message", null, "Hi", locale);
    }

}
