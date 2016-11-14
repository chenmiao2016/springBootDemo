package com.dahuatech.rongqi.action;

import com.alibaba.fastjson.JSONObject;

public class BaseAction {
	JSONObject successValue(Object o){
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("success", true);
		jsonObject.put("result", o);
		return jsonObject;
	}
	
	JSONObject failureValue(String msg){
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("success", false);
		jsonObject.put("error_msg", msg);
		return jsonObject;
	}
}
