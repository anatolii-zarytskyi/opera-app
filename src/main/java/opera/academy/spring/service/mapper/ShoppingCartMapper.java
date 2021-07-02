package opera.academy.spring.service.mapper;

import java.util.stream.Collectors;
import opera.academy.spring.dto.response.ShoppingCartResponseDto;
import opera.academy.spring.model.ShoppingCart;
import opera.academy.spring.model.Ticket;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartMapper implements
        ResponseDtoMapper<ShoppingCartResponseDto, ShoppingCart> {

    @Override
    public ShoppingCartResponseDto mapToDto(ShoppingCart shoppingCart) {
        ShoppingCartResponseDto responseDto = new ShoppingCartResponseDto();
        responseDto.setUserId(shoppingCart.getUser().getId());
        responseDto.setTicketIds(shoppingCart.getTickets()
                .stream()
                .map(Ticket::getId)
                .collect(Collectors.toList()));
        return responseDto;
    }
}
