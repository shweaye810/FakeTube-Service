package com.shwe.faketube.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shwe.faketube.model.Video;

@FeignClient(url="localhost:9000/videos", name="videoService")
public interface VideoService {
	
	@RequestMapping(method = RequestMethod.GET, value="")
	Resources<Video> getAll();

}
