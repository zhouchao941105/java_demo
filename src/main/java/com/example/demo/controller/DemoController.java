package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Demo REST controller that provides three simple endpoints.
 */
@RestController
public class DemoController {

    /**
     * GET /hello
     * Returns a fixed greeting message.
     *
     * curl http://localhost:8080/hello
     * => {"msg":"Hello, world!"}
     */
    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("msg", "Hello, world!");
    }

    /**
     * GET /user/{id}
     * Returns a user object whose name is "user" + id.
     *
     * curl http://localhost:8080/user/1
     * => {"id":1,"name":"user1"}
     */
    @GetMapping("/user/{id}")
    public Map<String, Object> getUser(@PathVariable Long id) {
        return Map.of("id", id, "name", "user" + id);
    }

    /**
     * POST /echo
     * Accepts any JSON body and returns it unchanged.
     *
     * curl -X POST http://localhost:8080/echo \
     *      -H "Content-Type: application/json" \
     *      -d '{"key":"value"}'
     * => {"key":"value"}
     */
    @PostMapping("/echo")
    public Map<String, Object> echo(@RequestBody Map<String, Object> body) {
        return body;
    }
}
