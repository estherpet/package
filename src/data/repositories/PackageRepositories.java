package data.repositories;

import data.models.Package;

import java.util.List;

public interface PackageRepositories {
   Package save (Package aPackage);
   void delete(int id);
   Package findPackageById(int id);
   List<Package> findAll();

   int count();
}
