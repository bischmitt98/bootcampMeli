package meli.qabugs.controllers;

import meli.qabugs.models.TestCase;
import meli.qabugs.repositories.ITestCaseRepo;
import meli.qabugs.services.ITestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/testcases")
public class TestCaseController {

    @Autowired
    private ITestCaseService testCaseService;

    @GetMapping("/{id}")
    public ResponseEntity<TestCase> findById(@PathVariable long id) {
        return ResponseEntity.ok(testCaseService.findById(id));
    }

    @PostMapping("/new")
    public ResponseEntity<TestCase> add(@RequestBody TestCase testCase){
        return ResponseEntity.status(HttpStatus.CREATED).body(testCaseService.add(testCase));
    }

/*    @GetMapping
    public ResponseEntity<List<TestCase>> li




    @GetMapping("?last_update='dd/mm/yyyy")



    @PutMapping("/{id}")

    @DeleteMapping("/{id}")*/
}
