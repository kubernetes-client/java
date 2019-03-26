/*
Copyright 2018 The Kubernetes Authors.
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

import com.google.common.io.Resources;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.models.ExtensionsV1beta1Deployment;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import org.junit.Test;

public class JSONTest {
  private static final URL TEST_JSON_FILE = Resources.getResource("test.json");

  @Test
  public void testLoadQuantity() throws IOException {
    ApiClient client = Config.defaultClient();
    FileReader json = new FileReader(TEST_JSON_FILE.getPath());
    Object obj = client.getJSON().getGson().fromJson(json, ExtensionsV1beta1Deployment.class);
  }
}
