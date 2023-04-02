/*
Copyright 2020 The Kubernetes Authors.
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
package io.cert.manager.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Selector selects a set of DNSNames on the Certificate resource that should be solved using this
 * challenge solver. If not specified, the solver will be treated as the &#39;default&#39; solver
 * with the lowest priority, i.e. if any other solver has a more specific match, it will be used
 * instead.
 */
@ApiModel(
    description =
        "Selector selects a set of DNSNames on the Certificate resource that should be solved using this challenge solver. If not specified, the solver will be treated as the 'default' solver with the lowest priority, i.e. if any other solver has a more specific match, it will be used instead.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeSelector {
  public static final String SERIALIZED_NAME_DNS_NAMES = "dnsNames";

  @SerializedName(SERIALIZED_NAME_DNS_NAMES)
  private List<String> dnsNames = null;

  public static final String SERIALIZED_NAME_DNS_ZONES = "dnsZones";

  @SerializedName(SERIALIZED_NAME_DNS_ZONES)
  private List<String> dnsZones = null;

  public static final String SERIALIZED_NAME_MATCH_LABELS = "matchLabels";

  @SerializedName(SERIALIZED_NAME_MATCH_LABELS)
  private Map<String, String> matchLabels = null;

  public V1alpha2IssuerSpecAcmeSelector dnsNames(List<String> dnsNames) {

    this.dnsNames = dnsNames;
    return this;
  }

  public V1alpha2IssuerSpecAcmeSelector addDnsNamesItem(String dnsNamesItem) {
    if (this.dnsNames == null) {
      this.dnsNames = new ArrayList<String>();
    }
    this.dnsNames.add(dnsNamesItem);
    return this;
  }

  /**
   * List of DNSNames that this solver will be used to solve. If specified and a match is found, a
   * dnsNames selector will take precedence over a dnsZones selector. If multiple solvers match with
   * the same dnsNames value, the solver with the most matching labels in matchLabels will be
   * selected. If neither has more matches, the solver defined earlier in the list will be selected.
   *
   * @return dnsNames
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "List of DNSNames that this solver will be used to solve. If specified and a match is found, a dnsNames selector will take precedence over a dnsZones selector. If multiple solvers match with the same dnsNames value, the solver with the most matching labels in matchLabels will be selected. If neither has more matches, the solver defined earlier in the list will be selected.")
  public List<String> getDnsNames() {
    return dnsNames;
  }

  public void setDnsNames(List<String> dnsNames) {
    this.dnsNames = dnsNames;
  }

  public V1alpha2IssuerSpecAcmeSelector dnsZones(List<String> dnsZones) {

    this.dnsZones = dnsZones;
    return this;
  }

  public V1alpha2IssuerSpecAcmeSelector addDnsZonesItem(String dnsZonesItem) {
    if (this.dnsZones == null) {
      this.dnsZones = new ArrayList<String>();
    }
    this.dnsZones.add(dnsZonesItem);
    return this;
  }

  /**
   * List of DNSZones that this solver will be used to solve. The most specific DNS zone match
   * specified here will take precedence over other DNS zone matches, so a solver specifying
   * sys.example.com will be selected over one specifying example.com for the domain
   * www.sys.example.com. If multiple solvers match with the same dnsZones value, the solver with
   * the most matching labels in matchLabels will be selected. If neither has more matches, the
   * solver defined earlier in the list will be selected.
   *
   * @return dnsZones
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "List of DNSZones that this solver will be used to solve. The most specific DNS zone match specified here will take precedence over other DNS zone matches, so a solver specifying sys.example.com will be selected over one specifying example.com for the domain www.sys.example.com. If multiple solvers match with the same dnsZones value, the solver with the most matching labels in matchLabels will be selected. If neither has more matches, the solver defined earlier in the list will be selected.")
  public List<String> getDnsZones() {
    return dnsZones;
  }

  public void setDnsZones(List<String> dnsZones) {
    this.dnsZones = dnsZones;
  }

  public V1alpha2IssuerSpecAcmeSelector matchLabels(Map<String, String> matchLabels) {

    this.matchLabels = matchLabels;
    return this;
  }

  public V1alpha2IssuerSpecAcmeSelector putMatchLabelsItem(String key, String matchLabelsItem) {
    if (this.matchLabels == null) {
      this.matchLabels = new HashMap<String, String>();
    }
    this.matchLabels.put(key, matchLabelsItem);
    return this;
  }

  /**
   * A label selector that is used to refine the set of certificate&#39;s that this challenge solver
   * will apply to.
   *
   * @return matchLabels
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "A label selector that is used to refine the set of certificate's that this challenge solver will apply to.")
  public Map<String, String> getMatchLabels() {
    return matchLabels;
  }

  public void setMatchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeSelector v1alpha2IssuerSpecAcmeSelector =
        (V1alpha2IssuerSpecAcmeSelector) o;
    return Objects.equals(this.dnsNames, v1alpha2IssuerSpecAcmeSelector.dnsNames)
        && Objects.equals(this.dnsZones, v1alpha2IssuerSpecAcmeSelector.dnsZones)
        && Objects.equals(this.matchLabels, v1alpha2IssuerSpecAcmeSelector.matchLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsNames, dnsZones, matchLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeSelector {\n");
    sb.append("    dnsNames: ").append(toIndentedString(dnsNames)).append("\n");
    sb.append("    dnsZones: ").append(toIndentedString(dnsZones)).append("\n");
    sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
