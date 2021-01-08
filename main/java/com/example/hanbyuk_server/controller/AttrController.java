package com.example.hanbyuk_server.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.hanbyuk_server.service.AttrService;
import com.example.hanbyuk_server.util.Util;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


@Controller
public class AttrController {
	
	@Autowired
	private AttrService attrService;
	
	
	
	@CrossOrigin("*")
	@RequestMapping(value = "/test/getAttr", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String getAttr(HttpServletResponse response) throws IOException {
		/*attrService.setValue("member__4__common__a", "안녕", null);*/

		return attrService.getValue("system__0__common__dataURL");
	}
	
	
	@CrossOrigin("*")
	@RequestMapping(value = "/test/removeAttr", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String removeAttr(HttpServletResponse response, @RequestParam String uuid) throws IOException {
		
		
		
		
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonStr = attrService.getValue("system__0__common__dataURL");
		System.out.println("tthis");
		System.out.println(jsonStr);
		Map<String, Object> data = mapper.readValue(jsonStr, new TypeReference <Map<String, Object>>(){});
		
		
		
		
		
		
		attrService.setValue("system__0__common__dataURL", Util.toJsonStr(data), null);
		//attrService.setValue("system__0__common__dataURL", Util.toJsonStr(menuUiData), null);
		
		

		return attrService.getValue("system__0__common__dataURL");
	}
	@CrossOrigin("*")
	@RequestMapping(value = "/test/initAttr", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String initAttr(HttpServletResponse response) throws IOException{
		
		// updatedMenuList
		
		
		/*
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("updatedMenuList", new LinkedHashMap());
		((Map<String, Object>)jsonObject.get("updatedMenuList")).put("String","String");
		System.out.println(jsonObject);*/
		
		
		
		
		
//		System.out.println(((List)menuUiData.get("updatedMenuList")).get(0));
		
		
		Map<String, Object> menuUiData = new LinkedHashMap<>();
		menuUiData.put("updatedMenuList", new ArrayList<>());
		((List)menuUiData.get("updatedMenuList")).add(new LinkedHashMap());
		((List)menuUiData.get("updatedMenuList")).add(new LinkedHashMap());
		((List)menuUiData.get("updatedMenuList")).add(new LinkedHashMap());
		((List)menuUiData.get("updatedMenuList")).add(new LinkedHashMap());
		((List)menuUiData.get("updatedMenuList")).add(new LinkedHashMap());
		
		
		////index 0
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).put("index", 0);
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).put("items", new ArrayList<>());
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).get(0)).put("type",0);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).get(0)).put("dataURLList",new ArrayList());
		
		

		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).get(1)).put("type",1);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).get(1)).put("dataURLList",new ArrayList());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).get(2)).put("type",2);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).get(2)).put("dataURLList",new ArrayList());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).get(3)).put("type",3);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).get(3)).put("dataURLList",new ArrayList());
		
		
		
		
	////index 1
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).put("index", 1);
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).put("items", new ArrayList<>());
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).get(0)).put("type",0);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).get(0)).put("dataURLList",new ArrayList());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).get(1)).put("type",1);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).get(1)).put("dataURLList",new ArrayList());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).get(2)).put("type",2);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).get(2)).put("dataURLList",new ArrayList());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).get(3)).put("type",3);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).get(3)).put("dataURLList",new ArrayList());
		
		
		
		
	////index 2
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).put("index", 2);
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).put("items", new ArrayList<>());
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).get(0)).put("type",0);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).get(0)).put("dataURLList",new ArrayList());
		
		
		

		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).get(1)).put("type",1);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).get(1)).put("dataURLList",new ArrayList());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).get(2)).put("type",2);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).get(2)).put("dataURLList",new ArrayList());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).get(3)).put("type",3);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).get(3)).put("dataURLList",new ArrayList());
		
		
		
		
		
	////index 3
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).put("index", 3);
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).put("items", new ArrayList<>());
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(0)).put("type",0);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(0)).put("dataURLList",new ArrayList());
		/*((List)((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).add(new LinkedHashMap());
		((List)((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).add(new LinkedHashMap());
		((Map<String,Object>)((List)((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).get(0)).put("id", 0);
		((Map<String,Object>)((List)((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).get(0)).put("url", "https://www.english-efl.com/wp-content/uploads/2019/12/test.jpg");
		((Map<String,Object>)((List)((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).get(1)).put("id", 1);
		((Map<String,Object>)((List)((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).get(1)).put("url", "https://miro.medium.com/max/2800/0*xMaFF2hSXpf_kIfG.jpg");*/		
		

		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(1)).put("type",1);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(1)).put("dataURLList",new ArrayList());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(2)).put("type",2);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(2)).put("dataURLList",new ArrayList());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(3)).put("type",3);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(3)).put("dataURLList",new ArrayList());
		
		
		
		
	////index 4
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).put("index", 4);
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).put("items", new ArrayList<>());
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).get(0)).put("type",0);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).get(0)).put("dataURLList",new ArrayList());
		
		

		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).get(1)).put("type",1);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).get(1)).put("dataURLList",new ArrayList());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).get(2)).put("type",2);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).get(2)).put("dataURLList",new ArrayList());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).get(3)).put("type",3);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).get(3)).put("dataURLList",new ArrayList());

		
		
		
		//System.out.println(data);
		
		
		
		
		/*ObjectMapper mapper = new ObjectMapper();
		String jsonStr = attrService.getValue("system__0__common__dataURL");
		System.out.println("tthis");
		System.out.println(jsonStr);
		Map<String, Object> data = mapper.readValue(jsonStr, new TypeReference <Map<String, Object>>(){});*/
		//((List)((Map<String, Object>)((List)((Map<String, Object>)((List)data.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).add("https://miro.medium.com/max/2800/0*xMaFF2hSXpf_kIfG.jpg");
		//((List)((Map<String, Object>)((List)((Map<String, Object>)((List)data.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).remove(0);
		//((List)((List)data.get("updatedMenuList")).get(5)).add(uuid);
		
		
		//attrService.setValue("system__0__common__dataURL", jsonData, null);
		//attrService.setValue("system__0__common__dataURL", Util.toJsonStr(data), null);
		attrService.setValue("system__0__common__dataURL", Util.toJsonStr(menuUiData), null);
		System.out.println("data");
		//System.out.println(Util.toJsonStr(data).getClass());
		//System.out.println(jsonData.getClass());
		
		

		return attrService.getValue("system__0__common__dataURL");
	}
	
	@CrossOrigin("*")
	@RequestMapping(value = "/test/setAttr", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String setAttr(HttpServletResponse response, @RequestParam String jsonData ) throws IOException{
		
		// updatedMenuList
		
		
		/*
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("updatedMenuList", new LinkedHashMap());
		((Map<String, Object>)jsonObject.get("updatedMenuList")).put("String","String");
		System.out.println(jsonObject);*/
		
		
		
		
		
//		System.out.println(((List)menuUiData.get("updatedMenuList")).get(0));
		
		
		Map<String, Object> menuUiData = new LinkedHashMap<>();
		menuUiData.put("updatedMenuList", new ArrayList<>());
		((List)menuUiData.get("updatedMenuList")).add(new LinkedHashMap());
		((List)menuUiData.get("updatedMenuList")).add(new LinkedHashMap());
		((List)menuUiData.get("updatedMenuList")).add(new LinkedHashMap());
		((List)menuUiData.get("updatedMenuList")).add(new LinkedHashMap());
		((List)menuUiData.get("updatedMenuList")).add(new LinkedHashMap());
		((List)menuUiData.get("updatedMenuList")).add(new ArrayList());
		
		////index 0
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).put("index", 0);
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).put("items", new ArrayList<>());
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).get(0)).put("type",0);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).get(0)).put("dataURLList",new LinkedHashMap());
		
		

		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).get(1)).put("type",1);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).get(1)).put("dataURLList",new LinkedHashMap());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).get(2)).put("type",2);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).get(2)).put("dataURLList",new LinkedHashMap());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).get(3)).put("type",3);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(0)).get("items")).get(3)).put("dataURLList",new LinkedHashMap());
		
		
		
		
	////index 1
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).put("index", 1);
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).put("items", new ArrayList<>());
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).get(0)).put("type",0);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).get(0)).put("dataURLList",new LinkedHashMap());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).get(1)).put("type",1);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).get(1)).put("dataURLList",new LinkedHashMap());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).get(2)).put("type",2);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).get(2)).put("dataURLList",new LinkedHashMap());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).get(3)).put("type",3);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(1)).get("items")).get(3)).put("dataURLList",new LinkedHashMap());
		
		
		
		
	////index 2
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).put("index", 2);
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).put("items", new ArrayList<>());
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).get(0)).put("type",0);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).get(0)).put("dataURLList",new LinkedHashMap());
		
		
		

		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).get(1)).put("type",1);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).get(1)).put("dataURLList",new LinkedHashMap());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).get(2)).put("type",2);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).get(2)).put("dataURLList",new LinkedHashMap());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).get(3)).put("type",3);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(2)).get("items")).get(3)).put("dataURLList",new LinkedHashMap());
		
		
		
		
		
	////index 3
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).put("index", 3);
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).put("items", new ArrayList<>());
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(0)).put("type",0);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(0)).put("dataURLList",new ArrayList());
		((List)((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).add(new LinkedHashMap());
		((List)((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).add(new LinkedHashMap());
		((Map<String,Object>)((List)((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).get(0)).put("id", 0);
		((Map<String,Object>)((List)((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).get(0)).put("url", "https://www.english-efl.com/wp-content/uploads/2019/12/test.jpg");
		((Map<String,Object>)((List)((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).get(1)).put("id", 1);
		((Map<String,Object>)((List)((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).get(1)).put("url", "https://miro.medium.com/max/2800/0*xMaFF2hSXpf_kIfG.jpg");		
		

		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(1)).put("type",1);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(1)).put("dataURLList",new LinkedHashMap());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(2)).put("type",2);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(2)).put("dataURLList",new LinkedHashMap());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(3)).put("type",3);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(3)).get("items")).get(3)).put("dataURLList",new LinkedHashMap());
		
		
		
		
	////index 4
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).put("index", 4);
		((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).put("items", new ArrayList<>());
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).get(0)).put("type",0);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).get(0)).put("dataURLList",new LinkedHashMap());
		
		

		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).get(1)).put("type",1);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).get(1)).put("dataURLList",new LinkedHashMap());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).get(2)).put("type",2);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).get(2)).put("dataURLList",new LinkedHashMap());
		
		
		
		((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).add(new LinkedHashMap());
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).get(3)).put("type",3);
		((Map<String, Object>)((List)((Map<String, Object>)((List)menuUiData.get("updatedMenuList")).get(4)).get("items")).get(3)).put("dataURLList",new LinkedHashMap());

		
		
		
		//System.out.println(data);
		
		
		
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonStr = attrService.getValue("system__0__common__dataURL");
		System.out.println("tthis");
		System.out.println(jsonStr);
		Map<String, Object> data = mapper.readValue(jsonStr, new TypeReference <Map<String, Object>>(){});
		//((List)((Map<String, Object>)((List)((Map<String, Object>)((List)data.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).add("https://miro.medium.com/max/2800/0*xMaFF2hSXpf_kIfG.jpg");
		//((List)((Map<String, Object>)((List)((Map<String, Object>)((List)data.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).remove(0);
		//((List)((List)data.get("updatedMenuList")).get(5)).add(uuid);
		
		
		attrService.setValue("system__0__common__dataURL", jsonData, null);
		//attrService.setValue("system__0__common__dataURL", Util.toJsonStr(data), null);
		//attrService.setValue("system__0__common__dataURL", Util.toJsonStr(menuUiData), null);
		System.out.println("data");
		//System.out.println(Util.toJsonStr(data).getClass());
		System.out.println(jsonData.getClass());
		
		

		return attrService.getValue("system__0__common__dataURL");
	}
	
	@CrossOrigin("*")
	@RequestMapping(value = "/test/initAdmin", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String initAdmin(HttpServletResponse response) throws IOException{
		
		// updatedMenuList
		
		
		/*
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("updatedMenuList", new LinkedHashMap());
		((Map<String, Object>)jsonObject.get("updatedMenuList")).put("String","String");
		System.out.println(jsonObject);*/
		
		
		
		
		
//		System.out.println(((List)menuUiData.get("updatedMenuList")).get(0));
		
		
		Map<String, Object> adminData = new LinkedHashMap<>();
		adminData.put("admin", new ArrayList<>());
		((List)adminData.get("admin")).add(new LinkedHashMap<>());
		((Map<String, Object>)((List)adminData.get("admin")).get(0)).put("id", "admin");
		((Map<String, Object>)((List)adminData.get("admin")).get(0)).put("passwd", "admin");
		
		
		

		
		
		
		//System.out.println(data);
		
		
		
		
		/*ObjectMapper mapper = new ObjectMapper();
		String jsonStr = attrService.getValue("system__0__common__dataURL");
		System.out.println("tthis");
		System.out.println(jsonStr);
		Map<String, Object> data = mapper.readValue(jsonStr, new TypeReference <Map<String, Object>>(){});*/
		//((List)((Map<String, Object>)((List)((Map<String, Object>)((List)data.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).add("https://miro.medium.com/max/2800/0*xMaFF2hSXpf_kIfG.jpg");
		//((List)((Map<String, Object>)((List)((Map<String, Object>)((List)data.get("updatedMenuList")).get(3)).get("items")).get(0)).get("dataURLList")).remove(0);
		//((List)((List)data.get("updatedMenuList")).get(5)).add(uuid);
		
		
		//attrService.setValue("system__0__common__dataURL", jsonData, null);
		//attrService.setValue("system__0__common__dataURL", Util.toJsonStr(data), null);
		attrService.setValue("system__0__common__admin", Util.toJsonStr(adminData), null);
		System.out.println("data");
		//System.out.println(Util.toJsonStr(data).getClass());
		//System.out.println(jsonData.getClass());
		
		

		return attrService.getValue("system__0__common__admin");
	}
	
	

	
}
