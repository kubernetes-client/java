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
import java.util.List;
import java.util.Objects;

/** Full X509 name specification (https://golang.org/pkg/crypto/x509/pkix/#Name). */
@ApiModel(
    description = "Full X509 name specification (https://golang.org/pkg/crypto/x509/pkix/#Name).")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2CertificateSpecSubject {
  public static final String SERIALIZED_NAME_COUNTRIES = "countries";

  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  private List<String> countries = null;

  public static final String SERIALIZED_NAME_LOCALITIES = "localities";

  @SerializedName(SERIALIZED_NAME_LOCALITIES)
  private List<String> localities = null;

  public static final String SERIALIZED_NAME_ORGANIZATIONAL_UNITS = "organizationalUnits";

  @SerializedName(SERIALIZED_NAME_ORGANIZATIONAL_UNITS)
  private List<String> organizationalUnits = null;

  public static final String SERIALIZED_NAME_POSTAL_CODES = "postalCodes";

  @SerializedName(SERIALIZED_NAME_POSTAL_CODES)
  private List<String> postalCodes = null;

  public static final String SERIALIZED_NAME_PROVINCES = "provinces";

  @SerializedName(SERIALIZED_NAME_PROVINCES)
  private List<String> provinces = null;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serialNumber";

  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_STREET_ADDRESSES = "streetAddresses";

  @SerializedName(SERIALIZED_NAME_STREET_ADDRESSES)
  private List<String> streetAddresses = null;

  public V1alpha2CertificateSpecSubject countries(List<String> countries) {

    this.countries = countries;
    return this;
  }

  public V1alpha2CertificateSpecSubject addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<String>();
    }
    this.countries.add(countriesItem);
    return this;
  }

  /**
   * Countries to be used on the Certificate.
   *
   * @return countries
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Countries to be used on the Certificate.")
  public List<String> getCountries() {
    return countries;
  }

  public void setCountries(List<String> countries) {
    this.countries = countries;
  }

  public V1alpha2CertificateSpecSubject localities(List<String> localities) {

    this.localities = localities;
    return this;
  }

  public V1alpha2CertificateSpecSubject addLocalitiesItem(String localitiesItem) {
    if (this.localities == null) {
      this.localities = new ArrayList<String>();
    }
    this.localities.add(localitiesItem);
    return this;
  }

  /**
   * Cities to be used on the Certificate.
   *
   * @return localities
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cities to be used on the Certificate.")
  public List<String> getLocalities() {
    return localities;
  }

  public void setLocalities(List<String> localities) {
    this.localities = localities;
  }

  public V1alpha2CertificateSpecSubject organizationalUnits(List<String> organizationalUnits) {

    this.organizationalUnits = organizationalUnits;
    return this;
  }

  public V1alpha2CertificateSpecSubject addOrganizationalUnitsItem(String organizationalUnitsItem) {
    if (this.organizationalUnits == null) {
      this.organizationalUnits = new ArrayList<String>();
    }
    this.organizationalUnits.add(organizationalUnitsItem);
    return this;
  }

  /**
   * Organizational Units to be used on the Certificate.
   *
   * @return organizationalUnits
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Organizational Units to be used on the Certificate.")
  public List<String> getOrganizationalUnits() {
    return organizationalUnits;
  }

  public void setOrganizationalUnits(List<String> organizationalUnits) {
    this.organizationalUnits = organizationalUnits;
  }

  public V1alpha2CertificateSpecSubject postalCodes(List<String> postalCodes) {

    this.postalCodes = postalCodes;
    return this;
  }

  public V1alpha2CertificateSpecSubject addPostalCodesItem(String postalCodesItem) {
    if (this.postalCodes == null) {
      this.postalCodes = new ArrayList<String>();
    }
    this.postalCodes.add(postalCodesItem);
    return this;
  }

  /**
   * Postal codes to be used on the Certificate.
   *
   * @return postalCodes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Postal codes to be used on the Certificate.")
  public List<String> getPostalCodes() {
    return postalCodes;
  }

  public void setPostalCodes(List<String> postalCodes) {
    this.postalCodes = postalCodes;
  }

  public V1alpha2CertificateSpecSubject provinces(List<String> provinces) {

    this.provinces = provinces;
    return this;
  }

  public V1alpha2CertificateSpecSubject addProvincesItem(String provincesItem) {
    if (this.provinces == null) {
      this.provinces = new ArrayList<String>();
    }
    this.provinces.add(provincesItem);
    return this;
  }

  /**
   * State/Provinces to be used on the Certificate.
   *
   * @return provinces
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State/Provinces to be used on the Certificate.")
  public List<String> getProvinces() {
    return provinces;
  }

  public void setProvinces(List<String> provinces) {
    this.provinces = provinces;
  }

  public V1alpha2CertificateSpecSubject serialNumber(String serialNumber) {

    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Serial number to be used on the Certificate.
   *
   * @return serialNumber
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Serial number to be used on the Certificate.")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public V1alpha2CertificateSpecSubject streetAddresses(List<String> streetAddresses) {

    this.streetAddresses = streetAddresses;
    return this;
  }

  public V1alpha2CertificateSpecSubject addStreetAddressesItem(String streetAddressesItem) {
    if (this.streetAddresses == null) {
      this.streetAddresses = new ArrayList<String>();
    }
    this.streetAddresses.add(streetAddressesItem);
    return this;
  }

  /**
   * Street addresses to be used on the Certificate.
   *
   * @return streetAddresses
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Street addresses to be used on the Certificate.")
  public List<String> getStreetAddresses() {
    return streetAddresses;
  }

  public void setStreetAddresses(List<String> streetAddresses) {
    this.streetAddresses = streetAddresses;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2CertificateSpecSubject v1alpha2CertificateSpecSubject =
        (V1alpha2CertificateSpecSubject) o;
    return Objects.equals(this.countries, v1alpha2CertificateSpecSubject.countries)
        && Objects.equals(this.localities, v1alpha2CertificateSpecSubject.localities)
        && Objects.equals(
            this.organizationalUnits, v1alpha2CertificateSpecSubject.organizationalUnits)
        && Objects.equals(this.postalCodes, v1alpha2CertificateSpecSubject.postalCodes)
        && Objects.equals(this.provinces, v1alpha2CertificateSpecSubject.provinces)
        && Objects.equals(this.serialNumber, v1alpha2CertificateSpecSubject.serialNumber)
        && Objects.equals(this.streetAddresses, v1alpha2CertificateSpecSubject.streetAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        countries,
        localities,
        organizationalUnits,
        postalCodes,
        provinces,
        serialNumber,
        streetAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2CertificateSpecSubject {\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    localities: ").append(toIndentedString(localities)).append("\n");
    sb.append("    organizationalUnits: ")
        .append(toIndentedString(organizationalUnits))
        .append("\n");
    sb.append("    postalCodes: ").append(toIndentedString(postalCodes)).append("\n");
    sb.append("    provinces: ").append(toIndentedString(provinces)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    streetAddresses: ").append(toIndentedString(streetAddresses)).append("\n");
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
