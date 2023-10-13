package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracs.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //Bu sınıf bir business nesnesidir.
public class BrandServiceImp implements BrandService { //BrandManager
    private BrandRepository brandRepository;
@Autowired
    public BrandServiceImp(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;

    }

    @Override
    public List<Brand> getAll() {
        //iş kuralları
        return brandRepository.getAll();
    }
}
