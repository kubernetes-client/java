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

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import io.kubernetes.client.Resources;
import io.kubernetes.client.common.KubernetesType;
import io.kubernetes.client.openapi.models.V1CustomResourceDefinition;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1Secret;
import io.kubernetes.client.openapi.models.V1Service;
import io.kubernetes.client.openapi.models.V1ServicePort;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class YamlTest {

  private static final URL TEST_YAML_FILE = Resources.getResource("test.yaml");
  private static final String TEST_YAML_FILE_PATH = new File(TEST_YAML_FILE.getPath()).toString();

  private static final URL EXPECTED_YAML_FILE = Resources.getResource("expected.yaml");

  private static final URL CREATED_TIMESTAMP_FILE = Resources.getResource("test-pod.yaml");

  private static final URL TAGGED_FILE = Resources.getResource("pod-tag.yaml");

  private static final URL CRD_INT_OR_STRING_FILE = Resources.getResource("crd-int-or-string.yaml");

  private static final String[] kinds =
      new String[] {
        "Pod",
        "CronJob",
        "HorizontalPodAutoscaler",
        "ClusterRole",
        "Deployment",
        "APIService",
        "Scale",
      };
  private static final String[] apiVersions =
      new String[] {
        "v1",
        "batch/v1",
        "autoscaling/v2",
        "rbac.authorization.k8s.io/v1",
        "apps/v1",
        "apiregistration.k8s.io/v1",
        "apps/v1",
      };
  private static final String[] classNames =
      new String[] {
        "V1Pod",
        "V1CronJob",
        "V2HorizontalPodAutoscaler",
        "V1ClusterRole",
        "V1Deployment",
        "V1APIService",
        "V1Scale",
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
    List<KubernetesType> k8ObjectList = new ArrayList<>();
    for (Object object : list) {
      String type = object.getClass().getSimpleName();
      if (type.equals("V1Service")) {
        V1Service svc = (V1Service) object;
        assertEquals("v1", svc.getApiVersion());
        assertEquals("Service", svc.getKind());
        assertEquals("mock", svc.getMetadata().getName());
        k8ObjectList.add(svc);
      } else if (type.equals("V1Deployment")) {
        V1Deployment deploy = (V1Deployment) object;
        assertEquals("apps/v1", deploy.getApiVersion());
        assertEquals("Deployment", deploy.getKind());
        assertEquals("helloworld", deploy.getMetadata().getName());
        k8ObjectList.add(deploy);
      } else if (type.equals("V1Secret")) {
        V1Secret secret = (V1Secret) object;
        assertEquals("Secret", secret.getKind());
        assertEquals("secret", secret.getMetadata().getName());
        assertEquals("Opaque", secret.getType());
        assertEquals("hello", new String(secret.getData().get("secret-data"), UTF_8));
        k8ObjectList.add(secret);
      } else {
        throw new Exception("some thing wrong happened");
      }
    }
    String result = Yaml.dumpAll(k8ObjectList.iterator());
    String expected = Resources.toString(EXPECTED_YAML_FILE, UTF_8).replace("\r\n", "\n");
    assertThat(result, equalTo(expected));
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
      assertEquals("test", stringPort.getTargetPort().getStrValue());

      assertTrue(
          "Target port for 'intPort' was parsed to a string, integer expected.",
          intPort.getTargetPort().isInteger());
      assertEquals(1L, (long) intPort.getTargetPort().getIntValue());
    } catch (Exception ex) {
      assertNull("Unexpected exception: " + ex.toString(), ex);
    }
  }

  @Test
  public void testDumpIntOrString() {
    try {
      String strInput = "targetPort: test\n";
      String intInput = "targetPort: 1\n";

      V1ServicePort stringPort = Yaml.loadAs(strInput, V1ServicePort.class);
      V1ServicePort intPort = Yaml.loadAs(intInput, V1ServicePort.class);

      StringWriter strOutput = new StringWriter();
      Yaml.dump(stringPort, strOutput);

      StringWriter intOutput = new StringWriter();
      Yaml.dump(intPort, intOutput);

      assertEquals(strInput, strOutput.toString());
      assertEquals(intInput, intOutput.toString());

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
          new String(secret.getData().get("hello"), UTF_8));

    } catch (Exception ex) {
      assertNull("Unexpected exception: " + ex.toString(), ex);
    }
  }

  @Test
  public void testDateTime() {
    try {
      String strInput =
          "apiVersion: v1\n"
              + "kind: Pod\n"
              + "metadata:\n"
              + "  creationTimestamp: 2018-09-06T15:12:24Z";

      V1Pod pod = Yaml.loadAs(strInput, V1Pod.class);

      assertEquals(
          "Incorrect value loaded for creationTimestamp",
          "2018-09-06T15:12:24Z",
          new String(pod.getMetadata().getCreationTimestamp().toString().getBytes(), UTF_8));

    } catch (Exception ex) {
      assertNull("Unexpected exception: " + ex.toString(), ex);
    }
  }

  @Test
  public void testDateTimeRoundTrip() {
    // There was an issue with dumping JODA DateTime as String.
    // This test verifies that its fixed.
    try {
      String data = Resources.toString(CREATED_TIMESTAMP_FILE, UTF_8);
      V1Pod pod = Yaml.loadAs(data, V1Pod.class);
      String output = Yaml.dump(pod);
      V1Pod pod2 = Yaml.loadAs(output, V1Pod.class);
      assertEquals(pod, pod2);
    } catch (Exception ex) {
      assertNull("Unexpected exception: " + ex.toString(), ex);
    }
  }

  @Test
  public void testYamlCantConstructObjects() {
    try {
      String data = Resources.toString(TAGGED_FILE, UTF_8);
      Object pod = Yaml.load(data);
    } catch (Exception ex) {
      // pass
    }
    assertFalse("Object should not be constructed!", TestPoJ.hasBeenConstructed());
  }

  @Test
  public void testLoadAsYamlCantConstructObjects() {
    try {
      String data = Resources.toString(TAGGED_FILE, UTF_8);
      V1Pod pod = Yaml.loadAs(data, V1Pod.class);
    } catch (Exception ex) {
      // pass
    }
    assertFalse("Object should not be constructed!", TestPoJ.hasBeenConstructed());
  }

  @Test
  public void testLoadDumpCRDWithIntOrStringExtension() {
    String data = Resources.toString(CRD_INT_OR_STRING_FILE, UTF_8).replace("\r\n", "\n");
    V1CustomResourceDefinition crd = Yaml.loadAs(data, V1CustomResourceDefinition.class);
    assertNotNull(crd);
    assertTrue(
        crd.getSpec()
            .getVersions()
            .get(0)
            .getSchema()
            .getOpenAPIV3Schema()
            .getProperties()
            .get("foo")
            .getxKubernetesIntOrString());
    String dumped = Yaml.dump(crd);
    assertEquals(data, dumped);
  }
}
