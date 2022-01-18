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
public interface V1FCVolumeSourceFluent<
        A extends io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getFsType();

  public A withFsType(java.lang.String fsType);

  public java.lang.Boolean hasFsType();

  /** Method is deprecated. use withFsType instead. */
  @java.lang.Deprecated
  public A withNewFsType(java.lang.String original);

  public java.lang.Integer getLun();

  public A withLun(java.lang.Integer lun);

  public java.lang.Boolean hasLun();

  public java.lang.Boolean getReadOnly();

  public A withReadOnly(java.lang.Boolean readOnly);

  public java.lang.Boolean hasReadOnly();

  public A addToTargetWWNs(java.lang.Integer index, java.lang.String item);

  public A setToTargetWWNs(java.lang.Integer index, java.lang.String item);

  public A addToTargetWWNs(java.lang.String... items);

  public A addAllToTargetWWNs(java.util.Collection<java.lang.String> items);

  public A removeFromTargetWWNs(java.lang.String... items);

  public A removeAllFromTargetWWNs(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getTargetWWNs();

  public java.lang.String getTargetWWN(java.lang.Integer index);

  public java.lang.String getFirstTargetWWN();

  public java.lang.String getLastTargetWWN();

  public java.lang.String getMatchingTargetWWN(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingTargetWWN(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withTargetWWNs(java.util.List<java.lang.String> targetWWNs);

  public A withTargetWWNs(java.lang.String... targetWWNs);

  public java.lang.Boolean hasTargetWWNs();

  public A addNewTargetWWN(java.lang.String original);

  public A addToWwids(java.lang.Integer index, java.lang.String item);

  public A setToWwids(java.lang.Integer index, java.lang.String item);

  public A addToWwids(java.lang.String... items);

  public A addAllToWwids(java.util.Collection<java.lang.String> items);

  public A removeFromWwids(java.lang.String... items);

  public A removeAllFromWwids(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getWwids();

  public java.lang.String getWwid(java.lang.Integer index);

  public java.lang.String getFirstWwid();

  public java.lang.String getLastWwid();

  public java.lang.String getMatchingWwid(java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingWwid(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withWwids(java.util.List<java.lang.String> wwids);

  public A withWwids(java.lang.String... wwids);

  public java.lang.Boolean hasWwids();

  public A addNewWwid(java.lang.String original);
}
