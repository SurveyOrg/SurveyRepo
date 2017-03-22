package org.windbell_lab.survey.repo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
* @ClassName: SimpleController
* demo controller
* @author MN
* 2017年3月22日 上午10:24:33
*/
@RestController
public class SimpleController {
	@RequestMapping("/")@ResponseBody
	public String hello() {
		return "hello";
	}
}
