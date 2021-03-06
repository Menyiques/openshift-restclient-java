/******************************************************************************* 
 * Copyright (c) 2016 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package com.openshift.restclient.api.models;

/**
 * A resource where the client can
 * define the name on the object
 * (e.g. ObjectRef)
 * @author jeff.cantrill
 *
 */
public interface INameSetable {

	/**
	 * The name of the resource
	 * @param name
	 */
	void setName(String name);
}
