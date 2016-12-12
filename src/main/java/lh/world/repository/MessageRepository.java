package lh.world.repository;

import lh.world.model.Message;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by lh on 2016/12/9.
 */
public interface MessageRepository extends PagingAndSortingRepository<Message, Long> {

}
