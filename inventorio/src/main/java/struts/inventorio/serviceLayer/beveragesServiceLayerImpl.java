package struts.inventorio.serviceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import struts.inventorio.entities.Beer;
import struts.inventorio.entities.Wine;
import struts.inventorio.repositories.BeerRepo;
import struts.inventorio.repositories.WineRepo;

@Service
public class beveragesServiceLayerImpl implements beveragesServiceLayer{
    private BeerRepo beerRepository;
    private WineRepo wineRepository;

    @Autowired
    public beveragesServiceLayerImpl(BeerRepo beerRepository, WineRepo wineRepository) {
        this.beerRepository = beerRepository;
        this.wineRepository = wineRepository;
    }

    //Hva er det som går inn i serviceLayer?
    //Business Logic

}
