package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.dataAccess.abstracs.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
        List<Brand> getAll();
}
