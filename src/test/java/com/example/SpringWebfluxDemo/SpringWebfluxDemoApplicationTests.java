package com.example.SpringWebfluxDemo;

import com.example.SpringWebfluxDemo.entity.District;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringWebfluxDemoApplicationTests {

	/*@Test
	void contextLoads() {
	}*/
	@Autowired
	WebTestClient webclient;
	@Test
	public void getString(){
		webclient.get().uri("/getstringviamono")
				.accept(MediaType.TEXT_PLAIN)
				.exchange()
				.expectStatus().isOk()
				.expectBody(String.class).isEqualTo("Hello world");

	}

	@Test
	public  void getAllDistrict(){
		webclient.get().uri("/alldistricts")
				.accept(MediaType.APPLICATION_JSON)
				.exchange()
				.expectStatus()
				.isOk()
				.expectBodyList(District.class);
	}

}
