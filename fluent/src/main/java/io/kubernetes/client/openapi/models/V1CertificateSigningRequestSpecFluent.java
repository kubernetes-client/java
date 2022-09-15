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
import java.util.Map;
import java.util.function.Predicate;

/** Generated */
public interface V1CertificateSigningRequestSpecFluent<
        A extends V1CertificateSigningRequestSpecFluent<A>>
    extends Fluent<A> {
  public Integer getExpirationSeconds();

  public A withExpirationSeconds(Integer expirationSeconds);

  public Boolean hasExpirationSeconds();

  public A addToExtra(String key, List<String> value);

  public A addToExtra(Map<String, List<String>> map);

  public A removeFromExtra(String key);

  public A removeFromExtra(Map<String, List<String>> map);

  public Map<String, List<String>> getExtra();

  public <K, V> A withExtra(Map<String, List<String>> extra);

  public Boolean hasExtra();

  public A addToGroups(Integer index, String item);

  public A setToGroups(Integer index, String item);

  public A addToGroups(java.lang.String... items);

  public A addAllToGroups(Collection<String> items);

  public A removeFromGroups(java.lang.String... items);

  public A removeAllFromGroups(Collection<String> items);

  public List<String> getGroups();

  public String getGroup(Integer index);

  public String getFirstGroup();

  public String getLastGroup();

  public String getMatchingGroup(Predicate<String> predicate);

  public Boolean hasMatchingGroup(Predicate<String> predicate);

  public A withGroups(List<String> groups);

  public A withGroups(java.lang.String... groups);

  public Boolean hasGroups();

  public A withRequest(byte... request);

  public byte[] getRequest();

  public A addToRequest(Integer index, Byte item);

  public A setToRequest(Integer index, Byte item);

  public A addToRequest(java.lang.Byte... items);

  public A addAllToRequest(Collection<Byte> items);

  public A removeFromRequest(java.lang.Byte... items);

  public A removeAllFromRequest(Collection<Byte> items);

  public Boolean hasRequest();

  public String getSignerName();

  public A withSignerName(String signerName);

  public Boolean hasSignerName();

  public String getUid();

  public A withUid(String uid);

  public Boolean hasUid();

  public A addToUsages(Integer index, String item);

  public A setToUsages(Integer index, String item);

  public A addToUsages(java.lang.String... items);

  public A addAllToUsages(Collection<String> items);

  public A removeFromUsages(java.lang.String... items);

  public A removeAllFromUsages(Collection<String> items);

  public List<String> getUsages();

  public String getUsage(Integer index);

  public String getFirstUsage();

  public String getLastUsage();

  public String getMatchingUsage(Predicate<String> predicate);

  public Boolean hasMatchingUsage(Predicate<String> predicate);

  public A withUsages(List<String> usages);

  public A withUsages(java.lang.String... usages);

  public Boolean hasUsages();

  public String getUsername();

  public A withUsername(String username);

  public Boolean hasUsername();
}
