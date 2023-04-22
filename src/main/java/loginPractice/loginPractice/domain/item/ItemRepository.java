package loginPractice.loginPractice.domain.item;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ItemRepository {
    private static final Map<Long, Item> store = new HashMap<>();
    private static long sequence = 0L;
    // 여기서는 조회, save, 삭제 등이 필요!

    public Item save(Item item) {
        sequence++;
        item.setId(sequence);
        store.put(sequence,item);
        return  item;
    }
    public Item findById(Long id) {return store.get(id);}

    public List<Item> findAll() {
        return new ArrayList<>(store.values());
    }

    public void update(Long id, Item updateParam) {
        Item findItem = findById(id);
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());
    }
    public void clear() { store.clear(); }
}
