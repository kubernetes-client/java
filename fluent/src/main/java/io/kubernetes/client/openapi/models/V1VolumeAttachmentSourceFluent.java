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
public interface V1VolumeAttachmentSourceFluent<
        A extends io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildInlineVolumeSpec instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpec getInlineVolumeSpec();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpec buildInlineVolumeSpec();

  public A withInlineVolumeSpec(
      io.kubernetes.client.openapi.models.V1PersistentVolumeSpec inlineVolumeSpec);

  public java.lang.Boolean hasInlineVolumeSpec();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<
          A>
      withNewInlineVolumeSpec();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<
          A>
      withNewInlineVolumeSpecLike(io.kubernetes.client.openapi.models.V1PersistentVolumeSpec item);

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<
          A>
      editInlineVolumeSpec();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<
          A>
      editOrNewInlineVolumeSpec();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<
          A>
      editOrNewInlineVolumeSpecLike(
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpec item);

  public java.lang.String getPersistentVolumeName();

  public A withPersistentVolumeName(java.lang.String persistentVolumeName);

  public java.lang.Boolean hasPersistentVolumeName();

  /** Method is deprecated. use withPersistentVolumeName instead. */
  @java.lang.Deprecated
  public A withNewPersistentVolumeName(java.lang.String original);

  public interface InlineVolumeSpecNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent<
              io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent
                      .InlineVolumeSpecNested<
                  N>> {
    public N and();

    public N endInlineVolumeSpec();
  }
}
