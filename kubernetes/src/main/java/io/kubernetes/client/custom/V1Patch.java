/*
Copyright 2020 The Kubernetes Authors.
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
package io.kubernetes.client.custom;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

@JsonAdapter(V1Patch.V1PatchAdapter.class)
public class V1Patch {

  private String value;

  public static final String PATCH_FORMAT_JSON_PATCH = "application/json-patch+json";
  public static final String PATCH_FORMAT_JSON_MERGE_PATCH = "application/merge-patch+json";
  public static final String PATCH_FORMAT_STRATEGIC_MERGE_PATCH =
      "application/strategic-merge-patch+json";
  public static final String PATCH_FORMAT_APPLY_YAML = "application/apply-patch+yaml";

  public V1Patch(final String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class V1PatchAdapter extends TypeAdapter<V1Patch> {
    @Override
    public void write(JsonWriter jsonWriter, V1Patch patch) throws IOException {
      jsonWriter.jsonValue(patch.getValue());
    }

    @Override
    public V1Patch read(JsonReader jsonReader) throws IOException {
      throw new UnsupportedOperationException("deserializing patch data is not supported");
    }
  }
}
