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
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1HostAliasFluent<A extends V1HostAliasFluent<A>> extends Fluent<A> {
  public A addToHostnames(Integer index, String item);

  public A setToHostnames(Integer index, String item);

  public A addToHostnames(java.lang.String... items);

  public A addAllToHostnames(Collection<String> items);

  public A removeFromHostnames(java.lang.String... items);

  public A removeAllFromHostnames(Collection<String> items);

  public List<String> getHostnames();

  public String getHostname(Integer index);

  public String getFirstHostname();

  public String getLastHostname();

  public String getMatchingHostname(Predicate<String> predicate);

  public Boolean hasMatchingHostname(Predicate<String> predicate);

  public A withHostnames(List<String> hostnames);

  public A withHostnames(java.lang.String... hostnames);

  public Boolean hasHostnames();

  public String getIp();

  public A withIp(String ip);

  public Boolean hasIp();
}
