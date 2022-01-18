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
public interface V1ManagedFieldsEntryFluent<
        A extends io.kubernetes.client.openapi.models.V1ManagedFieldsEntryFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original);

  public java.lang.String getFieldsType();

  public A withFieldsType(java.lang.String fieldsType);

  public java.lang.Boolean hasFieldsType();

  /** Method is deprecated. use withFieldsType instead. */
  @java.lang.Deprecated
  public A withNewFieldsType(java.lang.String original);

  public java.lang.Object getFieldsV1();

  public A withFieldsV1(java.lang.Object fieldsV1);

  public java.lang.Boolean hasFieldsV1();

  public java.lang.String getManager();

  public A withManager(java.lang.String manager);

  public java.lang.Boolean hasManager();

  /** Method is deprecated. use withManager instead. */
  @java.lang.Deprecated
  public A withNewManager(java.lang.String original);

  public java.lang.String getOperation();

  public A withOperation(java.lang.String operation);

  public java.lang.Boolean hasOperation();

  /** Method is deprecated. use withOperation instead. */
  @java.lang.Deprecated
  public A withNewOperation(java.lang.String original);

  public java.lang.String getSubresource();

  public A withSubresource(java.lang.String subresource);

  public java.lang.Boolean hasSubresource();

  /** Method is deprecated. use withSubresource instead. */
  @java.lang.Deprecated
  public A withNewSubresource(java.lang.String original);

  public java.time.OffsetDateTime getTime();

  public A withTime(java.time.OffsetDateTime time);

  public java.lang.Boolean hasTime();
}
