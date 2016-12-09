package lh.world.repository;

import lh.world.model.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by lh on 2016/12/9.
 */
public interface MessageRepository extends PagingAndSortingRepository<Message, Long> {
    Page<Message> list(int page, int size, String sortField, Pageable pageable);
}
