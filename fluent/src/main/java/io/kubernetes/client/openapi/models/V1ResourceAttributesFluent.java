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

/** Generated */
public interface V1ResourceAttributesFluent<A extends V1ResourceAttributesFluent<A>>
    extends Fluent<A> {
  public String getGroup();

  public A withGroup(java.lang.String group);

  public Boolean hasGroup();

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  public java.lang.String getNamespace();

  public A withNamespace(java.lang.String namespace);

  public java.lang.Boolean hasNamespace();

  public java.lang.String getResource();

  public A withResource(java.lang.String resource);

  public java.lang.Boolean hasResource();

  public java.lang.String getSubresource();

  public A withSubresource(java.lang.String subresource);

  public java.lang.Boolean hasSubresource();

  public java.lang.String getVerb();

  public A withVerb(java.lang.String verb);

  public java.lang.Boolean hasVerb();

  public java.lang.String getVersion();

  public A withVersion(java.lang.String version);

  public java.lang.Boolean hasVersion();
}
