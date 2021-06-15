package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1WatchEventFluentImpl<A extends io.kubernetes.client.openapi.models.V1WatchEventFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1WatchEventFluent<A> {

    private java.lang.Object _object;
    private java.lang.String type;

    public V1WatchEventFluentImpl() {
    }

    public V1WatchEventFluentImpl(io.kubernetes.client.openapi.models.V1WatchEvent instance) {
        this.withObject(instance.getObject());
        
        this.withType(instance.getType());
    }

    public java.lang.Object getObject() {
        return this._object;
    }

    public A withObject(java.lang.Object _object) {
        this._object=_object; return (A) this;
    }

    public java.lang.Boolean hasObject() {
        return this._object != null;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public A withType(java.lang.String type) {
        this.type=type; return (A) this;
    }

    public java.lang.Boolean hasType() {
        return this.type != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original) {
        return (A)withType(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1WatchEventFluentImpl that = (V1WatchEventFluentImpl) o;
        if (_object != null ? !_object.equals(that._object) :that._object != null) return false;
        if (type != null ? !type.equals(that.type) :that.type != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(_object,  type,  super.hashCode());
    }

}
