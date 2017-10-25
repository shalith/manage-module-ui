package com.wso2telco.dep.manageservice.resource.service;

import com.wso2telco.dep.manageservice.resource.util.ServiceTypes;

/**
 * Copyright (c) 2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * <p>
 * WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class ServiceFactory {
	static ServiceFactory instance;
	private ServiceFactory(){}

	public static synchronized ServiceFactory getInstance(){
		if(instance!=null){
			instance = new ServiceFactory();
		}
		return instance;
	}


    public Serviceable getServiceFactory(ServiceTypes serviceTypes){
    	Serviceable service;
    	switch (serviceTypes) {
		case QUOTA:

			break;
		case RATE:
			service =RateFactory.getInstace();
			break;
		default:
			break;

		}
    	return service;
    }

}