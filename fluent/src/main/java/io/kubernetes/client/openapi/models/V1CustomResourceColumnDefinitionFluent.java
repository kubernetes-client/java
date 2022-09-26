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
public interface V1CustomResourceColumnDefinitionFluent<
        A extends V1CustomResourceColumnDefinitionFluent<A>>
    extends Fluent<A> {
  public String getDescription();

  public A withDescription(String description);

  public Boolean hasDescription();

  public String getFormat();

  public A withFormat(String format);

  public Boolean hasFormat();

  public String getJsonPath();

  public A withJsonPath(String jsonPath);

  public Boolean hasJsonPath();

  public String getName();

  public A withName(String name);

  public Boolean hasName();

  public Integer getPriority();

  public A withPriority(Integer priority);

  public Boolean hasPriority();

  public String getType();

  public A withType(String type);

  public Boolean hasType();
}
