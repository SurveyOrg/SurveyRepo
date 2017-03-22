/**  
* @Title: CmChannelRepository.java
* @Package org.windbell_lab.survey.repo.repository
* TODO
* @author MN 
* 2017年3月22日 下午3:09:08
* @version V1.0  
*/
package org.windbell_lab.survey.repo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.windbell_lab.survey.repo.mode.CmChannelEntity;

/**
 * Created by morning on 2017/3/21.
 */
@Repository
public interface CmChannelRepository extends CrudRepository<CmChannelEntity, Long> {
}
