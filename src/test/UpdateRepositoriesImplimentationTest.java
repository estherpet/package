package test;

import data.models.TrackingInfornmation;
import data.repositories.UpdateRepositories;
import data.repositories.TrackingInformationRepositoriesImplementation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpdateRepositoriesImplementationTest {
UpdateRepositories updateRepositories = new TrackingInformationRepositoriesImplementation();
@Test
    public  void  saveOneUpdate_countIsOneTest(){
    TrackingInfornmation update = new TrackingInfornmation();
    updateRepositories.save(update);
    assertEquals(1,updateRepositories.counter());
 }
}