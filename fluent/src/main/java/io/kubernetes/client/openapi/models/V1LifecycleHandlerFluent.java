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
public interface V1LifecycleHandlerFluent<A extends V1LifecycleHandlerFluent<A>> extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildExec instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ExecAction getExec();

  public io.kubernetes.client.openapi.models.V1ExecAction buildExec();

  public A withExec(io.kubernetes.client.openapi.models.V1ExecAction exec);

  public Boolean hasExec();

  public V1LifecycleHandlerFluent.ExecNested<A> withNewExec();

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.ExecNested<A> withNewExecLike(
      io.kubernetes.client.openapi.models.V1ExecAction item);

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.ExecNested<A> editExec();

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.ExecNested<A> editOrNewExec();

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.ExecNested<A>
      editOrNewExecLike(io.kubernetes.client.openapi.models.V1ExecAction item);

  /**
   * This method has been deprecated, please use method buildHttpGet instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1HTTPGetAction getHttpGet();

  public io.kubernetes.client.openapi.models.V1HTTPGetAction buildHttpGet();

  public A withHttpGet(io.kubernetes.client.openapi.models.V1HTTPGetAction httpGet);

  public java.lang.Boolean hasHttpGet();

  public V1LifecycleHandlerFluent.HttpGetNested<A> withNewHttpGet();

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.HttpGetNested<A>
      withNewHttpGetLike(io.kubernetes.client.openapi.models.V1HTTPGetAction item);

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.HttpGetNested<A>
      editHttpGet();

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.HttpGetNested<A>
      editOrNewHttpGet();

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.HttpGetNested<A>
      editOrNewHttpGetLike(io.kubernetes.client.openapi.models.V1HTTPGetAction item);

  /**
   * This method has been deprecated, please use method buildTcpSocket instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1TCPSocketAction getTcpSocket();

  public io.kubernetes.client.openapi.models.V1TCPSocketAction buildTcpSocket();

  public A withTcpSocket(io.kubernetes.client.openapi.models.V1TCPSocketAction tcpSocket);

  public java.lang.Boolean hasTcpSocket();

  public V1LifecycleHandlerFluent.TcpSocketNested<A> withNewTcpSocket();

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.TcpSocketNested<A>
      withNewTcpSocketLike(io.kubernetes.client.openapi.models.V1TCPSocketAction item);

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.TcpSocketNested<A>
      editTcpSocket();

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.TcpSocketNested<A>
      editOrNewTcpSocket();

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.TcpSocketNested<A>
      editOrNewTcpSocketLike(io.kubernetes.client.openapi.models.V1TCPSocketAction item);

  public interface ExecNested<N>
      extends Nested<N>, V1ExecActionFluent<V1LifecycleHandlerFluent.ExecNested<N>> {
    public N and();

    public N endExec();
  }

  public interface HttpGetNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1HTTPGetActionFluent<V1LifecycleHandlerFluent.HttpGetNested<N>> {
    public N and();

    public N endHttpGet();
  }

  public interface TcpSocketNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1TCPSocketActionFluent<V1LifecycleHandlerFluent.TcpSocketNested<N>> {
    public N and();

    public N endTcpSocket();
  }
}
