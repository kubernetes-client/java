package io.kubernetes.client.extended.informer;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by 烛坤 on 2019/10/24.
 *
 * @author 烛坤
 * @date 2019/10/24
 */
public class FilterField {

  // the name of the field
  private String name;

  // the declaring class name that contains this field
  private Class<?> declaringClass;

  // the serialized name of the field
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
}
