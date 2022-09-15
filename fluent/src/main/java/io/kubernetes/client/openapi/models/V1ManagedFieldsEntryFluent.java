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
import java.time.OffsetDateTime;

/** Generated */
public interface V1ManagedFieldsEntryFluent<A extends V1ManagedFieldsEntryFluent<A>>
    extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public String getFieldsType();

  public A withFieldsType(String fieldsType);

  public Boolean hasFieldsType();

  public Object getFieldsV1();

  public A withFieldsV1(Object fieldsV1);

  public Boolean hasFieldsV1();

  public String getManager();

  public A withManager(String manager);

  public Boolean hasManager();

  public String getOperation();

  public A withOperation(String operation);

  public Boolean hasOperation();

  public String getSubresource();

  public A withSubresource(String subresource);

  public Boolean hasSubresource();

  public OffsetDateTime getTime();

  public A withTime(OffsetDateTime time);

  public Boolean hasTime();
}
