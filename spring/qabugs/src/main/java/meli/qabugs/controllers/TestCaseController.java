package meli.qabugs.controllers;

import meli.qabugs.models.TestCase;
import meli.qabugs.repositories.ITestCaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/testcases")
public class TestCaseController {

    @Autowired
    private ITestCaseRepo ITestCaseRepo;

    @GetMapping
    public ResponseEntity<List<TestCase>> li


    @GetMapping("/{id}")
    public ResponseEntity<TestCase> getById(@PathVariable long id) {
        return ResponseEntity.ok(ITestCaseRepo.findById(id).get());
    }

    @GetMapping("?last_update='dd/mm/yyyy")

    @PostMapping("/new")

    @PutMapping("/{id}")

    @DeleteMapping("/{id}")
}
