package test;

import data.models.Package;
import data.repositories.PackageRepositories;
import data.repositories.PackageRepositoriesImplementation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageRepositoriesImplementationTest {
    PackageRepositories packageRepositories = new PackageRepositoriesImplementation();
    @Test
    public  void saveOne_CountIsOneTest(){
        Package aPackage = new Package();
        packageRepositories.save(aPackage);
        assertEquals(1,packageRepositories.count());
    }
    @Test
    public  void  saveTwo_CountIsTwoTest(){
        Package aPackage = new Package();
        packageRepositories.save(aPackage);
        Package aPackage1 = new Package();
        packageRepositories.save(aPackage1);
        assertEquals(2,packageRepositories.count());
    }
    @Test
        public  void saveTwo_DeleteOneTest(){
        Package aPackage = new Package();
        packageRepositories.save(aPackage);
        Package aPackage1 = new Package();
        packageRepositories.save(aPackage1);
        packageRepositories.delete(1);
//        System.out.println(aPackage1.getId());
        assertEquals(1,packageRepositories.count());
    }
    @Test
    public  void saveTwo_FindByIdTest(){
        Package aPackage = new Package();
        Package aPackage1 = new Package();
        packageRepositories.save(aPackage);
        packageRepositories.save(aPackage1);
        assertSame(aPackage,packageRepositories.findPackageById(1));
    }
    @Test
    public void saveAndFindAllTest(){
        Package aPackage = new Package();
        Package aPackage1 = new Package();
        Package aPackage2 = new Package();
        packageRepositories.save(aPackage);
        packageRepositories.save(aPackage1);
        packageRepositories.save(aPackage2);
        for (int index = 0; index < packageRepositories.findAll().size(); index++) {
            assertTrue(packageRepositories.findAll().contains(aPackage));
            assertTrue(packageRepositories.findAll().contains(aPackage1));
            assertTrue(packageRepositories.findAll().contains(aPackage2));
        }
    }
}