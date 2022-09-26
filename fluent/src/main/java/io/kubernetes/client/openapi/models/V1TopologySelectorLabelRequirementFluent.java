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

  public A withKey(String key);

  public Boolean hasKey();

  public A addToValues(Integer index, String item);

  public A setToValues(Integer index, String item);

  public A addToValues(java.lang.String... items);

  public A addAllToValues(Collection<String> items);

  public A removeFromValues(java.lang.String... items);

  public A removeAllFromValues(Collection<String> items);

  public List<String> getValues();

  public String getValue(Integer index);

  public String getFirstValue();

  public String getLastValue();

  public String getMatchingValue(Predicate<String> predicate);

  public Boolean hasMatchingValue(Predicate<String> predicate);

  public A withValues(List<String> values);

  public A withValues(java.lang.String... values);

  public Boolean hasValues();
}
