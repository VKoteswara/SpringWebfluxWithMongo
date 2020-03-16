package com.example.SpringWebfluxDemo;

import com.example.SpringWebfluxDemo.controller.DistrictController;
import com.example.SpringWebfluxDemo.entity.District;
import com.example.SpringWebfluxDemo.repository.DistrictRepository;
import com.example.SpringWebfluxDemo.service.Impl.DistrictServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;
import reactor.core.publisher.Mono;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {
        DistrictController.class
        //DataMongoTest.class
})
@WebFluxTest(DistrictController.class)
@Import(DistrictServiceImpl.class)
public class DistrictControllerTest {
    @MockBean
    DistrictRepository districtRepository;

    @Autowired
    private WebTestClient webClient;

    @Test
    void TestCreateDistrict(){
        District district = new District();
        district.setId(6l);
        district.setDistrictCode("dist06");
        district.setDistrictDesc("Sec");

        Mockito.when(districtRepository.save(district)).thenReturn(Mono.just(district));

        webClient.post()
                .uri("/createdistrict")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromObject(district))
                .exchange()
                .expectStatus().isCreated();

        Mockito.verify(districtRepository).save(district);

    }
}
