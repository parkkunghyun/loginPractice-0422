package loginPractice.loginPractice;

import jakarta.annotation.PostConstruct;
import loginPractice.loginPractice.domain.item.Item;
import loginPractice.loginPractice.domain.item.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestDataInit {
    private final ItemRepository itemRepository;

    @PostConstruct
    public void init() {
        itemRepository.save(new Item("testA", 1000,100));
        itemRepository.save(new Item("testB", 1200,500));
    }

}
