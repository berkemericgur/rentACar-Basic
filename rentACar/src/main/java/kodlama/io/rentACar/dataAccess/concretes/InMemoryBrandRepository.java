package kodlama.io.rentACar.dataAccess.concretes;

import kodlama.io.rentACar.dataAccess.abstracs.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository //bu sınıf bir data access nesnesidir.
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"AUDI"));
        brands.add(new Brand(3,"MERCEDES"));
        brands.add(new Brand(4,"VOLVO"));
        brands.add(new Brand(5,"RENAULT"));
        brands.add(new Brand(6,"PEUGEOT"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
