package com.ninja.ci.cd_pipeline;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cicdpipeline 
{
@RequestMapping("/test")
public String test()
{
	return"this is thest page";
}
}
