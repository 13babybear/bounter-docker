package cn.bounter.docker.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/docker")
public class DockerController {

	@GetMapping
	public String get() {
		return "Hello Susan!";
	}

}
