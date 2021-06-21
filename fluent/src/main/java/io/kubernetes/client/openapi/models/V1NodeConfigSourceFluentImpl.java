package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1NodeConfigSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent<A> {

    private io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceBuilder configMap;

    public V1NodeConfigSourceFluentImpl() {
    }

    public V1NodeConfigSourceFluentImpl(io.kubernetes.client.openapi.models.V1NodeConfigSource instance) {
        this.withConfigMap(instance.getConfigMap());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConfigMap instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource getConfigMap() {
        return this.configMap!=null?this.configMap.build():null;
    }

    public io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource buildConfigMap() {
        return this.configMap!=null?this.configMap.build():null;
    }

    public A withConfigMap(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource configMap) {
        _visitables.get("configMap").remove(this.configMap);
        if (configMap!=null){ this.configMap= new io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceBuilder(configMap); _visitables.get("configMap").add(this.configMap);} return (A) this;
    }

    public java.lang.Boolean hasConfigMap() {
        return this.configMap != null;
    }

    public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A> withNewConfigMap() {
        return new io.kubernetes.client.openapi.models.V1NodeConfigSourceFluentImpl.ConfigMapNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A> withNewConfigMapLike(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource item) {
        return new io.kubernetes.client.openapi.models.V1NodeConfigSourceFluentImpl.ConfigMapNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A> editConfigMap() {
        return withNewConfigMapLike(getConfigMap());
    }

    public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A> editOrNewConfigMap() {
        return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): new io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A> editOrNewConfigMapLike(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource item) {
        return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1NodeConfigSourceFluentImpl that = (V1NodeConfigSourceFluentImpl) o;
        if (configMap != null ? !configMap.equals(that.configMap) :that.configMap != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(configMap,  super.hashCode());
    }

    public class ConfigMapNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluentImpl<io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<N>> implements io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceBuilder builder;

            ConfigMapNestedImpl(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource item) {
                this.builder = new io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceBuilder(this, item);
                        
            }

            ConfigMapNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceBuilder(this);
                        
            }

            public N and() {
                return (N) V1NodeConfigSourceFluentImpl.this.withConfigMap(builder.build());
            }

            public N endConfigMap() {
                return and();
            }
    }


}
