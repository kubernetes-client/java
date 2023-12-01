/*
Copyright 2023 The Kubernetes Authors.
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1UserInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SelfSubjectReviewStatus is filled by the kube-apiserver and sent back to a user.
 */
@ApiModel(description = "SelfSubjectReviewStatus is filled by the kube-apiserver and sent back to a user.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1beta1SelfSubjectReviewStatus {
  public static final String SERIALIZED_NAME_USER_INFO = "userInfo";
  @SerializedName(SERIALIZED_NAME_USER_INFO)
  private V1UserInfo userInfo;


  public V1beta1SelfSubjectReviewStatus userInfo(V1UserInfo userInfo) {

    this.userInfo = userInfo;
    return this;
  }

   /**
   * Get userInfo
   * @return userInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1UserInfo getUserInfo() {
    return userInfo;
  }


  public void setUserInfo(V1UserInfo userInfo) {
    this.userInfo = userInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1SelfSubjectReviewStatus v1beta1SelfSubjectReviewStatus = (V1beta1SelfSubjectReviewStatus) o;
    return Objects.equals(this.userInfo, v1beta1SelfSubjectReviewStatus.userInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1SelfSubjectReviewStatus {\n");
    sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
