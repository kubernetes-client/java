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
package io.kubernetes.client.apimachinery;

import static org.junit.Assert.*;

import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1Pod;
import org.junit.Test;

public class GroupVersionTest {

  @Test
  public void parse() {
    assertEquals(new GroupVersion("", "v1"), GroupVersion.parse(new V1Pod().apiVersion("v1")));
    assertEquals(
        new GroupVersion("apps", "v1"),
        GroupVersion.parse(new V1Deployment().apiVersion("apps/v1")));
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          GroupVersion.parse(new V1Pod());
          GroupVersion.parse(new V1Pod().apiVersion(null));
          GroupVersion.parse(new V1Pod().apiVersion("foo/bar/f"));
        });
  }
}
