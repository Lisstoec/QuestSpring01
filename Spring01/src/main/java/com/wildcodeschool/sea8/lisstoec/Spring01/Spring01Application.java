package com.wildcodeschool.sea8.lisstoec.Spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctor2() {
		return "Patrick Troughton";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4() {
		return "Tom Baker";
	}

	@RequestMapping("/doctor/8")
	@ResponseBody
	public String doctor8() {
		return "Paul McGann";
	}

	@RequestMapping("/doctor/12")
	@ResponseBody
	public String doctor12() {
		return "Peter Capaldi";
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		String indexString = "Here are some incarnations of the Doctor:" +
					"<ul>" +
					"<li><a href='http://localhost:8080/doctor/2'>Second Doctor: Patrick Troughton</a></li>" +
					"<li><a href='http://localhost:8080/doctor/4'>Fourth Doctor: Tom Baker</a></li>" +
					"<li><a href='http://localhost:8080/doctor/8'>Eighth Doctor: Paul McGann</a></li>" +
					"<li><a href='http://localhost:8080/doctor/12'>Twelfth Doctor: Peter Capaldi</a></li>" +
					"</ul>";
		return indexString;
	}
}
