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

import io.kubernetes.client.apimachinery.GroupVersionKind;
import io.kubernetes.client.openapi.models.V1CustomResourceDefinition;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1Pod;
import org.junit.Test;

public class ModelMapperTest {

  @Test
  public void testPrebuiltModelMapping() {

    assertEquals(V1Pod.class, ModelMapper.getApiTypeClass("", "v1", "Pod"));
    assertEquals(V1Deployment.class, ModelMapper.getApiTypeClass("", "v1", "Deployment"));
    assertEquals(
            V1CustomResourceDefinition.class,
            ModelMapper.getApiTypeClass("", "v1", "CustomResourceDefinition"));
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

    assertNull(ModelMapper.getApiTypeClass("v1", "Togu"));
    ModelMapper.addModelMap("v1", "Togu", objClass);
    assertEquals(objClass, ModelMapper.getApiTypeClass("", "v1", "Togu"));
    assertEquals(objClass, ModelMapper.getApiTypeClass("v1", "Togu"));
  }


  @Test
  public void testPreBuiltGetGroupVersionKindByClass() {
    assertEquals(
            new GroupVersionKind("", "v1", "Pod"),
            ModelMapper.preBuiltGetGroupVersionKindByClass(V1Pod.class).orElse(null));
    assertEquals(
            new GroupVersionKind("", "v1", "Pod"),
            ModelMapper.preBuiltGetGroupVersionKindByClass(V1Pod.class).orElse(null));
    assertEquals(
            new GroupVersionKind("", "v1", "Deployment"),
            ModelMapper.preBuiltGetGroupVersionKindByClass(V1Deployment.class).orElse(null));
    assertEquals(
            new GroupVersionKind("", "v1", "CustomResourceDefinition"),
            ModelMapper.preBuiltGetGroupVersionKindByClass(V1CustomResourceDefinition.class).orElse(null));
  }
}
