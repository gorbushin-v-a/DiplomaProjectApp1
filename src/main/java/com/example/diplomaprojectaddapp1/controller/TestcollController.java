package com.example.diplomaprojectaddapp1.controller;

import com.example.diplomaprojectaddapp1.documents.Testcoll;
import com.example.diplomaprojectaddapp1.service.TestcollService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testcoll")
@AllArgsConstructor
public class TestcollController {

    @Autowired
    private TestcollService testcollService;

    @PostMapping
    public List<Testcoll> post(@RequestBody Testcoll testcoll) {
        return testcollService.save(testcoll);
    }

    @GetMapping
    public List<Testcoll> get() {
        return testcollService.get();
    }
}
