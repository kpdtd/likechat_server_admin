package com.likechat.admin.persistence.mapper;

import java.util.Map;

import com.likechat.admin.persistence.po.DataDictionary;


public interface DictionaryMapper extends BaseMapper<DataDictionary> {

	int countKey(Map<String, Object> conditionMap);

}
