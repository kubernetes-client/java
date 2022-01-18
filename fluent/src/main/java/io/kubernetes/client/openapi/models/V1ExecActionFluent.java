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
public interface V1ExecActionFluent<
        A extends io.kubernetes.client.openapi.models.V1ExecActionFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToCommand(java.lang.Integer index, java.lang.String item);

  public A setToCommand(java.lang.Integer index, java.lang.String item);

  public A addToCommand(java.lang.String... items);

  public A addAllToCommand(java.util.Collection<java.lang.String> items);

  public A removeFromCommand(java.lang.String... items);

  public A removeAllFromCommand(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getCommand();

  public java.lang.String getCommand(java.lang.Integer index);

  public java.lang.String getFirstCommand();

  public java.lang.String getLastCommand();

  public java.lang.String getMatchingCommand(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingCommand(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withCommand(java.util.List<java.lang.String> command);

  public A withCommand(java.lang.String... command);

  public java.lang.Boolean hasCommand();

  public A addNewCommand(java.lang.String original);
}
