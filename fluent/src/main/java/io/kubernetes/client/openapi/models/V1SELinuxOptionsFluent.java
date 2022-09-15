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
public interface V1SELinuxOptionsFluent<A extends V1SELinuxOptionsFluent<A>> extends Fluent<A> {
  public String getLevel();

  public A withLevel(String level);

  public Boolean hasLevel();

  public String getRole();

  public A withRole(String role);

  public Boolean hasRole();

  public String getType();

  public A withType(String type);

  public Boolean hasType();

  public String getUser();

  public A withUser(String user);

  public Boolean hasUser();
}
