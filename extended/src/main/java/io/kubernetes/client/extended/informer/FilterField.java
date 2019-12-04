package io.kubernetes.client.extended.informer;

import org.apache.commons.lang3.StringUtils;

public class FilterField {

  private String name;
  private Class<?> declaringClass;
  private String serializedName;

  public FilterField setName(String name) {
    this.name = name;
    return this;
  }

  public FilterField setDeclaringClass(Class<?> declaringClass) {
    this.declaringClass = declaringClass;
    return this;
  }

  public FilterField setSerializedName(String serializedName) {
    this.serializedName = serializedName;
    return this;
  }

  public String getName() {
    return name;
  }

  public Class<?> getDeclaringClass() {
    return declaringClass;
  }

  public String getSerializedName() {
    return serializedName;
  }

  public boolean isNotEmpty() {
    return StringUtils.isNotEmpty(name)
        || declaringClass != null
        || StringUtils.isNotEmpty(serializedName);
  }

  public boolean isEmpty() {
    return !isNotEmpty();
  }
}
