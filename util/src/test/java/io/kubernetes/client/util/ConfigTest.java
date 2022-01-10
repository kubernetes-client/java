/*
Copyright 2020 The Kubernetes Authors.
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

import static org.junit.Assert.*;
import static uk.org.webcompere.systemstubs.SystemStubs.withEnvironmentVariable;

import io.kubernetes.client.openapi.ApiClient;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/** Tests for the Config helper class */
public class ConfigTest {
  @Rule public TemporaryFolder folder = new TemporaryFolder();

  @Test
  public void testDefaultClientNothingPresent() {
    try {
      String path =
          withEnvironmentVariable("HOME", "/non-existent")
              .and("HOMEDRIVE", null)
              .and("USERPROFILE", null)
              .execute(
                  () -> {
                    ApiClient client = Config.defaultClient();
                    return client.getBasePath();
                  });
      assertEquals("http://localhost:8080", path);
    } catch (Exception ex) {
      fail("Unexpected exception: " + ex);
    }
  }

  public static String HOME_CONFIG =
      "apiVersion: v1\n"
          + "clusters:\n"
          + "- cluster:\n"
          + "    server: http://home.dir.com\n"
          + "  name: foo\n"
          + "contexts:\n"
          + "- context:\n"
          + "    cluster: foo\n"
          + "  name: foo-context\n"
          + "current-context: foo-context\n";

  public static String KUBECONFIG =
      "apiVersion: v1\n"
          + "clusters:\n"
          + "- cluster:\n"
          + "    server: http://kubeconfig.dir.com\n"
          + "  name: foo\n"
          + "contexts:\n"
          + "- context:\n"
          + "    cluster: foo\n"
          + "  name: foo-context\n"
          + "current-context: foo-context\n";

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
      String path =
          withEnvironmentVariable("HOME", dir.getCanonicalPath())
              .execute(
                  () -> {
                    ApiClient client = Config.defaultClient();
                    return client.getBasePath();
                  });
      assertEquals("http://home.dir.com", path);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Unexpected exception: " + ex);
    }
  }

  @Test
  public void testDefaultClientKubeConfig() {
    try {
      String path =
          withEnvironmentVariable("KUBECONFIG", configFile.getCanonicalPath())
              .execute(
                  () -> {
                    ApiClient client = Config.defaultClient();
                    return client.getBasePath();
                  });
      assertEquals("http://kubeconfig.dir.com", path);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Unexpected exception: " + ex);
    }
  }

  @Test
  public void testDefaultClientPrecedence() {
    try {
      String path =
          withEnvironmentVariable("HOME", dir.getCanonicalPath())
              .and("KUBECONFIG", configFile.getCanonicalPath())
              .execute(
                  () -> {
                    ApiClient client = Config.defaultClient();
                    return client.getBasePath();
                  });

      // $KUBECONFIG should take precedence over $HOME/.kube/config
      assertEquals("http://kubeconfig.dir.com", path);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Unexpected exception: " + ex);
    }
  }
}
