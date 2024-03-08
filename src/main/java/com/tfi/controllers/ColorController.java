package com.tfi.controllers;

import com.tfi.model.Color;
import com.tfi.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("color")
@CrossOrigin(origins = "*")
public class ColorController {

    @Autowired
    ColorService colorService;

    @PostMapping("/save")
    public Color saveColor(@RequestBody Color color) {
        return colorService.saveColor(color);
    }

}
