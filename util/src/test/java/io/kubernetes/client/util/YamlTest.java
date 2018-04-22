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

import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.models.V1ServicePort;
import java.io.StringReader;
import java.lang.reflect.Method;
import org.junit.Test;

public class YamlTest {
  @Test
  public void testLoad() {
    String[] kinds =
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
    String[] apiVersions =
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
    String[] classNames =
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
    for (int i = 0; i < kinds.length; i++) {
      String kind = kinds[i];
      String className = classNames[i];
      try {
        String input =
            "kind: "
                + kind
                + "\n"
                + "apiVersion: "
                + apiVersions[i]
                + "\n"
                + "metadata:\n"
                + "  name: foo";
        Object obj = Yaml.load(new StringReader(input));
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
}
