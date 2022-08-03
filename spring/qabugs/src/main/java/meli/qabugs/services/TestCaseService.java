package meli.qabugs.services;

import meli.qabugs.exceptions.BadRequestException;
import meli.qabugs.exceptions.UserNotFoundException;
import meli.qabugs.models.TestCase;
import meli.qabugs.repositories.ITestCaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TestCaseService implements ITestCaseService{

    @Autowired
    private ITestCaseRepo testCaseRepo;


    @Override
    public TestCase findById(long id) {
        return testCaseRepo.findById(id).orElseThrow(()->
                new UserNotFoundException("Test not found. Id: " + id));
    }

    @Override
    public TestCase add(TestCase newTestCase) {
        if (newTestCase.getId() > 0)
            throw new BadRequestException("The test cannot have id to be created!");
        return testCaseRepo.save(newTestCase);
    }

    @Override
    public TestCase update(TestCase updateTestCase){
        TestCase foundTest = findById(updateTestCase.getId());
        return testCaseRepo.save(updateTestCase);
    }

    @Override
    public List<TestCase> findAllPassed(TestCase testCase) {
        return testCaseRepo.findAllByPassed(testCase);
    }

    @Override
    public List<TestCase> findAllTested() {
        return testCaseRepo.findAllByTested();
    }

    @Override
    public List<TestCase> findAllByDescription(String description) {
        return testCaseRepo.findAllByDescription(description);
    }

    @Override
    public List<TestCase> findTestCaseByAfterLastUpdate(LocalDate localDate) {
        return testCaseRepo.findTestCaseByAfterLastUpdate(localDate);
    }

    @Override
    public void delete(long id) {
        testCaseRepo.deleteById(id);
    }

    @Override
    public void deleteAll() {
        testCaseRepo.deleteAll();
    }
}
