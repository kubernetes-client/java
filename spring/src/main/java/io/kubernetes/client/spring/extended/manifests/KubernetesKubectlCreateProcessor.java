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

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.kubectl.Kubectl;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.spring.extended.manifests.annotation.KubectlCreate;
import java.net.HttpURLConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class KubernetesKubectlCreateProcessor implements BeanPostProcessor, BeanFactoryAware {

  private static final Logger log = LoggerFactory.getLogger(KubernetesKubectlCreateProcessor.class);

  private ListableBeanFactory beanFactory;

  @Autowired private ApiClient apiClient;

  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    if (!(bean instanceof KubernetesObject)) {
      return bean; // no-op
    }

    KubectlCreate create = beanFactory.findAnnotationOnBean(beanName, KubectlCreate.class);
    if (create == null) {
      return bean;
    }

    Class<? extends KubernetesObject> apiTypeClass =
        (Class<? extends KubernetesObject>) bean.getClass();

    try {
      log.info("@KubectlCreate ensuring resource upon bean {}", beanName);
      return create(apiTypeClass, bean);
    } catch (KubectlException e) {
      if (e.getCause() instanceof ApiException) {
        ApiException apiException = (ApiException) e.getCause();
        if (HttpURLConnection.HTTP_CONFLICT == apiException.getCode()) {
          // already exists
          log.info("Skipped processing {} @KubectlCreate resource already exists", beanName);
          return bean;
        }
      }
      log.error("Failed ensuring resource from @KubectlCreate", e);
      throw new BeanCreationException("Failed ensuring resource from @KubectlCreate", e);
    }
  }

  public <ApiType extends KubernetesObject> ApiType create(Class<ApiType> apiTypeClass, Object obj)
      throws KubectlException {
    return Kubectl.create(apiTypeClass)
        .apiClient(this.apiClient)
        .resource((ApiType) obj)
        .execute(); // replaced the bean of the created status
  }

  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    this.beanFactory = (ListableBeanFactory) beanFactory;
  }
}
