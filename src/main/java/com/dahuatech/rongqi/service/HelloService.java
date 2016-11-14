package com.dahuatech.rongqi.service;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

@Service
public class HelloService {
	public JSONObject getJson(String id){
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("aaa", "bbb");
		jsonObject.put("id", id);
		return jsonObject;
	}
}
