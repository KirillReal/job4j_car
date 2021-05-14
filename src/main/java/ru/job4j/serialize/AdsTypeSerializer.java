package ru.job4j.serialize;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import ru.job4j.model.AdsType;

import java.lang.reflect.Type;

public class AdsTypeSerializer implements JsonSerializer<AdsType> {

    @Override
    public JsonElement serialize(AdsType adsType, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject result = new JsonObject();
            result.addProperty("id", adsType.getId());
            result.addProperty("name", adsType.getName());
            return result;

    }
}
