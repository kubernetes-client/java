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
public interface V1LifecycleHandlerFluent<
        A extends io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildExec instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ExecAction getExec();

  public io.kubernetes.client.openapi.models.V1ExecAction buildExec();

  public A withExec(io.kubernetes.client.openapi.models.V1ExecAction exec);

  public java.lang.Boolean hasExec();

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.ExecNested<A> withNewExec();

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
  public io.kubernetes.client.openapi.models.V1HTTPGetAction getHttpGet();

  public io.kubernetes.client.openapi.models.V1HTTPGetAction buildHttpGet();

  public A withHttpGet(io.kubernetes.client.openapi.models.V1HTTPGetAction httpGet);

  public java.lang.Boolean hasHttpGet();

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.HttpGetNested<A>
      withNewHttpGet();

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
  public io.kubernetes.client.openapi.models.V1TCPSocketAction getTcpSocket();

  public io.kubernetes.client.openapi.models.V1TCPSocketAction buildTcpSocket();

  public A withTcpSocket(io.kubernetes.client.openapi.models.V1TCPSocketAction tcpSocket);

  public java.lang.Boolean hasTcpSocket();

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.TcpSocketNested<A>
      withNewTcpSocket();

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.TcpSocketNested<A>
      withNewTcpSocketLike(io.kubernetes.client.openapi.models.V1TCPSocketAction item);

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.TcpSocketNested<A>
      editTcpSocket();

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.TcpSocketNested<A>
      editOrNewTcpSocket();

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.TcpSocketNested<A>
      editOrNewTcpSocketLike(io.kubernetes.client.openapi.models.V1TCPSocketAction item);

  public interface ExecNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ExecActionFluent<
              io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.ExecNested<N>> {
    public N and();

    public N endExec();
  }

  public interface HttpGetNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1HTTPGetActionFluent<
              io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.HttpGetNested<N>> {
    public N and();

    public N endHttpGet();
  }

  public interface TcpSocketNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1TCPSocketActionFluent<
              io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.TcpSocketNested<N>> {
    public N and();

    public N endTcpSocket();
  }
}
