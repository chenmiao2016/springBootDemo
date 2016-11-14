package com.dahuatech.rongqi.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.dahuatech.rongqi.service.HelloService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/hello")
public class HelloAction extends BaseAction{
	@Autowired
	HelloService helloService;
	
	@RequestMapping("/")
	String home(){
		return "Hello World!";
	}
	
//	@RequestMapping("/json")
	@RequestMapping(value="/json",method=RequestMethod.GET)
	JSONObject getJson(String id){
		try {
			if(StringUtils.isEmpty(id)){
				throw new RuntimeException("id不能为空!");
			}
		} catch (RuntimeException e) {
			return failureValue(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			return failureValue("后台错误！");
		}
		return successValue(helloService.getJson(id));
	}
}
