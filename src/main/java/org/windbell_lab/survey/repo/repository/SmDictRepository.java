package org.windbell_lab.survey.repo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.windbell_lab.survey.repo.mode.SmDictEntity;

/**
 * Created by morning on 2017/3/21.
 */
@Repository
public interface SmDictRepository extends CrudRepository<SmDictEntity, Long> {
}
