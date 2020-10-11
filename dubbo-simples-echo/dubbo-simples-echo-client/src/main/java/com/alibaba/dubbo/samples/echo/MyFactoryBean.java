package com.alibaba.dubbo.samples.echo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.FactoryBean;
/**
 * @description:
 * @author: WEIYI SONG
 * @time: 03 15:48
 **/

public class MyFactoryBean implements FactoryBean{

	public Object getObject() throws Exception {
		return new UserServiceImpl();
	}


	public Class<?> getObjectType() {
		return null;
	}


	public boolean isSingleton() {
		return false;
	}
}
