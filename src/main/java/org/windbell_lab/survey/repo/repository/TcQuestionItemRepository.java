package org.windbell_lab.survey.repo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.windbell_lab.survey.repo.mode.TcQuestionItemEntity;

/**
 * Created by morning on 2017/3/21.
 */
@Repository
public interface TcQuestionItemRepository extends CrudRepository<TcQuestionItemEntity, Long> {
}
