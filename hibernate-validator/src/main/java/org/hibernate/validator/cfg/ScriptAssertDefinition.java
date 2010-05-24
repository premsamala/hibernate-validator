// $Id$
/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc. and/or its affiliates, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hibernate.validator.cfg;

import java.lang.annotation.ElementType;
import javax.validation.Payload;

import org.hibernate.validator.constraints.ScriptAssert;

/**
 * @author Hardy Ferentschik
 */
public class ScriptAssertDefinition extends ConstraintDefinition<ScriptAssert> {

	public ScriptAssertDefinition(Class<?> beanType, String property, ElementType elementType, ConstraintMapping mapping) {
		super( beanType, ScriptAssert.class, property, elementType, mapping );
	}

	public ScriptAssertDefinition message(String message) {
		addParameter( "message", message );
		return this;
	}

	public ScriptAssertDefinition groups(Class<?>... groups) {
		addParameter( "groups", groups );
		return this;
	}

	public ScriptAssertDefinition payload(Class<? extends Payload>... payload) {
		addParameter( "payload", payload );
		return this;
	}

	public ScriptAssertDefinition lang(String lang) {
		addParameter( "lang", lang );
		return this;
	}

	public ScriptAssertDefinition script(String script) {
		addParameter( "script", script );
		return this;
	}

	public ScriptAssertDefinition alias(String alias) {
		addParameter( "alias", alias );
		return this;
	}
}