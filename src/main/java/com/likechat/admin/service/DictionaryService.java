package com.likechat.admin.service;

import java.util.List;
import java.util.Map;

import com.likechat.admin.persistence.po.DataDictionary;
import com.likechat.admin.persistence.po.SelectGroup;


public interface DictionaryService extends CommonService<DataDictionary> {

	public int countKey(Map<String, Object> conditionMap);

	public DataDictionary getDicByKey(String key);

	public Map<String, String> getDicValueByKey(String key) throws Exception;
	
	public List<SelectGroup> getDicValueListByKey(String key);

}
