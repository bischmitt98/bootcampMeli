package meli.qabugs.controllers;

import meli.qabugs.models.TestCase;
import meli.qabugs.repositories.ITestCaseRepo;
import meli.qabugs.services.ITestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RestController
@RequestMapping("/api/testcases")
public class TestCaseController {
    @Autowired
    ITestCaseRepo testCaseRepo;

    @Autowired
    private ITestCaseService testCaseService;

    @GetMapping("/{id}")
    public ResponseEntity<TestCase> findById(@PathVariable long id) {
        return ResponseEntity.ok(testCaseService.findById(id));
    }


    @PostMapping("/new")
    public ResponseEntity<TestCase> add(@RequestBody TestCase newTestCase) {
        return ResponseEntity.status(HttpStatus.CREATED).body(testCaseService.add(newTestCase));
    }

    @GetMapping
    public ResponseEntity<List<TestCase>> getAllTests(@RequestParam(required = false)
                                                      @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        if (date != null) {
            if (date.isAfter(LocalDate.now())) {
                return ResponseEntity.badRequest().build();
            }
            return ResponseEntity.ok(testCaseService.findTestCaseByAfterLastUpdate(date));
        }
        return ResponseEntity.ok(testCaseService.findAllTested());

    }


    /*
        @GetMapping("?last_update='dd/mm/yyyy")



        @PutMapping("/{id}")
    */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable long id) {
        testCaseService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
