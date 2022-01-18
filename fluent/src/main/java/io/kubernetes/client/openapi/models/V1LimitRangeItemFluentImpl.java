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

/** Generated */
public class V1LimitRangeItemFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1LimitRangeItemFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1LimitRangeItemFluent<A> {
  public V1LimitRangeItemFluentImpl() {}

  public V1LimitRangeItemFluentImpl(io.kubernetes.client.openapi.models.V1LimitRangeItem instance) {
    this.withDefault(instance.getDefault());

    this.withDefaultRequest(instance.getDefaultRequest());

    this.withMax(instance.getMax());

    this.withMaxLimitRequestRatio(instance.getMaxLimitRequestRatio());

    this.withMin(instance.getMin());

    this.withType(instance.getType());
  }

  private java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> _default;
  private java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> defaultRequest;
  private java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> max;
  private java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity>
      maxLimitRequestRatio;
  private java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> min;
  private io.kubernetes.client.openapi.models.V1LimitRangeItem.TypeEnum type;

  public A addToDefault(java.lang.String key, io.kubernetes.client.custom.Quantity value) {
    if (this._default == null && key != null && value != null) {
      this._default = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this._default.put(key, value);
    }
    return (A) this;
  }

  public A addToDefault(java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this._default == null && map != null) {
      this._default = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this._default.putAll(map);
    }
    return (A) this;
  }

  public A removeFromDefault(java.lang.String key) {
    if (this._default == null) {
      return (A) this;
    }
    if (key != null && this._default != null) {
      this._default.remove(key);
    }
    return (A) this;
  }

  public A removeFromDefault(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this._default == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this._default != null) {
          this._default.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getDefault() {
    return this._default;
  }

  public <K, V> A withDefault(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> _default) {
    if (_default == null) {
      this._default = null;
    } else {
      this._default = new java.util.LinkedHashMap(_default);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDefault() {
    return this._default != null;
  }

  public A addToDefaultRequest(java.lang.String key, io.kubernetes.client.custom.Quantity value) {
    if (this.defaultRequest == null && key != null && value != null) {
      this.defaultRequest = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.defaultRequest.put(key, value);
    }
    return (A) this;
  }

  public A addToDefaultRequest(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.defaultRequest == null && map != null) {
      this.defaultRequest = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.defaultRequest.putAll(map);
    }
    return (A) this;
  }

  public A removeFromDefaultRequest(java.lang.String key) {
    if (this.defaultRequest == null) {
      return (A) this;
    }
    if (key != null && this.defaultRequest != null) {
      this.defaultRequest.remove(key);
    }
    return (A) this;
  }

  public A removeFromDefaultRequest(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.defaultRequest == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.defaultRequest != null) {
          this.defaultRequest.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getDefaultRequest() {
    return this.defaultRequest;
  }

  public <K, V> A withDefaultRequest(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> defaultRequest) {
    if (defaultRequest == null) {
      this.defaultRequest = null;
    } else {
      this.defaultRequest = new java.util.LinkedHashMap(defaultRequest);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDefaultRequest() {
    return this.defaultRequest != null;
  }

  public A addToMax(java.lang.String key, io.kubernetes.client.custom.Quantity value) {
    if (this.max == null && key != null && value != null) {
      this.max = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.max.put(key, value);
    }
    return (A) this;
  }

  public A addToMax(java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.max == null && map != null) {
      this.max = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.max.putAll(map);
    }
    return (A) this;
  }

  public A removeFromMax(java.lang.String key) {
    if (this.max == null) {
      return (A) this;
    }
    if (key != null && this.max != null) {
      this.max.remove(key);
    }
    return (A) this;
  }

  public A removeFromMax(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.max == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.max != null) {
          this.max.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getMax() {
    return this.max;
  }

  public <K, V> A withMax(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> max) {
    if (max == null) {
      this.max = null;
    } else {
      this.max = new java.util.LinkedHashMap(max);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMax() {
    return this.max != null;
  }

  public A addToMaxLimitRequestRatio(
      java.lang.String key, io.kubernetes.client.custom.Quantity value) {
    if (this.maxLimitRequestRatio == null && key != null && value != null) {
      this.maxLimitRequestRatio = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.maxLimitRequestRatio.put(key, value);
    }
    return (A) this;
  }

  public A addToMaxLimitRequestRatio(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.maxLimitRequestRatio == null && map != null) {
      this.maxLimitRequestRatio = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.maxLimitRequestRatio.putAll(map);
    }
    return (A) this;
  }

  public A removeFromMaxLimitRequestRatio(java.lang.String key) {
    if (this.maxLimitRequestRatio == null) {
      return (A) this;
    }
    if (key != null && this.maxLimitRequestRatio != null) {
      this.maxLimitRequestRatio.remove(key);
    }
    return (A) this;
  }

  public A removeFromMaxLimitRequestRatio(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.maxLimitRequestRatio == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.maxLimitRequestRatio != null) {
          this.maxLimitRequestRatio.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity>
      getMaxLimitRequestRatio() {
    return this.maxLimitRequestRatio;
  }

  public <K, V> A withMaxLimitRequestRatio(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> maxLimitRequestRatio) {
    if (maxLimitRequestRatio == null) {
      this.maxLimitRequestRatio = null;
    } else {
      this.maxLimitRequestRatio = new java.util.LinkedHashMap(maxLimitRequestRatio);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMaxLimitRequestRatio() {
    return this.maxLimitRequestRatio != null;
  }

  public A addToMin(java.lang.String key, io.kubernetes.client.custom.Quantity value) {
    if (this.min == null && key != null && value != null) {
      this.min = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.min.put(key, value);
    }
    return (A) this;
  }

  public A addToMin(java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.min == null && map != null) {
      this.min = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.min.putAll(map);
    }
    return (A) this;
  }

  public A removeFromMin(java.lang.String key) {
    if (this.min == null) {
      return (A) this;
    }
    if (key != null && this.min != null) {
      this.min.remove(key);
    }
    return (A) this;
  }

  public A removeFromMin(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.min == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.min != null) {
          this.min.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getMin() {
    return this.min;
  }

  public <K, V> A withMin(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> min) {
    if (min == null) {
      this.min = null;
    } else {
      this.min = new java.util.LinkedHashMap(min);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMin() {
    return this.min != null;
  }

  public io.kubernetes.client.openapi.models.V1LimitRangeItem.TypeEnum getType() {
    return this.type;
  }

  public A withType(io.kubernetes.client.openapi.models.V1LimitRangeItem.TypeEnum type) {
    this.type = type;
    return (A) this;
  }

  public java.lang.Boolean hasType() {
    return this.type != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1LimitRangeItemFluentImpl that = (V1LimitRangeItemFluentImpl) o;
    if (_default != null ? !_default.equals(that._default) : that._default != null) return false;
    if (defaultRequest != null
        ? !defaultRequest.equals(that.defaultRequest)
        : that.defaultRequest != null) return false;
    if (max != null ? !max.equals(that.max) : that.max != null) return false;
    if (maxLimitRequestRatio != null
        ? !maxLimitRequestRatio.equals(that.maxLimitRequestRatio)
        : that.maxLimitRequestRatio != null) return false;
    if (min != null ? !min.equals(that.min) : that.min != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        _default, defaultRequest, max, maxLimitRequestRatio, min, type, super.hashCode());
  }
}
