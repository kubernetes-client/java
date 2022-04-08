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
public interface V1StatusFluent<A extends V1StatusFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public Boolean hasApiVersion();

  public Integer getCode();

  public A withCode(java.lang.Integer code);

  public java.lang.Boolean hasCode();

  /**
   * This method has been deprecated, please use method buildDetails instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1StatusDetails getDetails();

  public io.kubernetes.client.openapi.models.V1StatusDetails buildDetails();

  public A withDetails(io.kubernetes.client.openapi.models.V1StatusDetails details);

  public java.lang.Boolean hasDetails();

  public V1StatusFluent.DetailsNested<A> withNewDetails();

  public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> withNewDetailsLike(
      io.kubernetes.client.openapi.models.V1StatusDetails item);

  public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> editDetails();

  public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> editOrNewDetails();

  public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> editOrNewDetailsLike(
      io.kubernetes.client.openapi.models.V1StatusDetails item);

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  public java.lang.String getMessage();

  public A withMessage(java.lang.String message);

  public java.lang.Boolean hasMessage();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ListMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ListMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ListMeta metadata);

  public java.lang.Boolean hasMetadata();

  public V1StatusFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> withNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ListMeta item);

  public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> editOrNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ListMeta item);

  public java.lang.String getReason();

  public A withReason(java.lang.String reason);

  public java.lang.Boolean hasReason();

  public java.lang.String getStatus();

  public A withStatus(java.lang.String status);

  public java.lang.Boolean hasStatus();

  public interface DetailsNested<N>
      extends Nested<N>, V1StatusDetailsFluent<V1StatusFluent.DetailsNested<N>> {
    public N and();

    public N endDetails();
  }

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ListMetaFluent<V1StatusFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
