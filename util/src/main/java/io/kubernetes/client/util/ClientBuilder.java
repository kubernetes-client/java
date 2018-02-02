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

public class ClientBuilder {

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
	private ApiClient client = null;

	private static final Logger log = Logger.getLogger(Config.class);

	public String getUserName() {
		return userName;
	}

	public ClientBuilder setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public ClientBuilder setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getApiKey() {
		return apiKey;
	}

	public ClientBuilder setApiKey(String apiKey) {
		this.apiKey = apiKey;
		return this;
	}

	public String getBasePath() {
		return basePath;
	}

	public ClientBuilder setBasePath(String basePath) {
		this.basePath = basePath;
		return this;
	}

	public File getCertificateAuthorityFile() {
		return certificateAuthorityFile;
	}

	public ClientBuilder setCertificateAuthority(File certificateAuthorityFile) {
		this.certificateAuthorityFile = certificateAuthorityFile;
		this.verifyingSsl = true;
		return this;
	}

	public String getCertificateAuthorityData() {
		return certificateAuthorityData;
	}

	public ClientBuilder setCertificateAuthority(String certificateAuthorityData) {
		this.certificateAuthorityData = certificateAuthorityData;
		this.verifyingSsl = true;
		return this;
	}

	public ClientBuilder setClusterMode() throws IOException {
		this.client = Config.fromCluster();
		return this;
	}

	public ClientBuilder setKubeConfig(KubeConfig config) {
		this.kubeConfig = config;
		if( this.kubeConfig !=null) {
			this.client = Config.fromConfig(this.kubeConfig);
		}
		return this;
	}

	public ClientBuilder setDefaultKubeConfigMode() throws FileNotFoundException {
		this.client = Config.fromConfig(KubeConfig.loadDefaultKubeConfig());
		return this;
	}

	public ClientBuilder setKubeConfig(File kubeFile) throws FileNotFoundException {
		this.kubeConfig = KubeConfig.loadKubeConfig(new FileReader(kubeFile));
		return this;
	}

	public ClientBuilder setKubeConfig(Reader input) {
		this.kubeConfig = KubeConfig.loadKubeConfig(input);
		return this;
	}

	public ClientBuilder setKubeConfig(InputStream stream) {
		this.kubeConfig = KubeConfig.loadKubeConfig(new InputStreamReader(stream));
		return this;
	}

	public KeyManager[] getKeyMgrs() {
		return keyMgrs;
	}

	public ClientBuilder setKeyMgrs(KeyManager[] keyMgrs) {
		this.keyMgrs = keyMgrs;
		return this;
	}

	public boolean isVerifyingSsl() {
		return verifyingSsl;
	}

	public ClientBuilder setVerifyingSsl(boolean verifyingSsl) {
		this.verifyingSsl = verifyingSsl;
		return this;
	}


	public ClientBuilder setDefaultClientMode() throws IOException {
		client = Config.defaultClient();
		return this;
	}

	public String getApiKeyPrefix() {
		return apiKeyPrefix;
	}

	public ClientBuilder setApiKeyPrefix(String apiKeyPrefix) {
		this.apiKeyPrefix = apiKeyPrefix;
		return this;
	}

	public ApiClient build() throws FileNotFoundException {
		if(client == null) {
			client = new ApiClient();
		}

		String localBasePath = client.getBasePath();

		if (basePath != null) {
			if(basePath.endsWith("/")) {
				basePath = basePath.substring(0, basePath.length() - 1);
			}
			client.setBasePath(basePath);
		}else {
			if (localBasePath.length() == 0) {
				client.setBasePath("http://localhost:8080");
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
			client.setSslCaCert(new FileInputStream(certificateAuthorityFile));
		}

		if(certificateAuthorityData != null) {
			byte[] bytes = Base64.decodeBase64(certificateAuthorityData);
			client.setSslCaCert(new ByteArrayInputStream(bytes));
		}

		return client;
	}
}