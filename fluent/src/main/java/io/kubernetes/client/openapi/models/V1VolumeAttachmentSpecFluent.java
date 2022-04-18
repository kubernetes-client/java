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
public interface V1VolumeAttachmentSpecFluent<A extends V1VolumeAttachmentSpecFluent<A>>
    extends Fluent<A> {
  public String getAttacher();

  public A withAttacher(java.lang.String attacher);

  public Boolean hasAttacher();

  public java.lang.String getNodeName();

  public A withNodeName(java.lang.String nodeName);

  public java.lang.Boolean hasNodeName();

  /**
   * This method has been deprecated, please use method buildSource instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeAttachmentSource getSource();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSource buildSource();

  public A withSource(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource source);

  public java.lang.Boolean hasSource();

  public V1VolumeAttachmentSpecFluent.SourceNested<A> withNewSource();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A>
      withNewSourceLike(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource item);

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A>
      editSource();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A>
      editOrNewSource();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A>
      editOrNewSourceLike(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource item);

  public interface SourceNested<N>
      extends Nested<N>,
          V1VolumeAttachmentSourceFluent<V1VolumeAttachmentSpecFluent.SourceNested<N>> {
    public N and();

    public N endSource();
  }
}
