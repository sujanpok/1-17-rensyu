package com.example.demo.conn;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.InfoInput;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin
@RestController
@RequestMapping("/userinfo")
@Slf4j
public class UserInfoApi {
	
	@PostMapping("/sousin")
	public InfoInput getUserinfo(@RequestBody  InfoInput request) {
		
		log.info(request.getBango());
		log.info(request.getTelno());
		return request;
	}

}
