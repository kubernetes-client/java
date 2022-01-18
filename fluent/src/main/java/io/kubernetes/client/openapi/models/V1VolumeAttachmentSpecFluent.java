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
public interface V1VolumeAttachmentSpecFluent<
        A extends io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getAttacher();

  public A withAttacher(java.lang.String attacher);

  public java.lang.Boolean hasAttacher();

  /** Method is deprecated. use withAttacher instead. */
  @java.lang.Deprecated
  public A withNewAttacher(java.lang.String original);

  public java.lang.String getNodeName();

  public A withNodeName(java.lang.String nodeName);

  public java.lang.Boolean hasNodeName();

  /** Method is deprecated. use withNodeName instead. */
  @java.lang.Deprecated
  public A withNewNodeName(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildSource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSource getSource();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSource buildSource();

  public A withSource(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource source);

  public java.lang.Boolean hasSource();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A>
      withNewSource();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A>
      withNewSourceLike(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource item);

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A>
      editSource();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A>
      editOrNewSource();

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A>
      editOrNewSourceLike(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource item);

  public interface SourceNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<N>> {
    public N and();

    public N endSource();
  }
}
