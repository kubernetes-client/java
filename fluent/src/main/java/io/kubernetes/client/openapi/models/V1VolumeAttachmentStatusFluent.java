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
public interface V1VolumeAttachmentStatusFluent<
        A extends io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildAttachError instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1VolumeError getAttachError();

  public io.kubernetes.client.openapi.models.V1VolumeError buildAttachError();

  public A withAttachError(io.kubernetes.client.openapi.models.V1VolumeError attachError);

  public java.lang.Boolean hasAttachError();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A>
      withNewAttachError();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A>
      withNewAttachErrorLike(io.kubernetes.client.openapi.models.V1VolumeError item);

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A>
      editAttachError();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A>
      editOrNewAttachError();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A>
      editOrNewAttachErrorLike(io.kubernetes.client.openapi.models.V1VolumeError item);

  public java.lang.Boolean getAttached();

  public A withAttached(java.lang.Boolean attached);

  public java.lang.Boolean hasAttached();

  public A addToAttachmentMetadata(java.lang.String key, java.lang.String value);

  public A addToAttachmentMetadata(java.util.Map<java.lang.String, java.lang.String> map);

  public A removeFromAttachmentMetadata(java.lang.String key);

  public A removeFromAttachmentMetadata(java.util.Map<java.lang.String, java.lang.String> map);

  public java.util.Map<java.lang.String, java.lang.String> getAttachmentMetadata();

  public <K, V> A withAttachmentMetadata(
      java.util.Map<java.lang.String, java.lang.String> attachmentMetadata);

  public java.lang.Boolean hasAttachmentMetadata();

  /**
   * This method has been deprecated, please use method buildDetachError instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1VolumeError getDetachError();

  public io.kubernetes.client.openapi.models.V1VolumeError buildDetachError();

  public A withDetachError(io.kubernetes.client.openapi.models.V1VolumeError detachError);

  public java.lang.Boolean hasDetachError();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A>
      withNewDetachError();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A>
      withNewDetachErrorLike(io.kubernetes.client.openapi.models.V1VolumeError item);

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A>
      editDetachError();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A>
      editOrNewDetachError();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A>
      editOrNewDetachErrorLike(io.kubernetes.client.openapi.models.V1VolumeError item);

  public interface AttachErrorNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1VolumeErrorFluent<
              io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<
                  N>> {
    public N and();

    public N endAttachError();
  }

  public interface DetachErrorNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1VolumeErrorFluent<
              io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<
                  N>> {
    public N and();

    public N endDetachError();
  }
}
