package com.nexyliya.dramacookie.exceptions;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController implements ErrorController {

    public CustomErrorController() {}

    @GetMapping(value = "/error")
    public String handleError(HttpServletRequest request) {
        
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
        
            Integer statusCode = Integer.valueOf(status.toString());

            if(statusCode == HttpStatus.NOT_FOUND.value()) {
                return "errors/404";
            } else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                return "errors/500";
            } else if(statusCode == HttpStatus.FORBIDDEN.value()) {
                return "errors/403";
            } else if(statusCode == HttpStatus.UNAUTHORIZED.value()) {
                return "errors/401";
            }
        }
        return "error";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }

}