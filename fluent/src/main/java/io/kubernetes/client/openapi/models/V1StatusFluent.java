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
public interface V1StatusFluent<A extends io.kubernetes.client.openapi.models.V1StatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original);

  public java.lang.Integer getCode();

  public A withCode(java.lang.Integer code);

  public java.lang.Boolean hasCode();

  /**
   * This method has been deprecated, please use method buildDetails instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1StatusDetails getDetails();

  public io.kubernetes.client.openapi.models.V1StatusDetails buildDetails();

  public A withDetails(io.kubernetes.client.openapi.models.V1StatusDetails details);

  public java.lang.Boolean hasDetails();

  public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> withNewDetails();

  public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> withNewDetailsLike(
      io.kubernetes.client.openapi.models.V1StatusDetails item);

  public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> editDetails();

  public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> editOrNewDetails();

  public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> editOrNewDetailsLike(
      io.kubernetes.client.openapi.models.V1StatusDetails item);

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original);

  public java.lang.String getMessage();

  public A withMessage(java.lang.String message);

  public java.lang.Boolean hasMessage();

  /** Method is deprecated. use withMessage instead. */
  @java.lang.Deprecated
  public A withNewMessage(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ListMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ListMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ListMeta metadata);

  public java.lang.Boolean hasMetadata();

  public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> withNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ListMeta item);

  public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> editOrNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ListMeta item);

  public java.lang.String getReason();

  public A withReason(java.lang.String reason);

  public java.lang.Boolean hasReason();

  /** Method is deprecated. use withReason instead. */
  @java.lang.Deprecated
  public A withNewReason(java.lang.String original);

  public java.lang.String getStatus();

  public A withStatus(java.lang.String status);

  public java.lang.Boolean hasStatus();

  /** Method is deprecated. use withStatus instead. */
  @java.lang.Deprecated
  public A withNewStatus(java.lang.String original);

  public interface DetailsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1StatusDetailsFluent<
              io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<N>> {
    public N and();

    public N endDetails();
  }

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ListMetaFluent<
              io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
