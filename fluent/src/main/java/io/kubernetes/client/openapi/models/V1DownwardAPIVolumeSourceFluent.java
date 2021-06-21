package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1DownwardAPIVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getDefaultMode();
    public A withDefaultMode(java.lang.Integer defaultMode);
    public java.lang.Boolean hasDefaultMode();
    public A addToItems(int index,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item);
    public A setToItems(int index,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item);
    public A addToItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items);
    public A addAllToItems(java.util.Collection<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile> items);
    public A removeFromItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items);
    public A removeAllFromItems(java.util.Collection<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile> items);
    public A removeMatchingFromItems(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildItems instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile> getItems();
    public java.util.List<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile> buildItems();
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile buildItem(int index);
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile buildFirstItem();
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile buildLastItem();
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile buildMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder> predicate);
    public java.lang.Boolean hasMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder> predicate);
    public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile> items);
    public A withItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items);
    public java.lang.Boolean hasItems();
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<A> addNewItem();
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<A> addNewItemLike(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item);
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<A> setNewItemLike(int index,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item);
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<A> editItem(int index);
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<A> editFirstItem();
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<A> editLastItem();
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<A> editMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder> predicate);
    public interface ItemsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<N>> {

            public N and();
            public N endItem();    }


}
