package com.sansan.test1;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

public class Test1 {
	@Test
	public void createTable(){
		ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
		//�������ݿ������4
		processEngineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");
		
		processEngineConfiguration.setJdbcUrl("jdbc:mysql://rm-2zehj99n4j00zyepvo.mysql.rds.aliyuncs.com:3306/fanfan?useOldAliasMetadataBehavior=true&amp;useUnicode=true&amp;characterEncoding=utf8&amp;allowMultiQueries=true");
		processEngineConfiguration.setJdbcUsername("fanfan");
		processEngineConfiguration.setJdbcPassword("Fanfan314");
		
		/**
		 	public static final String DB_SCHEMA_UPDATE_FALSE = "false";�����Զ���������Ҫ�����
  			public static final String DB_SCHEMA_UPDATE_CREATE_DROP = "create-drop";��ɾ�����ٴ�����
  			public static final String DB_SCHEMA_UPDATE_TRUE = "true";��������ڣ��Զ�������
		 */
		processEngineConfiguration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
		//�������ĺ��Ķ���ProcessEnginee����
		ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
		System.out.println("processEngine:"+processEngine);
	}

}
