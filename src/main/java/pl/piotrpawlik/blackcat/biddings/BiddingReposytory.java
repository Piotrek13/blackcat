package pl.piotrpawlik.blackcat.biddings;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiddingReposytory extends JpaRepository<Bidding, Long> {

}
