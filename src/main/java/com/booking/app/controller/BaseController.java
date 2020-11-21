package com.booking.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(BaseController.API_V1)
@RestController
public class BaseController {
    public static final String API_V1 = "/api/v1";

}


