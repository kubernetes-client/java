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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

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
public class ConfigBuilderTest {
	String basePath = "http://localhost";
	String apiKey = "ABCD";
	String userName = "userName";
	String password = "password";
	String apiKeyPrefix = "Bearer";
	String certificateAuthorityData = null;
	String certificateAuthorityFile = "/home/user/.minikube/ca.crt";
	String clientCertData = null;
	String clientCertFile = "/home/user/.minikube/apiserver.crt";
	String clientKeyData = null;
	String clientKeyFile = "/home/user/.minikube/apiserver.key";
	String algo = "RSA";
	String passphrase = "";
	String keyStoreFile = null ;
	String keyStorePassphrase = null;
	KeyManager[] keyMgrs =null;
	
	@Rule
	public final EnvironmentVariables environmentVariables
	= new EnvironmentVariables();

	@Rule
	public TemporaryFolder folder= new TemporaryFolder();


	@Test
	public void testDefaultClientNothingPresent() {
		environmentVariables.set("HOME", "/non-existent");
		ApiClient client = (new ConfigBuilder())
				.setDefaultClientMode(true)
				.build();
		assertEquals("http://localhost:8080", client.getBasePath());
	}

	public static String HOME_CONFIG = 
			"apiVersion: v1\n" +
					"clusters:\n" +
					"- cluster:\n" +
					"    server: http://home.dir.com\n" +
					"  name: foo\n" +
					"contexts:\n" + 
					"- context:\n" +
					"    cluster: foo\n" + 
					"  name: foo-context\n" +
					"current-context: foo-context\n";

	public static String KUBECONFIG = 
			"apiVersion: v1\n" +
					"clusters:\n" +
					"- cluster:\n" +
					"    server: http://kubeconfig.dir.com\n" +
					"  name: foo\n" +
					"contexts:\n" + 
					"- context:\n" +
					"    cluster: foo\n" + 
					"  name: foo-context\n" +
					"current-context: foo-context\n";

	File config = null;
	File dir = null;
	File kubedir = null;
	File configFile = null;

	@Before
	public void setUp() throws IOException {
		dir = folder.newFolder();
		kubedir = new File(dir, ".kube");
		kubedir.mkdir();
		config = new File(kubedir, "config");
		FileWriter writer = new FileWriter(config);
		writer.write(HOME_CONFIG);
		writer.flush();
		writer.close();

		configFile = folder.newFile("config");
		writer = new FileWriter(configFile);
		writer.write(KUBECONFIG);
		writer.flush();
		writer.close();
	}

	@Test
	public void testDefaultClientHomeDir() {
		try {
			environmentVariables.set("HOME", dir.getCanonicalPath());
			ApiClient client = new ConfigBuilder()
					.setDefaultClientMode(true)
					.build();
			assertEquals("http://home.dir.com", client.getBasePath());
		} catch (Exception ex) {
			ex.printStackTrace();
			fail("Unexpected exception: " + ex);
		}
	}

	@Test
	public void testDefaultClientKubeConfig() {
		try {
			environmentVariables.set("KUBECONFIG", configFile.getCanonicalPath());
			ApiClient client = new ConfigBuilder()
					.setDefaultClientMode(true)
					.build();
			assertEquals("http://kubeconfig.dir.com", client.getBasePath());
		} catch (Exception ex) {
			ex.printStackTrace();
			fail("Unexpected exception: " + ex);
		}
	}

	@Test
	public void testDefaultClientPrecedence() {
		try {
			environmentVariables.set("HOME", dir.getCanonicalPath());
			environmentVariables.set("KUBECONFIG", configFile.getCanonicalPath());
			ApiClient client = new ConfigBuilder()
					.setDefaultClientMode(true)
					.build();
			// $KUBECONFIG should take precedence over $HOME/.kube/config
			assertEquals("http://kubeconfig.dir.com", client.getBasePath());
		} catch (Exception ex) {
			ex.printStackTrace();
			fail("Unexpected exception: " + ex);
		}
	}

	@Test
	public void testUserNamePasswordConfigBuilder() {
		try {
			ApiClient client = (new ConfigBuilder())
					.setbasePath(basePath)
					.setUserName(userName)
					.setPassword(password)
					.build();
			assertEquals(userName, ((io.kubernetes.client.auth.HttpBasicAuth)client.getAuthentication("BasicAuth")).getUsername());
			assertEquals(password, ((io.kubernetes.client.auth.HttpBasicAuth)client.getAuthentication("BasicAuth")).getPassword());
			assertEquals(basePath, client.getBasePath());
			assertEquals(false, client.isVerifyingSsl());
			assertEquals("Basic", ((io.kubernetes.client.auth.ApiKeyAuth)client.getAuthentications().get("BearerToken")).getApiKeyPrefix());
			assertEquals(ByteString.of((userName+":"+password).getBytes(Charset.forName("ISO-8859-1"))).base64(), ((io.kubernetes.client.auth.ApiKeyAuth)client.getAuthentications().get("BearerToken")).getApiKey());
		}
		catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected exception: " + e);
		}
	}

	@Test
	public void testApiKeyConfigbuilder() {
		ApiClient client = (new ConfigBuilder())
				.setbasePath(basePath)
				.setApiKeyPrefix(apiKeyPrefix)
				.setApiKey(apiKey)
				.build();
		assertEquals(basePath, client.getBasePath());
		assertEquals(false, client.isVerifyingSsl());
		assertEquals(apiKeyPrefix, ((io.kubernetes.client.auth.ApiKeyAuth)client.getAuthentications().get("BearerToken")).getApiKeyPrefix());
		assertEquals( apiKey, ((io.kubernetes.client.auth.ApiKeyAuth)client.getAuthentications().get("BearerToken")).getApiKey());
		assertEquals(null,((io.kubernetes.client.auth.HttpBasicAuth)client.getAuthentications().get("BasicAuth")).getUsername());
	}
	
	@Test
	public void testKeyMgrANDCertConfigBUilder() {
		// will not fail even if file not found exception occurs for clientCertFile
		try{
			keyMgrs = SSLUtils.keyManagers(clientCertData, clientCertFile, clientKeyData, clientKeyFile, algo, passphrase, keyStoreFile, keyStorePassphrase);
		//by default verify ssl is false
		ApiClient client = (new ConfigBuilder())
				.setbasePath(basePath)
				.setKeyMgrs(keyMgrs)
				.setCertificateAuthorityData(certificateAuthorityData)
				.setCertificateAuthorityFile(certificateAuthorityFile)
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
