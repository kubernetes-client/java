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

import com.google.common.io.ByteStreams;
import io.kubernetes.client.ApiClient;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

/**
 * Tests for the KubeConfigConfig helper class
 */
public class KubeConfigTest {

    @Rule
    public TemporaryFolder folder= new TemporaryFolder();

    public static String KUBECONFIG_TOKEN = 
        "apiVersion: v1\n" +
        "clusters:\n" +
        "- cluster:\n" +
        "    server: http://kubeconfig.dir.com\n" +
        "  name: foo\n" +
        "users:\n" +
        "- user:\n" +
        "   token: foobaz\n" +
        "  name: foo\n" + 
        "contexts:\n" + 
        "- context:\n" +
        "    cluster: foo\n" + 
        "    user: foo\n" +
        "  name: foo-context\n" +
        "current-context: foo-context\n";

    @Test
    public void testToken() {
        KubeConfig config = KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_TOKEN));
        assertEquals(config.getAccessToken(), "foobaz");
    }

    @Test
    public void testTokenFile() throws IOException {
        String token = "flubble";
        File tokenFile = folder.newFile("token-file.txt");
        Files.write(tokenFile.toPath(), token.getBytes("UTF-8"));

        String replace = KUBECONFIG_TOKEN.replace("foobaz", tokenFile.getCanonicalPath());
        replace = replace.replace("token:", "tokenFile:");
        KubeConfig config = KubeConfig.loadKubeConfig(new StringReader(replace));
        assertEquals(config.getAccessToken(), token);
    }
}