package org.windbell_lab.survey.repo.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.windbell_lab.survey.repo.mode.CmChannelEntity;
import org.windbell_lab.survey.repo.repository.CmChannelRepository;

/**
* @ClassName: SimpleController
* demo controller
* @author MN
* 2017年3月22日 上午10:24:33
*/
@RestController
public class SimpleController {
	private static final Logger log = LoggerFactory.getLogger(SimpleController.class);
	@Autowired
	CmChannelRepository cmChannelRepository;

	@RequestMapping("/")
	@ResponseBody
	public String hello(HttpServletRequest request) {
		log.info(" url: {}",request.getRequestURI());
		return "hello";
	}

	@RequestMapping(value = "/cmChannel/{id}", method = RequestMethod.GET, produces = {
			"application/json;charset=UTF-8" })
	@ResponseBody
	public String CmChannel(HttpServletRequest request, @PathVariable("id") long id) {
		log.info(" url: {}",request.getRequestURI());
		CmChannelEntity cmChannelEntity = cmChannelRepository.findOne(id);
		return cmChannelEntity.toString();
	}
}
