package de.mpi.testprogs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by matthiaspiehl on 04.11.15.
 */
@RestController
public class WebController {

    @RequestMapping("/")
    String getAppInfo() {
        return "Hello World!";
    }


}
