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
    public TestCase add(TestCase testCase) {
        if (testCase.getId() > 0)
            throw new BadRequestException("The test cannot have id to be created!");
        return testCaseRepo.save(testCase);
    }

    @Override
    public TestCase update(TestCase testCase) {
        return null;
    }

    @Override
    public List<TestCase> findAllPassed() {
        return null;
    }

    @Override
    public List<TestCase> findAllTested() {
        return null;
    }

    @Override
    public List<TestCase> findAllByDescription(String description) {
        return null;
    }

    @Override
    public List<TestCase> findByAfterDate(LocalDate localDate) {
        return null;
    }

    @Override
    public void delete(long id_case) {

    }

    @Override
    public void deleteAll() {

    }
}
