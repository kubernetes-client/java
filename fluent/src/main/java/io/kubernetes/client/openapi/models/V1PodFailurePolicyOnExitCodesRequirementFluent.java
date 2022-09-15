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
public interface V1PodFailurePolicyOnExitCodesRequirementFluent<
        A extends V1PodFailurePolicyOnExitCodesRequirementFluent<A>>
    extends Fluent<A> {
  public String getContainerName();

  public A withContainerName(String containerName);

  public Boolean hasContainerName();

  public String getOperator();

  public A withOperator(String operator);

  public Boolean hasOperator();

  public A addToValues(Integer index, Integer item);

  public A setToValues(Integer index, Integer item);

  public A addToValues(java.lang.Integer... items);

  public A addAllToValues(Collection<Integer> items);

  public A removeFromValues(java.lang.Integer... items);

  public A removeAllFromValues(Collection<Integer> items);

  public List<Integer> getValues();

  public Integer getValue(Integer index);

  public Integer getFirstValue();

  public Integer getLastValue();

  public Integer getMatchingValue(Predicate<Integer> predicate);

  public Boolean hasMatchingValue(Predicate<Integer> predicate);

  public A withValues(List<Integer> values);

  public A withValues(java.lang.Integer... values);

  public Boolean hasValues();
}
