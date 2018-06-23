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

import static org.junit.Assert.*;

import com.google.common.io.Resources;
import io.kubernetes.client.models.*;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.Test;

public class YamlTest {
  private static final String TEST_YAML_FILE_PATH = Resources.getResource("test.yaml").getPath();
  private static final String[] kinds =
      new String[] {
        "Pod",
        "CronJob",
        "HorizontalPodAutoscaler",
        "ClusterRole",
        "Deployment",
        "APIService",
        "Scale",
        "Deployment"
      };
  private static final String[] apiVersions =
      new String[] {
        "v1",
        "batch/v2alpha1",
        "autoscaling/v2beta1",
        "rbac.authorization.k8s.io/v1alpha1",
        "apps/v1beta2",
        "apiregistration.k8s.io/v1beta1",
        "extensions/v1beta1",
        "apps/v1beta1"
      };
  private static final String[] classNames =
      new String[] {
        "V1Pod",
        "V2alpha1CronJob",
        "V2beta1HorizontalPodAutoscaler",
        "V1alpha1ClusterRole",
        "V1beta2Deployment",
        "V1beta1APIService",
        "ExtensionsV1beta1Scale",
        "AppsV1beta1Deployment"
      };
  private static final String input =
      "kind: " + "XXXX" + "\n" + "apiVersion: " + "YYYY" + "\n" + "metadata:\n" + "  name: foo";

  @Test
  public void testLoad() {
    for (int i = 0; i < kinds.length; i++) {
      String className = classNames[i];
      try {
        Object obj =
            Yaml.load(
                new StringReader(input.replace("XXXX", kinds[i]).replace("YYYY", apiVersions[i])));
        Method m = obj.getClass().getMethod("getMetadata");
        V1ObjectMeta metadata = (V1ObjectMeta) m.invoke(obj);

        assertEquals("foo", metadata.getName());
        assertEquals(className, obj.getClass().getSimpleName());
      } catch (Exception ex) {
        assertNull("Unexpected exception: " + ex.toString(), ex);
      }
    }
  }

  @Test
  public void testLoadAll() throws IOException {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < kinds.length; i++) {
      sb.append(input.replace("XXXX", kinds[i]).replace("YYYY", apiVersions[i]));
      sb.append("\n---\n");
    }

    List<Object> list = null;
    list = (List<Object>) Yaml.loadAll(sb.toString());
    for (int i = 0; i < kinds.length; i++) {
      String className = classNames[i];
      try {
        Object obj = list.get(i);
        Method m = obj.getClass().getMethod("getMetadata");
        V1ObjectMeta metadata = (V1ObjectMeta) m.invoke(obj);

        assertEquals("foo", metadata.getName());
        assertEquals(className, obj.getClass().getSimpleName());
      } catch (Exception ex) {
        assertNull("Unexpected exception: " + ex.toString(), ex);
      }
    }
  }

  @Test
  public void testLoadAllFile() throws Exception {
    List<Object> list = Yaml.loadAll(new File(TEST_YAML_FILE_PATH));
    for (Object object : list) {
      String type = object.getClass().getSimpleName();
      if (type.equals("V1Service")) {
        V1Service svc = (V1Service) object;
        assertEquals("v1", svc.getApiVersion());
        assertEquals("Service", svc.getKind());
        assertEquals("mock", svc.getMetadata().getName());
      } else if (type.equals("AppsV1beta1Deployment")) {
        AppsV1beta1Deployment deploy = (AppsV1beta1Deployment) object;
        assertEquals("apps/v1beta1", deploy.getApiVersion());
        assertEquals("Deployment", deploy.getKind());
        assertEquals("helloworld", deploy.getMetadata().getName());
      } else if (type.equals("V1Secret")) {
        V1Secret secret = (V1Secret) object;
        assertEquals("Secret", secret.getKind());
        assertEquals("secret", secret.getMetadata().getName());
        assertEquals("Opaque", secret.getType());
        assertEquals(
            "hello", new String(secret.getData().get("secret-data"), StandardCharsets.UTF_8));
      } else {
        throw new Exception("some thing wrong happened");
      }
    }
  }

  @Test
  public void testLoadIntOrString() {
    try {
      String strInput = "targetPort: test";
      String intInput = "targetPort: 1";

      V1ServicePort stringPort = Yaml.loadAs(strInput, V1ServicePort.class);
      V1ServicePort intPort = Yaml.loadAs(intInput, V1ServicePort.class);

      assertFalse(
          "Target port for 'stringPort' was parsed to an integer, string expected.",
          stringPort.getTargetPort().isInteger());
      assertTrue(
          "Target port for 'intPort' was parsed to a string, integer expected.",
          intPort.getTargetPort().isInteger());

    } catch (Exception ex) {
      assertNull("Unexpected exception: " + ex.toString(), ex);
    }
  }

  @Test
  public void testLoadBytes() {
    try {
      String strInput = "data:\n  hello: aGVsbG8=";

      V1Secret secret = Yaml.loadAs(strInput, V1Secret.class);

      assertEquals(
          "Incorrect value loaded for Base64 encoded secret",
          "hello",
          new String(secret.getData().get("hello"), StandardCharsets.UTF_8));

    } catch (Exception ex) {
      assertNull("Unexpected exception: " + ex.toString(), ex);
    }
  }
}
