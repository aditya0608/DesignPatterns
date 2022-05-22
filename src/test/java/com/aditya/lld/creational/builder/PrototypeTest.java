package com.aditya.lld.creational.builder;

import com.aditya.lld.creational.prototype.MlModel;
import com.aditya.lld.creational.prototype.ModelRegistry;
import com.aditya.lld.creational.prototype.ModelType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class PrototypeTest {


     ModelRegistry modelRegistry;
     @Before
     public void setUp()
     {
         modelRegistry=new ModelRegistry();

         //add models before the run of test

         modelRegistry.addModel(ModelType.ALPHA,new MlModel(ModelType.ALPHA,99.9,1.0,"Tests image rceognition"));
         modelRegistry.addModel(ModelType.BETA,new MlModel(ModelType.BETA,99.9,1.0,"Tests image rceognition"));
         modelRegistry.addModel(ModelType.GAMMA,new MlModel(ModelType.GAMMA,99.9,1.0,"Tests image rceognition"));
     }
    @Test
    //1. Check model instantiation
    public void testModelCloning()
    {
        MlModel mlModel=new MlModel(ModelType.ALPHA,99.9,1.0,"Tests image rceognition");
        MlModel cloned=mlModel.clone();
        assertEquals("Cloneable object should have same name",mlModel.getModeltype(),cloned.getModeltype());
    }
    @Test
    //1. Test if the new model returned is different
    public void testNewModel()
    {
        MlModel mlModel=new MlModel(ModelType.ALPHA,99.9,1.0,"Tests image rceognition");
        MlModel cloned=mlModel.clone();
        assertFalse("Cloneable object should be different",mlModel==cloned);
    }
    //1. Returning multiple models via clone, tweeking them a bit
    private void testMultipleClones()
    {
        MlModel protoype=new MlModel(ModelType.ALPHA,99.9,1.0,"Tests image rceognition");
        List<MlModel> list=new ArrayList<>();
        for(int i=1;i<11;i++)
        {
            MlModel cloned=(protoype.clone());
            cloned.setModelVersion(i);
            list.add(cloned);
        }
    }
    @Test
    //1. Test create and remove registry models
    public void testRegistry()
    {
     MlModel mlModel=modelRegistry.getModel(ModelType.GAMMA);
     assertTrue("If object is returned modeltype should be same",ModelType.GAMMA==mlModel.getModeltype());

    }
    //teardown method to be executed at the end
    //@After-->Use this at the end

}
