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

  public A withGroup(String group);

  public Boolean hasGroup();

  public String getName();

  public A withName(String name);

  public Boolean hasName();

  public String getNamespace();

  public A withNamespace(String namespace);

  public Boolean hasNamespace();

  public String getResource();

  public A withResource(String resource);

  public Boolean hasResource();

  public String getSubresource();

  public A withSubresource(String subresource);

  public Boolean hasSubresource();

  public String getVerb();

  public A withVerb(String verb);

  public Boolean hasVerb();

  public String getVersion();

  public A withVersion(String version);

  public Boolean hasVersion();
}
