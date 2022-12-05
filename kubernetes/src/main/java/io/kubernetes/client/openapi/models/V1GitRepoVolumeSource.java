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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * Represents a volume that is populated with the contents of a git repository. Git repo volumes do
 * not support ownership management. Git repo volumes support SELinux relabeling. DEPRECATED:
 * GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an
 * InitContainer that clones the repo using git, then mount the EmptyDir into the Pod&#39;s
 * container.
 */
@ApiModel(
    description =
        "Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.  DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1GitRepoVolumeSource {
  public static final String SERIALIZED_NAME_DIRECTORY = "directory";

  @SerializedName(SERIALIZED_NAME_DIRECTORY)
  private String directory;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";

  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private String repository;

  public static final String SERIALIZED_NAME_REVISION = "revision";

  @SerializedName(SERIALIZED_NAME_REVISION)
  private String revision;

  public V1GitRepoVolumeSource directory(String directory) {

    this.directory = directory;
    return this;
  }

  /**
   * directory is the target directory name. Must not contain or start with &#39;..&#39;. If
   * &#39;.&#39; is supplied, the volume directory will be the git repository. Otherwise, if
   * specified, the volume will contain the git repository in the subdirectory with the given name.
   *
   * @return directory
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "directory is the target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.")
  public String getDirectory() {
    return directory;
  }

  public void setDirectory(String directory) {
    this.directory = directory;
  }

  public V1GitRepoVolumeSource repository(String repository) {

    this.repository = repository;
    return this;
  }

  /**
   * repository is the URL
   *
   * @return repository
   */
  @ApiModelProperty(required = true, value = "repository is the URL")
  public String getRepository() {
    return repository;
  }

  public void setRepository(String repository) {
    this.repository = repository;
  }

  public V1GitRepoVolumeSource revision(String revision) {

    this.revision = revision;
    return this;
  }

  /**
   * revision is the commit hash for the specified revision.
   *
   * @return revision
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "revision is the commit hash for the specified revision.")
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GitRepoVolumeSource v1GitRepoVolumeSource = (V1GitRepoVolumeSource) o;
    return Objects.equals(this.directory, v1GitRepoVolumeSource.directory)
        && Objects.equals(this.repository, v1GitRepoVolumeSource.repository)
        && Objects.equals(this.revision, v1GitRepoVolumeSource.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directory, repository, revision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GitRepoVolumeSource {\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
