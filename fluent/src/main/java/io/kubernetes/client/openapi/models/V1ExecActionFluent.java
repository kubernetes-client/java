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
public interface V1ExecActionFluent<A extends V1ExecActionFluent<A>> extends Fluent<A> {
  public A addToCommand(Integer index, String item);

  public A setToCommand(Integer index, String item);

  public A addToCommand(java.lang.String... items);

  public A addAllToCommand(Collection<String> items);

  public A removeFromCommand(java.lang.String... items);

  public A removeAllFromCommand(Collection<String> items);

  public List<String> getCommand();

  public String getCommand(Integer index);

  public String getFirstCommand();

  public String getLastCommand();

  public String getMatchingCommand(Predicate<String> predicate);

  public Boolean hasMatchingCommand(Predicate<String> predicate);

  public A withCommand(List<String> command);

  public A withCommand(java.lang.String... command);

  public Boolean hasCommand();
}
