package meli.qabugs.services;

import meli.qabugs.models.TestCase;

import java.time.LocalDate;
import java.util.List;

public interface ITestCaseService {
    TestCase findById(long id);
    TestCase add(TestCase testCase);
    TestCase update(TestCase testCase);
    List<TestCase> findAllPassed();
    List<TestCase> findAllTested();
    List<TestCase> findAllByDescription(String description);
    List<TestCase> findByAfterDate(LocalDate localDate);
    void delete(long id);
    void deleteAll();


}
