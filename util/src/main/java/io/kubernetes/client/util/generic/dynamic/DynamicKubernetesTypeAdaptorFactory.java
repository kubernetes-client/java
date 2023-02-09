/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.util.generic.dynamic;

import com.google.gson.Gson;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import java.io.IOException;
import java.lang.reflect.Type;

public class DynamicKubernetesTypeAdaptorFactory implements TypeAdapterFactory {
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
    if (shouldHandleAsSingleObject(typeToken)) {
      return (TypeAdapter<T>) (new GenericObjectCreator(gson));
    }
    if (shouldHandleAsListObject(typeToken)) {
      return (TypeAdapter<T>) (new GenericListObjectCreator(gson));
    }
    return null;
  }

  private boolean shouldHandleAsSingleObject(TypeToken typeToken) {
    if (TypeToken.get(KubernetesObject.class).equals(typeToken)) {
      return true;
    }
    return TypeToken.get(DynamicKubernetesObject.class).equals(typeToken);
  }

  private boolean shouldHandleAsListObject(TypeToken typeToken) {
    if (TypeToken.get(KubernetesListObject.class).equals(typeToken)) {
      return true;
    }
    return TypeToken.get(DynamicKubernetesListObject.class).equals(typeToken);
  }

  class GenericListObjectCreator extends TypeAdapter<DynamicKubernetesListObject>
      implements InstanceCreator<DynamicKubernetesListObject> {

    GenericListObjectCreator(Gson delegate) {
      this.delegate = delegate;
    }

    private final Gson delegate;

    @Override
    public DynamicKubernetesListObject createInstance(Type type) {
      return new DynamicKubernetesListObject();
    }

    @Override
    public void write(JsonWriter jsonWriter, DynamicKubernetesListObject t) throws IOException {
      jsonWriter.jsonValue(delegate.toJson(t.getRaw()));
    }

    @Override
    public DynamicKubernetesListObject read(JsonReader jsonReader) throws IOException {
      return new DynamicKubernetesListObject(delegate.fromJson(jsonReader, JsonObject.class));
    }
  }

  class GenericObjectCreator extends TypeAdapter<DynamicKubernetesObject>
      implements InstanceCreator<DynamicKubernetesObject> {

    GenericObjectCreator(Gson delegate) {
      this.delegate = delegate;
    }

    private final Gson delegate;

    @Override
    public DynamicKubernetesObject createInstance(Type type) {
      return new DynamicKubernetesObject();
    }

    @Override
    public void write(JsonWriter jsonWriter, DynamicKubernetesObject t) throws IOException {
      jsonWriter.jsonValue(delegate.toJson(t.getRaw()));
    }

    @Override
    public DynamicKubernetesObject read(JsonReader jsonReader) throws IOException {
      return new DynamicKubernetesObject(delegate.fromJson(jsonReader, JsonObject.class));
    }
  }
}
