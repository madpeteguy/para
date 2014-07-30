/*
 * Copyright 2013-2014 Erudika. http://erudika.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For issues and patches go to: https://github.com/erudika
 */
package com.erudika.para.utils.filters;

import javax.servlet.ServletException;

/**
 * GZip Filter. Adapted from JHipster: https://github.com/jhipster/generator-jhipster
 *
 * @author Julien Dubois
 * @author Jérôme Mirc
 */
public class GzipResponseHeadersNotModifiableException extends ServletException {

	private static final long serialVersionUID = 1L;

	public GzipResponseHeadersNotModifiableException(String message) {
		super(message);
	}
}