/*
Copyright 2017 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package io.kubernetes.client.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

import javax.net.ssl.KeyManager;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import okio.ByteString;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.KubeConfig;

public class ConfigBuilder {

	private boolean clusterMode = false;
	private boolean defaultKubeConfigMode = false;
	private boolean defaultClientMode = false;
	private boolean verifyingSsl = false;
	private String basePath = null;
	private File certificateAuthorityFile = null;
	private String certificateAuthorityData = null;
	private String apiKey = null;
	private String userName = null;
	private String password = null;
	private KeyManager[] keyMgrs = null;
	private String accessToken = null;
	private String apiKeyPrefix = null;
	private KubeConfig kubeConfig = null;

	private static final Logger log = Logger.getLogger(Config.class);

	public String getUserName() {
		return userName;
	}

	public ConfigBuilder setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public ConfigBuilder setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getApiKey() {
		return apiKey;
	}

	public ConfigBuilder setApiKey(String apiKey) {
		this.apiKey = apiKey;
		return this;
	}

	public String getBasePath() {
		return basePath;
	}

	public ConfigBuilder setBasePath(String basePath) {
		this.basePath = basePath;
		return this;
	}

	public File getCertificateAuthorityFile() {
		return certificateAuthorityFile;
	}

	public ConfigBuilder setCertificateAuthority(File certificateAuthorityFile) {
		this.certificateAuthorityFile = certificateAuthorityFile;
		this.verifyingSsl = true;
		return this;
	}

	public String getCertificateAuthorityData() {
		return certificateAuthorityData;
	}

	public ConfigBuilder setCertificateAuthority(String certificateAuthorityData) {
		this.certificateAuthorityData = certificateAuthorityData;
		this.verifyingSsl = true;
		return this;
	}

	public ConfigBuilder setClusterMode() {
		this.clusterMode = true;
		return this;
	}

	public ConfigBuilder setKubeConfig(KubeConfig config) {
		this.kubeConfig = config;
		return this;
	}

	public ConfigBuilder setDefaultKubeConfigMode() {
		this.defaultKubeConfigMode = true;
		return this;
	}

	public ConfigBuilder setKubeConfig(String fileName) throws FileNotFoundException {
		this.kubeConfig = KubeConfig.loadKubeConfig(new FileReader(fileName));
		return this;
	}

	public ConfigBuilder setKubeConfig(Reader input) {
		this.kubeConfig = KubeConfig.loadKubeConfig(input);
		return this;
	}

	public ConfigBuilder setKubeConfig(InputStream stream) {
		this.kubeConfig = KubeConfig.loadKubeConfig(new InputStreamReader(stream));
		return this;
	}

	public KeyManager[] getKeyMgrs() {
		return keyMgrs;
	}

	public ConfigBuilder setKeyMgrs(KeyManager[] keyMgrs) {
		this.keyMgrs = keyMgrs;
		return this;
	}

	public boolean isVerifyingSsl() {
		return verifyingSsl;
	}

	public ConfigBuilder setVerifyingSsl(boolean verifyingSsl) {
		this.verifyingSsl = verifyingSsl;
		return this;
	}

	public boolean isDefaultClientMode() {
		return defaultClientMode;
	}

	public ConfigBuilder setDefaultClientMode() {
		this.defaultClientMode = true;
		return this;
	}

	public String getApiKeyPrefix() {
		return apiKeyPrefix;
	}

	public ConfigBuilder setApiKeyPrefix(String apiKeyPrefix) {
		this.apiKeyPrefix = apiKeyPrefix;
		return this;
	}

	public ApiClient build() {
		ApiClient client = new ApiClient();

		if( kubeConfig !=null) {
			client = Config.fromConfig(kubeConfig);
		}

		if(defaultKubeConfigMode == true) {
			try {
				client = Config.fromConfig(KubeConfig.loadDefaultKubeConfig());
			} catch (FileNotFoundException e) {
				log.error("Unable to find the file", e);
			}
		}

		if(clusterMode == true) {
			try {
				client = Config.fromCluster();
			} catch (IOException e) {
				log.error("Exception ->", e);
			}
		}

		if(defaultClientMode ==true ) {
			try {
				client = Config.defaultClient();
			} catch (IOException e) {
				log.error("Exception -> ", e);
			}
		}

		if (basePath != null ) {
			if(basePath.endsWith("/")) {
				basePath = basePath.substring(0, basePath.length() - 1);
			}
			client.setBasePath(basePath);
		} else {
			if((clusterMode == false) && (defaultClientMode == false) && (defaultKubeConfigMode == false)) {
				throw new IllegalArgumentException("please set kubernetes URL ex:http://localhost");
			}
		}

		if(keyMgrs != null) {
			client.setKeyManagers(keyMgrs);
		}

		if(userName != null){
			client.setUsername(userName);
		}

		if(password != null){
			client.setPassword(password);
		}

		if(( userName != null )&&(password != null)) {
			final String usernameAndPassword = userName + ":" + password;
			client.setApiKeyPrefix("Basic");
			client.setApiKey(ByteString.of(usernameAndPassword.getBytes(Charset.forName("ISO-8859-1"))).base64());
		}

		if(accessToken != null) {
			if (apiKeyPrefix == null){
				client.setApiKeyPrefix("Bearer");
			}
			client.setAccessToken(accessToken);
		}

		if(apiKeyPrefix != null) {
			client.setApiKeyPrefix(apiKeyPrefix);
		}

		if(apiKey != null) {
			if (apiKeyPrefix == null){
				client.setApiKeyPrefix("Bearer");
			}
			client.setApiKey(apiKey);
		}

		client.setVerifyingSsl(verifyingSsl);

		if(certificateAuthorityFile != null) {
			try {
				client.setSslCaCert(new FileInputStream(certificateAuthorityFile));
			} catch (FileNotFoundException e) {
				log.error("Unable to find the file", e);
			}
		}

		if(certificateAuthorityData != null) {
			byte[] bytes = Base64.decodeBase64(certificateAuthorityData);
			client.setSslCaCert(new ByteArrayInputStream(bytes));
		}

		return client;
	}
}