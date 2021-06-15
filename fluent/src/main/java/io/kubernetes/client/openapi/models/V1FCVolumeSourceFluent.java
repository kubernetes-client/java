package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

public interface V1FCVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getFsType();
    public A withFsType(java.lang.String fsType);
    public java.lang.Boolean hasFsType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFsType instead.
     */
        public A withNewFsType(java.lang.String original);
    public java.lang.Integer getLun();
    public A withLun(java.lang.Integer lun);
    public java.lang.Boolean hasLun();
    public java.lang.Boolean getReadOnly();
    public A withReadOnly(java.lang.Boolean readOnly);
    public java.lang.Boolean hasReadOnly();
    public A addToTargetWWNs(int index,java.lang.String item);
    public A setToTargetWWNs(int index,java.lang.String item);
    public A addToTargetWWNs(java.lang.String... items);
    public A addAllToTargetWWNs(java.util.Collection<java.lang.String> items);
    public A removeFromTargetWWNs(java.lang.String... items);
    public A removeAllFromTargetWWNs(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getTargetWWNs();
    public java.lang.String getTargetWWN(int index);
    public java.lang.String getFirstTargetWWN();
    public java.lang.String getLastTargetWWN();
    public java.lang.String getMatchingTargetWWN(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingTargetWWN(java.util.function.Predicate<java.lang.String> predicate);
    public A withTargetWWNs(java.util.List<java.lang.String> targetWWNs);
    public A withTargetWWNs(java.lang.String... targetWWNs);
    public java.lang.Boolean hasTargetWWNs();
    public A addNewTargetWWN(java.lang.String original);
    public A addToWwids(int index,java.lang.String item);
    public A setToWwids(int index,java.lang.String item);
    public A addToWwids(java.lang.String... items);
    public A addAllToWwids(java.util.Collection<java.lang.String> items);
    public A removeFromWwids(java.lang.String... items);
    public A removeAllFromWwids(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getWwids();
    public java.lang.String getWwid(int index);
    public java.lang.String getFirstWwid();
    public java.lang.String getLastWwid();
    public java.lang.String getMatchingWwid(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingWwid(java.util.function.Predicate<java.lang.String> predicate);
    public A withWwids(java.util.List<java.lang.String> wwids);
    public A withWwids(java.lang.String... wwids);
    public java.lang.Boolean hasWwids();
    public A addNewWwid(java.lang.String original);
}
