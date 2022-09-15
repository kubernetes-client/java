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
public interface V1VolumeAttachmentSourceFluent<A extends V1VolumeAttachmentSourceFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildInlineVolumeSpec instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1PersistentVolumeSpec getInlineVolumeSpec();

  public V1PersistentVolumeSpec buildInlineVolumeSpec();

  public A withInlineVolumeSpec(V1PersistentVolumeSpec inlineVolumeSpec);

  public Boolean hasInlineVolumeSpec();

  public V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> withNewInlineVolumeSpec();

  public V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> withNewInlineVolumeSpecLike(
      V1PersistentVolumeSpec item);

  public V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editInlineVolumeSpec();

  public V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editOrNewInlineVolumeSpec();

  public V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editOrNewInlineVolumeSpecLike(
      V1PersistentVolumeSpec item);

  public String getPersistentVolumeName();

  public A withPersistentVolumeName(String persistentVolumeName);

  public Boolean hasPersistentVolumeName();

  public interface InlineVolumeSpecNested<N>
      extends Nested<N>,
          V1PersistentVolumeSpecFluent<V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<N>> {
    public N and();

    public N endInlineVolumeSpec();
  }
}
