package com.likechat.admin.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.likechat.admin.persistence.mapper.DictionaryMapper;
import com.likechat.admin.persistence.po.DataDictionary;
import com.likechat.admin.persistence.po.SelectGroup;

@Service("dictionaryService")
public class DictionaryServiceImpl implements DictionaryService {

	@Autowired
	DictionaryMapper dictionaryMapper;
	
	@Override
	public int insert(DataDictionary record) throws SQLException {
		return dictionaryMapper.insert(record);
	}

	@Override
	public int update(DataDictionary record) throws SQLException {
		return dictionaryMapper.update(record);
	}

	@Override
	public int deleteById(Integer id) throws SQLException {
		return dictionaryMapper.deleteById(id);
	}

	@Override
	public DataDictionary selectById(Integer id) throws SQLException {
		return dictionaryMapper.getById(id);
	}

	@Override
	public List<DataDictionary> loadList(Map<String, Object> dataMap) throws SQLException {
		return dictionaryMapper.getListByMap(dataMap);
	}

	@Override
	public int count(Map<String, Object> condition) throws SQLException {
		return dictionaryMapper.count(condition);
	}

	@Override
	public int countKey(Map<String, Object> conditionMap) {
		return dictionaryMapper.countKey(conditionMap);
	}

	@Override
	public DataDictionary getDicByKey(String key) {
		DataDictionary dictionary = new DataDictionary();
		dictionary.setName(key);
		List<DataDictionary> dataList = dictionaryMapper.getListByPo(dictionary);
		if(dataList != null && dataList.size() > 0)
			return dataList.get(0);
		else {
			return null;
		}
	}

	@Override
	public Map<String, String> getDicValueByKey(String key) throws Exception{
		DataDictionary dictionary = new DataDictionary();
		Map<String, String> resMap = new HashMap<String, String>();
		dictionary.setName(key);
		List<DataDictionary> dataList = dictionaryMapper.getListByPo(dictionary);
		dictionary = dataList.get(0);
		if(dictionary != null) {
			String values = dictionary.getValue();
			String[] content = values.split(";");

			for(String con : content) {
				String[] kv = con.split("=");
				resMap.put(kv[0], kv[1]);
			}

		}

		return resMap;
	}

	@Override
	public List<SelectGroup> getDicValueListByKey(String key) {
		DataDictionary dictionary = new DataDictionary();
		dictionary.setName(key);
		List<DataDictionary> dataList = dictionaryMapper.getListByPo(dictionary);
		List<SelectGroup> groupList = new ArrayList<SelectGroup>();
		dictionary = dataList.get(0);
		if(dictionary != null) {
			String values = dictionary.getValue();
			String[] content = values.split(";");

			for(String con : content) {
				SelectGroup group = new SelectGroup();
				String[] kv = con.split("=");
				group.setId(kv[0]);
				group.setName(kv[1]);
				groupList.add(group);
			}

		}
		return groupList;
	}

}
