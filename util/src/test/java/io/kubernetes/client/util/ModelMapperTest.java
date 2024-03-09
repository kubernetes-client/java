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

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.apimachinery.GroupVersionKind;
import io.kubernetes.client.openapi.models.V1CustomResourceDefinition;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1Pod;
import org.junit.jupiter.api.Test;

class ModelMapperTest {

  @Test
  void prebuiltModelMapping() {

    assertThat(ModelMapper.getApiTypeClass("", "v1", "Pod"))
        .isEqualTo(V1Pod.class);
    assertThat(ModelMapper.getApiTypeClass("", "v1", "Deployment"))
        .isEqualTo(V1Deployment.class);
    assertThat(ModelMapper.getApiTypeClass("", "v1", "CustomResourceDefinition"))
        .isEqualTo(V1CustomResourceDefinition.class);
  }

  @Test
  void addingModel() {
    Class objClass =
            new Object() {
              {
              }
            }.getClass();

    ModelMapper.addModelMap("example.io", "v1", "Toss", objClass);

    assertThat(ModelMapper.getApiTypeClass("example.io/v1", "Toss"))
        .isEqualTo(objClass);
    assertThat(ModelMapper.getApiTypeClass("example.io", "v1", "Toss"))
        .isEqualTo(objClass);

    assertThat(ModelMapper.getApiTypeClass("example.io/V1", "Toss")).isNull();
    assertThat(ModelMapper.getApiTypeClass("example.io", "V1", "Toss")).isNull();

    assertThat(ModelMapper.getApiTypeClass("example.io/v1", "Tofu")).isNull();
    assertThat(ModelMapper.getApiTypeClass("example.io", "v1", "Tofu")).isNull();

    assertThat(ModelMapper.getApiTypeClass("v1", "Togu")).isNull();
    ModelMapper.addModelMap("v1", "Togu", objClass);
    assertThat(ModelMapper.getApiTypeClass("", "v1", "Togu"))
        .isEqualTo(objClass);
    assertThat(ModelMapper.getApiTypeClass("v1", "Togu"))
        .isEqualTo(objClass);
  }


  @Test
  void preBuiltGetGroupVersionKindByClass() {
    assertThat(ModelMapper.preBuiltGetGroupVersionKindByClass(V1Pod.class))
        .hasValue(new GroupVersionKind("", "v1", "Pod"));
    assertThat(ModelMapper.preBuiltGetGroupVersionKindByClass(V1Deployment.class))
        .hasValue(new GroupVersionKind("", "v1", "Deployment"));
    assertThat(ModelMapper.preBuiltGetGroupVersionKindByClass(V1CustomResourceDefinition.class))
        .hasValue(new GroupVersionKind("", "v1", "CustomResourceDefinition"));
  }
}
