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
package io.kubernetes.client.spring.extended.manifests;

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.openapi.models.V1Service;
import io.kubernetes.client.spring.extended.manifests.annotation.FromYaml;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest
class KubernetesFromYamlTest {

  @SpringBootConfiguration
  static class App {

    @Bean
    public KubernetesFromYamlProcessor kubernetesFromYamlProcessor() {
      return new KubernetesFromYamlProcessor();
    }

    @Bean
    public MyBean myBean() {
      return new MyBean();
    }

    @Bean
    @Qualifier("my-service-1")
    @FromYaml(filePath = "service.yaml")
    public V1Service service() {
      return new V1Service();
    }
  }

  static class MyBean {
    @FromYaml(filePath = "service.yaml")
    private V1Service service;
  }

  @Autowired private MyBean myBean;

  @Autowired
  @Qualifier("my-service-1")
  private V1Service service;

  @Test
  void test() {
    assertThat(myBean.service).isNotNull();
    assertThat(service).isNotNull();
  }
}
