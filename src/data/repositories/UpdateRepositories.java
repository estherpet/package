package data.repositories;

import data.models.Package;
import data.models.TrackingInfornmation;

import java.util.List;

public interface UpdateRepositories {
    TrackingInfornmation save(TrackingInfornmation update);
    void  delete(int id);
    Package findUpdateById(int id);
    List<TrackingInfornmation> findAll();
    int counter();
}
