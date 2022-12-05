package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1GitRepoVolumeSourceFluentImpl<A extends V1GitRepoVolumeSourceFluent<A>> extends BaseFluent<A> implements V1GitRepoVolumeSourceFluent<A>{
  public V1GitRepoVolumeSourceFluentImpl() {
  }
  public V1GitRepoVolumeSourceFluentImpl(V1GitRepoVolumeSource instance) {
    this.withDirectory(instance.getDirectory());

    this.withRepository(instance.getRepository());

    this.withRevision(instance.getRevision());

  }
  private String directory;
  private String repository;
  private String revision;
  public String getDirectory() {
    return this.directory;
  }
  public A withDirectory(String directory) {
    this.directory=directory; return (A) this;
  }
  public Boolean hasDirectory() {
    return this.directory != null;
  }
  public String getRepository() {
    return this.repository;
  }
  public A withRepository(String repository) {
    this.repository=repository; return (A) this;
  }
  public Boolean hasRepository() {
    return this.repository != null;
  }
  public String getRevision() {
    return this.revision;
  }
  public A withRevision(String revision) {
    this.revision=revision; return (A) this;
  }
  public Boolean hasRevision() {
    return this.revision != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1GitRepoVolumeSourceFluentImpl that = (V1GitRepoVolumeSourceFluentImpl) o;
    if (directory != null ? !directory.equals(that.directory) :that.directory != null) return false;
    if (repository != null ? !repository.equals(that.repository) :that.repository != null) return false;
    if (revision != null ? !revision.equals(that.revision) :that.revision != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(directory,  repository,  revision,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (directory != null) { sb.append("directory:"); sb.append(directory + ","); }
    if (repository != null) { sb.append("repository:"); sb.append(repository + ","); }
    if (revision != null) { sb.append("revision:"); sb.append(revision); }
    sb.append("}");
    return sb.toString();
  }
  
}