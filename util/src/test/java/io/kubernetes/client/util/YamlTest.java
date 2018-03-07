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
import java.io.StringReader;
import java.lang.reflect.Method;
import org.junit.Test;

public class YamlTest {
  @Test
  public void testLoad() {
    String[] kinds = new String[] {"Pod", "Deployment", "ClusterRole", "APIService", "Scale"};
    String[] apiVersions =
        new String[] {"v1", "v1beta2", "v1alpha1", "v1beta1", "extensions/v1beta1"};
    String[] classNames =
        new String[] {
          "V1Pod",
          "V1beta2Deployment",
          "V1alpha1ClusterRole",
          "V1beta1APIService",
          "ExtensionsV1beta1Scale"
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
}
