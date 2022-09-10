package com.aditya.lld.creational.prototype;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
//1. Implement cloneable interface
public class MlModel implements ObjectCloneable{

    private ModelType modeltype;
    private double modelAccuracy;
    private double modelVersion;
    private String description;

    @Override
    //Step 2 return a instance of Mlmodel
    public MlModel clone() {
        return new MlModel(ModelType.ALPHA,99.9,1.0,"Tests image recognition");
        }
    }

