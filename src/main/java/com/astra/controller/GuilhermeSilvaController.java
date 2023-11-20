package com.astra.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astra.dto.GuilhermeSilvaDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class GuilhermeSilvaController {

	@GetMapping("/")
	public ResponseEntity<GuilhermeSilvaDTO> index() throws IOException {

		GuilhermeSilvaDTO oGuilhermeSilvaDTO = new GuilhermeSilvaDTO();
		oGuilhermeSilvaDTO.setData("Hello Word");
		return ResponseEntity.ok(oGuilhermeSilvaDTO);
	}

}