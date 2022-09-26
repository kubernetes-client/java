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
public interface V1VolumeAttachmentStatusFluent<A extends V1VolumeAttachmentStatusFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildAttachError instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeError getAttachError();

  public V1VolumeError buildAttachError();

  public A withAttachError(V1VolumeError attachError);

  public Boolean hasAttachError();

  public V1VolumeAttachmentStatusFluent.AttachErrorNested<A> withNewAttachError();

  public V1VolumeAttachmentStatusFluent.AttachErrorNested<A> withNewAttachErrorLike(
      V1VolumeError item);

  public V1VolumeAttachmentStatusFluent.AttachErrorNested<A> editAttachError();

  public V1VolumeAttachmentStatusFluent.AttachErrorNested<A> editOrNewAttachError();

  public V1VolumeAttachmentStatusFluent.AttachErrorNested<A> editOrNewAttachErrorLike(
      V1VolumeError item);

  public Boolean getAttached();

  public A withAttached(Boolean attached);

  public Boolean hasAttached();

  public A addToAttachmentMetadata(String key, String value);

  public A addToAttachmentMetadata(Map<String, String> map);

  public A removeFromAttachmentMetadata(String key);

  public A removeFromAttachmentMetadata(Map<String, String> map);

  public Map<String, String> getAttachmentMetadata();

  public <K, V> A withAttachmentMetadata(Map<String, String> attachmentMetadata);

  public Boolean hasAttachmentMetadata();

  /**
   * This method has been deprecated, please use method buildDetachError instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeError getDetachError();

  public V1VolumeError buildDetachError();

  public A withDetachError(V1VolumeError detachError);

  public Boolean hasDetachError();

  public V1VolumeAttachmentStatusFluent.DetachErrorNested<A> withNewDetachError();

  public V1VolumeAttachmentStatusFluent.DetachErrorNested<A> withNewDetachErrorLike(
      V1VolumeError item);

  public V1VolumeAttachmentStatusFluent.DetachErrorNested<A> editDetachError();

  public V1VolumeAttachmentStatusFluent.DetachErrorNested<A> editOrNewDetachError();

  public V1VolumeAttachmentStatusFluent.DetachErrorNested<A> editOrNewDetachErrorLike(
      V1VolumeError item);

  public A withAttached();

  public interface AttachErrorNested<N>
      extends Nested<N>, V1VolumeErrorFluent<V1VolumeAttachmentStatusFluent.AttachErrorNested<N>> {
    public N and();

    public N endAttachError();
  }

  public interface DetachErrorNested<N>
      extends Nested<N>, V1VolumeErrorFluent<V1VolumeAttachmentStatusFluent.DetachErrorNested<N>> {
    public N and();

    public N endDetachError();
  }
}
