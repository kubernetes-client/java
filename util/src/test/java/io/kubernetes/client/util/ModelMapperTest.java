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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import io.kubernetes.client.Discovery;
import io.kubernetes.client.apimachinery.GroupVersionKind;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinition;
import java.io.IOException;
import java.util.Map;
import org.junit.Ignore;
import org.junit.Test;

public class ModelMapperTest {

  @Test
  public void testPrebuiltModelMapping() {
    Map<GroupVersionKind, Class<?>> maps = ModelMapper.getAllKnownClasses();
    assertTrue(maps.size() > 0);

    assertEquals(V1Pod.class, ModelMapper.getApiTypeClass("", "v1", "Pod"));
    assertEquals(V1Pod.class, ModelMapper.getApiTypeClass("v1", "Pod"));

    assertEquals(V1Deployment.class, ModelMapper.getApiTypeClass("", "v1", "Deployment"));
    assertEquals(V1Deployment.class, ModelMapper.getApiTypeClass("apps/v1", "Deployment"));

    assertEquals(
        V1beta1CustomResourceDefinition.class,
        ModelMapper.getApiTypeClass("apiextensions.k8s.io/v1beta1", "CustomResourceDefinition"));
    assertEquals(
        V1beta1CustomResourceDefinition.class,
        ModelMapper.getApiTypeClass("apiextensions.k8s.io", "v1beta1", "CustomResourceDefinition"));
  }

  @Test
  public void testAddingModel() {
    Class objClass =
        new Object() {
          {
          }
        }.getClass();

    ModelMapper.addModelMap("example.io", "v1", "Toss", objClass);

    assertEquals(objClass, ModelMapper.getApiTypeClass("example.io/v1", "Toss"));
    assertEquals(objClass, ModelMapper.getApiTypeClass("example.io", "v1", "Toss"));

    assertNull(ModelMapper.getApiTypeClass("example.io/V1", "Toss"));
    assertNull(ModelMapper.getApiTypeClass("example.io", "V1", "Toss"));

    assertNull(ModelMapper.getApiTypeClass("example.io/v1", "Tofu"));
    assertNull(ModelMapper.getApiTypeClass("example.io", "v1", "Tofu"));
  }

  @Test
  public void testGetClassByKind() {
    assertEquals(
        new GroupVersionKind(null, "v1", "Pod"),
        ModelMapper.getGroupVersionKindByClass(V1Pod.class));

    assertEquals(
        new GroupVersionKind(null, "v1", "Pod"),
        ModelMapper.getGroupVersionKindByClass(V1Pod.class));
    assertEquals(
        new GroupVersionKind(null, "v1", "Deployment"),
        ModelMapper.getGroupVersionKindByClass(V1Deployment.class));
    assertEquals(
        new GroupVersionKind(null, "v1beta1", "CustomResourceDefinition"),
        ModelMapper.getGroupVersionKindByClass(V1beta1CustomResourceDefinition.class));
  }

  @Test
  @Ignore
  public void test() throws IOException, ApiException {
    // TODO(yue9944882): move this to an integration test
    Discovery discovery = new Discovery(ClientBuilder.defaultClient());
    ModelMapper.refresh(discovery);
    ModelMapper.refresh(discovery);

    assertEquals(
        new GroupVersionKind("", "v1", "Pod"), ModelMapper.getGroupVersionKindByClass(V1Pod.class));
    assertEquals(
        new GroupVersionKind("apps", "v1", "Deployment"),
        ModelMapper.getGroupVersionKindByClass(V1Deployment.class));
    assertEquals(
        new GroupVersionKind("apiextensions.k8s.io", "v1beta1", "CustomResourceDefinition"),
        ModelMapper.getGroupVersionKindByClass(V1beta1CustomResourceDefinition.class));
  }
}
