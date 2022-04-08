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
public interface V1TopologySelectorLabelRequirementFluent<
        A extends V1TopologySelectorLabelRequirementFluent<A>>
    extends Fluent<A> {
  public String getKey();

  public A withKey(java.lang.String key);

  public Boolean hasKey();

  public A addToValues(Integer index, java.lang.String item);

  public A setToValues(java.lang.Integer index, java.lang.String item);

  public A addToValues(java.lang.String... items);

  public A addAllToValues(Collection<java.lang.String> items);

  public A removeFromValues(java.lang.String... items);

  public A removeAllFromValues(java.util.Collection<java.lang.String> items);

  public List<java.lang.String> getValues();

  public java.lang.String getValue(java.lang.Integer index);

  public java.lang.String getFirstValue();

  public java.lang.String getLastValue();

  public java.lang.String getMatchingValue(Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingValue(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withValues(java.util.List<java.lang.String> values);

  public A withValues(java.lang.String... values);

  public java.lang.Boolean hasValues();
}
