package com.aditya.lld.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ModelRegistry {
    Map<ModelType,MlModel> map=new HashMap<>();

    //1 Add model to the registry
    public void addModel(ModelType modelType,MlModel mlModel)
    {
        map.put(modelType,mlModel);
    }
    //2. Get particular model from the registry
    public MlModel getModel(ModelType modelType)
    {
        return map.remove(modelType);
    }

    //3. Remove model
    public MlModel removeModel(ModelType modelType)
    {
        return map.remove(modelType);
    }


}
