package struts.inventorio.serviceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import struts.inventorio.entities.Beer;
import struts.inventorio.entities.Wine;
import struts.inventorio.repositories.beveragesRepo;

@Service
public class beveragesServiceLayerImpl implements beveragesServiceLayer{
    private final beveragesRepo<Beer> beerRepository;
    private final beveragesRepo<Wine> wineRepository;

    @Autowired
    public beveragesServiceLayerImpl(beveragesRepo<Beer> beerRepository, beveragesRepo<Wine> wineRepository) {
        this.beerRepository = beerRepository;
        this.wineRepository = wineRepository;
    }

    //Hva er det som går inn i serviceLayer?
    //Business Logic

}
