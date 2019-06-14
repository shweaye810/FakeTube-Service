package com.shwe.faketube.controller;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.List;

import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.MediaType;
import org.springframework.http.MediaTypeFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shwe.faketube.model.Video;
import com.shwe.faketube.service.VideoService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/recommendation")
public class RecommendationController {
	
	@Autowired
	VideoService videoService;
	
	@GetMapping("/videos/videoId/{videoId}")
	public Publisher<ResponseEntity<Resource>> getOne(@PathVariable String videoId)
			throws URISyntaxException, MalformedURLException {
		// URI
		Resource uri = new UrlResource(
				"file:///Volumes/MY_PASSPORT/Video/Watch Captain Fantastic Online Watch Full Captain Fantastic .mp4");
		// return ResponseEntity.status(HttpStatus.OK)
		// .contentType(MediaTypeFactory
		// .getMediaType(uri)
		// .orElse(MediaType.APPLICATION_OCTET_STREAM)
		// )
		// .body(uri);
		// return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
		// .body(BodyInserters.fromObject("Hello, Spring!"));
		return Mono.just(uri).map(p -> ResponseEntity.ok()
				.contentType(MediaTypeFactory.getMediaType(uri).orElse(MediaType.APPLICATION_OCTET_STREAM))
				.body(uri));
	}
	
	@GetMapping("/videos/personId/{personId}")
	public Collection<Video> getAll(@PathVariable String personId) {
		
		return videoService.getAll().getContent();
	}
}
