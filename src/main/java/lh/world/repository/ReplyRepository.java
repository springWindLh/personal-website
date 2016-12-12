package lh.world.repository;

import lh.world.model.Reply;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by lh on 2016/12/12.
 */
public interface ReplyRepository extends PagingAndSortingRepository<Reply, Long> {
}
