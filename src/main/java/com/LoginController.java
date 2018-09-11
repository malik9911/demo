package com;


import com.sun.org.apache.xpath.internal.operations.String;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class LoginController {

    @ApiResponses(value ={
            @ApiResponse(code = 200, message = "success"),
            @ApiResponse(code = 400,message = "erroe")

    })
    @RequestMapping(value =UrlMapping.login, method =   RequestMethod.POST)
    public Map<String,Object> login()
    {
        Map<String, Object> result=new HashMap<String,Object>();



        return result;
    }
}
