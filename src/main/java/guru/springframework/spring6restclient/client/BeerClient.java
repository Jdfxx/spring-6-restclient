package guru.springframework.spring6restclient.client;

import guru.springframework.spring6restclient.model.BeerDTO;

import java.util.List;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface BeerClient {
    List<BeerDTO> listBeers();

    List<BeerDTO> listBeers(String beerName, String beerStyle, Boolean showInventory, Integer pageNumber,
                            Integer pageSize);

    BeerDTO getBeerById(String beerId);

    BeerDTO createBeer(BeerDTO newDto);

    BeerDTO updateBeer(BeerDTO beerDto);

    void deleteBeer(String beerId);
}
