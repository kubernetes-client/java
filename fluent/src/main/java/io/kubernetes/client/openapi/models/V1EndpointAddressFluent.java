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
public interface V1EndpointAddressFluent<
        A extends io.kubernetes.client.openapi.models.V1EndpointAddressFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getHostname();

  public A withHostname(java.lang.String hostname);

  public java.lang.Boolean hasHostname();

  /** Method is deprecated. use withHostname instead. */
  @java.lang.Deprecated
  public A withNewHostname(java.lang.String original);

  public java.lang.String getIp();

  public A withIp(java.lang.String ip);

  public java.lang.Boolean hasIp();

  /** Method is deprecated. use withIp instead. */
  @java.lang.Deprecated
  public A withNewIp(java.lang.String original);

  public java.lang.String getNodeName();

  public A withNodeName(java.lang.String nodeName);

  public java.lang.Boolean hasNodeName();

  /** Method is deprecated. use withNodeName instead. */
  @java.lang.Deprecated
  public A withNewNodeName(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildTargetRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectReference getTargetRef();

  public io.kubernetes.client.openapi.models.V1ObjectReference buildTargetRef();

  public A withTargetRef(io.kubernetes.client.openapi.models.V1ObjectReference targetRef);

  public java.lang.Boolean hasTargetRef();

  public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A>
      withNewTargetRef();

  public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A>
      withNewTargetRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A>
      editTargetRef();

  public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A>
      editOrNewTargetRef();

  public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A>
      editOrNewTargetRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  public interface TargetRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<
              io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<N>> {
    public N and();

    public N endTargetRef();
  }
}
