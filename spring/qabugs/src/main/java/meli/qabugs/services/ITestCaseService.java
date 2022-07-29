package meli.qabugs.services;

import meli.qabugs.models.TestCase;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface ITestCaseService {
    TestCase findById(long id);
    TestCase add(TestCase newTestCase);
    TestCase update(TestCase updateTestCase);
    List<TestCase> findAllPassed();
    List<TestCase> findAllTested();
    List<TestCase> findAllByDescription(String description);
    List<TestCase> findTestCaseByAfterLastUpdate(LocalDate localDate);
    void delete(long id);
    void deleteAll();
}
