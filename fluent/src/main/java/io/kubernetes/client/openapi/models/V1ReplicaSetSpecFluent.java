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

/** Generated */
public interface V1ReplicaSetSpecFluent<
        A extends io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.Integer getMinReadySeconds();

  public A withMinReadySeconds(java.lang.Integer minReadySeconds);

  public java.lang.Boolean hasMinReadySeconds();

  public java.lang.Integer getReplicas();

  public A withReplicas(java.lang.Integer replicas);

  public java.lang.Boolean hasReplicas();

  /**
   * This method has been deprecated, please use method buildSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getSelector();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector();

  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector);

  public java.lang.Boolean hasSelector();

  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.SelectorNested<A>
      withNewSelector();

  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.SelectorNested<A>
      withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.SelectorNested<A>
      editSelector();

  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.SelectorNested<A>
      editOrNewSelector();

  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.SelectorNested<A>
      editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  /**
   * This method has been deprecated, please use method buildTemplate instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PodTemplateSpec getTemplate();

  public io.kubernetes.client.openapi.models.V1PodTemplateSpec buildTemplate();

  public A withTemplate(io.kubernetes.client.openapi.models.V1PodTemplateSpec template);

  public java.lang.Boolean hasTemplate();

  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.TemplateNested<A>
      withNewTemplate();

  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.TemplateNested<A>
      withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);

  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.TemplateNested<A>
      editTemplate();

  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.TemplateNested<A>
      editOrNewTemplate();

  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.TemplateNested<A>
      editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);

  public interface SelectorNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LabelSelectorFluent<
              io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.SelectorNested<N>> {
    public N and();

    public N endSelector();
  }

  public interface TemplateNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent<
              io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.TemplateNested<N>> {
    public N and();

    public N endTemplate();
  }
}
