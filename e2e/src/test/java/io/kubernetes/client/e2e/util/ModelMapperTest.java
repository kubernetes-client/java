/*
Copyright 2024 The Kubernetes Authors.
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
package io.kubernetes.client.e2e.util;

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.Discovery;
import io.kubernetes.client.apimachinery.GroupVersionKind;
import io.kubernetes.client.apimachinery.GroupVersionResource;
import io.kubernetes.client.openapi.models.V1CustomResourceDefinition;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.ModelMapper;
import org.junit.jupiter.api.Test;

class ModelMapperTest {

  @Test
  void apiDiscoveryShouldWork() throws Exception {
    Discovery discovery = new Discovery(ClientBuilder.defaultClient());
    ModelMapper.refresh(discovery);

    assertThat(new GroupVersionKind("", "v1", "Pod"))
        .isEqualTo(ModelMapper.getGroupVersionKindByClass(V1Pod.class));
    assertThat(new GroupVersionResource("", "v1", "pods"))
        .isEqualTo(ModelMapper.getGroupVersionResourceByClass(V1Pod.class));
    assertThat(ModelMapper.isNamespaced(V1Pod.class)).isTrue();

    assertThat(new GroupVersionKind("apps", "v1", "Deployment"))
        .isEqualTo(ModelMapper.getGroupVersionKindByClass(V1Deployment.class));
    assertThat(new GroupVersionResource("apps", "v1", "deployments"))
        .isEqualTo(ModelMapper.getGroupVersionResourceByClass(V1Deployment.class));
    assertThat(ModelMapper.isNamespaced(V1Deployment.class)).isTrue();

    assertThat(new GroupVersionKind("apiextensions.k8s.io", "v1", "CustomResourceDefinition"))
        .isEqualTo(ModelMapper.getGroupVersionKindByClass(V1CustomResourceDefinition.class));
    assertThat(new GroupVersionResource("apiextensions.k8s.io", "v1", "customresourcedefinitions"))
        .isEqualTo(ModelMapper.getGroupVersionResourceByClass(V1CustomResourceDefinition.class));
    assertThat(ModelMapper.isNamespaced(V1CustomResourceDefinition.class)).isFalse();
  }
}
