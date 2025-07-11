package seki.backend.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Map<String, String> hello(@RequestParam(required = false, defaultValue = "React") String name) {
        return Map.of("message", "こんにちは " + name + "さん！");
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public Map<String, String> helloPost(@RequestParam(required = false, defaultValue = "React") String name) {
        return Map.of("message", "こんにちは " + name + "さん！");
    }

    @RequestMapping(value = "/hello", method = RequestMethod.PUT)
    public Map<String, String> helloPut(@RequestParam(required = false, defaultValue = "React") String name,
                                        @RequestParam(required = false, defaultValue = "") String newName) {
        String finalName = newName.isEmpty() ? name : newName;
        return Map.of("message", "こんにちは " + finalName + "さん！");
    }

    @RequestMapping(value = "/hello", method = RequestMethod.DELETE)
    public Map<String, String> helloDelete(@RequestParam(required = false, defaultValue = "React") String name) {
        return Map.of("message", "さようなら " + name + "さん！");
    }
}