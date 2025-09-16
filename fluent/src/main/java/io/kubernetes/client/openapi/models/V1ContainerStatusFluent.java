package io.kubernetes.client.openapi.models;

import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import java.util.Optional;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.RuntimeException;
import java.util.Iterator;
import io.kubernetes.client.custom.Quantity;
import java.lang.Integer;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ContainerStatusFluent<A extends io.kubernetes.client.openapi.models.V1ContainerStatusFluent<A>> extends BaseFluent<A>{
  public V1ContainerStatusFluent() {
  }
  
  public V1ContainerStatusFluent(V1ContainerStatus instance) {
    this.copyInstance(instance);
  }
  private Map<String,Quantity> allocatedResources;
  private ArrayList<V1ResourceStatusBuilder> allocatedResourcesStatus;
  private String containerID;
  private String image;
  private String imageID;
  private V1ContainerStateBuilder lastState;
  private String name;
  private Boolean ready;
  private V1ResourceRequirementsBuilder resources;
  private Integer restartCount;
  private Boolean started;
  private V1ContainerStateBuilder state;
  private String stopSignal;
  private V1ContainerUserBuilder user;
  private ArrayList<V1VolumeMountStatusBuilder> volumeMounts;
  
  protected void copyInstance(V1ContainerStatus instance) {
    instance = instance != null ? instance : new V1ContainerStatus();
    if (instance != null) {
        this.withAllocatedResources(instance.getAllocatedResources());
        this.withAllocatedResourcesStatus(instance.getAllocatedResourcesStatus());
        this.withContainerID(instance.getContainerID());
        this.withImage(instance.getImage());
        this.withImageID(instance.getImageID());
        this.withLastState(instance.getLastState());
        this.withName(instance.getName());
        this.withReady(instance.getReady());
        this.withResources(instance.getResources());
        this.withRestartCount(instance.getRestartCount());
        this.withStarted(instance.getStarted());
        this.withState(instance.getState());
        this.withStopSignal(instance.getStopSignal());
        this.withUser(instance.getUser());
        this.withVolumeMounts(instance.getVolumeMounts());
    }
  }
  
  public A addToAllocatedResources(String key,Quantity value) {
    if (this.allocatedResources == null && key != null && value != null) {
      this.allocatedResources = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.allocatedResources.put(key, value);
    }
    return (A) this;
  }
  
  public A addToAllocatedResources(Map<String,Quantity> map) {
    if (this.allocatedResources == null && map != null) {
      this.allocatedResources = new LinkedHashMap();
    }
    if (map != null) {
      this.allocatedResources.putAll(map);
    }
    return (A) this;
  }
  
  public A removeFromAllocatedResources(String key) {
    if (this.allocatedResources == null) {
      return (A) this;
    }
    if (key != null && this.allocatedResources != null) {
      this.allocatedResources.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromAllocatedResources(Map<String,Quantity> map) {
    if (this.allocatedResources == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.allocatedResources != null) {
          this.allocatedResources.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public Map<String,Quantity> getAllocatedResources() {
    return this.allocatedResources;
  }
  
  public <K,V>A withAllocatedResources(Map<String,Quantity> allocatedResources) {
    if (allocatedResources == null) {
      this.allocatedResources = null;
    } else {
      this.allocatedResources = new LinkedHashMap(allocatedResources);
    }
    return (A) this;
  }
  
  public boolean hasAllocatedResources() {
    return this.allocatedResources != null;
  }
  
  public A addToAllocatedResourcesStatus(int index,V1ResourceStatus item) {
    if (this.allocatedResourcesStatus == null) {
      this.allocatedResourcesStatus = new ArrayList();
    }
    V1ResourceStatusBuilder builder = new V1ResourceStatusBuilder(item);
    if (index < 0 || index >= allocatedResourcesStatus.size()) {
        _visitables.get("allocatedResourcesStatus").add(builder);
        allocatedResourcesStatus.add(builder);
    } else {
        _visitables.get("allocatedResourcesStatus").add(builder);
        allocatedResourcesStatus.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToAllocatedResourcesStatus(int index,V1ResourceStatus item) {
    if (this.allocatedResourcesStatus == null) {
      this.allocatedResourcesStatus = new ArrayList();
    }
    V1ResourceStatusBuilder builder = new V1ResourceStatusBuilder(item);
    if (index < 0 || index >= allocatedResourcesStatus.size()) {
        _visitables.get("allocatedResourcesStatus").add(builder);
        allocatedResourcesStatus.add(builder);
    } else {
        _visitables.get("allocatedResourcesStatus").add(builder);
        allocatedResourcesStatus.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToAllocatedResourcesStatus(V1ResourceStatus... items) {
    if (this.allocatedResourcesStatus == null) {
      this.allocatedResourcesStatus = new ArrayList();
    }
    for (V1ResourceStatus item : items) {
        V1ResourceStatusBuilder builder = new V1ResourceStatusBuilder(item);
        _visitables.get("allocatedResourcesStatus").add(builder);
        this.allocatedResourcesStatus.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToAllocatedResourcesStatus(Collection<V1ResourceStatus> items) {
    if (this.allocatedResourcesStatus == null) {
      this.allocatedResourcesStatus = new ArrayList();
    }
    for (V1ResourceStatus item : items) {
        V1ResourceStatusBuilder builder = new V1ResourceStatusBuilder(item);
        _visitables.get("allocatedResourcesStatus").add(builder);
        this.allocatedResourcesStatus.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromAllocatedResourcesStatus(V1ResourceStatus... items) {
    if (this.allocatedResourcesStatus == null) {
      return (A) this;
    }
    for (V1ResourceStatus item : items) {
        V1ResourceStatusBuilder builder = new V1ResourceStatusBuilder(item);
        _visitables.get("allocatedResourcesStatus").remove(builder);
        this.allocatedResourcesStatus.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromAllocatedResourcesStatus(Collection<V1ResourceStatus> items) {
    if (this.allocatedResourcesStatus == null) {
      return (A) this;
    }
    for (V1ResourceStatus item : items) {
        V1ResourceStatusBuilder builder = new V1ResourceStatusBuilder(item);
        _visitables.get("allocatedResourcesStatus").remove(builder);
        this.allocatedResourcesStatus.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromAllocatedResourcesStatus(Predicate<V1ResourceStatusBuilder> predicate) {
    if (allocatedResourcesStatus == null) {
      return (A) this;
    }
    Iterator<V1ResourceStatusBuilder> each = allocatedResourcesStatus.iterator();
    List visitables = _visitables.get("allocatedResourcesStatus");
    while (each.hasNext()) {
        V1ResourceStatusBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1ResourceStatus> buildAllocatedResourcesStatus() {
    return this.allocatedResourcesStatus != null ? build(allocatedResourcesStatus) : null;
  }
  
  public V1ResourceStatus buildAllocatedResourcesStatus(int index) {
    return this.allocatedResourcesStatus.get(index).build();
  }
  
  public V1ResourceStatus buildFirstAllocatedResourcesStatus() {
    return this.allocatedResourcesStatus.get(0).build();
  }
  
  public V1ResourceStatus buildLastAllocatedResourcesStatus() {
    return this.allocatedResourcesStatus.get(allocatedResourcesStatus.size() - 1).build();
  }
  
  public V1ResourceStatus buildMatchingAllocatedResourcesStatus(Predicate<V1ResourceStatusBuilder> predicate) {
      for (V1ResourceStatusBuilder item : allocatedResourcesStatus) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingAllocatedResourcesStatus(Predicate<V1ResourceStatusBuilder> predicate) {
      for (V1ResourceStatusBuilder item : allocatedResourcesStatus) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withAllocatedResourcesStatus(List<V1ResourceStatus> allocatedResourcesStatus) {
    if (this.allocatedResourcesStatus != null) {
      this._visitables.get("allocatedResourcesStatus").clear();
    }
    if (allocatedResourcesStatus != null) {
        this.allocatedResourcesStatus = new ArrayList();
        for (V1ResourceStatus item : allocatedResourcesStatus) {
          this.addToAllocatedResourcesStatus(item);
        }
    } else {
      this.allocatedResourcesStatus = null;
    }
    return (A) this;
  }
  
  public A withAllocatedResourcesStatus(V1ResourceStatus... allocatedResourcesStatus) {
    if (this.allocatedResourcesStatus != null) {
        this.allocatedResourcesStatus.clear();
        _visitables.remove("allocatedResourcesStatus");
    }
    if (allocatedResourcesStatus != null) {
      for (V1ResourceStatus item : allocatedResourcesStatus) {
        this.addToAllocatedResourcesStatus(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasAllocatedResourcesStatus() {
    return this.allocatedResourcesStatus != null && !(this.allocatedResourcesStatus.isEmpty());
  }
  
  public AllocatedResourcesStatusNested<A> addNewAllocatedResourcesStatus() {
    return new AllocatedResourcesStatusNested(-1, null);
  }
  
  public AllocatedResourcesStatusNested<A> addNewAllocatedResourcesStatusLike(V1ResourceStatus item) {
    return new AllocatedResourcesStatusNested(-1, item);
  }
  
  public AllocatedResourcesStatusNested<A> setNewAllocatedResourcesStatusLike(int index,V1ResourceStatus item) {
    return new AllocatedResourcesStatusNested(index, item);
  }
  
  public AllocatedResourcesStatusNested<A> editAllocatedResourcesStatus(int index) {
    if (index <= allocatedResourcesStatus.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "allocatedResourcesStatus"));
    }
    return this.setNewAllocatedResourcesStatusLike(index, this.buildAllocatedResourcesStatus(index));
  }
  
  public AllocatedResourcesStatusNested<A> editFirstAllocatedResourcesStatus() {
    if (allocatedResourcesStatus.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "allocatedResourcesStatus"));
    }
    return this.setNewAllocatedResourcesStatusLike(0, this.buildAllocatedResourcesStatus(0));
  }
  
  public AllocatedResourcesStatusNested<A> editLastAllocatedResourcesStatus() {
    int index = allocatedResourcesStatus.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "allocatedResourcesStatus"));
    }
    return this.setNewAllocatedResourcesStatusLike(index, this.buildAllocatedResourcesStatus(index));
  }
  
  public AllocatedResourcesStatusNested<A> editMatchingAllocatedResourcesStatus(Predicate<V1ResourceStatusBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < allocatedResourcesStatus.size();i++) {
      if (predicate.test(allocatedResourcesStatus.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "allocatedResourcesStatus"));
    }
    return this.setNewAllocatedResourcesStatusLike(index, this.buildAllocatedResourcesStatus(index));
  }
  
  public String getContainerID() {
    return this.containerID;
  }
  
  public A withContainerID(String containerID) {
    this.containerID = containerID;
    return (A) this;
  }
  
  public boolean hasContainerID() {
    return this.containerID != null;
  }
  
  public String getImage() {
    return this.image;
  }
  
  public A withImage(String image) {
    this.image = image;
    return (A) this;
  }
  
  public boolean hasImage() {
    return this.image != null;
  }
  
  public String getImageID() {
    return this.imageID;
  }
  
  public A withImageID(String imageID) {
    this.imageID = imageID;
    return (A) this;
  }
  
  public boolean hasImageID() {
    return this.imageID != null;
  }
  
  public V1ContainerState buildLastState() {
    return this.lastState != null ? this.lastState.build() : null;
  }
  
  public A withLastState(V1ContainerState lastState) {
    this._visitables.remove("lastState");
    if (lastState != null) {
        this.lastState = new V1ContainerStateBuilder(lastState);
        this._visitables.get("lastState").add(this.lastState);
    } else {
        this.lastState = null;
        this._visitables.get("lastState").remove(this.lastState);
    }
    return (A) this;
  }
  
  public boolean hasLastState() {
    return this.lastState != null;
  }
  
  public LastStateNested<A> withNewLastState() {
    return new LastStateNested(null);
  }
  
  public LastStateNested<A> withNewLastStateLike(V1ContainerState item) {
    return new LastStateNested(item);
  }
  
  public LastStateNested<A> editLastState() {
    return this.withNewLastStateLike(Optional.ofNullable(this.buildLastState()).orElse(null));
  }
  
  public LastStateNested<A> editOrNewLastState() {
    return this.withNewLastStateLike(Optional.ofNullable(this.buildLastState()).orElse(new V1ContainerStateBuilder().build()));
  }
  
  public LastStateNested<A> editOrNewLastStateLike(V1ContainerState item) {
    return this.withNewLastStateLike(Optional.ofNullable(this.buildLastState()).orElse(item));
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public Boolean getReady() {
    return this.ready;
  }
  
  public A withReady(Boolean ready) {
    this.ready = ready;
    return (A) this;
  }
  
  public boolean hasReady() {
    return this.ready != null;
  }
  
  public V1ResourceRequirements buildResources() {
    return this.resources != null ? this.resources.build() : null;
  }
  
  public A withResources(V1ResourceRequirements resources) {
    this._visitables.remove("resources");
    if (resources != null) {
        this.resources = new V1ResourceRequirementsBuilder(resources);
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
  
  public ResourcesNested<A> withNewResourcesLike(V1ResourceRequirements item) {
    return new ResourcesNested(item);
  }
  
  public ResourcesNested<A> editResources() {
    return this.withNewResourcesLike(Optional.ofNullable(this.buildResources()).orElse(null));
  }
  
  public ResourcesNested<A> editOrNewResources() {
    return this.withNewResourcesLike(Optional.ofNullable(this.buildResources()).orElse(new V1ResourceRequirementsBuilder().build()));
  }
  
  public ResourcesNested<A> editOrNewResourcesLike(V1ResourceRequirements item) {
    return this.withNewResourcesLike(Optional.ofNullable(this.buildResources()).orElse(item));
  }
  
  public Integer getRestartCount() {
    return this.restartCount;
  }
  
  public A withRestartCount(Integer restartCount) {
    this.restartCount = restartCount;
    return (A) this;
  }
  
  public boolean hasRestartCount() {
    return this.restartCount != null;
  }
  
  public Boolean getStarted() {
    return this.started;
  }
  
  public A withStarted(Boolean started) {
    this.started = started;
    return (A) this;
  }
  
  public boolean hasStarted() {
    return this.started != null;
  }
  
  public V1ContainerState buildState() {
    return this.state != null ? this.state.build() : null;
  }
  
  public A withState(V1ContainerState state) {
    this._visitables.remove("state");
    if (state != null) {
        this.state = new V1ContainerStateBuilder(state);
        this._visitables.get("state").add(this.state);
    } else {
        this.state = null;
        this._visitables.get("state").remove(this.state);
    }
    return (A) this;
  }
  
  public boolean hasState() {
    return this.state != null;
  }
  
  public StateNested<A> withNewState() {
    return new StateNested(null);
  }
  
  public StateNested<A> withNewStateLike(V1ContainerState item) {
    return new StateNested(item);
  }
  
  public StateNested<A> editState() {
    return this.withNewStateLike(Optional.ofNullable(this.buildState()).orElse(null));
  }
  
  public StateNested<A> editOrNewState() {
    return this.withNewStateLike(Optional.ofNullable(this.buildState()).orElse(new V1ContainerStateBuilder().build()));
  }
  
  public StateNested<A> editOrNewStateLike(V1ContainerState item) {
    return this.withNewStateLike(Optional.ofNullable(this.buildState()).orElse(item));
  }
  
  public String getStopSignal() {
    return this.stopSignal;
  }
  
  public A withStopSignal(String stopSignal) {
    this.stopSignal = stopSignal;
    return (A) this;
  }
  
  public boolean hasStopSignal() {
    return this.stopSignal != null;
  }
  
  public V1ContainerUser buildUser() {
    return this.user != null ? this.user.build() : null;
  }
  
  public A withUser(V1ContainerUser user) {
    this._visitables.remove("user");
    if (user != null) {
        this.user = new V1ContainerUserBuilder(user);
        this._visitables.get("user").add(this.user);
    } else {
        this.user = null;
        this._visitables.get("user").remove(this.user);
    }
    return (A) this;
  }
  
  public boolean hasUser() {
    return this.user != null;
  }
  
  public UserNested<A> withNewUser() {
    return new UserNested(null);
  }
  
  public UserNested<A> withNewUserLike(V1ContainerUser item) {
    return new UserNested(item);
  }
  
  public UserNested<A> editUser() {
    return this.withNewUserLike(Optional.ofNullable(this.buildUser()).orElse(null));
  }
  
  public UserNested<A> editOrNewUser() {
    return this.withNewUserLike(Optional.ofNullable(this.buildUser()).orElse(new V1ContainerUserBuilder().build()));
  }
  
  public UserNested<A> editOrNewUserLike(V1ContainerUser item) {
    return this.withNewUserLike(Optional.ofNullable(this.buildUser()).orElse(item));
  }
  
  public A addToVolumeMounts(int index,V1VolumeMountStatus item) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList();
    }
    V1VolumeMountStatusBuilder builder = new V1VolumeMountStatusBuilder(item);
    if (index < 0 || index >= volumeMounts.size()) {
        _visitables.get("volumeMounts").add(builder);
        volumeMounts.add(builder);
    } else {
        _visitables.get("volumeMounts").add(builder);
        volumeMounts.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToVolumeMounts(int index,V1VolumeMountStatus item) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList();
    }
    V1VolumeMountStatusBuilder builder = new V1VolumeMountStatusBuilder(item);
    if (index < 0 || index >= volumeMounts.size()) {
        _visitables.get("volumeMounts").add(builder);
        volumeMounts.add(builder);
    } else {
        _visitables.get("volumeMounts").add(builder);
        volumeMounts.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToVolumeMounts(V1VolumeMountStatus... items) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList();
    }
    for (V1VolumeMountStatus item : items) {
        V1VolumeMountStatusBuilder builder = new V1VolumeMountStatusBuilder(item);
        _visitables.get("volumeMounts").add(builder);
        this.volumeMounts.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToVolumeMounts(Collection<V1VolumeMountStatus> items) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList();
    }
    for (V1VolumeMountStatus item : items) {
        V1VolumeMountStatusBuilder builder = new V1VolumeMountStatusBuilder(item);
        _visitables.get("volumeMounts").add(builder);
        this.volumeMounts.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromVolumeMounts(V1VolumeMountStatus... items) {
    if (this.volumeMounts == null) {
      return (A) this;
    }
    for (V1VolumeMountStatus item : items) {
        V1VolumeMountStatusBuilder builder = new V1VolumeMountStatusBuilder(item);
        _visitables.get("volumeMounts").remove(builder);
        this.volumeMounts.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromVolumeMounts(Collection<V1VolumeMountStatus> items) {
    if (this.volumeMounts == null) {
      return (A) this;
    }
    for (V1VolumeMountStatus item : items) {
        V1VolumeMountStatusBuilder builder = new V1VolumeMountStatusBuilder(item);
        _visitables.get("volumeMounts").remove(builder);
        this.volumeMounts.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromVolumeMounts(Predicate<V1VolumeMountStatusBuilder> predicate) {
    if (volumeMounts == null) {
      return (A) this;
    }
    Iterator<V1VolumeMountStatusBuilder> each = volumeMounts.iterator();
    List visitables = _visitables.get("volumeMounts");
    while (each.hasNext()) {
        V1VolumeMountStatusBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1VolumeMountStatus> buildVolumeMounts() {
    return this.volumeMounts != null ? build(volumeMounts) : null;
  }
  
  public V1VolumeMountStatus buildVolumeMount(int index) {
    return this.volumeMounts.get(index).build();
  }
  
  public V1VolumeMountStatus buildFirstVolumeMount() {
    return this.volumeMounts.get(0).build();
  }
  
  public V1VolumeMountStatus buildLastVolumeMount() {
    return this.volumeMounts.get(volumeMounts.size() - 1).build();
  }
  
  public V1VolumeMountStatus buildMatchingVolumeMount(Predicate<V1VolumeMountStatusBuilder> predicate) {
      for (V1VolumeMountStatusBuilder item : volumeMounts) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingVolumeMount(Predicate<V1VolumeMountStatusBuilder> predicate) {
      for (V1VolumeMountStatusBuilder item : volumeMounts) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVolumeMounts(List<V1VolumeMountStatus> volumeMounts) {
    if (this.volumeMounts != null) {
      this._visitables.get("volumeMounts").clear();
    }
    if (volumeMounts != null) {
        this.volumeMounts = new ArrayList();
        for (V1VolumeMountStatus item : volumeMounts) {
          this.addToVolumeMounts(item);
        }
    } else {
      this.volumeMounts = null;
    }
    return (A) this;
  }
  
  public A withVolumeMounts(V1VolumeMountStatus... volumeMounts) {
    if (this.volumeMounts != null) {
        this.volumeMounts.clear();
        _visitables.remove("volumeMounts");
    }
    if (volumeMounts != null) {
      for (V1VolumeMountStatus item : volumeMounts) {
        this.addToVolumeMounts(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasVolumeMounts() {
    return this.volumeMounts != null && !(this.volumeMounts.isEmpty());
  }
  
  public VolumeMountsNested<A> addNewVolumeMount() {
    return new VolumeMountsNested(-1, null);
  }
  
  public VolumeMountsNested<A> addNewVolumeMountLike(V1VolumeMountStatus item) {
    return new VolumeMountsNested(-1, item);
  }
  
  public VolumeMountsNested<A> setNewVolumeMountLike(int index,V1VolumeMountStatus item) {
    return new VolumeMountsNested(index, item);
  }
  
  public VolumeMountsNested<A> editVolumeMount(int index) {
    if (index <= volumeMounts.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "volumeMounts"));
    }
    return this.setNewVolumeMountLike(index, this.buildVolumeMount(index));
  }
  
  public VolumeMountsNested<A> editFirstVolumeMount() {
    if (volumeMounts.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "volumeMounts"));
    }
    return this.setNewVolumeMountLike(0, this.buildVolumeMount(0));
  }
  
  public VolumeMountsNested<A> editLastVolumeMount() {
    int index = volumeMounts.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "volumeMounts"));
    }
    return this.setNewVolumeMountLike(index, this.buildVolumeMount(index));
  }
  
  public VolumeMountsNested<A> editMatchingVolumeMount(Predicate<V1VolumeMountStatusBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < volumeMounts.size();i++) {
      if (predicate.test(volumeMounts.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "volumeMounts"));
    }
    return this.setNewVolumeMountLike(index, this.buildVolumeMount(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1ContainerStatusFluent that = (V1ContainerStatusFluent) o;
    if (!(Objects.equals(allocatedResources, that.allocatedResources))) {
      return false;
    }
    if (!(Objects.equals(allocatedResourcesStatus, that.allocatedResourcesStatus))) {
      return false;
    }
    if (!(Objects.equals(containerID, that.containerID))) {
      return false;
    }
    if (!(Objects.equals(image, that.image))) {
      return false;
    }
    if (!(Objects.equals(imageID, that.imageID))) {
      return false;
    }
    if (!(Objects.equals(lastState, that.lastState))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(ready, that.ready))) {
      return false;
    }
    if (!(Objects.equals(resources, that.resources))) {
      return false;
    }
    if (!(Objects.equals(restartCount, that.restartCount))) {
      return false;
    }
    if (!(Objects.equals(started, that.started))) {
      return false;
    }
    if (!(Objects.equals(state, that.state))) {
      return false;
    }
    if (!(Objects.equals(stopSignal, that.stopSignal))) {
      return false;
    }
    if (!(Objects.equals(user, that.user))) {
      return false;
    }
    if (!(Objects.equals(volumeMounts, that.volumeMounts))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(allocatedResources, allocatedResourcesStatus, containerID, image, imageID, lastState, name, ready, resources, restartCount, started, state, stopSignal, user, volumeMounts);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(allocatedResources == null) && !(allocatedResources.isEmpty())) {
        sb.append("allocatedResources:");
        sb.append(allocatedResources);
        sb.append(",");
    }
    if (!(allocatedResourcesStatus == null) && !(allocatedResourcesStatus.isEmpty())) {
        sb.append("allocatedResourcesStatus:");
        sb.append(allocatedResourcesStatus);
        sb.append(",");
    }
    if (!(containerID == null)) {
        sb.append("containerID:");
        sb.append(containerID);
        sb.append(",");
    }
    if (!(image == null)) {
        sb.append("image:");
        sb.append(image);
        sb.append(",");
    }
    if (!(imageID == null)) {
        sb.append("imageID:");
        sb.append(imageID);
        sb.append(",");
    }
    if (!(lastState == null)) {
        sb.append("lastState:");
        sb.append(lastState);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(ready == null)) {
        sb.append("ready:");
        sb.append(ready);
        sb.append(",");
    }
    if (!(resources == null)) {
        sb.append("resources:");
        sb.append(resources);
        sb.append(",");
    }
    if (!(restartCount == null)) {
        sb.append("restartCount:");
        sb.append(restartCount);
        sb.append(",");
    }
    if (!(started == null)) {
        sb.append("started:");
        sb.append(started);
        sb.append(",");
    }
    if (!(state == null)) {
        sb.append("state:");
        sb.append(state);
        sb.append(",");
    }
    if (!(stopSignal == null)) {
        sb.append("stopSignal:");
        sb.append(stopSignal);
        sb.append(",");
    }
    if (!(user == null)) {
        sb.append("user:");
        sb.append(user);
        sb.append(",");
    }
    if (!(volumeMounts == null) && !(volumeMounts.isEmpty())) {
        sb.append("volumeMounts:");
        sb.append(volumeMounts);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReady() {
    return withReady(true);
  }
  
  public A withStarted() {
    return withStarted(true);
  }
  public class AllocatedResourcesStatusNested<N> extends V1ResourceStatusFluent<AllocatedResourcesStatusNested<N>> implements Nested<N>{
    AllocatedResourcesStatusNested(int index,V1ResourceStatus item) {
      this.index = index;
      this.builder = new V1ResourceStatusBuilder(this, item);
    }
    V1ResourceStatusBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ContainerStatusFluent.this.setToAllocatedResourcesStatus(index, builder.build());
    }
    
    public N endAllocatedResourcesStatus() {
      return and();
    }
    
  
  }
  public class LastStateNested<N> extends V1ContainerStateFluent<LastStateNested<N>> implements Nested<N>{
    LastStateNested(V1ContainerState item) {
      this.builder = new V1ContainerStateBuilder(this, item);
    }
    V1ContainerStateBuilder builder;
    
    public N and() {
      return (N) V1ContainerStatusFluent.this.withLastState(builder.build());
    }
    
    public N endLastState() {
      return and();
    }
    
  
  }
  public class ResourcesNested<N> extends V1ResourceRequirementsFluent<ResourcesNested<N>> implements Nested<N>{
    ResourcesNested(V1ResourceRequirements item) {
      this.builder = new V1ResourceRequirementsBuilder(this, item);
    }
    V1ResourceRequirementsBuilder builder;
    
    public N and() {
      return (N) V1ContainerStatusFluent.this.withResources(builder.build());
    }
    
    public N endResources() {
      return and();
    }
    
  
  }
  public class StateNested<N> extends V1ContainerStateFluent<StateNested<N>> implements Nested<N>{
    StateNested(V1ContainerState item) {
      this.builder = new V1ContainerStateBuilder(this, item);
    }
    V1ContainerStateBuilder builder;
    
    public N and() {
      return (N) V1ContainerStatusFluent.this.withState(builder.build());
    }
    
    public N endState() {
      return and();
    }
    
  
  }
  public class UserNested<N> extends V1ContainerUserFluent<UserNested<N>> implements Nested<N>{
    UserNested(V1ContainerUser item) {
      this.builder = new V1ContainerUserBuilder(this, item);
    }
    V1ContainerUserBuilder builder;
    
    public N and() {
      return (N) V1ContainerStatusFluent.this.withUser(builder.build());
    }
    
    public N endUser() {
      return and();
    }
    
  
  }
  public class VolumeMountsNested<N> extends V1VolumeMountStatusFluent<VolumeMountsNested<N>> implements Nested<N>{
    VolumeMountsNested(int index,V1VolumeMountStatus item) {
      this.index = index;
      this.builder = new V1VolumeMountStatusBuilder(this, item);
    }
    V1VolumeMountStatusBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ContainerStatusFluent.this.setToVolumeMounts(index, builder.build());
    }
    
    public N endVolumeMount() {
      return and();
    }
    
  
  }

}