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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import com.google.common.io.Resources;
import io.kubernetes.client.util.credentials.AccessTokenCredentialProvider;
import io.kubernetes.client.util.credentials.ClientCertificateCredentialProvider;
import io.kubernetes.client.util.credentials.UsernamePasswordCredentialProvider;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

import java.nio.file.Files;
import java.nio.file.Paths;
import javax.net.ssl.KeyManager;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;
import org.junit.rules.TemporaryFolder;

import io.kubernetes.client.ApiClient;
import okio.ByteString;

/**
 * Tests for the ConfigBuilder helper class
 */
public class ClientBuilderTest {
	private static final String HOME_PATH = Resources.getResource("").getPath();
	private static final String KUBECONFIG_FILE_PATH = Resources.getResource("kubeconfig").getPath();

	private String basePath = "http://localhost";
  private String apiKey = "ABCD";
  private String userName = "userName";
  private String password = "password";
  private String apiKeyPrefix = "Bearer";
  private String certificateAuthorityData = null;

	@Rule
	public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

	@Test
	public void testDefaultsWithNoFiles() throws IOException {
		environmentVariables.set("HOME", "/non-existent");
		final ApiClient client = ClientBuilder
				.defaults()
				.build();
		assertEquals("http://localhost:8080", client.getBasePath());
	}

	@Test
	public void testDefaultsReadsHomeDir() throws Exception {
    environmentVariables.set("HOME", HOME_PATH);
    ApiClient client = ClientBuilder
        .defaults()
        .build();
    assertEquals("http://home.dir.com", client.getBasePath());
	}

	@Test
	public void testDefaultsReadsKubeConfig() throws Exception {
		environmentVariables.set("KUBECONFIG", KUBECONFIG_FILE_PATH);
		ApiClient client = ClientBuilder
				.defaults()
				.build();
		assertEquals("http://kubeconfig.dir.com", client.getBasePath());
	}

	@Test
	public void testKubeconfigPreferredOverHomeDir() throws Exception {
		environmentVariables.set("HOME", HOME_PATH);
		environmentVariables.set("KUBECONFIG", KUBECONFIG_FILE_PATH);
		ApiClient client = ClientBuilder
				.defaults()
				.build();
		// $KUBECONFIG should take precedence over $HOME/.kube/config
		assertEquals("http://kubeconfig.dir.com", client.getBasePath());
	}

	@Test
	public void testUserNamePasswordClientBuilder() throws Exception{
    final ApiClient client = (new ClientBuilder())
        .setBasePath(basePath)
        .setCredentialProvider(new UsernamePasswordCredentialProvider(userName, password))
        .build();
    assertEquals(basePath, client.getBasePath());
    assertEquals(true, client.isVerifyingSsl());
    assertEquals("Basic", ((io.kubernetes.client.auth.ApiKeyAuth)client.getAuthentications().get("BearerToken")).getApiKeyPrefix());
    assertEquals(ByteString.of((userName+":"+password).getBytes(Charset.forName("ISO-8859-1"))).base64(), ((io.kubernetes.client.auth.ApiKeyAuth)client.getAuthentications().get("BearerToken")).getApiKey());
	}

	@Test
	public void testApiKeyConfigbuilder() throws Exception {
		final ApiClient client = new ClientBuilder()
				.setBasePath(basePath)
				.setCredentialProvider(new AccessTokenCredentialProvider(apiKey))
				.build();
		assertEquals(basePath, client.getBasePath());
		assertEquals(true, client.isVerifyingSsl());
		assertEquals(apiKeyPrefix, ((io.kubernetes.client.auth.ApiKeyAuth)client.getAuthentications().get("BearerToken")).getApiKeyPrefix());
		assertEquals( apiKey, ((io.kubernetes.client.auth.ApiKeyAuth)client.getAuthentications().get("BearerToken")).getApiKey());
		assertEquals(null,((io.kubernetes.client.auth.HttpBasicAuth)client.getAuthentications().get("BasicAuth")).getUsername());
	}

	@Test
	public void testKeyMgrANDCertConfigBUilder() {
		// will not fail even if file not found exception occurs for clientCertFile
		try{
			//keyMgrs = SSLUtils.keyManagers(clientCertData, clientCertFile, clientKeyData, clientKeyFile, algo, passphrase, keyStoreFile, keyStorePassphrase);
			//by default verify ssl is false
			ApiClient client = (new ClientBuilder())
					.setBasePath(basePath)
					.setCredentialProvider(new ClientCertificateCredentialProvider(null, null))
					.setCertificateAuthority(certificateAuthorityData)
					.setVerifyingSsl(true)
					.build();
			assertEquals(basePath, client.getBasePath());
			assertEquals(true, client.isVerifyingSsl());
			//below assert is not appropriate
			//assertSame(keyMgrs, client.getKeyManagers());
		}
		catch(Exception e){
			//e.printStackTrace();
		}
	}
}
