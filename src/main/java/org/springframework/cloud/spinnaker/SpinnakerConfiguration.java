/*
 * Copyright 2016 the original author or authors.
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
 */
package org.springframework.cloud.spinnaker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Greg Turnquist
 */
@ConfigurationProperties(prefix = "spinnaker")
public class SpinnakerConfiguration {

	List<ModuleDetails> modules;

	Map<String, String> properties = new HashMap<>();

	Map<String, String> patterns = new HashMap<>();

	public List<ModuleDetails> getModules() {
		return modules;
	}

	public void setModules(List<ModuleDetails> modules) {
		this.modules = modules;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	public Map<String, String> getPatterns() {
		return patterns;
	}

	public void setPatterns(Map<String, String> patterns) {
		this.patterns = patterns;
	}
}
