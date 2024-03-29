package meli.qabugs.repositories;

import meli.qabugs.models.TestCase;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ITestCaseRepo extends CrudRepository<TestCase, Long> {
    @Query(value = "SELECT * FROM test_case WHERE DATE(last_update) = ?1", nativeQuery = true)
    List<TestCase> findTestCaseByAfterLastUpdate(LocalDate localDate);
}
