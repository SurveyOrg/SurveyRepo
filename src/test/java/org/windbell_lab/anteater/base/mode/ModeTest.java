package org.windbell_lab.anteater.base.mode;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.windbell_lab.survey.repo.Main;
import org.windbell_lab.survey.repo.mode.CmChannelEntity;
import org.windbell_lab.survey.repo.repository.CmChannelRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
@AutoConfigureMockMvc
public class ModeTest {
	@Autowired
	public CmChannelRepository repository;
	@Autowired
	private MockMvc mvc;
	@Value("${application.page.index:index}")
	private String hello;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testRepository() {
		assertNotNull(repository);
		CmChannelEntity entity = new CmChannelEntity();
		entity.setChannelName("ChannelName");
		repository.save(entity);
		entity = repository.findOne(1L);
		entity.setCreator(111L);
		repository.save(entity);
	}

	@Test
	public void testMvc() throws Exception {
		assertNotNull(mvc);
		mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().string(equalTo(hello)));

	}
}
