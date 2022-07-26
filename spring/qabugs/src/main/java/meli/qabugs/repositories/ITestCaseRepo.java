package meli.qabugs.repositories;

import meli.qabugs.models.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITestCaseRepo extends JpaRepository<TestCase, Long> {
}
