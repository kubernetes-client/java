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

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1LifecycleHandlerFluentImpl<A extends V1LifecycleHandlerFluent<A>>
    extends BaseFluent<A> implements V1LifecycleHandlerFluent<A> {
  public V1LifecycleHandlerFluentImpl() {}

  public V1LifecycleHandlerFluentImpl(
      io.kubernetes.client.openapi.models.V1LifecycleHandler instance) {
    this.withExec(instance.getExec());

    this.withHttpGet(instance.getHttpGet());

    this.withTcpSocket(instance.getTcpSocket());
  }

  private V1ExecActionBuilder exec;
  private V1HTTPGetActionBuilder httpGet;
  private V1TCPSocketActionBuilder tcpSocket;

  /**
   * This method has been deprecated, please use method buildExec instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ExecAction getExec() {
    return this.exec != null ? this.exec.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ExecAction buildExec() {
    return this.exec != null ? this.exec.build() : null;
  }

  public A withExec(io.kubernetes.client.openapi.models.V1ExecAction exec) {
    _visitables.get("exec").remove(this.exec);
    if (exec != null) {
      this.exec = new io.kubernetes.client.openapi.models.V1ExecActionBuilder(exec);
      _visitables.get("exec").add(this.exec);
    }
    return (A) this;
  }

  public Boolean hasExec() {
    return this.exec != null;
  }

  public V1LifecycleHandlerFluent.ExecNested<A> withNewExec() {
    return new V1LifecycleHandlerFluentImpl.ExecNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.ExecNested<A> withNewExecLike(
      io.kubernetes.client.openapi.models.V1ExecAction item) {
    return new V1LifecycleHandlerFluentImpl.ExecNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.ExecNested<A> editExec() {
    return withNewExecLike(getExec());
  }

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.ExecNested<A>
      editOrNewExec() {
    return withNewExecLike(
        getExec() != null
            ? getExec()
            : new io.kubernetes.client.openapi.models.V1ExecActionBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.ExecNested<A>
      editOrNewExecLike(io.kubernetes.client.openapi.models.V1ExecAction item) {
    return withNewExecLike(getExec() != null ? getExec() : item);
  }

  /**
   * This method has been deprecated, please use method buildHttpGet instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1HTTPGetAction getHttpGet() {
    return this.httpGet != null ? this.httpGet.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1HTTPGetAction buildHttpGet() {
    return this.httpGet != null ? this.httpGet.build() : null;
  }

  public A withHttpGet(io.kubernetes.client.openapi.models.V1HTTPGetAction httpGet) {
    _visitables.get("httpGet").remove(this.httpGet);
    if (httpGet != null) {
      this.httpGet = new V1HTTPGetActionBuilder(httpGet);
      _visitables.get("httpGet").add(this.httpGet);
    }
    return (A) this;
  }

  public java.lang.Boolean hasHttpGet() {
    return this.httpGet != null;
  }

  public V1LifecycleHandlerFluent.HttpGetNested<A> withNewHttpGet() {
    return new V1LifecycleHandlerFluentImpl.HttpGetNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.HttpGetNested<A>
      withNewHttpGetLike(io.kubernetes.client.openapi.models.V1HTTPGetAction item) {
    return new io.kubernetes.client.openapi.models.V1LifecycleHandlerFluentImpl.HttpGetNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.HttpGetNested<A>
      editHttpGet() {
    return withNewHttpGetLike(getHttpGet());
  }

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.HttpGetNested<A>
      editOrNewHttpGet() {
    return withNewHttpGetLike(
        getHttpGet() != null
            ? getHttpGet()
            : new io.kubernetes.client.openapi.models.V1HTTPGetActionBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.HttpGetNested<A>
      editOrNewHttpGetLike(io.kubernetes.client.openapi.models.V1HTTPGetAction item) {
    return withNewHttpGetLike(getHttpGet() != null ? getHttpGet() : item);
  }

  /**
   * This method has been deprecated, please use method buildTcpSocket instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1TCPSocketAction getTcpSocket() {
    return this.tcpSocket != null ? this.tcpSocket.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1TCPSocketAction buildTcpSocket() {
    return this.tcpSocket != null ? this.tcpSocket.build() : null;
  }

  public A withTcpSocket(io.kubernetes.client.openapi.models.V1TCPSocketAction tcpSocket) {
    _visitables.get("tcpSocket").remove(this.tcpSocket);
    if (tcpSocket != null) {
      this.tcpSocket = new V1TCPSocketActionBuilder(tcpSocket);
      _visitables.get("tcpSocket").add(this.tcpSocket);
    }
    return (A) this;
  }

  public java.lang.Boolean hasTcpSocket() {
    return this.tcpSocket != null;
  }

  public V1LifecycleHandlerFluent.TcpSocketNested<A> withNewTcpSocket() {
    return new V1LifecycleHandlerFluentImpl.TcpSocketNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.TcpSocketNested<A>
      withNewTcpSocketLike(io.kubernetes.client.openapi.models.V1TCPSocketAction item) {
    return new io.kubernetes.client.openapi.models.V1LifecycleHandlerFluentImpl.TcpSocketNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.TcpSocketNested<A>
      editTcpSocket() {
    return withNewTcpSocketLike(getTcpSocket());
  }

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.TcpSocketNested<A>
      editOrNewTcpSocket() {
    return withNewTcpSocketLike(
        getTcpSocket() != null
            ? getTcpSocket()
            : new io.kubernetes.client.openapi.models.V1TCPSocketActionBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.TcpSocketNested<A>
      editOrNewTcpSocketLike(io.kubernetes.client.openapi.models.V1TCPSocketAction item) {
    return withNewTcpSocketLike(getTcpSocket() != null ? getTcpSocket() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1LifecycleHandlerFluentImpl that = (V1LifecycleHandlerFluentImpl) o;
    if (exec != null ? !exec.equals(that.exec) : that.exec != null) return false;
    if (httpGet != null ? !httpGet.equals(that.httpGet) : that.httpGet != null) return false;
    if (tcpSocket != null ? !tcpSocket.equals(that.tcpSocket) : that.tcpSocket != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(exec, httpGet, tcpSocket, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (exec != null) {
      sb.append("exec:");
      sb.append(exec + ",");
    }
    if (httpGet != null) {
      sb.append("httpGet:");
      sb.append(httpGet + ",");
    }
    if (tcpSocket != null) {
      sb.append("tcpSocket:");
      sb.append(tcpSocket);
    }
    sb.append("}");
    return sb.toString();
  }

  class ExecNestedImpl<N> extends V1ExecActionFluentImpl<V1LifecycleHandlerFluent.ExecNested<N>>
      implements io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.ExecNested<N>,
          Nested<N> {
    ExecNestedImpl(io.kubernetes.client.openapi.models.V1ExecAction item) {
      this.builder = new V1ExecActionBuilder(this, item);
    }

    ExecNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ExecActionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ExecActionBuilder builder;

    public N and() {
      return (N) V1LifecycleHandlerFluentImpl.this.withExec(builder.build());
    }

    public N endExec() {
      return and();
    }
  }

  class HttpGetNestedImpl<N>
      extends V1HTTPGetActionFluentImpl<V1LifecycleHandlerFluent.HttpGetNested<N>>
      implements io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.HttpGetNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    HttpGetNestedImpl(V1HTTPGetAction item) {
      this.builder = new V1HTTPGetActionBuilder(this, item);
    }

    HttpGetNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1HTTPGetActionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1HTTPGetActionBuilder builder;

    public N and() {
      return (N) V1LifecycleHandlerFluentImpl.this.withHttpGet(builder.build());
    }

    public N endHttpGet() {
      return and();
    }
  }

  class TcpSocketNestedImpl<N>
      extends V1TCPSocketActionFluentImpl<V1LifecycleHandlerFluent.TcpSocketNested<N>>
      implements io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent.TcpSocketNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    TcpSocketNestedImpl(io.kubernetes.client.openapi.models.V1TCPSocketAction item) {
      this.builder = new V1TCPSocketActionBuilder(this, item);
    }

    TcpSocketNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1TCPSocketActionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1TCPSocketActionBuilder builder;

    public N and() {
      return (N) V1LifecycleHandlerFluentImpl.this.withTcpSocket(builder.build());
    }

    public N endTcpSocket() {
      return and();
    }
  }
}
