package com.sansan.test1;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

public class Test1 {
	@Test
	public void createTable(){
		ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
		//连接数据库的配置4
		processEngineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");
		
		processEngineConfiguration.setJdbcUrl("jdbc:mysql://rm-2zehj99n4j00zyepvo.mysql.rds.aliyuncs.com:3306/fanfan?useOldAliasMetadataBehavior=true&amp;useUnicode=true&amp;characterEncoding=utf8&amp;allowMultiQueries=true");
		processEngineConfiguration.setJdbcUsername("fanfan");
		processEngineConfiguration.setJdbcPassword("Fanfan314");
		
		/**
		 	public static final String DB_SCHEMA_UPDATE_FALSE = "false";不能自动创建表，需要表存在
  			public static final String DB_SCHEMA_UPDATE_CREATE_DROP = "create-drop";先删除表再创建表
  			public static final String DB_SCHEMA_UPDATE_TRUE = "true";如果表不存在，自动创建表
		 */
		processEngineConfiguration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
		//工作流的核心对象，ProcessEnginee对象
		ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
		System.out.println("processEngine:"+processEngine);
	}

}
