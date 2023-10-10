package data.repositories;

import data.models.Package;

import java.util.ArrayList;
import java.util.List;

public class PackageRepositoriesImplementation implements PackageRepositories{
    private  int count;

    List<Package> packages = new ArrayList<>();
    @Override
    public Package save(Package aPackage) {
        packages.add(aPackage);
        aPackage.setId(++ count);
        return aPackage;
    }

    @Override
    public void delete(int id) {
        for (Package aPackage: packages) {
            if (aPackage.getId() == id)
                packages.remove(id);
        }
    }

    @Override
    public Package findPackageById(int id) {

        return packages.get(id -1);
    }

    @Override
    public List<Package> findAll() {
        return packages;
    }

    @Override
    public int count() {
        return packages.size();
    }
}
