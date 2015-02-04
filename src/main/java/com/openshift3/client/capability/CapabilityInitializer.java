/*******************************************************************************
 * Copyright (c) 2015 Red Hat, Inc. Distributed under license by Red Hat, Inc.
 * All rights reserved. This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Red Hat, Inc.
 ******************************************************************************/
package com.openshift3.client.capability;

import java.util.Map;

/**
 * Convenience class to initialize capabilies.  Only adds entry
 * to underlying map if the capability is supported 
 */
public class CapabilityInitializer {

	/**
	 * Register the capability if it is supported
	 * @param capabilities
	 * @param capability
	 * @param impl
	 */
	public static void initializeCapability(Map<Class<? extends ICapability>, ICapability> capabilities, Class<? extends ICapability> capability, ICapability impl){
		if(impl.isSupported()){
			capabilities.put(capability, impl);
		}
	}
}
