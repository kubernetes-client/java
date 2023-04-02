package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import java.util.Iterator;
import io.kubernetes.client.custom.Quantity;
import java.lang.Integer;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1NodeStatusFluentImpl<A extends V1NodeStatusFluent<A>> extends BaseFluent<A> implements V1NodeStatusFluent<A>{
  public V1NodeStatusFluentImpl() {
  }
  public V1NodeStatusFluentImpl(V1NodeStatus instance) {
    this.withAddresses(instance.getAddresses());

    this.withAllocatable(instance.getAllocatable());

    this.withCapacity(instance.getCapacity());

    this.withConditions(instance.getConditions());

    this.withConfig(instance.getConfig());

    this.withDaemonEndpoints(instance.getDaemonEndpoints());

    this.withImages(instance.getImages());

    this.withNodeInfo(instance.getNodeInfo());

    this.withPhase(instance.getPhase());

    this.withVolumesAttached(instance.getVolumesAttached());

    this.withVolumesInUse(instance.getVolumesInUse());

  }
  private ArrayList<V1NodeAddressBuilder> addresses;
  private Map<String,Quantity> allocatable;
  private Map<String,Quantity> capacity;
  private ArrayList<V1NodeConditionBuilder> conditions;
  private V1NodeConfigStatusBuilder config;
  private V1NodeDaemonEndpointsBuilder daemonEndpoints;
  private ArrayList<V1ContainerImageBuilder> images;
  private V1NodeSystemInfoBuilder nodeInfo;
  private String phase;
  private ArrayList<V1AttachedVolumeBuilder> volumesAttached;
  private List<String> volumesInUse;
  public A addToAddresses(Integer index,V1NodeAddress item) {
    if (this.addresses == null) {this.addresses = new ArrayList<V1NodeAddressBuilder>();}
    V1NodeAddressBuilder builder = new V1NodeAddressBuilder(item);_visitables.get("addresses").add(index >= 0 ? index : _visitables.get("addresses").size(), builder);this.addresses.add(index >= 0 ? index : addresses.size(), builder); return (A)this;
  }
  public A setToAddresses(Integer index,V1NodeAddress item) {
    if (this.addresses == null) {this.addresses = new ArrayList<V1NodeAddressBuilder>();}
    V1NodeAddressBuilder builder = new V1NodeAddressBuilder(item);
    if (index < 0 || index >= _visitables.get("addresses").size()) { _visitables.get("addresses").add(builder); } else { _visitables.get("addresses").set(index, builder);}
    if (index < 0 || index >= addresses.size()) { addresses.add(builder); } else { addresses.set(index, builder);}
     return (A)this;
  }
  public A addToAddresses(io.kubernetes.client.openapi.models.V1NodeAddress... items) {
    if (this.addresses == null) {this.addresses = new ArrayList<V1NodeAddressBuilder>();}
    for (V1NodeAddress item : items) {V1NodeAddressBuilder builder = new V1NodeAddressBuilder(item);_visitables.get("addresses").add(builder);this.addresses.add(builder);} return (A)this;
  }
  public A addAllToAddresses(Collection<V1NodeAddress> items) {
    if (this.addresses == null) {this.addresses = new ArrayList<V1NodeAddressBuilder>();}
    for (V1NodeAddress item : items) {V1NodeAddressBuilder builder = new V1NodeAddressBuilder(item);_visitables.get("addresses").add(builder);this.addresses.add(builder);} return (A)this;
  }
  public A removeFromAddresses(io.kubernetes.client.openapi.models.V1NodeAddress... items) {
    for (V1NodeAddress item : items) {V1NodeAddressBuilder builder = new V1NodeAddressBuilder(item);_visitables.get("addresses").remove(builder);if (this.addresses != null) {this.addresses.remove(builder);}} return (A)this;
  }
  public A removeAllFromAddresses(Collection<V1NodeAddress> items) {
    for (V1NodeAddress item : items) {V1NodeAddressBuilder builder = new V1NodeAddressBuilder(item);_visitables.get("addresses").remove(builder);if (this.addresses != null) {this.addresses.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromAddresses(Predicate<V1NodeAddressBuilder> predicate) {
    if (addresses == null) return (A) this;
    final Iterator<V1NodeAddressBuilder> each = addresses.iterator();
    final List visitables = _visitables.get("addresses");
    while (each.hasNext()) {
      V1NodeAddressBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildAddresses instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NodeAddress> getAddresses() {
    return addresses != null ? build(addresses) : null;
  }
  public List<V1NodeAddress> buildAddresses() {
    return addresses != null ? build(addresses) : null;
  }
  public V1NodeAddress buildAddress(Integer index) {
    return this.addresses.get(index).build();
  }
  public V1NodeAddress buildFirstAddress() {
    return this.addresses.get(0).build();
  }
  public V1NodeAddress buildLastAddress() {
    return this.addresses.get(addresses.size() - 1).build();
  }
  public V1NodeAddress buildMatchingAddress(Predicate<V1NodeAddressBuilder> predicate) {
    for (V1NodeAddressBuilder item: addresses) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingAddress(Predicate<V1NodeAddressBuilder> predicate) {
    for (V1NodeAddressBuilder item: addresses) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withAddresses(List<V1NodeAddress> addresses) {
    if (this.addresses != null) { _visitables.get("addresses").removeAll(this.addresses);}
    if (addresses != null) {this.addresses = new ArrayList(); for (V1NodeAddress item : addresses){this.addToAddresses(item);}} else { this.addresses = null;} return (A) this;
  }
  public A withAddresses(io.kubernetes.client.openapi.models.V1NodeAddress... addresses) {
    if (this.addresses != null) {this.addresses.clear();}
    if (addresses != null) {for (V1NodeAddress item :addresses){ this.addToAddresses(item);}} return (A) this;
  }
  public Boolean hasAddresses() {
    return addresses != null && !addresses.isEmpty();
  }
  public V1NodeStatusFluent.AddressesNested<A> addNewAddress() {
    return new V1NodeStatusFluentImpl.AddressesNestedImpl();
  }
  public V1NodeStatusFluent.AddressesNested<A> addNewAddressLike(V1NodeAddress item) {
    return new V1NodeStatusFluentImpl.AddressesNestedImpl(-1, item);
  }
  public V1NodeStatusFluent.AddressesNested<A> setNewAddressLike(Integer index,V1NodeAddress item) {
    return new V1NodeStatusFluentImpl.AddressesNestedImpl(index, item);
  }
  public V1NodeStatusFluent.AddressesNested<A> editAddress(Integer index) {
    if (addresses.size() <= index) throw new RuntimeException("Can't edit addresses. Index exceeds size.");
    return setNewAddressLike(index, buildAddress(index));
  }
  public V1NodeStatusFluent.AddressesNested<A> editFirstAddress() {
    if (addresses.size() == 0) throw new RuntimeException("Can't edit first addresses. The list is empty.");
    return setNewAddressLike(0, buildAddress(0));
  }
  public V1NodeStatusFluent.AddressesNested<A> editLastAddress() {
    int index = addresses.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last addresses. The list is empty.");
    return setNewAddressLike(index, buildAddress(index));
  }
  public V1NodeStatusFluent.AddressesNested<A> editMatchingAddress(Predicate<V1NodeAddressBuilder> predicate) {
    int index = -1;
    for (int i=0;i<addresses.size();i++) { 
    if (predicate.test(addresses.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching addresses. No match found.");
    return setNewAddressLike(index, buildAddress(index));
  }
  public A addToAllocatable(String key,Quantity value) {
    if(this.allocatable == null && key != null && value != null) { this.allocatable = new LinkedHashMap(); }
    if(key != null && value != null) {this.allocatable.put(key, value);} return (A)this;
  }
  public A addToAllocatable(Map<String,Quantity> map) {
    if(this.allocatable == null && map != null) { this.allocatable = new LinkedHashMap(); }
    if(map != null) { this.allocatable.putAll(map);} return (A)this;
  }
  public A removeFromAllocatable(String key) {
    if(this.allocatable == null) { return (A) this; }
    if(key != null && this.allocatable != null) {this.allocatable.remove(key);} return (A)this;
  }
  public A removeFromAllocatable(Map<String,Quantity> map) {
    if(this.allocatable == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.allocatable != null){this.allocatable.remove(key);}}} return (A)this;
  }
  public Map<String,Quantity> getAllocatable() {
    return this.allocatable;
  }
  public <K,V>A withAllocatable(Map<String,Quantity> allocatable) {
    if (allocatable == null) { this.allocatable =  null;} else {this.allocatable = new LinkedHashMap(allocatable);} return (A) this;
  }
  public Boolean hasAllocatable() {
    return this.allocatable != null;
  }
  public A addToCapacity(String key,Quantity value) {
    if(this.capacity == null && key != null && value != null) { this.capacity = new LinkedHashMap(); }
    if(key != null && value != null) {this.capacity.put(key, value);} return (A)this;
  }
  public A addToCapacity(Map<String,Quantity> map) {
    if(this.capacity == null && map != null) { this.capacity = new LinkedHashMap(); }
    if(map != null) { this.capacity.putAll(map);} return (A)this;
  }
  public A removeFromCapacity(String key) {
    if(this.capacity == null) { return (A) this; }
    if(key != null && this.capacity != null) {this.capacity.remove(key);} return (A)this;
  }
  public A removeFromCapacity(Map<String,Quantity> map) {
    if(this.capacity == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.capacity != null){this.capacity.remove(key);}}} return (A)this;
  }
  public Map<String,Quantity> getCapacity() {
    return this.capacity;
  }
  public <K,V>A withCapacity(Map<String,Quantity> capacity) {
    if (capacity == null) { this.capacity =  null;} else {this.capacity = new LinkedHashMap(capacity);} return (A) this;
  }
  public Boolean hasCapacity() {
    return this.capacity != null;
  }
  public A addToConditions(Integer index,V1NodeCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1NodeConditionBuilder>();}
    V1NodeConditionBuilder builder = new V1NodeConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
  }
  public A setToConditions(Integer index,V1NodeCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1NodeConditionBuilder>();}
    V1NodeConditionBuilder builder = new V1NodeConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
    if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
     return (A)this;
  }
  public A addToConditions(io.kubernetes.client.openapi.models.V1NodeCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1NodeConditionBuilder>();}
    for (V1NodeCondition item : items) {V1NodeConditionBuilder builder = new V1NodeConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A addAllToConditions(Collection<V1NodeCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1NodeConditionBuilder>();}
    for (V1NodeCondition item : items) {V1NodeConditionBuilder builder = new V1NodeConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1NodeCondition... items) {
    for (V1NodeCondition item : items) {V1NodeConditionBuilder builder = new V1NodeConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(Collection<V1NodeCondition> items) {
    for (V1NodeCondition item : items) {V1NodeConditionBuilder builder = new V1NodeConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromConditions(Predicate<V1NodeConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1NodeConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1NodeConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NodeCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public List<V1NodeCondition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public V1NodeCondition buildCondition(Integer index) {
    return this.conditions.get(index).build();
  }
  public V1NodeCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public V1NodeCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public V1NodeCondition buildMatchingCondition(Predicate<V1NodeConditionBuilder> predicate) {
    for (V1NodeConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCondition(Predicate<V1NodeConditionBuilder> predicate) {
    for (V1NodeConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(List<V1NodeCondition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
    if (conditions != null) {this.conditions = new ArrayList(); for (V1NodeCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.kubernetes.client.openapi.models.V1NodeCondition... conditions) {
    if (this.conditions != null) {this.conditions.clear();}
    if (conditions != null) {for (V1NodeCondition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public V1NodeStatusFluent.ConditionsNested<A> addNewCondition() {
    return new V1NodeStatusFluentImpl.ConditionsNestedImpl();
  }
  public V1NodeStatusFluent.ConditionsNested<A> addNewConditionLike(V1NodeCondition item) {
    return new V1NodeStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public V1NodeStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1NodeCondition item) {
    return new V1NodeStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public V1NodeStatusFluent.ConditionsNested<A> editCondition(Integer index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1NodeStatusFluent.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public V1NodeStatusFluent.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1NodeStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1NodeConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  /**
   * This method has been deprecated, please use method buildConfig instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeConfigStatus getConfig() {
    return this.config!=null ?this.config.build():null;
  }
  public V1NodeConfigStatus buildConfig() {
    return this.config!=null ?this.config.build():null;
  }
  public A withConfig(V1NodeConfigStatus config) {
    _visitables.get("config").remove(this.config);
    if (config!=null){ this.config= new V1NodeConfigStatusBuilder(config); _visitables.get("config").add(this.config);} else { this.config = null; _visitables.get("config").remove(this.config); } return (A) this;
  }
  public Boolean hasConfig() {
    return this.config != null;
  }
  public V1NodeStatusFluent.ConfigNested<A> withNewConfig() {
    return new V1NodeStatusFluentImpl.ConfigNestedImpl();
  }
  public V1NodeStatusFluent.ConfigNested<A> withNewConfigLike(V1NodeConfigStatus item) {
    return new V1NodeStatusFluentImpl.ConfigNestedImpl(item);
  }
  public V1NodeStatusFluent.ConfigNested<A> editConfig() {
    return withNewConfigLike(getConfig());
  }
  public V1NodeStatusFluent.ConfigNested<A> editOrNewConfig() {
    return withNewConfigLike(getConfig() != null ? getConfig(): new V1NodeConfigStatusBuilder().build());
  }
  public V1NodeStatusFluent.ConfigNested<A> editOrNewConfigLike(V1NodeConfigStatus item) {
    return withNewConfigLike(getConfig() != null ? getConfig(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildDaemonEndpoints instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeDaemonEndpoints getDaemonEndpoints() {
    return this.daemonEndpoints!=null ?this.daemonEndpoints.build():null;
  }
  public V1NodeDaemonEndpoints buildDaemonEndpoints() {
    return this.daemonEndpoints!=null ?this.daemonEndpoints.build():null;
  }
  public A withDaemonEndpoints(V1NodeDaemonEndpoints daemonEndpoints) {
    _visitables.get("daemonEndpoints").remove(this.daemonEndpoints);
    if (daemonEndpoints!=null){ this.daemonEndpoints= new V1NodeDaemonEndpointsBuilder(daemonEndpoints); _visitables.get("daemonEndpoints").add(this.daemonEndpoints);} else { this.daemonEndpoints = null; _visitables.get("daemonEndpoints").remove(this.daemonEndpoints); } return (A) this;
  }
  public Boolean hasDaemonEndpoints() {
    return this.daemonEndpoints != null;
  }
  public V1NodeStatusFluent.DaemonEndpointsNested<A> withNewDaemonEndpoints() {
    return new V1NodeStatusFluentImpl.DaemonEndpointsNestedImpl();
  }
  public V1NodeStatusFluent.DaemonEndpointsNested<A> withNewDaemonEndpointsLike(V1NodeDaemonEndpoints item) {
    return new V1NodeStatusFluentImpl.DaemonEndpointsNestedImpl(item);
  }
  public V1NodeStatusFluent.DaemonEndpointsNested<A> editDaemonEndpoints() {
    return withNewDaemonEndpointsLike(getDaemonEndpoints());
  }
  public V1NodeStatusFluent.DaemonEndpointsNested<A> editOrNewDaemonEndpoints() {
    return withNewDaemonEndpointsLike(getDaemonEndpoints() != null ? getDaemonEndpoints(): new V1NodeDaemonEndpointsBuilder().build());
  }
  public V1NodeStatusFluent.DaemonEndpointsNested<A> editOrNewDaemonEndpointsLike(V1NodeDaemonEndpoints item) {
    return withNewDaemonEndpointsLike(getDaemonEndpoints() != null ? getDaemonEndpoints(): item);
  }
  public A addToImages(Integer index,V1ContainerImage item) {
    if (this.images == null) {this.images = new ArrayList<V1ContainerImageBuilder>();}
    V1ContainerImageBuilder builder = new V1ContainerImageBuilder(item);_visitables.get("images").add(index >= 0 ? index : _visitables.get("images").size(), builder);this.images.add(index >= 0 ? index : images.size(), builder); return (A)this;
  }
  public A setToImages(Integer index,V1ContainerImage item) {
    if (this.images == null) {this.images = new ArrayList<V1ContainerImageBuilder>();}
    V1ContainerImageBuilder builder = new V1ContainerImageBuilder(item);
    if (index < 0 || index >= _visitables.get("images").size()) { _visitables.get("images").add(builder); } else { _visitables.get("images").set(index, builder);}
    if (index < 0 || index >= images.size()) { images.add(builder); } else { images.set(index, builder);}
     return (A)this;
  }
  public A addToImages(io.kubernetes.client.openapi.models.V1ContainerImage... items) {
    if (this.images == null) {this.images = new ArrayList<V1ContainerImageBuilder>();}
    for (V1ContainerImage item : items) {V1ContainerImageBuilder builder = new V1ContainerImageBuilder(item);_visitables.get("images").add(builder);this.images.add(builder);} return (A)this;
  }
  public A addAllToImages(Collection<V1ContainerImage> items) {
    if (this.images == null) {this.images = new ArrayList<V1ContainerImageBuilder>();}
    for (V1ContainerImage item : items) {V1ContainerImageBuilder builder = new V1ContainerImageBuilder(item);_visitables.get("images").add(builder);this.images.add(builder);} return (A)this;
  }
  public A removeFromImages(io.kubernetes.client.openapi.models.V1ContainerImage... items) {
    for (V1ContainerImage item : items) {V1ContainerImageBuilder builder = new V1ContainerImageBuilder(item);_visitables.get("images").remove(builder);if (this.images != null) {this.images.remove(builder);}} return (A)this;
  }
  public A removeAllFromImages(Collection<V1ContainerImage> items) {
    for (V1ContainerImage item : items) {V1ContainerImageBuilder builder = new V1ContainerImageBuilder(item);_visitables.get("images").remove(builder);if (this.images != null) {this.images.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromImages(Predicate<V1ContainerImageBuilder> predicate) {
    if (images == null) return (A) this;
    final Iterator<V1ContainerImageBuilder> each = images.iterator();
    final List visitables = _visitables.get("images");
    while (each.hasNext()) {
      V1ContainerImageBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildImages instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ContainerImage> getImages() {
    return images != null ? build(images) : null;
  }
  public List<V1ContainerImage> buildImages() {
    return images != null ? build(images) : null;
  }
  public V1ContainerImage buildImage(Integer index) {
    return this.images.get(index).build();
  }
  public V1ContainerImage buildFirstImage() {
    return this.images.get(0).build();
  }
  public V1ContainerImage buildLastImage() {
    return this.images.get(images.size() - 1).build();
  }
  public V1ContainerImage buildMatchingImage(Predicate<V1ContainerImageBuilder> predicate) {
    for (V1ContainerImageBuilder item: images) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingImage(Predicate<V1ContainerImageBuilder> predicate) {
    for (V1ContainerImageBuilder item: images) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withImages(List<V1ContainerImage> images) {
    if (this.images != null) { _visitables.get("images").removeAll(this.images);}
    if (images != null) {this.images = new ArrayList(); for (V1ContainerImage item : images){this.addToImages(item);}} else { this.images = null;} return (A) this;
  }
  public A withImages(io.kubernetes.client.openapi.models.V1ContainerImage... images) {
    if (this.images != null) {this.images.clear();}
    if (images != null) {for (V1ContainerImage item :images){ this.addToImages(item);}} return (A) this;
  }
  public Boolean hasImages() {
    return images != null && !images.isEmpty();
  }
  public V1NodeStatusFluent.ImagesNested<A> addNewImage() {
    return new V1NodeStatusFluentImpl.ImagesNestedImpl();
  }
  public V1NodeStatusFluent.ImagesNested<A> addNewImageLike(V1ContainerImage item) {
    return new V1NodeStatusFluentImpl.ImagesNestedImpl(-1, item);
  }
  public V1NodeStatusFluent.ImagesNested<A> setNewImageLike(Integer index,V1ContainerImage item) {
    return new V1NodeStatusFluentImpl.ImagesNestedImpl(index, item);
  }
  public V1NodeStatusFluent.ImagesNested<A> editImage(Integer index) {
    if (images.size() <= index) throw new RuntimeException("Can't edit images. Index exceeds size.");
    return setNewImageLike(index, buildImage(index));
  }
  public V1NodeStatusFluent.ImagesNested<A> editFirstImage() {
    if (images.size() == 0) throw new RuntimeException("Can't edit first images. The list is empty.");
    return setNewImageLike(0, buildImage(0));
  }
  public V1NodeStatusFluent.ImagesNested<A> editLastImage() {
    int index = images.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last images. The list is empty.");
    return setNewImageLike(index, buildImage(index));
  }
  public V1NodeStatusFluent.ImagesNested<A> editMatchingImage(Predicate<V1ContainerImageBuilder> predicate) {
    int index = -1;
    for (int i=0;i<images.size();i++) { 
    if (predicate.test(images.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching images. No match found.");
    return setNewImageLike(index, buildImage(index));
  }
  
  /**
   * This method has been deprecated, please use method buildNodeInfo instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSystemInfo getNodeInfo() {
    return this.nodeInfo!=null ?this.nodeInfo.build():null;
  }
  public V1NodeSystemInfo buildNodeInfo() {
    return this.nodeInfo!=null ?this.nodeInfo.build():null;
  }
  public A withNodeInfo(V1NodeSystemInfo nodeInfo) {
    _visitables.get("nodeInfo").remove(this.nodeInfo);
    if (nodeInfo!=null){ this.nodeInfo= new V1NodeSystemInfoBuilder(nodeInfo); _visitables.get("nodeInfo").add(this.nodeInfo);} else { this.nodeInfo = null; _visitables.get("nodeInfo").remove(this.nodeInfo); } return (A) this;
  }
  public Boolean hasNodeInfo() {
    return this.nodeInfo != null;
  }
  public V1NodeStatusFluent.NodeInfoNested<A> withNewNodeInfo() {
    return new V1NodeStatusFluentImpl.NodeInfoNestedImpl();
  }
  public V1NodeStatusFluent.NodeInfoNested<A> withNewNodeInfoLike(V1NodeSystemInfo item) {
    return new V1NodeStatusFluentImpl.NodeInfoNestedImpl(item);
  }
  public V1NodeStatusFluent.NodeInfoNested<A> editNodeInfo() {
    return withNewNodeInfoLike(getNodeInfo());
  }
  public V1NodeStatusFluent.NodeInfoNested<A> editOrNewNodeInfo() {
    return withNewNodeInfoLike(getNodeInfo() != null ? getNodeInfo(): new V1NodeSystemInfoBuilder().build());
  }
  public V1NodeStatusFluent.NodeInfoNested<A> editOrNewNodeInfoLike(V1NodeSystemInfo item) {
    return withNewNodeInfoLike(getNodeInfo() != null ? getNodeInfo(): item);
  }
  public String getPhase() {
    return this.phase;
  }
  public A withPhase(String phase) {
    this.phase=phase; return (A) this;
  }
  public Boolean hasPhase() {
    return this.phase != null;
  }
  public A addToVolumesAttached(Integer index,V1AttachedVolume item) {
    if (this.volumesAttached == null) {this.volumesAttached = new ArrayList<V1AttachedVolumeBuilder>();}
    V1AttachedVolumeBuilder builder = new V1AttachedVolumeBuilder(item);_visitables.get("volumesAttached").add(index >= 0 ? index : _visitables.get("volumesAttached").size(), builder);this.volumesAttached.add(index >= 0 ? index : volumesAttached.size(), builder); return (A)this;
  }
  public A setToVolumesAttached(Integer index,V1AttachedVolume item) {
    if (this.volumesAttached == null) {this.volumesAttached = new ArrayList<V1AttachedVolumeBuilder>();}
    V1AttachedVolumeBuilder builder = new V1AttachedVolumeBuilder(item);
    if (index < 0 || index >= _visitables.get("volumesAttached").size()) { _visitables.get("volumesAttached").add(builder); } else { _visitables.get("volumesAttached").set(index, builder);}
    if (index < 0 || index >= volumesAttached.size()) { volumesAttached.add(builder); } else { volumesAttached.set(index, builder);}
     return (A)this;
  }
  public A addToVolumesAttached(io.kubernetes.client.openapi.models.V1AttachedVolume... items) {
    if (this.volumesAttached == null) {this.volumesAttached = new ArrayList<V1AttachedVolumeBuilder>();}
    for (V1AttachedVolume item : items) {V1AttachedVolumeBuilder builder = new V1AttachedVolumeBuilder(item);_visitables.get("volumesAttached").add(builder);this.volumesAttached.add(builder);} return (A)this;
  }
  public A addAllToVolumesAttached(Collection<V1AttachedVolume> items) {
    if (this.volumesAttached == null) {this.volumesAttached = new ArrayList<V1AttachedVolumeBuilder>();}
    for (V1AttachedVolume item : items) {V1AttachedVolumeBuilder builder = new V1AttachedVolumeBuilder(item);_visitables.get("volumesAttached").add(builder);this.volumesAttached.add(builder);} return (A)this;
  }
  public A removeFromVolumesAttached(io.kubernetes.client.openapi.models.V1AttachedVolume... items) {
    for (V1AttachedVolume item : items) {V1AttachedVolumeBuilder builder = new V1AttachedVolumeBuilder(item);_visitables.get("volumesAttached").remove(builder);if (this.volumesAttached != null) {this.volumesAttached.remove(builder);}} return (A)this;
  }
  public A removeAllFromVolumesAttached(Collection<V1AttachedVolume> items) {
    for (V1AttachedVolume item : items) {V1AttachedVolumeBuilder builder = new V1AttachedVolumeBuilder(item);_visitables.get("volumesAttached").remove(builder);if (this.volumesAttached != null) {this.volumesAttached.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromVolumesAttached(Predicate<V1AttachedVolumeBuilder> predicate) {
    if (volumesAttached == null) return (A) this;
    final Iterator<V1AttachedVolumeBuilder> each = volumesAttached.iterator();
    final List visitables = _visitables.get("volumesAttached");
    while (each.hasNext()) {
      V1AttachedVolumeBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildVolumesAttached instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1AttachedVolume> getVolumesAttached() {
    return volumesAttached != null ? build(volumesAttached) : null;
  }
  public List<V1AttachedVolume> buildVolumesAttached() {
    return volumesAttached != null ? build(volumesAttached) : null;
  }
  public V1AttachedVolume buildVolumesAttached(Integer index) {
    return this.volumesAttached.get(index).build();
  }
  public V1AttachedVolume buildFirstVolumesAttached() {
    return this.volumesAttached.get(0).build();
  }
  public V1AttachedVolume buildLastVolumesAttached() {
    return this.volumesAttached.get(volumesAttached.size() - 1).build();
  }
  public V1AttachedVolume buildMatchingVolumesAttached(Predicate<V1AttachedVolumeBuilder> predicate) {
    for (V1AttachedVolumeBuilder item: volumesAttached) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingVolumesAttached(Predicate<V1AttachedVolumeBuilder> predicate) {
    for (V1AttachedVolumeBuilder item: volumesAttached) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withVolumesAttached(List<V1AttachedVolume> volumesAttached) {
    if (this.volumesAttached != null) { _visitables.get("volumesAttached").removeAll(this.volumesAttached);}
    if (volumesAttached != null) {this.volumesAttached = new ArrayList(); for (V1AttachedVolume item : volumesAttached){this.addToVolumesAttached(item);}} else { this.volumesAttached = null;} return (A) this;
  }
  public A withVolumesAttached(io.kubernetes.client.openapi.models.V1AttachedVolume... volumesAttached) {
    if (this.volumesAttached != null) {this.volumesAttached.clear();}
    if (volumesAttached != null) {for (V1AttachedVolume item :volumesAttached){ this.addToVolumesAttached(item);}} return (A) this;
  }
  public Boolean hasVolumesAttached() {
    return volumesAttached != null && !volumesAttached.isEmpty();
  }
  public V1NodeStatusFluent.VolumesAttachedNested<A> addNewVolumesAttached() {
    return new V1NodeStatusFluentImpl.VolumesAttachedNestedImpl();
  }
  public V1NodeStatusFluent.VolumesAttachedNested<A> addNewVolumesAttachedLike(V1AttachedVolume item) {
    return new V1NodeStatusFluentImpl.VolumesAttachedNestedImpl(-1, item);
  }
  public V1NodeStatusFluent.VolumesAttachedNested<A> setNewVolumesAttachedLike(Integer index,V1AttachedVolume item) {
    return new V1NodeStatusFluentImpl.VolumesAttachedNestedImpl(index, item);
  }
  public V1NodeStatusFluent.VolumesAttachedNested<A> editVolumesAttached(Integer index) {
    if (volumesAttached.size() <= index) throw new RuntimeException("Can't edit volumesAttached. Index exceeds size.");
    return setNewVolumesAttachedLike(index, buildVolumesAttached(index));
  }
  public V1NodeStatusFluent.VolumesAttachedNested<A> editFirstVolumesAttached() {
    if (volumesAttached.size() == 0) throw new RuntimeException("Can't edit first volumesAttached. The list is empty.");
    return setNewVolumesAttachedLike(0, buildVolumesAttached(0));
  }
  public V1NodeStatusFluent.VolumesAttachedNested<A> editLastVolumesAttached() {
    int index = volumesAttached.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last volumesAttached. The list is empty.");
    return setNewVolumesAttachedLike(index, buildVolumesAttached(index));
  }
  public V1NodeStatusFluent.VolumesAttachedNested<A> editMatchingVolumesAttached(Predicate<V1AttachedVolumeBuilder> predicate) {
    int index = -1;
    for (int i=0;i<volumesAttached.size();i++) { 
    if (predicate.test(volumesAttached.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching volumesAttached. No match found.");
    return setNewVolumesAttachedLike(index, buildVolumesAttached(index));
  }
  public A addToVolumesInUse(Integer index,String item) {
    if (this.volumesInUse == null) {this.volumesInUse = new ArrayList<String>();}
    this.volumesInUse.add(index, item);
    return (A)this;
  }
  public A setToVolumesInUse(Integer index,String item) {
    if (this.volumesInUse == null) {this.volumesInUse = new ArrayList<String>();}
    this.volumesInUse.set(index, item); return (A)this;
  }
  public A addToVolumesInUse(java.lang.String... items) {
    if (this.volumesInUse == null) {this.volumesInUse = new ArrayList<String>();}
    for (String item : items) {this.volumesInUse.add(item);} return (A)this;
  }
  public A addAllToVolumesInUse(Collection<String> items) {
    if (this.volumesInUse == null) {this.volumesInUse = new ArrayList<String>();}
    for (String item : items) {this.volumesInUse.add(item);} return (A)this;
  }
  public A removeFromVolumesInUse(java.lang.String... items) {
    for (String item : items) {if (this.volumesInUse!= null){ this.volumesInUse.remove(item);}} return (A)this;
  }
  public A removeAllFromVolumesInUse(Collection<String> items) {
    for (String item : items) {if (this.volumesInUse!= null){ this.volumesInUse.remove(item);}} return (A)this;
  }
  public List<String> getVolumesInUse() {
    return this.volumesInUse;
  }
  public String getVolumesInUse(Integer index) {
    return this.volumesInUse.get(index);
  }
  public String getFirstVolumesInUse() {
    return this.volumesInUse.get(0);
  }
  public String getLastVolumesInUse() {
    return this.volumesInUse.get(volumesInUse.size() - 1);
  }
  public String getMatchingVolumesInUse(Predicate<String> predicate) {
    for (String item: volumesInUse) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingVolumesInUse(Predicate<String> predicate) {
    for (String item: volumesInUse) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withVolumesInUse(List<String> volumesInUse) {
    if (volumesInUse != null) {this.volumesInUse = new ArrayList(); for (String item : volumesInUse){this.addToVolumesInUse(item);}} else { this.volumesInUse = null;} return (A) this;
  }
  public A withVolumesInUse(java.lang.String... volumesInUse) {
    if (this.volumesInUse != null) {this.volumesInUse.clear();}
    if (volumesInUse != null) {for (String item :volumesInUse){ this.addToVolumesInUse(item);}} return (A) this;
  }
  public Boolean hasVolumesInUse() {
    return volumesInUse != null && !volumesInUse.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeStatusFluentImpl that = (V1NodeStatusFluentImpl) o;
    if (addresses != null ? !addresses.equals(that.addresses) :that.addresses != null) return false;
    if (allocatable != null ? !allocatable.equals(that.allocatable) :that.allocatable != null) return false;
    if (capacity != null ? !capacity.equals(that.capacity) :that.capacity != null) return false;
    if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
    if (config != null ? !config.equals(that.config) :that.config != null) return false;
    if (daemonEndpoints != null ? !daemonEndpoints.equals(that.daemonEndpoints) :that.daemonEndpoints != null) return false;
    if (images != null ? !images.equals(that.images) :that.images != null) return false;
    if (nodeInfo != null ? !nodeInfo.equals(that.nodeInfo) :that.nodeInfo != null) return false;
    if (phase != null ? !phase.equals(that.phase) :that.phase != null) return false;
    if (volumesAttached != null ? !volumesAttached.equals(that.volumesAttached) :that.volumesAttached != null) return false;
    if (volumesInUse != null ? !volumesInUse.equals(that.volumesInUse) :that.volumesInUse != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(addresses,  allocatable,  capacity,  conditions,  config,  daemonEndpoints,  images,  nodeInfo,  phase,  volumesAttached,  volumesInUse,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (addresses != null && !addresses.isEmpty()) { sb.append("addresses:"); sb.append(addresses + ","); }
    if (allocatable != null && !allocatable.isEmpty()) { sb.append("allocatable:"); sb.append(allocatable + ","); }
    if (capacity != null && !capacity.isEmpty()) { sb.append("capacity:"); sb.append(capacity + ","); }
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (config != null) { sb.append("config:"); sb.append(config + ","); }
    if (daemonEndpoints != null) { sb.append("daemonEndpoints:"); sb.append(daemonEndpoints + ","); }
    if (images != null && !images.isEmpty()) { sb.append("images:"); sb.append(images + ","); }
    if (nodeInfo != null) { sb.append("nodeInfo:"); sb.append(nodeInfo + ","); }
    if (phase != null) { sb.append("phase:"); sb.append(phase + ","); }
    if (volumesAttached != null && !volumesAttached.isEmpty()) { sb.append("volumesAttached:"); sb.append(volumesAttached + ","); }
    if (volumesInUse != null && !volumesInUse.isEmpty()) { sb.append("volumesInUse:"); sb.append(volumesInUse); }
    sb.append("}");
    return sb.toString();
  }
  class AddressesNestedImpl<N> extends V1NodeAddressFluentImpl<V1NodeStatusFluent.AddressesNested<N>> implements V1NodeStatusFluent.AddressesNested<N>,Nested<N>{
    AddressesNestedImpl(Integer index,V1NodeAddress item) {
      this.index = index;
      this.builder = new V1NodeAddressBuilder(this, item);
    }
    AddressesNestedImpl() {
      this.index = -1;
      this.builder = new V1NodeAddressBuilder(this);
    }
    V1NodeAddressBuilder builder;
    Integer index;
    public N and() {
      return (N) V1NodeStatusFluentImpl.this.setToAddresses(index,builder.build());
    }
    public N endAddress() {
      return and();
    }
    
  }
  class ConditionsNestedImpl<N> extends V1NodeConditionFluentImpl<V1NodeStatusFluent.ConditionsNested<N>> implements V1NodeStatusFluent.ConditionsNested<N>,Nested<N>{
    ConditionsNestedImpl(Integer index,V1NodeCondition item) {
      this.index = index;
      this.builder = new V1NodeConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new V1NodeConditionBuilder(this);
    }
    V1NodeConditionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1NodeStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  class ConfigNestedImpl<N> extends V1NodeConfigStatusFluentImpl<V1NodeStatusFluent.ConfigNested<N>> implements V1NodeStatusFluent.ConfigNested<N>,Nested<N>{
    ConfigNestedImpl(V1NodeConfigStatus item) {
      this.builder = new V1NodeConfigStatusBuilder(this, item);
    }
    ConfigNestedImpl() {
      this.builder = new V1NodeConfigStatusBuilder(this);
    }
    V1NodeConfigStatusBuilder builder;
    public N and() {
      return (N) V1NodeStatusFluentImpl.this.withConfig(builder.build());
    }
    public N endConfig() {
      return and();
    }
    
  }
  class DaemonEndpointsNestedImpl<N> extends V1NodeDaemonEndpointsFluentImpl<V1NodeStatusFluent.DaemonEndpointsNested<N>> implements V1NodeStatusFluent.DaemonEndpointsNested<N>,Nested<N>{
    DaemonEndpointsNestedImpl(V1NodeDaemonEndpoints item) {
      this.builder = new V1NodeDaemonEndpointsBuilder(this, item);
    }
    DaemonEndpointsNestedImpl() {
      this.builder = new V1NodeDaemonEndpointsBuilder(this);
    }
    V1NodeDaemonEndpointsBuilder builder;
    public N and() {
      return (N) V1NodeStatusFluentImpl.this.withDaemonEndpoints(builder.build());
    }
    public N endDaemonEndpoints() {
      return and();
    }
    
  }
  class ImagesNestedImpl<N> extends V1ContainerImageFluentImpl<V1NodeStatusFluent.ImagesNested<N>> implements V1NodeStatusFluent.ImagesNested<N>,Nested<N>{
    ImagesNestedImpl(Integer index,V1ContainerImage item) {
      this.index = index;
      this.builder = new V1ContainerImageBuilder(this, item);
    }
    ImagesNestedImpl() {
      this.index = -1;
      this.builder = new V1ContainerImageBuilder(this);
    }
    V1ContainerImageBuilder builder;
    Integer index;
    public N and() {
      return (N) V1NodeStatusFluentImpl.this.setToImages(index,builder.build());
    }
    public N endImage() {
      return and();
    }
    
  }
  class NodeInfoNestedImpl<N> extends V1NodeSystemInfoFluentImpl<V1NodeStatusFluent.NodeInfoNested<N>> implements V1NodeStatusFluent.NodeInfoNested<N>,Nested<N>{
    NodeInfoNestedImpl(V1NodeSystemInfo item) {
      this.builder = new V1NodeSystemInfoBuilder(this, item);
    }
    NodeInfoNestedImpl() {
      this.builder = new V1NodeSystemInfoBuilder(this);
    }
    V1NodeSystemInfoBuilder builder;
    public N and() {
      return (N) V1NodeStatusFluentImpl.this.withNodeInfo(builder.build());
    }
    public N endNodeInfo() {
      return and();
    }
    
  }
  class VolumesAttachedNestedImpl<N> extends V1AttachedVolumeFluentImpl<V1NodeStatusFluent.VolumesAttachedNested<N>> implements V1NodeStatusFluent.VolumesAttachedNested<N>,Nested<N>{
    VolumesAttachedNestedImpl(Integer index,V1AttachedVolume item) {
      this.index = index;
      this.builder = new V1AttachedVolumeBuilder(this, item);
    }
    VolumesAttachedNestedImpl() {
      this.index = -1;
      this.builder = new V1AttachedVolumeBuilder(this);
    }
    V1AttachedVolumeBuilder builder;
    Integer index;
    public N and() {
      return (N) V1NodeStatusFluentImpl.this.setToVolumesAttached(index,builder.build());
    }
    public N endVolumesAttached() {
      return and();
    }
    
  }
  
}