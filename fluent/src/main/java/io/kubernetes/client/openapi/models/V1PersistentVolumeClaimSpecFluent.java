package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.List;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PersistentVolumeClaimSpecFluent<A extends V1PersistentVolumeClaimSpecFluent<A>> extends BaseFluent<A>{
  public V1PersistentVolumeClaimSpecFluent() {
  }
  
  public V1PersistentVolumeClaimSpecFluent(V1PersistentVolumeClaimSpec instance) {
    this.copyInstance(instance);
  }
  private List<String> accessModes;
  private V1TypedLocalObjectReferenceBuilder dataSource;
  private V1TypedObjectReferenceBuilder dataSourceRef;
  private V1VolumeResourceRequirementsBuilder resources;
  private V1LabelSelectorBuilder selector;
  private String storageClassName;
  private String volumeAttributesClassName;
  private String volumeMode;
  private String volumeName;
  
  protected void copyInstance(V1PersistentVolumeClaimSpec instance) {
    instance = (instance != null ? instance : new V1PersistentVolumeClaimSpec());
    if (instance != null) {
          this.withAccessModes(instance.getAccessModes());
          this.withDataSource(instance.getDataSource());
          this.withDataSourceRef(instance.getDataSourceRef());
          this.withResources(instance.getResources());
          this.withSelector(instance.getSelector());
          this.withStorageClassName(instance.getStorageClassName());
          this.withVolumeAttributesClassName(instance.getVolumeAttributesClassName());
          this.withVolumeMode(instance.getVolumeMode());
          this.withVolumeName(instance.getVolumeName());
        }
  }
  
  public A addToAccessModes(int index,String item) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    this.accessModes.add(index, item);
    return (A)this;
  }
  
  public A setToAccessModes(int index,String item) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    this.accessModes.set(index, item); return (A)this;
  }
  
  public A addToAccessModes(java.lang.String... items) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    for (String item : items) {this.accessModes.add(item);} return (A)this;
  }
  
  public A addAllToAccessModes(Collection<String> items) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    for (String item : items) {this.accessModes.add(item);} return (A)this;
  }
  
  public A removeFromAccessModes(java.lang.String... items) {
    if (this.accessModes == null) return (A)this;
    for (String item : items) { this.accessModes.remove(item);} return (A)this;
  }
  
  public A removeAllFromAccessModes(Collection<String> items) {
    if (this.accessModes == null) return (A)this;
    for (String item : items) { this.accessModes.remove(item);} return (A)this;
  }
  
  public List<String> getAccessModes() {
    return this.accessModes;
  }
  
  public String getAccessMode(int index) {
    return this.accessModes.get(index);
  }
  
  public String getFirstAccessMode() {
    return this.accessModes.get(0);
  }
  
  public String getLastAccessMode() {
    return this.accessModes.get(accessModes.size() - 1);
  }
  
  public String getMatchingAccessMode(Predicate<String> predicate) {
      for (String item : accessModes) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingAccessMode(Predicate<String> predicate) {
      for (String item : accessModes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withAccessModes(List<String> accessModes) {
    if (accessModes != null) {
        this.accessModes = new ArrayList();
        for (String item : accessModes) {
          this.addToAccessModes(item);
        }
    } else {
      this.accessModes = null;
    }
    return (A) this;
  }
  
  public A withAccessModes(java.lang.String... accessModes) {
    if (this.accessModes != null) {
        this.accessModes.clear();
        _visitables.remove("accessModes");
    }
    if (accessModes != null) {
      for (String item : accessModes) {
        this.addToAccessModes(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasAccessModes() {
    return this.accessModes != null && !this.accessModes.isEmpty();
  }
  
  public V1TypedLocalObjectReference buildDataSource() {
    return this.dataSource != null ? this.dataSource.build() : null;
  }
  
  public A withDataSource(V1TypedLocalObjectReference dataSource) {
    this._visitables.remove("dataSource");
    if (dataSource != null) {
        this.dataSource = new V1TypedLocalObjectReferenceBuilder(dataSource);
        this._visitables.get("dataSource").add(this.dataSource);
    } else {
        this.dataSource = null;
        this._visitables.get("dataSource").remove(this.dataSource);
    }
    return (A) this;
  }
  
  public boolean hasDataSource() {
    return this.dataSource != null;
  }
  
  public DataSourceNested<A> withNewDataSource() {
    return new DataSourceNested(null);
  }
  
  public DataSourceNested<A> withNewDataSourceLike(V1TypedLocalObjectReference item) {
    return new DataSourceNested(item);
  }
  
  public DataSourceNested<A> editDataSource() {
    return withNewDataSourceLike(java.util.Optional.ofNullable(buildDataSource()).orElse(null));
  }
  
  public DataSourceNested<A> editOrNewDataSource() {
    return withNewDataSourceLike(java.util.Optional.ofNullable(buildDataSource()).orElse(new V1TypedLocalObjectReferenceBuilder().build()));
  }
  
  public DataSourceNested<A> editOrNewDataSourceLike(V1TypedLocalObjectReference item) {
    return withNewDataSourceLike(java.util.Optional.ofNullable(buildDataSource()).orElse(item));
  }
  
  public V1TypedObjectReference buildDataSourceRef() {
    return this.dataSourceRef != null ? this.dataSourceRef.build() : null;
  }
  
  public A withDataSourceRef(V1TypedObjectReference dataSourceRef) {
    this._visitables.remove("dataSourceRef");
    if (dataSourceRef != null) {
        this.dataSourceRef = new V1TypedObjectReferenceBuilder(dataSourceRef);
        this._visitables.get("dataSourceRef").add(this.dataSourceRef);
    } else {
        this.dataSourceRef = null;
        this._visitables.get("dataSourceRef").remove(this.dataSourceRef);
    }
    return (A) this;
  }
  
  public boolean hasDataSourceRef() {
    return this.dataSourceRef != null;
  }
  
  public DataSourceRefNested<A> withNewDataSourceRef() {
    return new DataSourceRefNested(null);
  }
  
  public DataSourceRefNested<A> withNewDataSourceRefLike(V1TypedObjectReference item) {
    return new DataSourceRefNested(item);
  }
  
  public DataSourceRefNested<A> editDataSourceRef() {
    return withNewDataSourceRefLike(java.util.Optional.ofNullable(buildDataSourceRef()).orElse(null));
  }
  
  public DataSourceRefNested<A> editOrNewDataSourceRef() {
    return withNewDataSourceRefLike(java.util.Optional.ofNullable(buildDataSourceRef()).orElse(new V1TypedObjectReferenceBuilder().build()));
  }
  
  public DataSourceRefNested<A> editOrNewDataSourceRefLike(V1TypedObjectReference item) {
    return withNewDataSourceRefLike(java.util.Optional.ofNullable(buildDataSourceRef()).orElse(item));
  }
  
  public V1VolumeResourceRequirements buildResources() {
    return this.resources != null ? this.resources.build() : null;
  }
  
  public A withResources(V1VolumeResourceRequirements resources) {
    this._visitables.remove("resources");
    if (resources != null) {
        this.resources = new V1VolumeResourceRequirementsBuilder(resources);
        this._visitables.get("resources").add(this.resources);
    } else {
        this.resources = null;
        this._visitables.get("resources").remove(this.resources);
    }
    return (A) this;
  }
  
  public boolean hasResources() {
    return this.resources != null;
  }
  
  public ResourcesNested<A> withNewResources() {
    return new ResourcesNested(null);
  }
  
  public ResourcesNested<A> withNewResourcesLike(V1VolumeResourceRequirements item) {
    return new ResourcesNested(item);
  }
  
  public ResourcesNested<A> editResources() {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(null));
  }
  
  public ResourcesNested<A> editOrNewResources() {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(new V1VolumeResourceRequirementsBuilder().build()));
  }
  
  public ResourcesNested<A> editOrNewResourcesLike(V1VolumeResourceRequirements item) {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(item));
  }
  
  public V1LabelSelector buildSelector() {
    return this.selector != null ? this.selector.build() : null;
  }
  
  public A withSelector(V1LabelSelector selector) {
    this._visitables.remove("selector");
    if (selector != null) {
        this.selector = new V1LabelSelectorBuilder(selector);
        this._visitables.get("selector").add(this.selector);
    } else {
        this.selector = null;
        this._visitables.get("selector").remove(this.selector);
    }
    return (A) this;
  }
  
  public boolean hasSelector() {
    return this.selector != null;
  }
  
  public SelectorNested<A> withNewSelector() {
    return new SelectorNested(null);
  }
  
  public SelectorNested<A> withNewSelectorLike(V1LabelSelector item) {
    return new SelectorNested(item);
  }
  
  public SelectorNested<A> editSelector() {
    return withNewSelectorLike(java.util.Optional.ofNullable(buildSelector()).orElse(null));
  }
  
  public SelectorNested<A> editOrNewSelector() {
    return withNewSelectorLike(java.util.Optional.ofNullable(buildSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item) {
    return withNewSelectorLike(java.util.Optional.ofNullable(buildSelector()).orElse(item));
  }
  
  public String getStorageClassName() {
    return this.storageClassName;
  }
  
  public A withStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
    return (A) this;
  }
  
  public boolean hasStorageClassName() {
    return this.storageClassName != null;
  }
  
  public String getVolumeAttributesClassName() {
    return this.volumeAttributesClassName;
  }
  
  public A withVolumeAttributesClassName(String volumeAttributesClassName) {
    this.volumeAttributesClassName = volumeAttributesClassName;
    return (A) this;
  }
  
  public boolean hasVolumeAttributesClassName() {
    return this.volumeAttributesClassName != null;
  }
  
  public String getVolumeMode() {
    return this.volumeMode;
  }
  
  public A withVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
    return (A) this;
  }
  
  public boolean hasVolumeMode() {
    return this.volumeMode != null;
  }
  
  public String getVolumeName() {
    return this.volumeName;
  }
  
  public A withVolumeName(String volumeName) {
    this.volumeName = volumeName;
    return (A) this;
  }
  
  public boolean hasVolumeName() {
    return this.volumeName != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PersistentVolumeClaimSpecFluent that = (V1PersistentVolumeClaimSpecFluent) o;
    if (!java.util.Objects.equals(accessModes, that.accessModes)) return false;
    if (!java.util.Objects.equals(dataSource, that.dataSource)) return false;
    if (!java.util.Objects.equals(dataSourceRef, that.dataSourceRef)) return false;
    if (!java.util.Objects.equals(resources, that.resources)) return false;
    if (!java.util.Objects.equals(selector, that.selector)) return false;
    if (!java.util.Objects.equals(storageClassName, that.storageClassName)) return false;
    if (!java.util.Objects.equals(volumeAttributesClassName, that.volumeAttributesClassName)) return false;
    if (!java.util.Objects.equals(volumeMode, that.volumeMode)) return false;
    if (!java.util.Objects.equals(volumeName, that.volumeName)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(accessModes,  dataSource,  dataSourceRef,  resources,  selector,  storageClassName,  volumeAttributesClassName,  volumeMode,  volumeName,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (accessModes != null && !accessModes.isEmpty()) { sb.append("accessModes:"); sb.append(accessModes + ","); }
    if (dataSource != null) { sb.append("dataSource:"); sb.append(dataSource + ","); }
    if (dataSourceRef != null) { sb.append("dataSourceRef:"); sb.append(dataSourceRef + ","); }
    if (resources != null) { sb.append("resources:"); sb.append(resources + ","); }
    if (selector != null) { sb.append("selector:"); sb.append(selector + ","); }
    if (storageClassName != null) { sb.append("storageClassName:"); sb.append(storageClassName + ","); }
    if (volumeAttributesClassName != null) { sb.append("volumeAttributesClassName:"); sb.append(volumeAttributesClassName + ","); }
    if (volumeMode != null) { sb.append("volumeMode:"); sb.append(volumeMode + ","); }
    if (volumeName != null) { sb.append("volumeName:"); sb.append(volumeName); }
    sb.append("}");
    return sb.toString();
  }
  public class DataSourceNested<N> extends V1TypedLocalObjectReferenceFluent<DataSourceNested<N>> implements Nested<N>{
    DataSourceNested(V1TypedLocalObjectReference item) {
      this.builder = new V1TypedLocalObjectReferenceBuilder(this, item);
    }
    V1TypedLocalObjectReferenceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeClaimSpecFluent.this.withDataSource(builder.build());
    }
    
    public N endDataSource() {
      return and();
    }
    
  
  }
  public class DataSourceRefNested<N> extends V1TypedObjectReferenceFluent<DataSourceRefNested<N>> implements Nested<N>{
    DataSourceRefNested(V1TypedObjectReference item) {
      this.builder = new V1TypedObjectReferenceBuilder(this, item);
    }
    V1TypedObjectReferenceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeClaimSpecFluent.this.withDataSourceRef(builder.build());
    }
    
    public N endDataSourceRef() {
      return and();
    }
    
  
  }
  public class ResourcesNested<N> extends V1VolumeResourceRequirementsFluent<ResourcesNested<N>> implements Nested<N>{
    ResourcesNested(V1VolumeResourceRequirements item) {
      this.builder = new V1VolumeResourceRequirementsBuilder(this, item);
    }
    V1VolumeResourceRequirementsBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeClaimSpecFluent.this.withResources(builder.build());
    }
    
    public N endResources() {
      return and();
    }
    
  
  }
  public class SelectorNested<N> extends V1LabelSelectorFluent<SelectorNested<N>> implements Nested<N>{
    SelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeClaimSpecFluent.this.withSelector(builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  
  }

}