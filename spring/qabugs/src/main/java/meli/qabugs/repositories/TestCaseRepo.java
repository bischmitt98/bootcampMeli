package meli.qabugs.repositories;

import meli.qabugs.models.TestCase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCaseRepo extends CrudRepository<TestCase, Long> {
}
