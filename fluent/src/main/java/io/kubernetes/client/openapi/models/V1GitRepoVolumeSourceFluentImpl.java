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

import io.kubernetes.client.fluent.BaseFluent;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1GitRepoVolumeSourceFluentImpl<A extends V1GitRepoVolumeSourceFluent<A>>
    extends BaseFluent<A> implements V1GitRepoVolumeSourceFluent<A> {
  public V1GitRepoVolumeSourceFluentImpl() {}

  public V1GitRepoVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1GitRepoVolumeSource instance) {
    this.withDirectory(instance.getDirectory());

    this.withRepository(instance.getRepository());

    this.withRevision(instance.getRevision());
  }

  private String directory;
  private java.lang.String repository;
  private java.lang.String revision;

  public java.lang.String getDirectory() {
    return this.directory;
  }

  public A withDirectory(java.lang.String directory) {
    this.directory = directory;
    return (A) this;
  }

  public Boolean hasDirectory() {
    return this.directory != null;
  }

  public java.lang.String getRepository() {
    return this.repository;
  }

  public A withRepository(java.lang.String repository) {
    this.repository = repository;
    return (A) this;
  }

  public java.lang.Boolean hasRepository() {
    return this.repository != null;
  }

  public java.lang.String getRevision() {
    return this.revision;
  }

  public A withRevision(java.lang.String revision) {
    this.revision = revision;
    return (A) this;
  }

  public java.lang.Boolean hasRevision() {
    return this.revision != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1GitRepoVolumeSourceFluentImpl that = (V1GitRepoVolumeSourceFluentImpl) o;
    if (directory != null ? !directory.equals(that.directory) : that.directory != null)
      return false;
    if (repository != null ? !repository.equals(that.repository) : that.repository != null)
      return false;
    if (revision != null ? !revision.equals(that.revision) : that.revision != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(directory, repository, revision, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (directory != null) {
      sb.append("directory:");
      sb.append(directory + ",");
    }
    if (repository != null) {
      sb.append("repository:");
      sb.append(repository + ",");
    }
    if (revision != null) {
      sb.append("revision:");
      sb.append(revision);
    }
    sb.append("}");
    return sb.toString();
  }
}
