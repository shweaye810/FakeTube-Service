package com.shwe.faketube.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "users")
public class UserController {

	
//	@GetMapping("/hello/{name}")
//	public ResponseEntity<Resource> hello(@PathVariable String name)
//			throws URISyntaxException, MalformedURLException {
//		// URI
//		Resource uri = new UrlResource(
//				"file:///Volumes/MY_PASSPORT/Video/Watch Captain Fantastic Online Watch Full Captain Fantastic .mp4");
//		 return ResponseEntity.status(HttpStatus.OK)
//		 .contentType(MediaTypeFactory
//		 .getMediaType(uri)
//		 .orElse(MediaType.APPLICATION_OCTET_STREAM)
//		 )
//		 .body(uri);
//		// return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
//		// .body(BodyInserters.fromObject("Hello, Spring!"));
////		return Mono.just(uri).map(p -> ResponseEntity.ok()
////				.contentType(MediaTypeFactory.getMediaType(uri).orElse(MediaType.APPLICATION_OCTET_STREAM))
////				.body(uri));
//	}


}
