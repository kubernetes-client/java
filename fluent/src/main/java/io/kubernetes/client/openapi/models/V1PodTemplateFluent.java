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

/** Generated */
public interface V1PodTemplateFluent<A extends V1PodTemplateFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public Boolean hasApiVersion();

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);

  public java.lang.Boolean hasMetadata();

  public V1PodTemplateFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  /**
   * This method has been deprecated, please use method buildTemplate instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1PodTemplateSpec getTemplate();

  public io.kubernetes.client.openapi.models.V1PodTemplateSpec buildTemplate();

  public A withTemplate(io.kubernetes.client.openapi.models.V1PodTemplateSpec template);

  public java.lang.Boolean hasTemplate();

  public V1PodTemplateFluent.TemplateNested<A> withNewTemplate();

  public io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<A>
      withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);

  public io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<A> editTemplate();

  public io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<A>
      editOrNewTemplate();

  public io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<A>
      editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1PodTemplateFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface TemplateNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1PodTemplateSpecFluent<V1PodTemplateFluent.TemplateNested<N>> {
    public N and();

    public N endTemplate();
  }
}
