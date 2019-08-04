package pl.piotrpawlik.blackcat.auctions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.piotrpawlik.blackcat.categories.Category;

@Repository
public interface AuctionReposytory extends JpaRepository<Auction, Long> {


}
