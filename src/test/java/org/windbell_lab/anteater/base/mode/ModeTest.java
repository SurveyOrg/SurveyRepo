package org.windbell_lab.anteater.base.mode;

import static org.junit.Assert.assertNotNull;

import org.windbell_lab.survey.repo.Main;
import org.windbell_lab.survey.repo.mode.CmChannelEntity;
import org.windbell_lab.survey.repo.repository.CmChannelRepository;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Main.class)

public class ModeTest {
	@Autowired
	public CmChannelRepository	repository;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		assertNotNull(repository);
		CmChannelEntity entity = new CmChannelEntity();
		entity.setChannelName("ChannelName");
		repository.save(entity);
		entity = repository.findOne(1L);
		entity.setCreator(111L);
		repository.save(entity);
	}

}
