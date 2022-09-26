/*
Copyright 2022 The Kubernetes Authors.
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
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.Map;

/** Generated */
public interface V1ReplicationControllerSpecFluent<A extends V1ReplicationControllerSpecFluent<A>>
    extends Fluent<A> {
  public Integer getMinReadySeconds();

  public A withMinReadySeconds(Integer minReadySeconds);

  public Boolean hasMinReadySeconds();

  public Integer getReplicas();

  public A withReplicas(Integer replicas);

  public Boolean hasReplicas();

  public A addToSelector(String key, String value);

  public A addToSelector(Map<String, String> map);

  public A removeFromSelector(String key);

  public A removeFromSelector(Map<String, String> map);

  public Map<String, String> getSelector();

  public <K, V> A withSelector(Map<String, String> selector);

  public Boolean hasSelector();

  /**
   * This method has been deprecated, please use method buildTemplate instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1PodTemplateSpec getTemplate();

  public V1PodTemplateSpec buildTemplate();

  public A withTemplate(V1PodTemplateSpec template);

  public Boolean hasTemplate();

  public V1ReplicationControllerSpecFluent.TemplateNested<A> withNewTemplate();

  public V1ReplicationControllerSpecFluent.TemplateNested<A> withNewTemplateLike(
      V1PodTemplateSpec item);

  public V1ReplicationControllerSpecFluent.TemplateNested<A> editTemplate();

  public V1ReplicationControllerSpecFluent.TemplateNested<A> editOrNewTemplate();

  public V1ReplicationControllerSpecFluent.TemplateNested<A> editOrNewTemplateLike(
      V1PodTemplateSpec item);

  public interface TemplateNested<N>
      extends Nested<N>,
          V1PodTemplateSpecFluent<V1ReplicationControllerSpecFluent.TemplateNested<N>> {
    public N and();

    public N endTemplate();
  }
}
