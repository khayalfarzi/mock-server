package az.company.mockserver.controller;

import az.company.mockserver.dto.FirstCheckRequest;
import az.company.mockserver.dto.FirstCheckResponse;
import az.company.mockserver.dto.SecondCheckRequest;
import az.company.mockserver.dto.SecondCheckResponse;
import az.company.mockserver.services.MockServices;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockController {

    private final MockServices mockServices;


    public MockController(MockServices mockServices) {
        this.mockServices = mockServices;
    }

    public FirstCheckRequest firstCheckRequest() {

        return null;
    }

    @PostMapping(value = "firstCheckResponseXml", consumes = MediaType.APPLICATION_XML_VALUE)
    public FirstCheckResponse firstCheckResponse(@RequestBody FirstCheckRequest firstCheckRequest) {
        return mockServices.firstCheckResponse(firstCheckRequest);
    }


    @PostMapping(value = "secondCheckResponseXml", consumes = MediaType.APPLICATION_XML_VALUE)
    public SecondCheckResponse secondCheckResponse(@RequestBody SecondCheckRequest secondCheckRequest) {
        return mockServices.secondCheckResponse(secondCheckRequest);
    }
}
